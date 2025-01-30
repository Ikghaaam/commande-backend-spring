package com.example.MyTp1Spring.service;
import com.example.MyTp1Spring.bean.Commande;
import com.example.MyTp1Spring.bean.CommandeItem;
import com.example.MyTp1Spring.dao.CommandeDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeService {
    @Autowired
    private CommandeDao commandeDao;
    @Autowired
    private CommandeItemService commandeItemService;

    public Commande findByRef(String ref){
        return commandeDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref){
        return  commandeDao.deleteByRef(ref);
    }

    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    public int save(Commande entity) {
        int result = validate(entity);
        if (result > 0) {
            Commande saved = commandeDao.save(entity);
            List<CommandeItem> commandeItems = entity.getCommandeItems();
            if (commandeItems != null) {
                for (CommandeItem commandeItem : commandeItems) {
                    commandeItem.setCommande(saved);
                    commandeItemService.save(commandeItem);
                }
            }
        }
        return result;
    }

    private int validate(Commande entity) {
        if (findByRef(entity.getRef()) != null) {
            return -1;
        }
        List<CommandeItem> commandeItems = entity.getCommandeItems();
        if (commandeItems == null || commandeItems.isEmpty()) {
            return -2;
        }
        for (int i = 0; i < commandeItems.size(); i++) {
            CommandeItem commandeItem = commandeItems.get(i);
            List<CommandeItem> collect = commandeItems.stream().filter(e -> e.getProduit().equals(commandeItem.getProduit())).collect(Collectors.toList());
            if (collect.size() > 1) {
                return -3;
            }
        }
        return 1;
    }

}

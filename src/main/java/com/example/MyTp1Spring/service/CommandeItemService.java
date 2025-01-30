package com.example.MyTp1Spring.service;

import com.example.MyTp1Spring.bean.CommandeItem;
import com.example.MyTp1Spring.dao.CommandeItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeItemService {
    @Autowired
    private CommandeItemDao dao;

    public List<CommandeItem> findAll(){
        return dao.findAll() ;
    }
    public void save(CommandeItem entity) {
        int res = 1;
        dao.save(entity);
    }












}

package com.example.MyTp1Spring.dao;

import com.example.MyTp1Spring.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeDao extends JpaRepository<Commande,Long> {
    int deleteByRef(String ref);
    Commande findByRef(String ref);
}

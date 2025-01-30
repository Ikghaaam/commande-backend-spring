package com.example.MyTp1Spring.dao;

import com.example.MyTp1Spring.bean.CommandeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeItemDao extends JpaRepository <CommandeItem ,Long> {

}

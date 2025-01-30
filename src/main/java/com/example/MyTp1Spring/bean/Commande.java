package com.example.MyTp1Spring.bean;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private BigDecimal total;
    @OneToMany(mappedBy = "commande")
    private List<CommandeItem> commandeItems;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }

    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<CommandeItem> getCommandeItems() {
        return commandeItems;
    }
    public void setCommandeItems(List<CommandeItem> commandeItems) {
        this.commandeItems = commandeItems;
    }
}

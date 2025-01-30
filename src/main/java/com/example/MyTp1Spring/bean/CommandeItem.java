package com.example.MyTp1Spring.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
@Entity
public class CommandeItem {
    @Id @GeneratedValue
    private Long id;
    private String produit;
    private BigDecimal prix;
    private BigDecimal qte;
    @ManyToOne
    private Commande commande;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getProduit() {
        return produit;
    }
    public void setProduit(String produit) {
        this.produit = produit;
    }

    public BigDecimal getPrix() {
        return prix;
    }
    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getQte() {
        return qte;
    }
    public void setQte(BigDecimal qte) {
        this.qte = qte;
    }

    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}

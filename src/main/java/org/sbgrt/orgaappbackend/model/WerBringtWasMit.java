package org.sbgrt.orgaappbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
//@Table(name="wer_bringt_was_mit", schema="orga_app_data")
public class WerBringtWasMit {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @JsonIgnore
    private String publicKey;
    @JsonIgnore
    private String adminKey;

    private String titel;
    private String ort;
    private Date datum;
    private String zeit;
    private boolean editableByUser;

    @ElementCollection
//    @CollectionTable(name = "wer_bringt_was_mit_items", joinColumns = @JoinColumn(name = "wer_bringt_was_mit_id")) // 2
//    @Column(name = "list") // 3
    private List<WerBringtWasMitItem> items = new ArrayList<>();

    public static WerBringtWasMit getDummy() {
        WerBringtWasMit w = new WerBringtWasMit();
        w.titel = "Ein Wer bringt was mit aus Spring Boot";
        w.datum = new Date();
        w.adminKey = "adminkey";
        w.publicKey = "publicKey";
        w.items.add(new WerBringtWasMitItem("Fleisch", "Heinz"));
        w.items.add(new WerBringtWasMitItem("Salat", "Inge"));
        w.items.add(new WerBringtWasMitItem("Bier", "Siggi"));
        return w;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getZeit() {
        return zeit;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public boolean isEditableByUser() {
        return editableByUser;
    }

    public void setEditableByUser(boolean editableByUser) {
        this.editableByUser = editableByUser;
    }

    public List<WerBringtWasMitItem> getItems() {
        return items;
    }

    public void setItems(List<WerBringtWasMitItem> items) {
        this.items = items;
    }
}

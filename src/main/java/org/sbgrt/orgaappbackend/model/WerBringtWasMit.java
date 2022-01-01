package org.sbgrt.orgaappbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WerBringtWasMit {
    @JsonIgnore
    private String publicKey;
    @JsonIgnore
    private String adminKey;

    private String titel;
    private Date datum;
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

    public String getPublicKey() {
        return publicKey;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public String getTitel() {
        return titel;
    }

    public Date getDatum() {
        return datum;
    }

    public List<WerBringtWasMitItem> getItems() {
        return items;
    }
}

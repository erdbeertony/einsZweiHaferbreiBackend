package org.sbgrt.orgaappbackend.model;

public class WerBringtWasMitItem {
    private String sache;
    private String person;

    public WerBringtWasMitItem(String sache, String person) {
        this.sache = sache;
        this.person = person;
    }

    public String getSache() {
        return sache;
    }

    public String getPerson() {
        return person;
    }
}

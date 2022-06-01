package org.sbgrt.orgaappbackend.model;

import javax.persistence.Embeddable;

@Embeddable // wegen ElementCollection
public class WerBringtWasMitItem {
    private String sache;
    private String person;

    public WerBringtWasMitItem() {}

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

    public void setSache(String sache) {
        this.sache = sache;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}

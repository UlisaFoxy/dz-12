package com.rd.family;
public class Woman extends Person{
    private String partnerLastName;
    private String maidenName;
    public Woman (String firstName,String lastName,Integer age,String partner,String profession,String partnerLastName,String maidenName){
        super(firstName,lastName,age,partner,profession);
    }

    public String getPartnerLastName() { return partnerLastName; }

    public String getMaidenName() {
        return maidenName;
    }

    public void deregisterPartnership(boolean shouldReturnToMaidenName) {
        if (getPartner() != null) {
            setPartner(null);
            if (shouldReturnToMaidenName) {
                setLastName(getMaidenName());
            }
        }
    }
    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public static void deregisterPartnership(Woman woman, boolean shouldReturnToMaidenName) {
        if (woman.getPartner() != null) {
            woman.setPartner(null);

            if (shouldReturnToMaidenName) {
                woman.setLastName(woman.getMaidenName());
            }
        }
    }
    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }
}

package com.rd.family;
public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String partner;
    private String profession;
    private String partnerLastName;
    private String maidenName;

    public Person(String firstName, String lastName, Integer age, String partner, String profession,String partnerLastName, String maidenName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner= partner;
        this.profession = profession;
        this.partnerLastName = partnerLastName;
        this.maidenName = maidenName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPartner() {
        return partner;
    }
    public void setPartner(String partner) {
        this.partner = partner;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getPartnerLastName() {
        return partnerLastName;
    }
    public String getMaidenName() {
        return maidenName;
    }
    public static void deregisterPartnership(Woman woman, boolean shouldReturnToMaidenName) {
        if (woman.getPartner() != null) {
            woman.setPartner(null);

            if (shouldReturnToMaidenName) {
                woman.setLastName(woman.getMaidenName());
            }
        }

    }
    public abstract boolean isRetired();
    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }
    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

}


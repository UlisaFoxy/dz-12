package com.rd.family;
public class Man extends Person{
    public Man (String firstName,String lastName,Integer age,String partner,String profession, String partnerLastName, String maidenName){
        super(firstName,lastName,age,partner,profession, partnerLastName,maidenName );
    }
    @Override
    public String getPartnerLastName() {
        return null;
    }
    @Override
    public String getMaidenName() {
        return null;
    }
    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }
}

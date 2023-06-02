package com.rd.family;

public class Woman extends Person{
    public Woman (String firstName,String lastName,Integer age,String partner,String profession,String partnerLastName,String maidenName){super(firstName,lastName,age,partner,profession,partnerLastName,maidenName);
    }
    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }


}

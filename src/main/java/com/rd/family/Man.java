package com.rd.family;
public class Man extends Person{
    public Man (String firstName,String lastName,Integer age,String partner,String profession){
        super(firstName,lastName,age,partner,profession);
    }
    @Override
    public boolean isRetired() {
        return getAge() >= 65;
    }
}

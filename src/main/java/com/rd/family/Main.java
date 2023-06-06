package com.rd.family;

public class Main {
    public static void main(String[] args) {
        Man man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter");
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        boolean isManRetired = man.getAge() >= 65;
        boolean isWomanRetired = woman.getAge() >= 60;
        System.out.println("Man is retired: " + isManRetired);
        System.out.println("Woman is retired: " + isWomanRetired);

        String takePartnerLastName = man.getLastName();
        System.out.println("Andrea became: " + takePartnerLastName);
    }



}

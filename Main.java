package com.company;

public class Main {

    public static void main(String[] args) {
        class2 sha = new class2();
        sha.setAngka1(2);
        sha.setAngka2(3);
        sha.setHasil(sha.getAngka1() + sha.getAngka2());
        System.out.println("Penjumlahan =" + sha.getHasil());
        System.out.println("Pengurangan =" + sha.getHasil2());
        System.out.println("Perkalian =" + sha.getHasil3());
        System.out.println("Pembagian =" + sha.getHasil4());

    }

}

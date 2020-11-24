package com.company;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player (134,"Plooful",135);
        Player wardell = new Player (536,"TSM Wardell",640);
        Player deadlyJimmy = new Player (32,"DeadlyJimmy",34);
        Player subroza = new Player (4931,"Subroza",684);
        Player annieDro = new Player (6919,"C9 Annie",593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        //Verifies Subroza is existing
        System.out.println("Verify Subroza");
        hashtable.printHashtable();
        System.out.println(hashtable.get("Subroza"));
        System.out.println("\n");

        //Deletes Subroza
        System.out.println("Delete Subroza");
        hashtable.delete("Subroza");
        hashtable.printHashtable();
        System.out.println("\n");

        //Place Subroza again
        System.out.println("Place Subroza again");
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.printHashtable();
        System.out.println("\n");
    }
}

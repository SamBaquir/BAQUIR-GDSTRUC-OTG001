package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player (1, "Asuna", 100);
        Player lethalBacon = new Player (2, "LethalBacon", 205);
        Player hpDeskjet = new Player (3, "HPDeskjet", 34);
        Player masterGuardianElite = new Player (4, "MasterGuardianElite69420", 69420);

        //Instantiate playerLinkedList
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        //Initial Players
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        //Initial List
        playerLinkedList.printList();

        //Deletes 1st element
        playerLinkedList.deleteElement1();

        //List with deleted element
        playerLinkedList.printList();

        //Adds another element to the front to test for the size counter
        playerLinkedList.addToFront(masterGuardianElite);

        //List with added element
        playerLinkedList.printList();

        //Check if node is on the list. masterGuardianElite for true, hpDeskJet for false;
        playerLinkedList.containsElement(masterGuardianElite);

        //Check for index of element. choose from asuna, lethalBacon, and masterGuardianElite to get an element. hpDeskJet for error message
        playerLinkedList.elementIndex(masterGuardianElite);
    }
}
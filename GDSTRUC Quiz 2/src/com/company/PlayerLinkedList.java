package com.company;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode currentNode;
    private PlayerNode previousNode;
    private int size;

    public void addToFront (Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;

    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print("\n");
            System.out.print("NEXT -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("List size:" + size);
        System.out.print("\n");
    }

    public void deleteElement1()
    {
        PlayerNode current1 = head;
        PlayerNode next = null;
        next = current1.getNextPlayer();
        size--;
        current1 = null;
        head = next;
    }

    public void containsElement(Player player)
    {
        PlayerNode current2 = head;
        PlayerNode next = null;
        boolean valid = false;

        for (int i = 0; i < size; i++)
        {
            if (player.getId() == current2.getPlayer().getId())
            {
                valid = true;
                System.out.println(player.getName() +  " validity: " + valid);
                return;
            }
            current2 = current2.getNextPlayer();
        }
        System.out.println(valid);
    }

    public void elementIndex(Player player)
    {
        PlayerNode current3 = head;
        int index = 0;
        for (int i = 0; i < size; i++)
        {
            if (player.getName() == current3.getPlayer().getName())
            {
                System.out.println(player.getName() + " is at index: " + index);
                return;
            }
            index++;
            current3 = current3.getNextPlayer();
        }
    }
}


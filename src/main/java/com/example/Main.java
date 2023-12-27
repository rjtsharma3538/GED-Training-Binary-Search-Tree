package com.example;

public class Main {
    public static void main(String[] args) {
        bst<Integer> obj = new bst<Integer>();
        obj.insert(56);
        obj.insert(30);
        obj.insert(70);
        obj.insert(22);
        obj.insert(40);
        obj.insert(60);
        obj.insert(95);
        obj.insert(11);
        obj.insert(65);
        obj.insert(3);
        obj.insert(16);
        obj.insert(63);
        obj.insert(67);

        obj.display();

        if(obj.size()==13)
            System.out.println("All are added");
        else 
            System.out.println("all are not added");
    }
}
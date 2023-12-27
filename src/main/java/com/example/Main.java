package com.example;

public class Main {
    public static void main(String[] args) {
        bst<Integer> obj = new bst<Integer>();
        obj.insert(56);
        obj.insert(30);
        obj.insert(70);

        obj.display();
    }
}
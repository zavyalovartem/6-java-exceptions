package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
    }

    static void codeWithNPE() {
        String test = null;
        test.toString();
    }
}

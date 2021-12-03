package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

// Initializam o lista goala de tip Integer
        ArrayList<Integer> numbersList = new ArrayList<>();

// Initializam un scanner pe care sa il folosim la citirea numarului de elemente din lista.
        Scanner input = new Scanner(System.in);
        System.out.print("Please specify the number of elements in the list: ");

// Citim de la tastatura numarul de elemente (n)
        int numberOfElements = input.nextInt();

// Populam lista cu numere de la 1 pana la n; n fiind numarul salvat in variabila numberOfElements
        for (int i = 1; i <= numberOfElements; i++) {
            numbersList.add(i);
        }

// Printam numerele din lista noastra pentru a fi siguri ca totul este in regula.
        System.out.print("The numbers stored in the list are: \n");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }

// Stergerea unui numar random.
        Random rand = new Random();
        int randomElement = numbersList.get(rand.nextInt(numbersList.size()));
        int removed = numbersList.remove(randomElement);


// Stergem numarul din pozitia dorita.
        //int removed = numbersList.remove(3);


// Printam numerele din nou din lista noastra pentru a fi siguri ca totul este in regula.
        System.out.print("\n The numbers stored in the new list are: \n");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }

// Afisam numarul lipsa.
        System.out.println("\n The missing number is: " + removed);
    }
// Comment for testing
}


package com.devmountain.mars;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    System.out.println("Game Booting Up!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to meet you.");
        System.out.println("On a scale of 1-10 how excited are you?!");
        String excitmentLevel= input.nextLine();
        int parsed = parseInt(excitmentLevel);
        if (parsed <= 3){
            System.out.println("But we are going to Mars ;(");
        } else if (parsed <= 6) {
            System.out.println("Come on get pumped");
        }else if (parsed <= 9){
            System.out.println("PSYCHED");
        }else if (parsed == 10){
            System.out.println("HECK YESSS!");
        }else {
            System.out.println("Please obey the rules :)");
        }
        System.out.println("How many suitcases will you be taking with you");
        String suitC = input.nextLine();
        int suitCase = parseInt(suitC);
        if (suitCase > 2){
            System.out.println("That's too many");
        }else if ( suitCase == 2){
            System.out.println("Perfect amount");
        }else if (suitCase < 2 && suitCase > 0){
            System.out.println("Can you teach me how to pack");
        } else {
            System.out.println("I would reconsider what you are bringing");
        }
        for (int x = 0; x == 0;) {
            System.out.println("What type of animal will be your companion");
            String companion = input.nextLine();
            System.out.println("And what is your animal's name?");
            String companionName = input.nextLine();
            System.out.println("Joining you on your journey is " + companionName + ", which is a " + companion);
            System.out.println("Is this correct? Please answer yes or no");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                System.out.println("Amazing");
                x++;
            } else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                System.out.println("Please re-enter the information");
            }
        }
    }



}



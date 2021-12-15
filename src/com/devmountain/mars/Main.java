package com.devmountain.mars;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Thread.sleep;

public class Main {

    public static <Ticket> void main(String[] args) throws InterruptedException {



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


        String[] animalInfo = companion();


        String[] designs = new String[]{"1: Leather (Black)", "2: Leather (Brown)", "3: Soft cushion (White)", "4: Soft cushion(Blue)"};
        System.out.println("Please choose your interior design");
            for (String design : designs) {
                     System.out.println(design);
            }
        String chosenDesign = null;
        for (int i = 0; i == 0;){
            String strResponse = input.nextLine();
            int intResponse = parseInt(strResponse);
            if (intResponse == 1){
                chosenDesign = designs[0];
            }else if (intResponse == 2){
                chosenDesign = designs[1];
            }else if (intResponse == 3){
                chosenDesign = designs[2];
            }else if (intResponse == 4){
                chosenDesign = designs[3];
            }else {
                System.out.println("Invalid response please choose again");
            }
            System.out.println("Is this design choice correct: " +chosenDesign + "   If so please type yes or no");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                System.out.println("Awesome!");
                i++;
            } else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                System.out.println("Please choose again");
            }
        }
        System.out.println("PRINTING YOUR TICKET...");
        System.out.println("Name: " + name);
        System.out.println("# of Suitcases: " + suitCase);
        System.out.println("Animal name: " + animalInfo[1]);
        System.out.println("Animal type: " + animalInfo[0]);
        System.out.println("Chosen Design: " + chosenDesign);


        sleep(5000);
        System.out.println("GET READY FOR TAKEOFF");
        sleep(2000);
        System.out.println("3");
        sleep(1000);
        System.out.println("2");
        sleep(1000);
        System.out.println("1");
        sleep(1000);
        System.out.println("BLAST OFF");
    }

    public static String[] companion() {
        String[] animalInfo = new String[0];
        for (int x = 0; x == 0; ) {
            Scanner input = new Scanner(System.in);
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
            animalInfo = new String[]{companion, companionName};
        }
        return animalInfo;
    }



}



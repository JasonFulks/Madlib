package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Phase One
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String action;
        String verbEndingInIng;
        String number;
        String pluralNoun;
        String adjective;
        String verbEndingInEd;
        String adjective2;
        String timeOfDay;
        String pluralNoun2;
        String typeOfGroup;
        String town;
        String typeOfRelative;
        String samePersonAsBefore;
        String pastTenseVerb;
        String pluralBodyPart;
        String adjective3;
        String adjective4;
        String noun;
        String bodyPart;
        String person;
        String number2;

    //Phase Two

        System.out.println("Give me an adjective.");
        adjective = keyboard.nextLine();
        System.out.println("I need another one.");
        adjective2 = keyboard.nextLine();
        System.out.println("Almost there!");
        adjective3 = keyboard.nextLine();
        System.out.println("Last adjective. I promise.");
        adjective4 = keyboard.nextLine();
        System.out.println("Give me an action.");
        action = keyboard.nextLine();
        System.out.println("I need a persons name.");
        person = keyboard.nextLine();
        System.out.println("Plural noun please!");
        pluralNoun = keyboard.nextLine();
        System.out.println("You know the drill, same thing.");
        pluralNoun2 = keyboard.nextLine();
        System.out.println("Give me a number.");
        number = keyboard.nextLine();
        System.out.println("One more number please.");
        number2 = keyboard.nextLine();
        System.out.println("Verb ending in ED please.");
        verbEndingInEd = keyboard.nextLine();
        System.out.println("Same thing, but with ING");
        verbEndingInIng = keyboard.nextLine();
        System.out.println("Give me a time of day.");
        timeOfDay = keyboard.nextLine();
        System.out.println("Now a type of group.");
        typeOfGroup = keyboard.nextLine();
        System.out.println("How about a type of relative?");
        typeOfRelative  = keyboard.nextLine();
        System.out.println("POP QUIZ! Who did you put before?");
        samePersonAsBefore  = keyboard.nextLine();
        System.out.println("Now I need a plural body part.");
        pluralBodyPart  = keyboard.nextLine();
        System.out.println("A noun now.");
        noun = keyboard.nextLine();
        System.out.println("How about a town?");
        town = keyboard.nextLine();
        System.out.println("Give me a body part");
        bodyPart = keyboard.nextLine();
        System.out.println("AND FINALLY! A past tense verb.");
        pastTenseVerb = keyboard.nextLine();

        //Phase 3
        System.out.println( " "+action+ "\n" +
                "\n" +
                " "+verbEndingInIng+ " here " +number+
                " floors up on my little balcony when I " +
                "heard shots and saw them boys running.\n " +
                "My eyes went straight to the lot beside " +
                person+"’(s) bar, and I saw something black not moving\n" +
                " in the " +pluralNoun+ " and knew a body was lying there " +
                "and knew it was " +adjective+".  A "+number2+"-year-old boy, the\n" +
                " papers said. Whole bunch of sirens and cops" +
                " and spinning lights the night I'm talking\n" +
                " about. I " +verbEndingInEd+ " till after " +
                "they rolled him away and then everything\n " +
                "got " +adjective2+ " again as it ever gets round " +
                "here, so I'm sure the boy's people not out" +
                " there that night. Didn't see them till\n " +
                "next " +timeOfDay+". I'm looking down at those" +
                " "+pluralNoun2+". A "+typeOfGroup+" is coming" +
                " slow on "+ town +" with a girl by the " +bodyPart+",\n " +
                "had to be the boy's "+typeOfRelative+". They" +
                " pass terrible " +samePersonAsBefore+"’(s) and stop exactly" +
                " next to the spot the boy "+pastTenseVerb+".\n" +
                " How did they know. Then they commence" +
                " to swaying, bowing, hugging, waving their " +
                " "+pluralBodyPart+" about. Forgive me, Jesus,\n" +
                " but look like they grief dancing, like" +
                " the sidewalk too "+adjective3+" or too" +
                " "+adjective4+" they had to jump around not to burn\n " +
                "up. How'd his people find the spot. Could" +
                " they hear my old mind working to guide " +
                "them, lead them like I would if I could\n " +
                "get up out this "+noun+" and take them by the "+ bodyPart+".\n");




    }
}

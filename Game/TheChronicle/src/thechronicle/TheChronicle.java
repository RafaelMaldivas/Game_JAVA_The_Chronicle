/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thechronicle;

import java.util.Scanner;

/**
 *
 * @author victor.alcantara
 */
public class TheChronicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=================================================================================================");
        System.out.println("XXXXXX   XX XX   XXXXX     XXXXX   XX XX   XXXX    XXXXX   XXX  XX   XX   XXXXX   XX       XXXXX ");
        System.out.println("  XX     XX XX   XX        XX      XX XX   X  XX   XX XX   XX X XX   XX   XX      XX       XX    ");
        System.out.println("  XX     XXXXX   XXXXX     XX      XXXXX   XXXX    XX XX   XX  XXX   XX   XX      XX       XXXXX ");
        System.out.println("  XX     XX XX   XX        XX      XX XX   XXX     XX XX   XX   XX   XX   XX      XX       XX    ");
        System.out.println("  XX     XX XX   XXXXX     XXXXX   XX XX   XX XX   XXXXX   XX   XX   XX   XXXXX   XXXXXX   XXXXX ");
        System.out.println("=================================================================================================\n");
        System.out.println("Type your name:");
        String name = input.nextLine();
        System.out.println(("\n") + (name));
        System.out.println(" Type your age ");
        int age = input.nextInt();
        if (age < 16) {
            System.out.println(name + " You are " + age + " years old " + " You cannot play this game. Go back to lol, kid!\n ");
            main(args);
        } else {
            System.out.println(name + age +" years old " + " \nYou can play, it's your choice! ");
        }

        System.out.println("Everytime you saw the '***' warning. Pay attention. It means that the action will interfere\n in your gameplay");
        System.out.println("--------------------------------");
        System.out.println("You are trapped inside your mind");
        System.out.println("Somehow, you live inside a chronicle. Your mind is full of concerns\n");
        System.out.println("Your mind is sick, good human being");
        System.out.println("The full world is in front of you");
        System.out.println("You've gotta begin your journey");
        System.out.println("--------------------------------");
        System.out.println("You gotta find a way out of yourself.");
        System.out.println("...");
        System.out.println("But how?");
        System.out.print("This, you gotta find on yourself...\n");
        System.out.println("--------------------------------");
        System.out.println("There is sometime you haven't smile.\n There is sometime you don't know how to fix this situation;");
        System.out.println("Today you tought about it. This situation cannot continue, and you gotta end it.");
        System.out.println("The first choice you have to do is:\n");
        System.out.println("--------------------------------");
        System.out.println("What would you do?\n");
        System.out.println("--------------------------------");
        System.out.println("Press 1 -- to end your suffer");
        System.out.println("Press 2 -- to keep trying");
        System.out.println("---------------------------------");
        int choice1 = input.nextInt();
        if (choice1 == 1) {
            System.out.println("***You choose the faster way.***\n So, looking to the stars, \n you put it the knife in your throat and finished your suffer.\n");
            System.out.println("------------------------------");
            System.out.println("GAME OVER!");
            System.out.println("------------------------------");
            main(args);

        }
        if (choice1 == 2) {
            System.out.println("\n");
            System.out.println("----------------------------");
            System.out.println("***Farewell, brave human being.***\n You choose to embrace your demons, and fight for life");
            System.out.println("----------------------------\n");

        }
        System.out.println("You passed by your delusions once again. But you gotta fix your problem \n you need to win this race against yourself");
        System.out.println("You think about medicine. You think about drugs.");
        System.out.println("You think a lot of things, but you gotta choose one\n");

        System.out.println("-----------------------------");
        System.out.println("What would you do?");
        System.out.println("-----------------------------\n");
        System.out.println("Press 1 to do Drugs");
        System.out.println("Press 2 to try medicine");
        System.out.println("-----------------------------");
        int choice2 = input.nextInt();
        if (choice2 == 1) {
            System.out.println("So you tryied to run away your mind, by causing more trouble in it.\n");
            System.out.println("It was nice in the beginning. But then your depression became unstoppable.");
            System.out.println("You take it your knife, and put it into your throat");
            System.out.println("---------------------------");
            System.out.println("GAME OVER");
            System.out.println("---------------------------");
            main(args);

        }
        if (choice2 == 2) {
            System.out.println("***You got the medicine.***\nOnce again you're full of will of survive.");
            System.out.println("You went to the doctor");
            System.out.println("He gave you some pills");
            System.out.println("These gonna be enough to keep you away from your suicidal tendencies a little bit more");
            System.out.println("----------------------------------------");
        }
        System.out.println("\n\n you have waked up the following day,\n with a great smile in your face");
        System.out.println("You decide to leave the fortress of your home, and stare the world in front of you\n ");
        System.out.println("Walking in the street, you found the girl you were crushed\n");
        System.out.println("---------------------------------------");
        System.out.println("What would you do?");
        System.out.println("---------------------------------------");
        System.out.println("Press 1 to say hi!");
        System.out.println("Press 2 to keep walking your way");
        System.out.println("---------------------------------------");

        int choice3 = input.nextInt();
        if (choice3 == 1) {
            System.out.println("You choose it to try again your pursuit of hapiness");
            System.out.println("She smiles to you.");
            System.out.println("She asked you for a date sometime");
            System.out.println("After so much time, a sincere smile came out from your face\n");
        }
        if (choice3 == 2) {
            System.out.println("You leave the girl behind, and continues your journey");
            System.out.println("Walking a little bit by the sidewalk. You saw a car blowing up\n a guy against the wall at  the sidewalk");
            System.out.println("You look at it, one step more, and could be you...");
            System.out.println("Perhaps you should have stoped and talked with her...");
            System.out.println("But your self esteem are so low, companion....");
        }

        System.out.println("In your way across the city, you got three ways to get through the market and buy a beer");
        System.out.println("But you find three different situations");
        System.out.println("-----------------------------------------");
        System.out.println("At the first street, several cops are doing something you don't know\n");
        System.out.println("At the second street, there is a politician making a speech\n");
        System.out.println("And finally, the last street you can go through are full of people,\n\n the reason you don't know, too many people in front of the way\n");
        System.out.println("------------------------------------------");

        System.out.println("Farewell, companion.\n What would you do?");
        System.out.println("-----------------------------------");
        System.out.println("- Press 1 - to go through the first street");
        System.out.println("- Press 2 - to go through the second street");
        System.out.println("- Press 3 - to go through the third street");
        System.out.println("----------------------------------");
        int choice4 = input.nextInt();
        switch (choice4) {
            case 1:
                System.out.println("You choose the first way then...");
                System.out.println("The cops are doing a search.");
                System.out.println("The jewel store has been robbed");
                System.out.println("The police stare at you, but after a quick stop, and collecting a picture of you, and ID number, they let you go!");
                System.out.println("***You were in the cops database, be careful with your actions***");
                break;
            case 2:
                System.out.println("You choose the second way, then...");
                System.out.println("The city Mayor are doing his speech");
                System.out.println("You have to wait till he's done");
                System.out.println("It will take sometime...");
                
                int wait = 1;
                while (wait <= 10000) {
                    wait++;
                    System.out.println(wait);
                    System.out.println("Please wait till the end of the speech");
                }
                System.out.println("Now, you can pass!\n\n");
                break;

            case 3:
                System.out.println("You choose the third way, then...");
                System.out.println("The street are full of people");
                System.out.println("It looks like a small band from town who achieve success\n decided to make a free show");
                System.out.println("Want to enjoy the show?\n\n");

                System.out.println("-- press 1 -- to stay here, and enjoy the music");
                System.out.println("-- press 2 -- to leave, and follow your way for the market, and get a beer");
                int show = input.nextInt();
                if (show == 1) {
                    System.out.println("Sooooo, you decided to stay.");
                    System.out.println("The market can wait");
                    System.out.println("The beer can wait");
                    System.out.println("LET'S ROCK, BITCH!");

                    int rock = 1;
                    while (rock <= 5) {
                        rock++;
                        System.out.println("♫Rock it out, baby♫");
                    }
                    System.out.println("All right. After several hours of party\n the show has ended");
                    System.out.println("you can follow your way");
                    break;
                }

        }
        System.out.println("--------------------------------------");
        System.out.println("The market is right in front of you.");
        System.out.println("Once you're in, you saw a guy robbing an old lady");
        System.out.println("Nobody saw it, except by you\n");
        System.out.println("------------------------------------");
        System.out.println("Farewell, companion\n ***What would you do?***");
        System.out.println("-- Press 1 -- To ignore that scene, buy your beer, and get out of here");
        System.out.println("-- Press 2 -- To stab him with your knife");
        System.out.println("-------------------------------------\n");
        int choice5 = input.nextInt();
        if (choice5 == 1) {
            System.out.println("Oh, you've been selfish, companion.\n But you don't seem to care about it. right!?");
            System.out.println("The guy take it the old lady's bag and went away by the door");
            System.out.println("You just kept looking at it, while he goes");
        } else if (choice5 == 2) {

            System.out.println("Like if you got a storm of will, you trowed this crook to the ground.\n Stopped in front of him. Staring him in the eyes");
            System.out.println("You're thinking about killing him");
            System.out.println("---------------------------------");
            System.out.println("Farewell, companion\nWhat would you do?");
            System.out.println("---------------------------------\n");
            System.out.println("-- Press 1 -- To stab him several times, till he dies");
            System.out.println("-- Press 2 -- To stab him once in the leg, to make him unable to walk, till the cops arrive");
            System.out.println("-- Press 3 -- To stab him till he dies, and then, steal his wallet");
            int stab = input.nextInt();
            switch (stab) {
                case 1:
                    System.out.println("Your eyes are shining, and you are full of will to kill this motherfucker");
                    System.out.println("Staring him, you hold your knife, and prepare to stab him till death");

                    int killing01 = 0;
                    while (killing01 <= 5) {
                        killing01++;
                        System.out.println(" Stab " + killing01);
                    }
                    System.out.println("You're so fucking maniac... Seriously you counted how many times you stabbed him?");
                    System.out.println("It seems like he's dead already");
                    System.out.println("You leave the body, and run, after hear a siren noise");
                    System.out.println("***The police may be looking for you, be careful***");
                    System.out.println("Avoid any cop you see by now");

                    break;

                case 2:
                    System.out.println("Farewell, companion,");
                    System.out.println("Then,you seems to be someone with some kind of humanity.");
                    System.out.println("You have been stabbed him in the leg, so he coudn't run anymore. ");
                    System.out.println("The cops arrived, and then you were gifted with the honor medal\n");
                    System.out.println("***You got the Honor Medal***");
                    break;

                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("So, you let your evil side came out.");
                    System.out.println("Don't you ever think about your evil behavior.");
                    System.out.println("Whatever. you've made your choice.");
                    System.out.println("-----------------------------------------------");

                    System.out.println("You kicked the motherfucker crook to the ground");
                    System.out.println("Stabbed him bruttally till his death. And then, take it his wallet and the old lady's bag");
                    int killing02 = 1;
                    while (killing02 <= 66) {
                        killing02++;
                        System.out.println("Die, Motherfucker!");
                    }
                    if (stab == 3) {
                        System.out.println("When you're getting out of the market, The cops were in front of you");
                        System.out.println("Now you're gonna spend the rest of your days in jail...");
                        System.out.println("***GAME OVER!***");
                        main(args);
                    }
            }
        }

        System.out.println("What a day!\n And you just wanted a beer when left home");
        if (choice5 == 2) {
            System.out.println("You haven't bought your beer, by the way!");
        }
        System.out.println("Or, you maybe just need another one!");
        System.out.println("Want to go back to buy it!?");
        System.out.println("------------------------------");
        System.out.println("What would you do?");
        System.out.println("------------------------------");
        System.out.println("-- Press 1 -- To fuck this shit. I don't want a beer anymore! ");
        System.out.println("-- Press 2 -- To drink a beer");
        System.out.println("------------------------------");

        int beer = input.nextInt();
        if (beer == 1) {

            System.out.println("Enough of drinks for you right now.");
            System.out.println("It seems like a good ideia before");
            System.out.println("but not now...");
            System.out.println("Maybe you should back home...");
        } else if (beer == 2) {
            System.out.println("So, you want to drink a beer.");
            System.out.println("You entered at the bar");

            System.out.println("--------------------------------");
            System.out.println("-- Press 1 -- To drink one beer");
            System.out.println("-- Press 2 -- To drink two beers");
            System.out.println("-- Press 3 -- To drink three beers");
            System.out.println("-- Press 4 -- To drink four beers");
            System.out.println("--------------------------------");
            int switchbeer = input.nextInt();
            switch (switchbeer) {
                case 1:
                    System.out.println("Ahhh, nothing like a beer, right?");
                    System.out.println("Fresh, so cold going down by your throat!");
                    System.out.println("Like a good citizen, you've drinked one beer, and walk");
                    break;

                case 2:
                    System.out.println("Wow, better than one beer? Two beers!");
                    System.out.println("You are a little bit high, but nothing that could fuck you!");
                    System.out.println("You've drinked two beers and walked");
                    break;

                case 3:
                    System.out.println("One, Two, Three, motherfucker!!!");
                    System.out.println("You are high as fuck, but you still can go home");
                    System.out.println("You've drinked three beers, and drunk walked away");
                    break;

                case 4:
                    System.out.println("You just kicked out any sense of notion, companion");
                    System.out.println("In the middle of the night you said that you would pay drinks for everyone");
                    System.out.println("But, geniously, you forgotted that you doesn't have enough money to pay for all  these drinks\n");
                    System.out.println("Now the owner want you to wash the dishes to go free\n");
                    System.out.println("---------------------------------------------");
                    System.out.println("What would you do?");
                    System.out.println("---------------------------------------------");
                    System.out.println("-- Press 1 -- To Runnaway, and fuck those dishes!");
                    System.out.println("-- Press 2 -- To wash the dishes");
                    System.out.println("---------------------------------------------");
                    int dishes = input.nextInt();
                    if (dishes == 1) {
                        System.out.println("You thought it would be this easy");
                        System.out.println("Trying to escape, you've been beaten like a dog");
                        System.out.println("They leave you in a coma, by the sidewalk");
                        System.out.println("------------------------------------------");
                        System.out.println("   ***GAME OVER***   ");
                        System.out.println("------------------------------------------");
                        main(args);
                    }
                    if (dishes == 2) {
                        System.out.println("At least you're trying to fix this bullshit you created, moron!");
                        int washdishes = 1;
                        while (washdishes <= 50000) {
                            washdishes++;
                            System.out.println("Wash it, sucker!!!");
                        }
                        System.out.println("Then, you finished washing those dishes");
                        System.out.println("Hard lesson, but well learned...");
                    }
                    break;

            }

        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("After a long day, you came back home, thought about your life, about your dreams...\n"
                + "All the things you won, all the things you loose. And somethings make you hopefull...");
        System.out.println("------------------------------------------------------------------------------\n");

        System.out.println("-------------------------------------------------------");
        System.out.println("One of those things, my friend, is love!");
        System.out.println("Yes, companion, I'm talking about that girl");
        System.out.println("I'm talking about love");
        System.out.println("Love, companion, getting out of your chest, intensely");
        System.out.println("You thinking about this girl...\n that girl who won your heart...");
        System.out.println("You thought about her... She asked for a date sometime.");
        System.out.println("Why not call her?");
        System.out.println("-------------------------------------------------------\n");

        System.out.println("---------------------------------");
        System.out.println("What would you do?");
        System.out.println("----------------------------------");
        System.out.println("-- Press 1 -- To call her!");
        System.out.println("-- Press 2 -- To give up on this!");
        System.out.println("----------------------------------");
        int choice6 = input.nextInt();
        if (choice6 == 1) {
            if (choice3 == 1) {
                System.out.println("You decided with your heart");
                System.out.println("You called her, and she answered with a smile voice");
                System.out.println("It seems she is happy by your call!");
                System.out.println("You and her are talking a lot!");
                int lovetalk = 1;
                while (lovetalk <= 100) {
                    lovetalk++;
                    System.out.println(" ♥ Love, companion, love ♥ ");
                }
            } else if (choice3 == 2) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("How can you call her, if you hasn't even talked with her, my friend?");
                System.out.println("Your self esteem are so low.");
                System.out.println("You don't believe in yourself");
                System.out.println("Even with a smile of her");
                System.out.println("But, you've gotta have your reasons, companion");
                System.out.println("--------------------------------------------------------------------\n");
                System.out.println("------------------------------------------");
                System.out.println("Do you still want to call her? It's on you");
                System.out.println("-- Press 1 -- To Yes");
                System.out.println("-- Press 2 -- To No");
                System.out.println("------------------------------------------");

                int lovegirl = input.nextInt();
                if (lovegirl == 1) {
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    System.out.println("Okay, so you want to call her... But you haven't tought it better before.");
                    System.out.println("She answered you. Gently. But it doesn't seems like she's interested in a date with you anymore);");
                    System.out.println("Perhaps if you had choose it better, companion...");
                    System.out.println("This story could be different");
                    System.out.println("-------------------------------------------------------------------------------------------------");
                } else if (lovegirl == 2) {
                    System.out.println("You haven't talked with her before. It doesn't make sense to talk now...");
                    System.out.println("So, let it go, companion. And follow your way");
                }

            }
        } else if (choice6 == 2) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("You wanted, but you feel like you can't. Right?");
            System.out.println("She asked you for a date, you want to date with her. And still don't want to call her");
            System.out.println("This could be a great chance of some sort of happy moments, companion...");
            System.out.println("But the life is yours. As your choices too");
            System.out.println("-------------------------------------------------------------------------------------");
        }

        System.out.println("------------------------------------------------");
        System.out.println("You are now in your home. Staring at the ceiling");
        System.out.println("You though about Yesterday, you tought about tomorrow");
        System.out.println("You tought so many things about hope, about being happy once more...");
        System.out.println("Your chronicle began so long ago, when you just born");
        System.out.println("And your story, is the great pursuit of happiness");
        System.out.println("You deserve it companion. Just like we all do");
        System.out.println("It's just a matter of your choices, and if the world stabs, or smiles to you...");
        System.out.println("------------------------------------------------");
        System.out.println("\n");
        System.out.println("------------------------------------------------");
        System.out.println("You got a great choice to do, and based on it, your life can change forever.");
        System.out.println("Your actions represent everything you will ever live someday");
        System.out.println("So, once again, your facing yourself in reflection...");
        System.out.println("So, once again your divided about go on, and believe in life.\n or put some end at thi uncertain and painful life of choices and delusions");
        System.out.println("You can still believing, and pursuit your so wanted happiness, or you can just be part of the nature again, by transforming your boy, by the act of dying");
        System.out.println("------------------------------------------------");
        System.out.println("Farewell, companion...");
        System.out.println("What you wanna do?");
        System.out.println("------------------------------------------------");
        System.out.println("-- Press 1 -- To Believe in life");
        System.out.println("-- Press 2 -- To Give up");
        System.out.println("------------------------------------------------");

        //ENDGAME 1
        int choicelife = input.nextInt();

        if (choicelife == 1) {
            System.out.println("-----------------------------------------");
            System.out.println("So, your will for life is admirable, good human. You can have great days in your life.");
            System.out.println("You just gotta believe in yourself");
            System.out.println("You just gotta be the best you can be!");
            System.out.println("-----------------------------------------");
        } else if (choicelife == 2) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Unfortunatelly, you choose it the faster way, but not the easiest, I can tell you...");
            System.out.println("You were so lost, confused, so full of will, till now");
            System.out.println("You tryied the most you could, but your demons have defeated you");
            System.out.println("You were in the top of a building, watching the city bellow you...");
            System.out.println("Then, suddenly, you just pull off the building, and flyied free for the end of life...");
            System.out.println("Farewell, brave human being, rest in peace, wherever you were now...");
            System.out.println("Such a great lost...");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(" -- G A M E  O V E R -- ");
            System.out.println("-------------------------------------------------------------------------------------");
            main(args);}

            if (choicelife == 1 ) {
                
                System.out.println("----------------------------------------------------------------------------------------------------------");
                System.out.println("***You founded: A wonderful woman*** ");
                System.out.println("You founded someone to believe in. Your life can be brightful, starting by now");
                System.out.println("If you had the right choices, a great future awaits for you!");
                System.out.println("I've once, not so time ago, told you, you were deserver of a great happiness, based on your will for life!");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
               
                    
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("You have been living in a state of chronical depression.");
                    System.out.println("Like if something magical happened, you founded someone to believe in your life.");
                    System.out.println("You found some of the brightest things in the world");
                    System.out.println("You founded love, companion!");
                    System.out.println("You got a reason to smile again. Your life doesn't seems worthless anymore. You feel like your world is full of hope");
                    System.out.println("May the blessings of the cosmos be with you!");
                    System.out.println("--------------------------------------------------------------------------------------------\n");

                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.println("Try to keep playing, and discover the other possibilities of finals!");
                    System.out.println("Life is uncertain, and your actions will interfere in absolutely everything you gonna do");
                    System.out.println("Enjoy, consequence!");
                    System.out.println("     ***CONGRATULATIONS, YOU HAVE REACHED THE ENDGAME!***     ");
                    System.out.println("----------------------------------------------------------------------------------------------");

                    System.out.println("\n=================================================================================================");
                    System.out.println("                    XXXXXX   XX XX   XXXXX     XXXXX    XXXX XX   XXXX                             ");
                    System.out.println("                      XX     XX XX   XX        XX       XX X XX   XX  XX                           ");
                    System.out.println("                      XX     XXXXX   XXXXX     XXXXX    XX  XXX   XX  XX                           ");
                    System.out.println("                      XX     XX XX   XX        XX       XX   XX   XX  XX                           ");
                    System.out.println("                      XX     XX XX   XXXXX     XXXXX    XX   XX   XXXX                             ");
                    System.out.println("=================================================================================================\n");
                    
                    System.out.println("                            *DEVELOPED BY @Victor_Flay*                                            ");
                    //ENDGAME1

                }
            }

            /*int beer = input.nextInt();
                                   if(beer==1){
                                       System.out.println("Ahhhh, refreshing");
                                       System.out.println("Nothing like a cold beer!");
                                       System.out.println("Maybe I'll have another");
                                       }
                                   if (beer==2){
                                       System.out.println("Allright, fuck the beer then!");
                                   }
                                   
                                   int beer2 = input.nextInt();
                                       
                                       if (beer2 == 1){
                                           System.out.println("Ahhhh, better than one beer, two beers!");
                                           System.out.println("It will not make any bad have another, isn't?");
                                       }
                                       if (beer2 ==2){
                                           System.out.println("Allright, one beer is more than sufficient.Better stop by now!");
                                       }
                                   
                                   int beer2 = input.nextInt();
                                       if (beer2 ==1){
                                           int beer3 = input.nextInt();
                                           if (beer3 ==1){
                                               System.out.println("YHAAAAAA!");
                                               System.out.println("1, 2, 3, fuck it!!!!");
                                               System.out.println("Maybe I'll have another?");
                                           
                                       }
                                            if (beer3 == 2){
                                               System.out.println("One, two. Sometimes we need a break to relax, isn't?");
                                               System.out.println("But you kept your good behavior. And don't goes off the edge!");
                                           }
                                       }
                                       int beer3 = input.nextInt();
                                       if (beer3 ==1){
                                               int beer4 = input.nextInt();
                                               if ((beer3==1) && (beer4 ==1)){
                                                   System.out.println("-------------------------------------");
                                                   System.out.println("Allright. I'm kinda drunk mothafocka!");
                                                   System.out.println("Fuck everything, I love you all!");
                                                   System.out.println("Who wants a beer on me?!");
                                                   System.out.println("One more for everyone, I'll pay!");
                                                   System.out.println("----------------------------------\n\n\n");
                                                   System.out.println("Farewell, genius, the bar party has over, and then you discovered that you have no money to pay it all...");
                                                   System.out.println("\n--------------------------------------------------");
                                                   System.out.println("What would you do?");
                                                   System.out.println("-----------------------------------------------------");
                                                   System.out.println("-- Press 1 -- To wash some dishes");
                                                   System.out.println("-- Press 2 -- To runaway!");
                                                   
                                               } 
                                               else if (beer4 == 2){
                                                   System.out.println("You are so fuckiiiiig drunk.\n but at least this time you haven't spent all your money!");
                                               }
                                       }*/
        }






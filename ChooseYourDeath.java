//Blake Allison 

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14; 

public class ChooseYourDeath {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("You're bored in your room, what do you do?");
    System.out.println("A) Go to sleep.");
    System.out.println("B) Watch Youtube.");
    System.out.println("C) Go for a run.");
    String option1 = sc.nextLine();

    //option1A
    if (option1.equals("a") || option1.equals("A"))
    {
        System.out.println("You went to bed but forgot to set your alarm.");
        System.out.println("You wake up at 6, practice started 30 minutes ago!!! What do you do?");
        System.out.println("A) Run out the door.");
        System.out.println("B) Text coach you'll be late and head to practice.");
        System.out.println("C) Go back to sleep.");
        String option1A = sc.nextLine();
        
        //option1AA
        if (option1A.equals("a") || option1A.equals("A"))
        {
            System.out.println("When you arive at practice Coach V asks why you are late, what do you do?");
            System.out.println("A) Say, Wouldn't you like to know.");
            System.out.println("B) Say, I forgot to set my alarm.");
            String option1AA = sc.nextLine();

            //option1AAA
            if (option1AA.equals("a") || option1AA.equals("A"))
            {
                System.out.println("Coach V. says, 'Yes, thats why I asked' you look at him and, without responding, you power walk out of pactice, on your way out it's dark and you accidently run head first into a door. The head trauma kills you on impact.");
            }

            //option1AAB
            else if (option1AA.equals("b") || option1AA.equals("B"))
            {
                System.out.println("Coach V. rolls his eyes so aggresively there's a tornado, it tears one of the diving boards off its stand, it hits you in the face and you die.");
            }
            else 
                System.out.println("That wasn't an option.");
        }

        //option1AB
        else if (option1A.equals("b") || option1A.equals("B"))
        {
            System.out.println("When you arrive Coach V tells you to do 500 push  ups! What do you do?");
            System.out.println("A) Say, 'Girl who do you think your asking to do pushups...?'");
            System.out.println("B) Start doing pushups.");
            String option1AB = sc.nextLine();

            //option1ABA
            if (option1AB.equals("a") || option1AB.equals("A"))
            {
                System.out.println("Coach V. Makes direct eyecontact with you and stares so deeply into your soul you die on the spot.");
            }

            //option1ABB
            else if (option1AB.equals("b") || option1AB.equals("B"))
            {
                System.out.println("While attempting 500 pushups you remember you didn't eat breakfast becuase you where in a rush. You get up after 50 to try and grab a snack and on the way trip over a saftey cone. You fall into the pool and accidently breath in water, you die.");
            }
            else 
                System.out.println("That wasn't an option.");
        }
            
        //option1AC
        else if (option1A.equals("c") || option1A.equals("C"))
        {
            System.out.println("Coach V breaks through your wall like the kool-aid man and assigns you 800 fly for your lazyness. While attempting your fly you remember you're a diver and you don't know how to swim fly, sadly you realized this at the bottom of the pool and now you're dead. ¯\\_(ツ)_/¯ ");
        }
        else 
            System.out.println("That wasn't an option.");
    }

    //option1B
    else if (option1.equals("b") || option1.equals("B"))
    {
        System.out.println("You watched youtube till 2 in the morning and when you wake up for practice you're exhausted");
        System.out.println("Coach V. see’s your awful performance and asks why you suck, what do you do?");
        System.out.println("A) Jump in the pool and hide under the bulkhead");
        System.out.println("B) Tell him you stayed up late");
        System.out.println("C) Tell him you don't feel well");
        String option1B = sc.nextLine();

        //Option1BA
        if (option1B.equals("a") || option1B.equals("A"))
        {
            System.out.println("While your under the bulkhead you realize you need to breath! Sadly your arm is traped and you can't escape, you drown.");
        }

        //option1BB
        else if (option1B.equals("b") || option1B.equals("B"))
        {
            System.out.println("Coach V. holds a team meeting telling everyone that we have a chance to win it all this year, but only if we all are dedicated and keeps making eyecontact with you, what do you do?");
            System.out.println("A) Discretely roll your eyes.");
            System.out.println("B) Lock eyes with him.");
            String option1BB = sc.nextLine();

            //option1BBA
            if (option1BB.equals("a") || option1BB.equals("A"))
            {
                System.out.println("Coach sees you roll your eyes and yells so loudly that your head literally exploads.");
            }

            //option1BBB
            else if (option1BB.equals("b") || option1BB.equals("B"))
            {
                System.out.println("In your refuesal to drop eyecontact you miss that a swimmer farted, the smell is so fowl that you go unconcious and never wake up.");
            }
            else 
                System.out.println("That wasn't an option.");
        }

        //option1BC
        else if (option1B.equals("c") || option1B.equals("C"))
        {
            System.out.println("Coach tells you that you look fine and to try to dive anyways. What do you do?");
            System.out.println("A) Go to the diving board.");
            System.out.println("B) Say, 'Coach I can't.'");
            String option1BC = sc.nextLine();
            
            //option1BCA
            if (option1BC.equals("a") || option1BC.equals("A"))
            {
                System.out.print("You attempt to do your prove to coach your amazing and try a hard dive, however right when you jump off the board Coach V whistles. The wistle scares you so bad you fall out of your dive and land completely parallel to the water and your ribcage breaks killing you.");
            }
            
            //option1BCB
            if (option1BC.equals("b") || option1BC.equals("B"))
            {
                System.out.print("Right as the word 'can't' leaves your mouth you realize your mistake. Coach instently goes supersane and shoots lazers out of eye's turning you to dust in an instant.");
            }

        }
    }

    //option1C
    else if (option1.equals("c") || option1.equals("C"))
    {
        System.out.println("You ran and sleep super well, you show up to practice on time but you have squats and your legs hurt. Coach V tells you to go deeper in your squat you try, but you end up falling when the weight rack falls on top of you! You wake up in the hospital, what do you do?");
        System.out.println("A) wiggle your toes");
        System.out.println("B) escape the hospital");
        System.out.println("C) Ask your nurse if it hurt when they fell from heaven");
        String option1C = sc.nextLine();

        //option1CA
        if (option1C.equals("a") || option1C.equals("A"))
        {
            System.out.println("When you try to wiggle your toes you realize you don't have any!!! Coach V. is in the hospital and tells you that it's time to go to practice, what do you do?");
            System.out.println("A) Say, 'Ok' and sigh");
            System.out.println("B) Roll over in bed");
            String option1CA = sc.nextLine();

            //option1CAA
            if (option1CA.equals("a") || option1CA.equals("A"))
            {
                System.out.println("Without your toes you're shockingly still able to dive, however you can no longer point your toes sense they don't exist! Coach Teri gets so annoyed with your lack of a toe point that she throws you off the diving board, you land face first on the bulkhead and die...");        
            }

            //option1CAB
            else if (option1CA.equals("b") || option1CA.equals("B"))
            {
                System.out.println("Coach V. picks you up and takes you to practice, when you refuse to get in he spartan kicks you into the water, however without toes you sink to the bottom. No one notices so you drown.");
            }

            else 
                System.out.println("That wasn't an option.");
        }
        //option1CB
        else if (option1C.equals("b") || option1C.equals("B"))
        {
            System.out.println("When you get up you realize your legs still hurt! You try to run anyways but you fall when you see you no longer have toes. Sadly you realized this on the 69th floor of the building and fall out the window");
        }

        //option1CC
        else if (option1C.equals("c") || option1C.equals("C"))
        {
            System.out.println("The nurse responds with, 'not as bad as it'll hurt if you ask that again.' What do you do?");
            System.out.println("A) Say, 'screw you too'");
            System.out.println("B) Say, 'Oh, someones spicy...'");
            String option1CC = sc.nextLine();

            if (option1CC.equals("a") || option1CC.equals("A") || option1CC.equals("b") || option1CC.equals("B"))
            {
                System.out.println("The nurse looks at you as they run an IV threw your arm then they say, 'OOOPS' and you black out.... the IV was pure distilled water, you died fairly quickly");
            }
            else 
                System.out.println("That wasn't an option.");
        }    
        else 
            System.out.println("That wasn't an option.");
    }

    else 
        System.out.println("That wasn't an option.");
    }
}

package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainProg {

    public static void line() {
        System.out.println("\n----------------------\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> typePet = new ArrayList<>();
        typePet.add(0, "Cat");
        typePet.add(1, "Dog");

        String catBreed[] = { "Lion", "Tiger", "Leopard", "Tiger", "Persian" };
        String dogBreed[] = { "Wolf", "Dingo", "Coyote", "Fox", "Askal" };
        System.out.print("\nWhat is your name :");

        String ownerStr = sc.nextLine();

        line();
        System.out.println(ownerStr + ", Please Select your Pet!");
        System.out.println(typePet);
        String typePetStr = sc.nextLine();
        line();
        System.out.println(ownerStr + ", Please Select Breed!");

        PetOwner petOwner = new PetOwner();
        Cat cat = new Cat();
        Dog dog = new Dog();
        String stats = "";
        double speedStat;
        int atkStat, hpStat;

        if (typePetStr.equalsIgnoreCase("Cat")) {
            System.out.println(Arrays.toString(catBreed));
            String breedStr = sc.nextLine();
            if (breedStr.equalsIgnoreCase("Lion")) {
                petOwner.setId("001");
                petOwner.setName(ownerStr);
                petOwner.setPet("cat");
                cat.setPetName("King");
                cat.setAttackDamage(15);
                cat.setRunSpeed(10.0);
                cat.setLifeCounter(20);

            } else if (breedStr.equalsIgnoreCase("Tiger")) {
                petOwner.setId("002");
                petOwner.setName(ownerStr);
                petOwner.setPet("cat");
                cat.setPetName("Stripe");
                cat.setAttackDamage(12);
                cat.setRunSpeed(13.0);
                cat.setLifeCounter(18);

            } else if (breedStr.equalsIgnoreCase("Leopard")) {
                petOwner.setId("003");
                petOwner.setName(ownerStr);
                petOwner.setPet("cat");
                cat.setPetName("Reaper");
                cat.setAttackDamage(10);
                cat.setRunSpeed(18.0);
                cat.setLifeCounter(16);
            } else if (breedStr.equalsIgnoreCase("Jaguar")) {
                petOwner.setId("004");
                petOwner.setName(ownerStr);
                petOwner.setPet("cat");
                cat.setPetName("Raze");
                cat.setAttackDamage(9);
                cat.setRunSpeed(20.0);
                cat.setLifeCounter(14);
            } else if (breedStr.equalsIgnoreCase("Persian")) {
                petOwner.setId("005");
                petOwner.setName(ownerStr);
                petOwner.setPet("cat");
                cat.setPetName("Royal");
                cat.setAttackDamage(3);
                cat.setRunSpeed(7.0);
                cat.setLifeCounter(5);

            }
            stats += "Name of pet: " + cat.getPetName() + "   Attack Damage: " + cat.getAttackDamage() + "   HP: "
                    + cat.getLifeCounter() + "   Movement Speed: " + cat.getRunSpeed();
            speedStat = cat.getRunSpeed();
            hpStat = cat.getLifeCounter();
            atkStat = cat.getAttackDamage();

        } else {
            System.out.println(Arrays.toString(dogBreed));
            String breedStr = sc.nextLine();
            if (breedStr.equalsIgnoreCase("Wolf")) {
                petOwner.setId("006");
                petOwner.setName(ownerStr);
                petOwner.setPet("dog");
                dog.setPetName("Fury");
                dog.setAttackDamage(10);
                dog.setRunSpeed(16.0);
                dog.setLifeCounter(16);
            } else if (breedStr.equalsIgnoreCase("Dingo")) {
                petOwner.setId("007");
                petOwner.setName(ownerStr);
                petOwner.setPet("dog");
                dog.setPetName("Dante");
                dog.setAttackDamage(10);
                dog.setRunSpeed(11.0);
                dog.setLifeCounter(16);
            } else if (breedStr.equalsIgnoreCase("Coyote")) {
                petOwner.setId("008");
                petOwner.setName(ownerStr);
                petOwner.setPet("dog");
                dog.setPetName("Wildle");
                dog.setAttackDamage(8);
                dog.setRunSpeed(15.0);
                dog.setLifeCounter(9);
            } else if (breedStr.equalsIgnoreCase("Fox")) {
                petOwner.setId("009");
                petOwner.setName(ownerStr);
                petOwner.setPet("dog");
                dog.setPetName("Orange");
                dog.setAttackDamage(8);
                dog.setRunSpeed(12.0);
                dog.setLifeCounter(8);
            } else if (breedStr.equalsIgnoreCase("Askal")) {
                petOwner.setId("010");
                petOwner.setName(ownerStr);
                petOwner.setPet("dog");
                dog.setPetName("Phil");
                dog.setAttackDamage(5);
                dog.setRunSpeed(9.0);
                dog.setLifeCounter(8);
            }

            stats += "Name of pet: " + dog.getPetName() + "   Attack Damage: " + dog.getAttackDamage() + "   HP: "
                    + dog.getLifeCounter() + "   Movement Speed: " + dog.getRunSpeed();
            speedStat = dog.getRunSpeed();
            hpStat = dog.getLifeCounter();
            atkStat = dog.getAttackDamage();
        }

        line();
        System.out.println(stats);
        System.out.println("Game on!");

        Bot bot = new Bot();
        double botSpeedStat = bot.getRunSpeed();
        int botHpStat = bot.getLifeCounter();
        int botAtkStat = bot.getAttackDamage();
        String option = "";
       

        while (hpStat != 0 || botHpStat != 0) {
            line();
            Random rand = new Random();
            int choiceRand = rand.nextInt(0,100);

            System.out.print("[1.Attack | 2.Defend]: ");
            option = sc.nextLine();
            if (option.equalsIgnoreCase("1")) {
                System.out.println("Damaged!");
                botHpStat = botHpStat - atkStat;
                

            } else {
                System.out.println("Shielded!");

            }

            if (choiceRand%2==1 && option.equalsIgnoreCase("1")) {
                line();
                System.out.println("Damaged!");
                hpStat = hpStat - botAtkStat;

            }
            System.out.println("Your Hp is " + hpStat);
            System.out.println("Enemy HP: " + botHpStat);

            if (botHpStat <= 0) {
                line();
                System.out.println("Game Over!");
                System.out.println("You Win!");
                line();
                System.out.println(petOwner.getPet().showLove());
            } else if (hpStat <= 0) {
                line();
                System.out.println("Game Over!");
                System.out.println("You Lose!");
                line();
                System.out.println(petOwner.getPet().showHate());
            }

        }

    }

}

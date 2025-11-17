package project;

import java.util.Scanner;

class Guesser {
    int GuesserNum;

    public int GuesserNumb() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser kindly guess a number : ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;

    public int GuesserNumb() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire {
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser() {
        Guesser gu = new Guesser();
        Guessernum = gu.GuesserNumb();
    }

    public void CollectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        System.out.print("Player1 kindly guess a number : ");
        Playernum1 = p1.GuesserNumb();
        System.out.print("Player2 kindly guess a number : ");
        Playernum2 = p2.GuesserNumb();
        System.out.print("Player3 kindly guess a number : ");
        Playernum3 = p3.GuesserNumb();
    }

    public void compare() {
        if (Guessernum == Playernum1) {
            if (Guessernum == Playernum2 && Guessernum == Playernum3) {
                System.out.println("All players won the game. ");
            } else if (Guessernum == Playernum2) {
                System.out.println("Player 1 and Player  2  won the game.");
            } else if (Guessernum == Playernum3) {
                System.out.println("Player 1 and  Player 3  won the game.");
            } else
                System.out.println("Player 1 won the game");
        } else if (Guessernum == Playernum2) {
            if (Guessernum == Playernum3) {
                System.out.println("Player 1 and Player 3 won the game. ");
            } else
                System.out.println("Player 2 won the game");
        } else if (Guessernum == Playernum3) {
            System.out.println("Only player 3 won the game");
        } else {
            System.out.println("All players lost the game!");
        }

    }
}

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("------- Game Started -------");
        System.out.println();
        Umpire um = new Umpire();
        um.CollectNumFromGuesser();
        um.CollectNumFromPlayer();
        um.compare();
        System.out.println();
        System.out.println("------- Game End-------");

    }
}

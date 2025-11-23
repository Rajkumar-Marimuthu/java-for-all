package com.rojatech.ch01.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Given an array of  Player objects, write a comparator that sorts them in order of decreasing score;
if  or more players have the same score, sort those players alphabetically by name.
 */

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        } else {
            return a.name.compareTo(b.name);
        }
    }
}

public class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        System.out.println("Player class executed");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}

package com.company.Excercise_14;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque1 = new LinkedList();
        Deque<Integer> deque2 = new LinkedList();

        for (int jj = 0; jj < 5; jj++){
            deque1.add(scanner.nextInt());
        }
        for (int jj = 0; jj < 5; jj++){
            deque2.add(scanner.nextInt());
        }

        int step = 0, card_1, card_2;
        while (deque1.size() != 0 && deque2.size() != 0){
            if (step == 106){
                break;
            }
            card_1 = deque1.pollFirst();
            card_2 = deque2.pollFirst();
            if (card_1 == 0 && card_2 == 9){
                deque1.add(card_1);
                deque1.add(card_2);
            }
            else if (card_2 == 0 && card_1 == 9){
                deque2.add(card_1);
                deque2.add(card_2);
            }
            else if (card_1 > card_2){
                deque1.add(card_1);
                deque1.add(card_2);
            }
            else if (card_1 < card_2){

                deque2.add(card_1);
                deque2.add(card_2);
            }
            else {
                deque1.add(card_1);
                deque2.add(card_2);
            }

            step++;
        }

        System.out.println("Steps: " + step);
        if (step == 106){
            System.out.println("botva");
        }
        else if (deque1.size() == 0){
            System.out.println("second");
        }
        else if (deque2.size() == 0){
            System.out.println("first");
        }

    }
}


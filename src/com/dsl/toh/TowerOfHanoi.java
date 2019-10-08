package com.dsl.toh;

import com.dsl.toh.core.Command;
import com.dsl.toh.core.CommandController;

import java.util.ArrayDeque;
import java.util.List;

public class TowerOfHanoi
{
    public static void main(String[] args)
    {
        Command command = new CommandController();
        List<ArrayDeque<Integer>> pegs = command.start(3);
        System.out.println("Start:");
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(0), pegs.get(2));
        System.out.println("\nProcessing: ");
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(0), pegs.get(1));
        System.out.println("\nProcessing: ");
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(2), pegs.get(1));
        System.out.println("\nProcessing: ");
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(0), pegs.get(2));
        System.out.println("\nProcessing: ");
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(1), pegs.get(0));
        System.out.println("\nProcessing: ");
        pegs.forEach(peg -> System.out.print(peg + " "));
        System.out.println("\nProcessing: ");
        command.move(pegs.get(1), pegs.get(2));
        pegs.forEach(peg -> System.out.print(peg + " "));
        command.move(pegs.get(0), pegs.get(2));
        System.out.println("\nDone: ");
        pegs.forEach(peg -> System.out.print(peg + " "));

        // [3, 2, 1] [] []
        // [3, 2] [] [1]
        // [3] [2] [1]
        // [3] [2,1] []
        // [] [2, 1] [3]
        // [1] [2] [3]
        // [1] [] [3, 2]
        // [] [] [3, 2, 1]

    }
}

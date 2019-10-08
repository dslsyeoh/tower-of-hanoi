/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.toh.core;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommandController implements Command
{
    private int count = 0;
    private List<ArrayDeque<Integer>> pegs;
    private double best_move = 0;
    @Override
    public void start(int size)
    {
        pegs = IntStream.rangeClosed(1, size).boxed().map(i -> new ArrayDeque<Integer>()).collect(Collectors.toList());
        best_move = Math.pow(2, size) - 1;
        for(int i = 3; i > 0; i--)
        {
            pegs.get(0).add(i);
        }
    }

    @Override
    public void move(ArrayDeque<Integer> source, ArrayDeque<Integer> target)
    {
        count++;
        Integer value = source.pollLast();
        if(Objects.nonNull(value))
        {
            target.addLast(value);
        }
    }

    @Override
    public List<ArrayDeque<Integer>> getPegs()
    {
        return pegs;
    }

    @Override
    public String getResult()
    {
        if(pegs.get(pegs.size() - 1).size() == 3)
        {
            return best_move == count ? "Congratulations, solved with best moves!" : "Solved but too much moves";
        }
        return "Too bad, try again!";
    }
}

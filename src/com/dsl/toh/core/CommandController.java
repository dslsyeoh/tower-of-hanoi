package com.dsl.toh.core;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommandController implements Command
{
    private int count = 0;
    @Override
    public List<ArrayDeque<Integer>> start(int size)
    {
        List<ArrayDeque<Integer>> pegs = IntStream.rangeClosed(1, size).boxed().map(i -> new ArrayDeque<Integer>()).collect(Collectors.toList());
        for(int i = 3; i > 0; i--)
        {
            pegs.get(0).add(i);
        }
        return pegs;
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
    public int getCount()
    {
        return count;
    }
}

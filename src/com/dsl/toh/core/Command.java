package com.dsl.toh.core;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public interface Command
{
    List<ArrayDeque<Integer>> start(int size);

    void move(ArrayDeque<Integer> source, ArrayDeque<Integer> target);

    int getCount();
}

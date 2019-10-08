/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.toh.core;

import java.util.ArrayDeque;
import java.util.List;

public interface Command
{
    void start(int size);

    void move(ArrayDeque<Integer> source, ArrayDeque<Integer> target);

    List<ArrayDeque<Integer>> getPegs();

    String getResult();
}

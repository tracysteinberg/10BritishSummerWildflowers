package com.example.tracysteinberg.a10britishsummerwildflowers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tracysteinberg on 09/08/2017.
 */

public class TopWildflowersTest {

        @Test
        public void getListTest() {
            TopWildflowers topWildflowers = new TopWildflowers();
            assertEquals(10, topWildflowers.getList().size());
        }
    }





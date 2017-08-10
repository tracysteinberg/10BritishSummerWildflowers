package com.example.tracysteinberg.a10britishsummerwildflowers;

/**
 * Created by tracysteinberg on 09/08/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;




public class WildflowerTest {

       Wildflower wildflower;

        @Before
        public void before() {
            wildflower = new Wildflower(1, "Dog Rose");
        }

        @Test
        public void getRankingTest() {
            assertEquals((Integer)1, wildflower.getRanking());

        }

        @Test
        public void getTitleTest() {
            assertEquals("Dog Rose", wildflower.getName());

        }

}

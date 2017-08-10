package com.example.tracysteinberg.a10britishsummerwildflowers;

import java.util.ArrayList;

/**
 * Created by tracysteinberg on 09/08/2017.
 */

public class TopWildflowers {


        private ArrayList<Wildflower> list;

        public TopWildflowers() {
            list = new ArrayList<Wildflower>();
            list.add(new Wildflower(1, "Dog Rose"));
            list.add(new Wildflower(2, "Honeysuckle"));
            list.add(new Wildflower(3, "Enchanters Nightshade"));
            list.add(new Wildflower(4, "Columbine"));
            list.add(new Wildflower(5, "King Cup"));
            list.add(new Wildflower(6, "Cornflower"));
            list.add(new Wildflower(7, "Water Avanes"));
            list.add(new Wildflower(8, "Forget-Me-Not"));
            list.add(new Wildflower(9, "Scarlet Pimpernel"));
            list.add(new Wildflower(10, "Ragged Robin"));

        }

        public ArrayList<Wildflower> getList() {
            return new ArrayList<Wildflower>(list);
        }

    }



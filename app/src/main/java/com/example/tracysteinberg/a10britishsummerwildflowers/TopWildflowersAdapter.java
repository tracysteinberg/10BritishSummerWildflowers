package com.example.tracysteinberg.a10britishsummerwildflowers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tracysteinberg on 09/08/2017.
 */

public class TopWildflowersAdapter extends ArrayAdapter<Wildflower>{


        public TopWildflowersAdapter(Context context, ArrayList<Wildflower> wildflowers ) {

            super(context, 0, wildflowers);
        }

        @Override
        public View getView(int position, View listItemView, ViewGroup parent) {

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.wildflowers_item, parent, false);
            }

            Wildflower currentWildflower = getItem(position);

            TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
            ranking.setText(currentWildflower.getRanking().toString());

            TextView name = (TextView) listItemView.findViewById(R.id.name);
            name.setText(currentWildflower.getName().toString());

            listItemView.setTag(currentWildflower);

            return listItemView;

        }

    }



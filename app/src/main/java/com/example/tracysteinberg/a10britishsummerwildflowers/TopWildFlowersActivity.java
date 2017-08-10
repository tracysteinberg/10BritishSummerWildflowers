package com.example.tracysteinberg.a10britishsummerwildflowers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopWildFlowersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wildflowers_list);

        TopWildflowers  topWildflowers = new TopWildflowers();
        ArrayList<Wildflower> list = topWildflowers.getList();

        TopWildflowersAdapter wildFlowersAdapter = new TopWildflowersAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wildFlowersAdapter);

    }

        public void getWildflower(View listItem)  {
            Wildflower wildflower = (Wildflower) listItem.getTag();
            Log.d("Wildflower Name: ", wildflower.getName());

        }
    }









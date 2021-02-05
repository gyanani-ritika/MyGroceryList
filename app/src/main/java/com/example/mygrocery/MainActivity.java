package com.example.mygrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ExpandableListView elv =findViewById(R.id.elview);
    List<String> grocery;
    Map<String, List<String>> items;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filldata();
       listAdapter = new ExLAdapter();
        elv.setAdapter(listAdapter);
    }
    public void filldata(){
        grocery = new ArrayList<String>();
        items = new HashMap<>();
        grocery.add("Fruits");
        grocery.add("Vegetables");
        grocery.add("Biscuits");
        grocery.add("Chocolates");
        grocery.add("Drinks");

        List<String> Fruits = new ArrayList<String>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Grapes");
        Fruits.add("Strawberries");
        Fruits.add("Orange");

        List<String> Vegetables = new ArrayList<String>();
        Vegetables.add("Potato");
        Vegetables.add("Ladyfinger");
        Vegetables.add("Tomato");
        Vegetables.add("Cabbage");
        Vegetables.add("Cauliflower");

        List<String> Biscuits = new ArrayList<String>();
        Biscuits.add("Oreo");
        Biscuits.add("Bourbon");
        Biscuits.add("Hide&Seek");
        Biscuits.add("Parle-G");
        Biscuits.add("Marie Lite");

        items.put(grocery.get(0),Fruits);
        items.put(grocery.get(1),Vegetables);
        items.put(grocery.get(2),Biscuits);

    }

}
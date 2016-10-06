package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();
        words.add(0, new Word("one", "lutti"));
        words.add(1, new Word("two", "otiiko"));
        words.add(2, new Word("three", "tolookosu"));
        words.add(3, new Word("four", "oyyisa"));
        words.add(4, new Word("five", "massokka"));
        words.add(5, new Word("six", "temmokka"));
        words.add(6, new Word("seven", "kenekaku"));
        words.add(7, new Word("eight", "kawinta"));
        words.add(8, new Word("nine", "wo'e"));
        words.add(9, new Word("ten", "na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

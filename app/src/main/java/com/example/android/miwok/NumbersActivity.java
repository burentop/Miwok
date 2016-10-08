package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(0, new Word("one", "lutti", R.drawable.number_one));
        words.add(1, new Word("two", "otiiko", R.drawable.number_two));
        words.add(2, new Word("three", "tolookosu", R.drawable.number_three));
        words.add(3, new Word("four", "oyyisa", R.drawable.number_four));
        words.add(4, new Word("five", "massokka", R.drawable.number_five));
        words.add(5, new Word("six", "temmokka", R.drawable.number_six));
        words.add(6, new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(7, new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(8, new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(9, new Word("ten", "na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

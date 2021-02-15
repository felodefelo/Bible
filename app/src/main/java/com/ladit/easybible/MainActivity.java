package com.ladit.easybible;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.ladit.easybible.adapters.WordRecyclerViewAdapter;
import com.ladit.easybible.models.Word;
import com.ladit.easybible.viewmodels.WordViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView myRecyclerView = findViewById(R.id.wordrecyclerview);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        final WordRecyclerViewAdapter myAdapter = new WordRecyclerViewAdapter();



        wordViewModel = ViewModelProviders.of(this).get(WordViewModel.class);
        wordViewModel.getAllWords().observe(this,new Observer<List<Word>>() {
            @Override
            public void onChanged(List<Word> words) {
             //   Log.d("RECEIVED LIST", words.get(1).getWord().toString());
                myAdapter.setWords(words);

            }
        });
        myRecyclerView.setAdapter(myAdapter);
        }

}
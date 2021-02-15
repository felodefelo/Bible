package com.ladit.easybible.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ladit.easybible.R;
import com.ladit.easybible.models.Word;

import java.util.ArrayList;
import java.util.List;

public class WordRecyclerViewAdapter extends RecyclerView.Adapter<WordRecyclerViewAdapter.CustomViewHolder> {
    private List<Word> allWords = new ArrayList<>();

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View wordView = LayoutInflater.from(parent.getContext()).inflate(R.layout.verse_item_layout,parent,false);
        return new CustomViewHolder(wordView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
    Word currentWord = allWords.get(position);
    holder.wordTextView.setText(currentWord.word);
    }
    public void  setWords(List<Word> words){
        this.allWords = words;
        notifyDataSetChanged();
        Log.d("TAG", "getItemCount: "+ allWords.size());
    }
    @Override
    public int getItemCount() {

        return allWords.size();
    }

    class  CustomViewHolder extends RecyclerView.ViewHolder {
        TextView wordTextView;

       public CustomViewHolder(@NonNull View itemView) {
           super(itemView);
           wordTextView =itemView.findViewById(R.id.textView);
       }
   }

}

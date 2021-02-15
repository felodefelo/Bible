package com.ladit.easybible.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.ladit.easybible.models.Word;
import com.ladit.easybible.repositories.WordRepository;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository repository;
    private LiveData<List<Word>> allWords;
    public WordViewModel(@NonNull Application application) {
        super(application);
        repository = new WordRepository(application);
        allWords=repository.getAllWords();

    }

    public LiveData<List<Word>> getAllWords(){
        return allWords;
    }

}

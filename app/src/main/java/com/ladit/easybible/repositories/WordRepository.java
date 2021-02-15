package com.ladit.easybible.repositories;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.ladit.easybible.daos.BibleDao;
import com.ladit.easybible.databases.BibleDatabase;
import com.ladit.easybible.models.Word;

import java.util.List;

public class WordRepository {

    BibleDao bibleDao;
    LiveData<List<Word>> allWords;
    public WordRepository(Application application) {
        BibleDatabase bibleDatabase=BibleDatabase.getInstance(application);
        bibleDao = bibleDatabase.wordDao();
         allWords =bibleDao.getAllWords();

    }

    public LiveData<List<Word>> getAllWords(){
        return allWords;
    }


}

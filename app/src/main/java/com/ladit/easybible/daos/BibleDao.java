package com.ladit.easybible.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.ladit.easybible.models.Word;

import java.util.List;

@Dao
public interface BibleDao {

    @Query("SELECT * FROM words ORDER BY wordId DESC")
    LiveData<List<Word>> getAllWords();
}

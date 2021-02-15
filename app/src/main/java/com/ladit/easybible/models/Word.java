package com.ladit.easybible.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "words")
public class Word {

    @Nullable @PrimaryKey(autoGenerate = true)
    public int WordId;

    @NonNull
     public String word;
    @NonNull
    public int bookNum;
    @Nullable
    public int chNum;

    @Nullable
    public int verseNum;

    @NonNull
    public String getWord() {
        return word;
    }

    public int getBookNum() {
        return bookNum;
    }

    public int getChNum() {
        return chNum;
    }

    public int getVerseNum() {
        return verseNum;
    }

    public Word(@NonNull String word, int bookNum, int chNum, int verseNum) {
        this.word = word;
        this.bookNum = bookNum;
        this.chNum = chNum;
        this.verseNum = verseNum;
    }

    public int getWordId() {
        return WordId;
    }

    public void setWord(@NonNull String word) {
        this.word = word;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public void setChNum(int chNum) {
        this.chNum = chNum;
    }

    public void setVerseNum(int verseNum) {
        this.verseNum = verseNum;
    }
}

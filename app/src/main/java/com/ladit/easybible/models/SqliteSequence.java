package com.ladit.easybible.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sequence")
public class SqliteSequence {

    @PrimaryKey @NonNull
    public String name;
    public String seq;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSeq() {
        return seq;
    }
}

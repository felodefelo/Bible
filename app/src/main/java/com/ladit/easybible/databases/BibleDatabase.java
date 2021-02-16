package com.ladit.easybible.databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.ladit.easybible.daos.BibleDao;

import com.ladit.easybible.models.Configuration;
import com.ladit.easybible.models.SqliteSequence;
import com.ladit.easybible.models.Word;

@Database(entities = {Word.class, Configuration.class, SqliteSequence.class},version = 4)
public abstract class BibleDatabase extends RoomDatabase {
     public abstract BibleDao wordDao();

     private static BibleDatabase instance;
         public static synchronized BibleDatabase getInstance(Context context) {
          if(instance==null){
               instance = Room.databaseBuilder(context.getApplicationContext(), BibleDatabase.class, "english_asv.db")
                       .createFromAsset("english_asv.db")
                       .build();
          }

          return instance;
     }
}

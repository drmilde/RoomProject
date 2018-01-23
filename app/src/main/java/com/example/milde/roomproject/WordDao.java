package com.example.milde.roomproject;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by milde on 22.01.18.
 */

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

    @Query("SELECT * from word_table WHERE word=:search ORDER BY word ASC")
    LiveData<List<Word>> getTheHellos(String search);

    @Query("SELECT COUNT(*) FROM word_table")
    int getWordCount();
}

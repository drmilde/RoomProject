package com.example.milde.roomproject;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * Created by milde on 22.01.18.
 */

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;

    private LiveData<List<Word>> mAllWords;

    public WordViewModel(Application application) {
        //super(application);
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();

    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }



    public void insert(Word word) {
        mRepository.insert(word);
    }
}

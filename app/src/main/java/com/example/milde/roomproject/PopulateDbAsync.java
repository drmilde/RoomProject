package com.example.milde.roomproject;

import android.os.AsyncTask;

/**
 * Created by milde on 23.01.18.
 */
class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final WordDao mDao;

    PopulateDbAsync(WordRoomDatabase db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... params) {
        mDao.deleteAll();
        Word word = new Word("Hello");
        mDao.insert(word);

        for (int i = 1; i < 30; i++) {
            word = new Word("World");
            mDao.insert(word);
        }

        return null;
    }
}


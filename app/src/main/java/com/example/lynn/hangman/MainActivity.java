package com.example.lynn.hangman;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static Button[] alphabet;
    public static AlphabetView alphabetView;
    public static ButtonsView buttonsView;
    public static HangmanView hangmanView;
    public static SQLiteDatabase database;
    public static MyDatabaseHelper helper;
    public static Button[] buttons;
    public static int width;
    public static int height;
    public static String word;
    public static boolean drawHead;
    public static boolean drawLeftArm;
    public static boolean drawRightArm;
    public static boolean drawBody;
    public static boolean drawLeftLeg;
    public static boolean drawRightLeg;
    public static int numberMissed;

    public static String getWord() {
        java.util.List<String> words = new ArrayList<>();

        Cursor cursor = database.rawQuery("SELECT * FROM words;",new String[]{});

        cursor.moveToFirst();

        do {
            int wordIndex = cursor.getColumnIndex("word");

            String word = cursor.getString(wordIndex);

            words.add(word);
        } while (cursor.moveToNext());

        return(words.get((int)(words.size()*Math.random())));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        helper = new MyDatabaseHelper(this);

        database = helper.getReadableDatabase();

        setContentView(myView = new MyView(this));
    }
}

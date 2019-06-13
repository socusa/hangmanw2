package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.TableLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class AlphabetView extends TableLayout {

    public AlphabetView(Context context) {
        super(context);

        setBackgroundColor(0xFF008F00);

        alphabet = new Button[26];

        for(int counter=0;counter<alphabet.length;counter++) {
            alphabet[counter] = new Button(context);

            alphabet[counter].setText("" + (char)(counter + 65));


        }


    }

}

package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class ButtonsView extends LinearLayout {

    public ButtonsView(Context context) {
        super(context);

        setBackgroundColor(0xFF8F0000);


        word = getWord();

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((2*width)/(3*word.length()),100);

        buttons = new Button[word.length()];

        for(int counter=0;counter<buttons.length;counter++) {
            buttons[counter] = new Button(context);

            buttons[counter].setTextSize(20);

            buttons[counter].setLayoutParams(layoutParams);

            addView(buttons[counter]);


        }
    }

}

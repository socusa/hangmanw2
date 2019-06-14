package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import static com.example.lynn.hangman.MainActivity.*;

public class AlphabetView extends TableLayout {

    public AlphabetView(Context context) {
        super(context);

        setBackgroundColor(0xFF008F00);

        alphabet = new Button[26];

        for(int counter=0;counter<alphabet.length;counter++) {
            alphabet[counter] = new Button(context);

            alphabet[counter].setText("" + (char)(counter + 65));

            alphabet[counter].setTextSize(20);

            alphabet[counter].setOnClickListener(listener);
        }

        TableRow row1 = new TableRow(context);

        int widthOfButton = 2*width/39;

        for (int counter=0;counter<13;counter++) {
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(widthOfButton,widthOfButton);

            alphabet[counter].setLayoutParams(layoutParams);

            row1.addView(alphabet[counter]);
        }

        addView(row1);

        TableRow row2 = new TableRow(context);

        for (int counter=13;counter<26;counter++) {
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(widthOfButton,widthOfButton);

            alphabet[counter].setLayoutParams(layoutParams);

            row2.addView(alphabet[counter]);
        }

        addView(row2);
    }

}

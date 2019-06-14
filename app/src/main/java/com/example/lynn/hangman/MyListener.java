package com.example.lynn.hangman;

import android.view.View;
import android.widget.Button;

import static com.example.lynn.hangman.MainActivity.*;

public class MyListener implements View.OnClickListener {

    public void displayWord() {
        for (int counter=0;counter<buttons.length;counter++)
            buttons[counter].setText(word.substring(counter,counter+1));
    }

    @Override
    public void onClick(View view) {
        Button button = (Button)view;

        char letter = button.getText().charAt(0);

        word = word.toUpperCase();

        boolean found = false;

        for(int counter=0;counter<buttons.length;counter++) {
            if (letter == word.charAt(counter)) {
                buttons[counter].setText("" + letter);

                found = true;
            }

            button.setVisibility(View.INVISIBLE);
        }

        if (!found)
            numberMissed++;

        hangmanView.check();

    }

}

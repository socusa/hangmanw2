package com.example.lynn.hangman;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.RelativeLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        Point size = Util.sizeOfScreen(context);

        int width = size.x;
        int height = size.y;

        buttonsView = new ButtonsView(context);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(2*width/3,3*height/4);

        buttonsView.setLayoutParams(params);

        buttonsView.setId(View.generateViewId());

        addView(buttonsView);

        alphabetView = new AlphabetView(context);

        params = new RelativeLayout.LayoutParams(2*width/3,height/4);

        params.addRule(RelativeLayout.BELOW,buttonsView.getId());

        alphabetView.setLayoutParams(params);

        alphabetView.setId(View.generateViewId());

        addView(alphabetView);

        hangmanView = new HangmanView(context);

        params = new RelativeLayout.LayoutParams(width/3,height);

        params.addRule(RelativeLayout.RIGHT_OF,buttonsView.getId());
        params.addRule(RelativeLayout.RIGHT_OF,alphabetView.getId());

        hangmanView.setLayoutParams(params);

        addView(hangmanView);





    }

}

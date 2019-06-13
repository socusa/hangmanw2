package com.example.lynn.hangman;

import android.content.Context;
import android.graphics.Point;
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

    }

}

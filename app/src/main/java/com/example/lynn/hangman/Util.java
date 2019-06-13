package com.example.lynn.hangman;

public class Util {

    public static Point sizeOfScreen(Context context) {
        WindowManager windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);

        Display display = windowManager.getDefaultDisplay();

        Point output = new Point();

        display.getSize(output);

        return(output);
    }

}

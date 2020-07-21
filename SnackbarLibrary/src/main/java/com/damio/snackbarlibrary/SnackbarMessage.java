package com.damio.snackbarlibrary;

import android.graphics.Color;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarMessage {

    public static void snacks(View view, String message){

        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setBackgroundTint(R.drawable.snackshape)
                .setActionTextColor(Color.WHITE)
                .show();
    }
}

package com.example.toastmessage;

import android.content.Context;
import android.widget.Toast;

public class CustomToastMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}

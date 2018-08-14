package com.example.a17010233.practicalquiz13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 17010233 on 14/8/2018.
 */

public class WallPaper extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("myChoice", R.id.radioButtonGood);
        if(id == R.id.radioButtonGood) {
            Toast.makeText(context, R.string.good, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, R.string.bad, Toast.LENGTH_LONG).show();
        }


    }
}

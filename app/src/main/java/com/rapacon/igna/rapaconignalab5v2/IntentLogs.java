package com.rapacon.igna.rapaconignalab5v2;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class IntentLogs extends IntentService {
    public IntentLogs() {
        super("com.rapacon.igna.rapaconignalab5v2.IntentLogs");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITG","Service is running...");
    }
}

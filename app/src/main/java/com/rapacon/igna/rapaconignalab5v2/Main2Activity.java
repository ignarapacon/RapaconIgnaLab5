package com.rapacon.igna.rapaconignalab5v2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = new Intent(this, IntentLogs.class);
        this.startService(i);

    }

    public void option(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btntoact1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

        } else if (v.getId() == R.id.btntomap) {
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:14.534871, 121.050994"));
            chooser = Intent.createChooser(i, "Maps");
            startActivity(chooser);

        }
    }
}

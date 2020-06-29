package it.alessandrasonsini.sisperaultimobluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //TAG per debugging
    private static final String TAG = "btsample";

    Holder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holder = new Holder();
    }


    private class Holder {
        Button btnStart;

        Holder() {
            btnStart = findViewById(R.id.btnStart);
            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "MainActivity: btnStart pressed.");
                    Intent i = new Intent(getApplicationContext(), BluetoothChat.class);
                    startActivity(i);
                }
            });
        }
    }
}
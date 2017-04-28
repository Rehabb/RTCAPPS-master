package com.project.notificationapps.rtcapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView txtmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtmessage = (TextView) findViewById(R.id.txtresult);

//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null){
//            String msg = bundle.getString("message");
//            txtmessage.setText(msg);
//        }
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == 1) {
                if (resultCode == RESULT_OK) {
                    String result = data.getStringExtra("message");
                    txtmessage.setText(result);
                    Log.d("tag", result);
                }

                if (resultCode == RESULT_CANCELED) {
                    Toast.makeText(this,"Go to hill",Toast.LENGTH_LONG).show();
                }
            }
        }
    }


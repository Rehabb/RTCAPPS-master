package com.project.notificationapps.rtcapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnmessage;
    EditText txtmessage;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmessage = (EditText) findViewById(R.id.txtmessage);
        txtresult = (TextView) findViewById(R.id.txtresult);
        btnmessage = (Button) findViewById(R.id.btnmessage);
        btnmessage.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                //Impict Intent

               // Intent intent = new Intent(Intent.ACTION_VIEW);

               // intent.setData(Uri.parse("http://www.google.com"));
               // startActivity(intent);
                //Excpit Intent
                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                String message  = txtmessage.getText().toString();
                intent.putExtra("message",message);
                setResult(RESULT_OK, intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivityForResult(intent, 1);
            //  startActivity(intent);
            }
        });
    }



    public void btnshow(View view) {
        txtresult.setText(txtmessage.getText().toString());
      //  Toast.makeText(MainActivity.this,txtmessage.getText().toString(),Toast.LENGTH_LONG).show();
    }
}

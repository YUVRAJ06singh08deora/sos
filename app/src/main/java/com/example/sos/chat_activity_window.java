package com.example.sos;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chat_activity_window extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);
        EditText number_txt_str=findViewById(R.id.phonenotxt);
        EditText message_txt=findViewById(R.id.msg_txt);
        Button sendbtn=findViewById(R.id.send_msgbtn);
        String message = message_txt.getText().toString();
        String phno=number_txt_str.getText().toString();
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phno,null,message,null,null);
                 Toast. makeText(getApplicationContext(),"Message Sent",Toast. LENGTH_SHORT);
            }
        });



    }
}
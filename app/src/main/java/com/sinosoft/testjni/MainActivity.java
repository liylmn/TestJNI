package com.sinosoft.testjni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.sinosoft.testjni.JniMethod.getNativeString;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.mtext);

        button= findViewById(R.id.mbutton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s=getNativeString("fff");
                textView.setText(s);
            }
        });
    }
}

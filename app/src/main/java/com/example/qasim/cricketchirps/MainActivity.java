package com.example.qasim.cricketchirps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView2);
        tv.setVisibility(View.GONE);
        et = findViewById(R.id.editText);
        et.setText("");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString().trim();
                int far = Integer.parseInt(str);
                int ans = far / 3 + 4;
                tv.setText("Temperature: " + ans + "°C");

                tv.setVisibility(View.VISIBLE);
            }
        });

    }


}

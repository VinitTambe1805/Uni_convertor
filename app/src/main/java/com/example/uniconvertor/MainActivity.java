package com.example.uniconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView,textViewResult;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textViewResult = findViewById(R.id.textViewResult);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "Hi Click Listener Worked!", Toast.LENGTH_SHORT).show();
//                      String s = editText.getText().toString();
//                      int kg = Integer.parseInt(s);
//                      double pound = 2.205 * kg;
//                textViewResult.setText("The resultant value in Pounds is " +pound);
//
//            }
    }
        public void calculate(View view){
            String s = editText.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.205 * kg;
            textViewResult.setText("The resultant value in Pounds is " +pound);



    }
}
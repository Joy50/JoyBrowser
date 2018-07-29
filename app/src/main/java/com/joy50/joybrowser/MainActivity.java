package com.joy50.joybrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ur;
    Button facebook,Go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ur=(EditText)findViewById(R.id.editText);
        Go=(Button)findViewById(R.id.button);
        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xy=ur.getText().toString();
                Intent search=new Intent(getApplicationContext(),SearchA.class);
                search.putExtra("Val",xy);
                startActivity(search);
            }
        });
        facebook=(Button)findViewById(R.id.button2);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Facebook.class));
            }
        });
    }
}

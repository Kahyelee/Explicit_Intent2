package com.example.kahye.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mText;
    final static int ACT_EDIT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView)findViewById(R.id.text);

        Button btnEdit = (Button)findViewById(R.id.edit);
        btnEdit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActEdit.class);
                intent.putExtra("Textln", mText.getText().toString());
                startActivityForResult(intent, ACT_EDIT);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case ACT_EDIT:
                if(resultCode == RESULT_OK) {
                    mText.setText(data.getStringExtra("TextOut"));
                }
                break;
        }
    }
}

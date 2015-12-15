package com.example.kahye.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kahye on 2015-12-15.
 */
public class ActEdit extends AppCompatActivity {
    EditText mEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_edit);

        mEdit = (EditText)findViewById(R.id.stredit);

        Intent intent = getIntent();
        mEdit.setText(intent.getStringExtra("Textln"));

        Button btnOK = (Button)findViewById(R.id.ok);
        btnOK.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("TextOut", mEdit.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

package com.example.ran.cypher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText inputEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = (EditText) findViewById(R.id.input_edit_text);
        resultTextView = (TextView) findViewById(R.id.result_text_view);
    }


    public void encrypt(View v) {

        resultTextView.setText(CaesarCipher.encrypt(inputEditText.getText().toString(), 256));

    }

    public void decrypt(View v) {
        resultTextView.setText(CaesarCipher.decrypt(inputEditText.getText().toString(), 256));

    }
}

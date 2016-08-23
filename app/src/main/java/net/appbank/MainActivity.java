package net.appbank;

import android.app.Activity;
import android.content.Context;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        Button button1 = (Button)findViewById(R.id.button1);
        final TextView textView = (TextView)findViewById(R.id.textview);
        final EditText editText = (EditText)findViewById(R.id.edittext);
        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkbox1);
        button.setText("しゃべる");
        button1.setText("移動");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Checkボタンの状態の確認
                //Checkが入っていないなら
                checkBox.setChecked(!checkBox.isChecked());
                //EditTextの取得
                String text = editText.getText().toString();
                //EditText空だった場合
                if (text.length() == 0) {
                    textView.setText("エラー");
                }
                //textViewへの反映
                textView.setText(text);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            final Intent intent = new Intent(MainActivity.this, SubActivity.class);
            startActivity(intent);

            }
        });
    }
}

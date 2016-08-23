package net.appbank;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        final TextView textView = (TextView)findViewById(R.id.textview);
        final EditText editText = (EditText)findViewById(R.id.edittext);
        final CheckBox checkBox = (CheckBox)findViewById(R.id.checkbox1);
        button.setText("しゃべる");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()==false)
                {
                    checkBox.setChecked(true);
                }else{
                checkBox.setChecked(false);
                }
                String text = editText.getText().toString();
                textView.setText(text);
                if(text.length()==0)
                {
                    textView.setText("エラー");
                }
            }
        });
    }
}

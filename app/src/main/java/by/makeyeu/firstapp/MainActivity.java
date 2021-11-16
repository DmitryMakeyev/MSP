package by.makeyeu.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import by.makeyeu.firstapp.text.TextFunction;

public class MainActivity extends AppCompatActivity {
//TODO Add new method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", " counter =" + count);
        }
        
    }

    private void displayText() {
        TextFunction textFunction = new TextFunction();
        TextView testView = findViewById(R.id.test);
        testView.setText(textFunction.getValue());
    }
}
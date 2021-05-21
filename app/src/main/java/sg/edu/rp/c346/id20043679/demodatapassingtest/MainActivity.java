package sg.edu.rp.c346.id20043679.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView passDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.passInt);
        btnPassChar = findViewById(R.id.passChar);
        passDouble = findViewById(R.id.tvDoubleValue);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.putExtra("value", 'a');
                startActivity(intent2);
            }
        });

        passDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, ForthActivity.class);
                intent3.putExtra("double", 99.99);
                startActivity(intent3);
            }
        });

    }
}

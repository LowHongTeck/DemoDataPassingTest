package sg.edu.rp.c346.id20043679.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        tvDouble = findViewById(R.id.textView3);

        Intent doubleReceived = getIntent();
        double dValue = doubleReceived.getDoubleExtra("double", 0);
        tvDouble.setText("Double value received is: " + dValue);
    }
}
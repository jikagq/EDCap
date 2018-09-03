package com.example.pain.edcap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calc;

    EditText latdep, longdep, latar, longar;

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = (Button)findViewById(R.id.calc);

        latdep = (EditText)findViewById(R.id.latdep);
        longdep = (EditText)findViewById(R.id.longdep);
        latar = (EditText)findViewById(R.id.latar);
        longar = (EditText)findViewById(R.id.longar);

        res = (TextView)findViewById(R.id.res) ;

        Log.d("INFO","Elle est ou la balayette ?");

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("INFO","Dans ton cul");
                Toast.makeText(MainActivity.this, "The BT device is OFF!", Toast.LENGTH_SHORT).show();
                //mettre les actions de calculs ici
                //vérifier si y a des valeurs nulles ou 0




            }
        });


    }
}

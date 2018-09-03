package com.example.pain.edcap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.Math.atan2;
import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {

    Button calc;

    EditText latdep, longdep, latar, longar;

    TextView txt, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.txt);
        calc = (Button)findViewById(R.id.calc);

        latdep = (EditText)findViewById(R.id.latdep);
        longdep = (EditText)findViewById(R.id.longdep);
        latar = (EditText)findViewById(R.id.latar);
        longar = (EditText)findViewById(R.id.longar);

        res = (TextView)findViewById(R.id.res) ;

        txt.setText("Elle est ou la balayette ?");
        Log.d("INFO","Elle est ou la balayette ?");

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mettre les actions de calculs ici
                //vérifier si y a des valeurs nulles ou 0

                double cap = 0;

                String a = latdep.getText().toString();
                String b = longdep.getText().toString();
                String c = latar.getText().toString();
                String d = longar.getText().toString();

                if(a.isEmpty()){
                    a = "0";
                    Toast.makeText(MainActivity.this, "valeur nulle remplacée par 0", Toast.LENGTH_SHORT).show();
                }
                if(b.isEmpty()){
                    b = "0";
                    Toast.makeText(MainActivity.this, "valeur nulle remplacée par 0", Toast.LENGTH_SHORT).show();
                }
                if(c.isEmpty()){
                    c = "0";
                    Toast.makeText(MainActivity.this, "valeur nulle remplacée par 0", Toast.LENGTH_SHORT).show();
                }
                if(d.isEmpty()){
                    d = "0";
                    Toast.makeText(MainActivity.this, "valeur nulle remplacée par 0", Toast.LENGTH_SHORT).show();
                }

                double xdep = Double.parseDouble(a);
                double ydep = Double.parseDouble(b);
                double xarr = Double.parseDouble(c);
                double yarr = Double.parseDouble(d);

                double deltax = xarr - xdep;
                double deltay = yarr - ydep;

                cap = (atan2(deltay,deltax)*(180/Math.PI));

                if(cap <= 0){
                   cap = 360 + cap;
                }

                Long caparrondi = round(cap);

                String chaine = "Volez en direction de : " + caparrondi.toString()+"°";

                res.setText(chaine);

                latdep.setText("");
                longdep.setText("");

                Log.d("INFO","Dans ton cul");
                Toast.makeText(MainActivity.this, "Dans ton cul" + caparrondi.toString()+"°", Toast.LENGTH_SHORT).show();

            }
        });


    }
}

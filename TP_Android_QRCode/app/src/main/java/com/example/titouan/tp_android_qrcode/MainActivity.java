package com.example.titouan.tp_android_qrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.zxing.integration.android.IntentIntegrator;
//import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    /**protected TextView nom;
    protected TextView prenom;
    protected TextView age;
    protected TextView adresse;

    protected Button bouton;**/

    //protected IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**this.nom = (TextView) findViewById(R.id.nom);
        this.prenom = (TextView) findViewById(R.id.prenom);
        this.age = (TextView) findViewById(R.id.age);
        this.adresse = (TextView) findViewById(R.id.adresse);**/

        //this.qrScan = new IntentIntegrator(this);

        /**this.bouton = (Button) findViewById(R.id.bouton);
        this.bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrScan.initiateScan();
            }
        });**/
    }

    /**@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            //Si on ne récupère rien
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                try {
                    //Conversion des données en JSON
                    JSONObject obj = new JSONObject(result.getContents());
                    //Fixer les valeurs des textview
                    nom.setText(obj.getString("nom"));
                    prenom.setText(obj.getString("prenom"));
                    age.setText(obj.getString("age"));
                    adresse.setText(obj.getString("adresse"));
                } catch (JSONException e) {
                    e.printStackTrace();
                    //Si on arrive ici
                    //cela signifie que le format n'est pas correct
                    //dans ce cas, on peut afficher le résultat, par exemple,
                    //dans un toast
                    Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }**/
}

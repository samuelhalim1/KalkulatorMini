package com.example.user.kalkulatormini;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private double hasilAkhir = 0.0;
    private String angka1 = "";
    private String angka2 = "";
    TextView hasil;
    Button btJumlah, btKurang, btKali, btBagi;
    EditText edAngka1, edAngka2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAngka1 = (EditText) findViewById(R.id.editAngka1);
        edAngka2 = (EditText) findViewById(R.id.editAngka2);
        hasil = (TextView) findViewById(R.id.textHasil);
        btJumlah = (Button) findViewById(R.id.tombolTambah);
        btKurang = (Button) findViewById(R.id.tombolKurang);
        btKali = (Button) findViewById(R.id.tombolKali);
        btBagi = (Button) findViewById(R.id.tombolBagi);
    }

    public void klikTambah(View V){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();

        if((angka1.equalsIgnoreCase(""))|| (angka2.equalsIgnoreCase("")))
        {
            edAngka1.setFocusable(true);
        }else{
            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);
            hasilAkhir = angkaA + angkaB;
            String hasilString = String.valueOf(hasilAkhir);
            hasil.setText(hasilString);
        }
    }

    public void klikKurang(View V){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();

        if((angka1.equalsIgnoreCase(""))|| (angka2.equalsIgnoreCase(""))){
            edAngka1.setFocusable(true);
        }else{
            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);
            hasilAkhir = angkaA - angkaB;
            String hasilString = String.valueOf(hasilAkhir);
            hasil.setText(hasilString);
        }
    }

    public void klikKali(View V){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();

        if((angka1.equalsIgnoreCase(""))|| (angka2.equalsIgnoreCase(""))){
            edAngka1.setFocusable(true);
        }else{
            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);
            hasilAkhir = angkaA * angkaB;
            String hasilString = String.valueOf(hasilAkhir);
            hasil.setText(hasilString);
        }
    }

    public void klikBagi(View V){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();

        if((angka1.equalsIgnoreCase(""))|| (angka2.equalsIgnoreCase(""))){
            edAngka1.setFocusable(true);
        }else{
            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);
            hasilAkhir = angkaA / angkaB;
            String hasilString = String.valueOf(hasilAkhir);
            hasil.setText(hasilString);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

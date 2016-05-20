package com.example.lucascalzavara.controlaltdel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String[] aparelhos = new String[]{"Selecione o tipo","TV","Projetor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapterAparelhos = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, aparelhos);
        adapterAparelhos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner spAparelhos = (Spinner) findViewById(R.id.spinnerAparelhos);
        spAparelhos.setAdapter(adapterAparelhos);

        spAparelhos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void startTv(View View){
        Intent TVActivity = new Intent(this, TVActivity.class);
        startActivity(TVActivity);
    }

    public void startProjetor(View View){
        Intent ProjetorActivity = new Intent(this, ProjetorActivity.class);
        startActivity(ProjetorActivity);
    }

    public void escolheAparelho(View View){
        Spinner sp = (Spinner) findViewById(R.id.spinnerAparelhos);
        switch ((String) sp.getSelectedItem()){
            case "Projetor": Intent ProjetorActivity = new Intent(this, ProjetorActivity.class);
                             startActivity(ProjetorActivity);
                             break;
            case "TV": Intent TVActivity = new Intent(this, TVActivity.class);
                       startActivity(TVActivity);
                       break;
        }
    }
}

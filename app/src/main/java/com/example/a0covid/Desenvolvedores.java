package com.example.a0covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Desenvolvedores extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvedores);
    }

    public void higorDev(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/higor-castelo/"));
        startActivity(nav);

    }

    public void viniciosDev(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.linkedin.com/in/vinicius-arvelos-61150615a"));
        startActivity(nav);
    }

    public void halisonDev(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/hallysson-gabriel-borges-pessoa-philippsen-8783111b9/"));
        startActivity(nav);
    }

    public void voltar(View view) {
        finish();

    }
}
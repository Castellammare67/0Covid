package com.example.a0covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a0covid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void clikInfo(View view) {
        tela = new Intent(getApplicationContext(),Informa.class);
        startActivity(tela);
    }

    public void clikUnidades(View view) {
        tela = new Intent(getApplicationContext(), UnidadeAtendimento.class);
        startActivity(tela);
    }

    public void clikMidia(View view) {
        tela = new Intent(getApplicationContext(),Midia.class);
        startActivity(tela);
    }

    public void clikDevs(View view) {
        tela = new Intent(getApplicationContext(),Desenvolvedores.class);
        startActivity(tela);
    }
}
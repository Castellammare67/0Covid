package com.example.a0covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.a0covid.databinding.ActivityUnidadeAtendimentoBinding;
import com.example.a0covid.databinding.ActivityMainBinding;


public class UnidadeAtendimento extends AppCompatActivity {
    Intent nav;
    private ActivityUnidadeAtendimentoBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUnidadeAtendimentoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void voltar(View view) {
        finish();
    }


    public void hospital1(View view) {
        nav = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/dir/-18.5913406,-46.5258909/HNSF+-+Hospital+Nossa+Senhora+de+F%C3%A1tima+-+R.+Padre+Caldeira,+386+-+Centro,+Patos+de+Minas+-+MG,+38700-044/@-18.5893008,-46.5235269,16z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x94ae8ad20a6a1c09:0x2bf6f579bab7ca28!2m2!1d-46.5126094!2d-18.5872815!3e2"));
    }

    public void hospital2(View view) {
        nav = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/dir//Hospital+Imaculada+Concei%C3%A7%C3%A3o+-+Av.+Get%C3%BAlio+Vargas,+702+-+Centro,+Patos+de+Minas+-+MG,+38700-128/@-18.5977563,-46.5153876,16z/data=!4m9!4m8!1m0!1m5!1m1!1s0x94ae8acb352f19cb:0x571fc56b9339cd0f!2m2!1d-46.5162757!2d-18.5947738!3e2"));
    }
}
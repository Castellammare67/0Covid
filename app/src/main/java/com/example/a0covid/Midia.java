package com.example.a0covid;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.a0covid.databinding.ActivityMainBinding;
import com.example.a0covid.databinding.ActivityMidiaBinding;

public class Midia extends AppCompatActivity {
    private ActivityMidiaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMidiaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String can = "android.resource://com.example.a0covid/" + R.raw.modulo1;
        Uri u = Uri.parse(can);
        binding.video.setVideoURI(u);
        binding.video.start();




    }

    public void voltar(View view) {
        finish();
    }
}
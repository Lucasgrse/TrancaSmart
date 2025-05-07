package com.example.trancasmart

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.trancasmart.activity.GenerateQrCodeForESP


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = Intent(this, GenerateQrCodeForESP::class.java)
        startActivity(intent)

        finish()
    }
}



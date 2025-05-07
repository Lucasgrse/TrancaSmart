package com.example.trancasmart.activity

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.trancasmart.R
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder

class GenerateQrCodeForESP: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qr_code)

        val qrCodeTitle = findViewById<TextView>(R.id.qrCodeTitle)
        supportActionBar?.title = qrCodeTitle.text

        val qrCodeImage = findViewById<ImageView>(R.id.imageQrCode)
        val textToEncode = "ESP32-ABC123"

        try {
            val barcodeEncoder = BarcodeEncoder()
            val bitmap: Bitmap = barcodeEncoder.encodeBitmap(textToEncode, BarcodeFormat.QR_CODE, 200, 200)
            qrCodeImage.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
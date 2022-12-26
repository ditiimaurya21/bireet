package com.example.bireet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {

    companion object{
        const val NameValue="nameValue"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val getName=intent.getStringExtra("nameValue")
        text2.text="Happy Birthday\n$getName!!"
    }
}
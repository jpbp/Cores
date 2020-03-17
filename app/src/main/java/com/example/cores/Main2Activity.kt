package com.example.cores

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ss:String = intent.getStringExtra("button")

        textView.setText(ss)
        if(ss=="verde") {
            view.setBackgroundColor(Color.GREEN);
        }
        if(ss=="vermelho") {
            view.setBackgroundColor(Color.RED);
        }
        if(ss=="azul") {
            view.setBackgroundColor(Color.BLUE);
        }
    }
}

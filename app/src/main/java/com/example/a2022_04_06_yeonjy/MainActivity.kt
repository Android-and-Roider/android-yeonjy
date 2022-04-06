package com.example.a2022_04_06_yeonjy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<TextView>(R.id.txtName)

        name.text = "LimYeonjy"      // name의 text로 들어감

        // 더해질 숫자
        var num = 0
        var score = findViewById<TextView>(R.id.score)
        score.text = num.toString()

        val btn = findViewById<Button>(R.id.btnPlus)

        btn.setOnClickListener {
            num ++
            score.text = num.toString()
        }
    }
}

package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private lateinit var scra: TextView
private lateinit var scrb: TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res = findViewById<Button>(R.id.reset)
        val plus3a = findViewById<Button>(R.id.plus3A)
        val plus2a = findViewById<Button>(R.id.plus2A)
        val freea = findViewById<Button>(R.id.freeA)
         scra = findViewById<TextView>(R.id.scoreA)

        val plus3b = findViewById<Button>(R.id.plus3B)
        val plus2b = findViewById<Button>(R.id.plus2B)
        val freeb = findViewById<Button>(R.id.freeB)
         scrb = findViewById<TextView>(R.id.scoreB)


        res.setOnClickListener(this)
        plus3a.setOnClickListener(this)
        plus2a.setOnClickListener(this)
        freea.setOnClickListener(this)
        plus3b.setOnClickListener(this)
        plus2b.setOnClickListener(this)
        freeb.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var scr:Int
        when (v?.id) {
            R.id.reset -> {
                scra.text = "0"
                scrb.text = "0"
            }
            R.id.plus3A -> {
                scr=scra.text.toString().toInt()+3
                scra.text = scr.toString()
            }
            R.id.plus2A -> {
                scr=scra.text.toString().toInt()+2
                scra.text = scr.toString()
            }
            R.id.freeA -> {
                scr=scra.text.toString().toInt()+1
                scra.text = scr.toString()
            }
            R.id.plus3B -> {
                scr=scrb.text.toString().toInt()+3
                scrb.text = scr.toString()
            }
            R.id.plus2B -> {
                scr=scrb.text.toString().toInt()+2
                scrb.text = scr.toString()
            }
            R.id.freeB -> {
                scr=scrb.text.toString().toInt()+1
                scrb.text = scr.toString()
            }
        }
    }
}

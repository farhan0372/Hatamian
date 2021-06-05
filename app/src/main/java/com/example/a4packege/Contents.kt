package com.example.a4packege

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Contents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contents)
        var btn_Caclator = findViewById<Button>(R.id.ac_Contents_btn_cal)

        btn_Caclator.setOnClickListener {

            var intent: Intent = Intent(this, Calculator::class.java)
            startActivityForResult(intent, 1)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == 1) {

                var tv_num1 = findViewById<TextView>(R.id.ac_Contents_tv_num1)
                var tv_num2 = findViewById<TextView>(R.id.ac_Contents_tv_num2)
                var tv_result = findViewById<TextView>(R.id.ac_Contents_tv_result)

                var tv_a = findViewById<TextView>(R.id.ac_Contents_tv_a)
                var tv_b = findViewById<TextView>(R.id.ac_Contents_tv_b)
                tv_a.setTextColor(Color.parseColor("#FF0000"))
                tv_b.setTextColor(Color.parseColor("#FF0000"))

                tv_a.text = "+"
                tv_b.text = "="

                tv_result.setTextColor(Color.parseColor("#FFEB3B"))
                tv_num1.setTextColor(Color.parseColor("#FFEB3B"))
                tv_num2.setTextColor(Color.parseColor("#FFEB3B"))

                tv_num1.text = data!!.getIntExtra("n11", 0).toString()
                tv_num2.text = data!!.getIntExtra("n2", 0).toString()
                tv_result.text = data!!.getIntExtra("plus", 0).toString()

            }
            if (resultCode == 2) {
                var tv_num1 = findViewById<TextView>(R.id.ac_Contents_tv_num1)
                var tv_num2 = findViewById<TextView>(R.id.ac_Contents_tv_num2)
                var tv_result = findViewById<TextView>(R.id.ac_Contents_tv_result)

                var tv_a = findViewById<TextView>(R.id.ac_Contents_tv_a)
                var tv_b = findViewById<TextView>(R.id.ac_Contents_tv_b)
                tv_a.setTextColor(Color.parseColor("#FF0000"))
                tv_b.setTextColor(Color.parseColor("#FF0000"))

                tv_a.text = "-"
                tv_b.text = "="

                tv_result.setTextColor(Color.parseColor("#832493"))
                tv_num1.setTextColor(Color.parseColor("#832493"))
                tv_num2.setTextColor(Color.parseColor("#832493"))

                tv_num1.text = data!!.getIntExtra("n1", 0).toString()
                tv_num2.text = data!!.getIntExtra("n2", 0).toString()
                tv_result.text = data!!.getIntExtra("min", 0).toString()

            }
            if (resultCode == 3) {
                var tv_num1 = findViewById<TextView>(R.id.ac_Contents_tv_num1)
                var tv_num2 = findViewById<TextView>(R.id.ac_Contents_tv_num2)
                var tv_result = findViewById<TextView>(R.id.ac_Contents_tv_result)

                var tv_a = findViewById<TextView>(R.id.ac_Contents_tv_a)
                var tv_b = findViewById<TextView>(R.id.ac_Contents_tv_b)
                tv_a.setTextColor(Color.parseColor("#FF0000"))
                tv_b.setTextColor(Color.parseColor("#FF0000"))

                tv_a.text = "×"
                tv_b.text = "="

                tv_result.setTextColor(Color.parseColor("#FFFF9800"))
                tv_num1.setTextColor(Color.parseColor("#FFFF9800"))
                tv_num2.setTextColor(Color.parseColor("#FFFF9800"))

                tv_num1.text = data!!.getIntExtra("n1", 0).toString()
                tv_num2.text = data!!.getIntExtra("n2", 0).toString()
                tv_result.text = data!!.getIntExtra("multi", 0).toString()

            }
            if (resultCode == 4) {
                var tv_num1 = findViewById<TextView>(R.id.ac_Contents_tv_num1)
                var tv_num2 = findViewById<TextView>(R.id.ac_Contents_tv_num2)
                var tv_result = findViewById<TextView>(R.id.ac_Contents_tv_result)

                var tv_a = findViewById<TextView>(R.id.ac_Contents_tv_a)
                var tv_b = findViewById<TextView>(R.id.ac_Contents_tv_b)
                tv_a.setTextColor(Color.parseColor("#FF0000"))
                tv_b.setTextColor(Color.parseColor("#FF0000"))

                tv_a.text = "÷"
                tv_b.text = "="

                tv_result.setTextColor(Color.parseColor("#8BC34A"))
                tv_num1.setTextColor(Color.parseColor("#8BC34A"))
                tv_num2.setTextColor(Color.parseColor("#8BC34A"))

                tv_num1.text = data!!.getIntExtra("n1", 0).toString()
                tv_num2.text = data!!.getIntExtra("n2", 0).toString()
                tv_result.text = data!!.getIntExtra("div", 0).toString()

            }

        }
    }
}

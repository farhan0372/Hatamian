package com.example.a4packege

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val edt_num1=findViewById<EditText>(R.id.ac_cal_edt_num1)
        val edt_num2=findViewById<EditText>(R.id.ac_cal_edt_num2)

        val btn_plus=findViewById<Button>(R.id.ac_cal_btn_plus)
        val btn_min=findViewById<Button>(R.id.ac_cal_btn_min)
        val btn_multi=findViewById<Button>(R.id.ac_cal_btn_multi)
        val btn_div=findViewById<Button>(R.id.ac_cal_btn_div)

        val tv_result=findViewById<TextView>(R.id.ac_cal_txt_result)

        btn_plus . setOnClickListener {

            if (edt_num1.text.toString() != "" && edt_num2.text.toString() != "") {

                var n10: String = edt_num1.text.toString()
                var n11: Int = n10.toInt()
                var n2: Int = edt_num2.text.toString().toInt()

                var Result = n11 + n2

                tv_result.text = Result.toString()
                tv_result.setTextColor(Color.parseColor("#FFEB3B"))

                var intent:Intent=Intent()
                intent.putExtra("n11",n11)
                intent.putExtra("n2",n2)
                intent.putExtra("plus",Result)
                setResult(1,intent)

                finish()

            }
            else
                Toast.makeText( this,"فیلد ها خالی است", Toast.LENGTH_SHORT).show()
        }

        btn_min.setOnClickListener {

            if (edt_num1.text.toString() != "" && edt_num2.text.toString() != ""){

                var n1: Int = edt_num1.text.toString().toInt()
                var n2: Int = edt_num2.text.toString().toInt()

                var Result = n1 - n2

                tv_result.text = Result.toString()
                tv_result.setTextColor(Color.parseColor("#832493"))


                var intent:Intent=Intent()
                intent.putExtra("n1",n1)
                intent.putExtra("n2",n2)
                intent.putExtra("min",Result)
                setResult(2,intent)

                finish()

            }
            else
                Toast.makeText( this,"فیلد ها خالی است", Toast.LENGTH_SHORT).show()
        }

        btn_multi.setOnClickListener {

            if(edt_num1.text.toString() != "" && edt_num2.text.toString() != "") {

                var n1: Int = edt_num1.text.toString().toInt()
                var n2: Int = edt_num2.text.toString().toInt()

                var Result = n1 * n2

                tv_result.text = Result.toString()
                tv_result.setTextColor(Color.parseColor("#FFFF9800"))

                var intent:Intent=Intent()
                intent.putExtra("n1",n1)
                intent.putExtra("n2",n2)
                intent.putExtra("multi",Result)
                setResult(3,intent)


                finish()

            }
            else
                Toast.makeText( this,"فیلد ها خالی است", Toast.LENGTH_SHORT).show()
        }

        btn_div.setOnClickListener {

            if (edt_num1.text.toString() != "" && edt_num2.text.toString() != "") {

                var n1: Int = edt_num1.text.toString().toInt()
                var n2: Int = edt_num2.text.toString().toInt()


                if (n2 > 0) {

                    var Result= n1 / n2

                    tv_result.text = Result.toString()
                    tv_result.setTextColor(Color.parseColor("#8BC34A"))

                    var intent:Intent= Intent()
                    intent.putExtra("n1",n1)
                    intent.putExtra("n2",n2)
                    intent.putExtra("div",Result)
                    setResult(4,intent)

                    finish()

                } else {
                    tv_result.text = "Error"
                    tv_result.setTextColor(Color.parseColor("#FF0000"))
                }
            }
            else
                Toast.makeText( this,"فیلد ها خالی است", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.a4packege

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_phone = findViewById<EditText>(R.id.ac_main_edt_phone)
        val btn_confirm = findViewById<Button>(R.id.ac_main_btn_confirm)

        btn_confirm.setOnClickListener {

            if (edt_phone.text.toString().length == 9) {
                Toast.makeText(this, "ورود موفیقت آمیز بود", Toast.LENGTH_SHORT).show()

                var intent: Intent = Intent(this, ConfirmCode::class.java)
                intent.putExtra("edt_phone", edt_phone.text.toString())
                finish()
                startActivity(intent)


            } else {
                Toast.makeText(this, "ورود ناموفق بود", Toast.LENGTH_SHORT).show()

                var txt_Error = findViewById<TextView>(R.id.ac_main_txt_Error)
                txt_Error.text = "لطفا یک شماره موبایل معتبر وارد نمایید."
            }
        }
    }
}
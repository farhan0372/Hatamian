package com.example.a4packege

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ConfirmCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_code)
        var txt_phone=findViewById<TextView>(R.id.ac_Ccode_txt_phone)
        if(intent.extras!=null)
        {
            var phone:String=intent.extras!!.getString("edt_phone","")
            txt_phone.text="09"+""+phone
        }

        val btn_Confirmcode=findViewById<Button>(R.id.ac_Cc_btn_Confirm_code)
        val edt_code=findViewById<EditText>(R.id.ac_Cc_Confirm_code)
        val txt_error=findViewById<TextView>(R.id.ac_Cc_txt_Error)

        btn_Confirmcode.setOnClickListener {

            if(edt_code.text.toString().length==5)
            {
                var intent: Intent =Intent(this,Contents::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                Toast.makeText( this,"Error", Toast.LENGTH_SHORT).show()
                txt_error.text="کد وارد شده اشتباه است."
            }

        }
    }
}
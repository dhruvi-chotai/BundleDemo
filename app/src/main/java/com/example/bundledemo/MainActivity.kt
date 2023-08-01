package com.example.bundledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var pwd:EditText
    private lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name_et)
        pwd = findViewById(R.id.pwd_et)
        submit = findViewById(R.id.submit_btn)



        submit.setOnClickListener{
            val name = name.text.toString()
            val pwd = pwd.text.toString()
            Log.d("abc", "def")
            if (name.isNotEmpty() && pwd.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("name", name)

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }



    }
}
package com.example.maytinhdongian

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var btnCong: Button
    lateinit var btnTru: Button
    lateinit var btnNhan: Button
    lateinit var btnChia: Button
    lateinit var nhapa: EditText
    lateinit var nhapb: EditText
    lateinit var tvKetQua: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnCong = findViewById(R.id.btn_Cong)
        btnTru = findViewById(R.id.btn_Tru)
        btnNhan = findViewById(R.id.btn_Nhan)
        btnChia = findViewById(R.id.btn_Chia)
        nhapa = findViewById(R.id.nhap_a)
        nhapb = findViewById(R.id.nhap_b)
        tvKetQua = findViewById(R.id.ketqua_tv)

        btnCong.setOnClickListener(this)
        btnTru.setOnClickListener(this)
        btnNhan.setOnClickListener(this)
        btnChia.setOnClickListener(this)




    }
    override fun onClick(p0: View?) {
        var a = nhapa.text.toString().toDouble()
        var b = nhapb.text.toString().toDouble()
        var result = 0.0

        when(p0?.id){
            R.id.btn_Cong -> {
                result = a + b
            }
            R.id.btn_Tru -> {
                result = a - b
            }
            R.id.btn_Nhan -> {
                result = a * b
            }
            R.id.btn_Chia -> {
                result = a / b
            }
        }
        tvKetQua.text = "Kết quả là : $result"
    }

}
package com.example.helloworld



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            if (textView.text == "Đã thay đổi kí tự") {
                textView.text = "Hello World!"
            } else {
                textView.text = "Đã thay đổi kí tự"

        }
    }
}
}
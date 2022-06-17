package com.cursodeandroid.mymessengerkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceiveMessageActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MESSAGE = "message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

        val intent = intent
        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        val messageView = findViewById<View>(R.id.message) as TextView
        messageView.text = messageText
    }
}
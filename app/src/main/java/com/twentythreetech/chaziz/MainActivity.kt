package com.twentythreetech.chaziz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.twentythreetech.chaziz.R.layout.chaziz_main
import kotlinx.android.synthetic.main.chaziz_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(chaziz_main)
        twentypage.loadUrl("2003page.ga")
        }
    }

//twentypage
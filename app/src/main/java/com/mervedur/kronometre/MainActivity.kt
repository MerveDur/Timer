package com.mervedur.kronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.geriSayim

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(/* millisInFuture = */ 15000,/* countDownInterval = */ 1000)
        {
            override fun onTick(millisUntilFinished: Long) {
                geriSayim.text="Kalan: ${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                geriSayim.text="Kalan: 0"
            }

        }.start()
    }



}
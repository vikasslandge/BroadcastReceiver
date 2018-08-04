package com.example.vikaslandge.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    var tview : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tview = tv

        var iFilter = IntentFilter()
        iFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        iFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        iFilter.addAction(Intent.ACTION_NEW_OUTGOING_CALL)
        iFilter.addAction(Intent.ACTION_CAMERA_BUTTON)
        iFilter.addAction(Intent.ACTION_BATTERY_LOW)
        registerReceiver(MyReceiver(tview!!),iFilter)
    }
}

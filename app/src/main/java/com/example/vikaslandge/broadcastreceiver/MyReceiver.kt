package com.example.vikaslandge.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(var tv: TextView) : BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
         tv.text=p1!!.action
    }


}
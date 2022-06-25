package com.helping.material.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.helping.material.adsmodule.AddInitilizer

class MainActivity : AppCompatActivity() {
    lateinit var addInitilizer: AddInitilizer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addInitilizer= AddInitilizer(this,this){

        }

        findViewById<View>(R.id.btn).setOnClickListener {
            addInitilizer.showInterstailAdd("abc")
        }
        addInitilizer!!.setnativeAddOnView(findViewById(R.id.nativeTemplateView))
    }
}
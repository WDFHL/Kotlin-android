package com.kotlin.android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlin.android.activity.AnimationActivity
import com.kotlin.android.activity.BasicsActivity
import com.kotlin.android.kotlinclass.Invoice_005

//https://www.kotlincn.net/docs/reference/classes.html
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun startBasicsActivity(view : View){
        startActivity(Intent(this@MainActivity, BasicsActivity::class.java))
    }
}

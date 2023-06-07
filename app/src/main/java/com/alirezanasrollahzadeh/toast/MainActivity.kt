package com.alirezanasrollahzadeh.toast

import ANToast
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ANToast.info(this).isRtl(false).gravity(Gravity.TOP).duration(Toast.LENGTH_LONG)
            .message("عملیات با موفقیت انجام شد!").build().show()
    }
}

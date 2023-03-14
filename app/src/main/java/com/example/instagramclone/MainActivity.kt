package com.example.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramclone.fragments.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.layout,FirstFragment())
            .commit()
    }
}
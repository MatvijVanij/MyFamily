package com.example.myfamily

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfamily.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit  var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.imagePhoto.setImageResource(R.drawable.myfamily)

        bindingClass.bFather.setOnClickListener(){
            bindingClass.imagePhoto.setImageResource(R.drawable.father)
        }
        bindingClass.bMather.setOnClickListener(){
            bindingClass.imagePhoto.setImageResource(R.drawable.mami1)
        }
        bindingClass.bFirst.setOnClickListener() {
            bindingClass.imagePhoto.setImageResource(R.drawable.vanui1)
        }
        bindingClass.bSecond.setOnClickListener(){
            bindingClass.imagePhoto.setImageResource(R.drawable.ola)
        }
        bindingClass.bThird.setOnClickListener(){
            bindingClass.imagePhoto.setImageResource(R.drawable.meshik)
        }
    }
}
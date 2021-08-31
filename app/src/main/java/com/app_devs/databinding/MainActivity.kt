package com.app_devs.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app_devs.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val studentObj=Student("Monica Bellucci","Actor","https://pbs.twimg.com/media/EfW94D4XoAEw66n.jpg:large")
        binding.student=studentObj
    }
}
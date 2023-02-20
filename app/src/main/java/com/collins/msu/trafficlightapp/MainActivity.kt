package com.collins.msu.trafficlightapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.appcompat.widget.ButtonBarLayout
import com.collins.msu.trafficlightapp.databinding.ActivityMainBinding
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var Button : Button
    private lateinit var red_light : ImageView
    private lateinit var green_light : ImageView
    private lateinit var yellow_light : ImageView
    private var isStop : Boolean = true
    private var isGo : Boolean = true
    private var isWait : Boolean = true

    // var isStop by Delegates.notNull<Boolean>()
    //private var isGo by Delegates.notNull<Boolean>()
    //private var isWait by Delegates.notNull<Boolean>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        red_light
        green_light
        yellow_light



        binding.button.setOnClickListener {
            if (isStop) {
                //Button.setBackgroundColor();
                Button.setText("GO!");
                binding.RedLight.visibility = View.INVISIBLE
                binding.GreenLight.visibility = View.VISIBLE
                binding.YellowLight.visibility = View.INVISIBLE
                booleanArrayOf(isGo,isWait,isStop)

            } else if (isGo) {
               // Button.setBackgroundColor();
                Button.setText("Wait!");
                binding.RedLight.visibility = View.INVISIBLE
                binding.GreenLight.visibility = View.INVISIBLE
                binding.YellowLight.visibility = View.VISIBLE
                booleanArrayOf(isWait, isStop, isGo)

            } else {
               // Button.setBackgroundColor();
                Button.setText("Stop!");
                binding.RedLight.visibility = View.VISIBLE
                binding.GreenLight.visibility = View.INVISIBLE
                binding.YellowLight.visibility = View.INVISIBLE
                booleanArrayOf(isStop, isGo, isWait)
            }
        }

    }
}
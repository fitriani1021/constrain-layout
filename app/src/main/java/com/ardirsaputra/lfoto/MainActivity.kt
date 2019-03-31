package com.ardirsaputra.lfoto
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img1.setOnClickListener { setImage("1") }
        img2.setOnClickListener { setImage("2") }
        img3.setOnClickListener { setImage("3") }
        img4.setOnClickListener { setImage("4") }
        img5.setOnClickListener { setImage("5") }
        img6.setOnClickListener { setImage("6") }
    }
    fun setImage(string :String ) {
        if(string == "1"){
            imageView.setImageResource(R.drawable.image1)
        }else if (string == "2") {
            imageView.setImageResource(R.drawable.image2)
        }else if (string == "3") {
            imageView.setImageResource(R.drawable.image3)
        }else if (string == "4") {
            imageView.setImageResource(R.drawable.image4)
        }else if (string == "5") {
            imageView.setImageResource(R.drawable.image5)
        } else {
            imageView.setImageResource(R.drawable.image6)
        }
    }
}

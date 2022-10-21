package com.example.ptactic12

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ClickableSpan
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun dowloadapple(view: View) {
        val photo: ImageView =findViewById(R.id.imageView);
        val image:Int=R.drawable.apple;
        photo.setVisibility(View.VISIBLE);
        val description:String="This is logo";
        photo.setImageResource(image);
        photo.setContentDescription(description);
    }


    fun dowloadpear(view: View) {
        val photo:ImageView=findViewById(R.id.imageView);
        val image:Int=R.drawable.grusha;
        val description:String="This is logo";
        photo.setImageResource(image);
        photo.setContentDescription(description);
    }


    fun dowloadgrape(view: View) {
        val photo:ImageView=findViewById(R.id.imageView);
        val image:Int=R.drawable.vinogradd;
        val description:String="This is logo";
        photo.setImageResource(image);
        photo.setContentDescription(description);
    }

    fun dowapple(view: View) {
        val imageaple :ImageView =findViewById(R.id.imageapple);
        imageaple.setVisibility(View.VISIBLE);
    }
    fun dowgrup(view: View) {
        val imagegrup :ImageView =findViewById(R.id.imagegrusha);
        imagegrup.setVisibility(View.VISIBLE);


    }
    fun dowavino(view: View) {
        val imagevino :ImageView =findViewById(R.id.imagevinogradd);
        imagevino.setVisibility(View.VISIBLE);
    }
}
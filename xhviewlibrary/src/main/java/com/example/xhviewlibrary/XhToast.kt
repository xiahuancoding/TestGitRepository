package com.example.xhviewlibrary

import android.content.Context
import android.widget.Toast

object XhToast {

    fun showToastShort(context:Context,content:String){
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show()
    }



}
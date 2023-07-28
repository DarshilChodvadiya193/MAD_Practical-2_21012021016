package com.example.mad_practical_2_21012021016

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("oncreatemethod is call")
    }

    fun showMessage(Message:String){
        Log.i(TAG, Message)
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout?=findViewById(R.id.myCoordinatorLayout)
        if(v!=null){
            Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            Message,
            Snackbar.LENGTH_SHORT
        ).show()
        }

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart Method is Call")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume Method is Call")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause Method is Call")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onstop method is call")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("ondestroy method is call")
    }
}
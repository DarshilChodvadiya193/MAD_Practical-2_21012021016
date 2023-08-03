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

    fun showMessage(Message : String){
        Log.i(TAG,Message)
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show()
        val constraint : ConstraintLayout? = findViewById(R.id.MainConstraint)
        if (constraint != null){
            Snackbar.make(constraint,Message,Snackbar.LENGTH_SHORT).show()
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
        showMessage("onStop method is call")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is call")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is call")
    }
}
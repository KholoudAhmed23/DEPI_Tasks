package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){
    val job:Job=Job()
    val coroutineScope= CoroutineScope(Dispatchers.Default+job)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        GlobalScope.launch {
            launch {
                for (i in 1..100) {
                    //delay(50)
                    Log.i("GlopalScope1", "$i")
                }
            }
            launch {
                for (i in 1..80) {
                   // delay(40)
                    Log.i("GlopalScope2", "$i")
                }
            }
        }
        for (i in 1..200) {
            Log.i("GlopalScope3", "$i")
        }
        */
       /* lifecycleScope.launch {
            var string1=""
            var string2=""
            val jop1=launch {
                string1=getString1()
            }
            val jop2=launch {
                string2=getString2()
            }
            Log.i("test",string1)
            Log.i("test",string2)
            jop1.join()
            Log.i("test",string1)
            jop2.join()
            Log.i("test",string2)
        }
        */
        /*
        lifecycleScope.launch {
            val string=async {
                getString1()
            }
            Log.i("test",string.await())
            val string2=async {
                    getString2()
            }
        }*/
      /*  val job1=coroutineScope.launch(Dispatchers.IO) {
                for (i in 1..200) {
                    delay(50)
                    Log.i("test", "$i")
                }
            }
        val job2=coroutineScope.launch (Dispatchers.IO) {
                for (i in 1..200) {
                    delay(50)
                    Log.i("test", "$i")
                }
            }

       */
        //job.cancel()



    }
    suspend fun getString1(): String {
        delay(5000)
        return "Kholoud"
    }
    suspend fun getString2(): String {
        delay(10000)
        return "Ahmed"
    }
}
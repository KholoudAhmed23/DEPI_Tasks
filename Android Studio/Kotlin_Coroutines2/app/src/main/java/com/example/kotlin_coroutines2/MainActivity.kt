package com.example.kotlin_coroutines2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val channel=Channel<Int>()
       /* runBlocking {
            launch{
                for(i in 1..100){
                    channel.send(i)
                }
                launch {
                    for (i in channel){
                        Log.i("test","$i")
                    }
                }
            }
        }

        */
        lifecycleScope.launch {
            flow<Int>{
                for (i in 1 .. 100){
                    emit(i)
                    delay(3000)
                }
            }.buffer().collect{
                delay(1000)
                Log.i("test",it.toString())
            }
        }
    }
}
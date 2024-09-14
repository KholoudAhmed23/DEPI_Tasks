package com.example.session9

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel:ViewModel() {

    private var _score1=MutableLiveData<Int>()
    val score1:MutableLiveData<Int>get()=_score1

    private var _score2=MutableLiveData<Int>()
    val score2:MutableLiveData<Int>get()=_score2

    private var _text=MutableLiveData<String>()
    val text:MutableLiveData<String> get() = _text

    init {
        _score1.value=0
        _score2.value=0
        _text.value="Start the game!"
    }
    fun checkTeamWinner(){
        if ((score1.value ?: 0) > (score2.value ?: 0)){
            _text.value="Team one is the winner"
        }
        else if ((score1.value ?: 0) < (score2.value ?: 0)){
            _text.value="Team two is the winner"
        }
        else{
            _text.value="It's a tie!"
        }
    }

    fun incrementScoreTeamOne(){
        val currentScore=_score1.value?:0
        _score1.value=currentScore+1
        checkTeamWinner()
    }
    fun incrementScoreTeamTwo(){
        val currentScore=_score2.value?:0
        _score2.value=currentScore+1
        checkTeamWinner()
    }
}
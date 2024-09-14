package com.example.session2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.example.session2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy (LazyThreadSafetyMode.NONE){
    ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        //kholoud Ahmed Mahmoud Ahmed

        binding.fName.editText.hint="Enter your first name"
        binding.lName.editText.hint="Enter your last name"
        binding.email.editText.hint="Enter your e-mail"
        binding.password.editText.hint="Enter your password"

        binding.fName.editText.doAfterTextChanged{
            if((binding.fName.editText.text?.length?:0)<5){
                binding.fName.editText.error="enter char more than 5"
            }
        }
        binding.lName.editText.doAfterTextChanged{
            if((binding.lName.editText.text?.length?:0)<5){
                binding.lName.editText.error="enter char more than 5"
            }
        }
        binding.email.editText.doAfterTextChanged{
            if((binding.email.editText.text?.length?:0)<5){
                binding.email.editText.error="enter char more than 5"
            }
        }
        binding.password.editText.doAfterTextChanged{
            if((binding.password.editText.text?.length?:0)<5){
                binding.password.editText.error="enter char more than 5"
            }
        }
    }
}
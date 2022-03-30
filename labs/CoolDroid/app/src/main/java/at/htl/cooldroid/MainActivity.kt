package at.htl.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import at.htl.cooldroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var binding: ActivityMainBinding
    internal val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.tvMessage.text = "xxx"
        binding.ivCooldroid.setOnClickListener {
            counter++
            binding.tvMessage.text=
                when (counter) {
                    1 -> getString(R.string.txt_once)
                    2 -> getString(R.string.txt_twice)
                    else -> getString(R.string.txt_view_numbers, counter)
                }
            Log.d(LOG_TAG,"$counter")
        }
    }
}
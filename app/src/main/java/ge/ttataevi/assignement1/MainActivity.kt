package ge.ttataevi.assignement1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ge.ttataevi.assignement1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of click listener.
        binding.imageView1.setOnClickListener {
            // TODO: logic
        }
    }
}
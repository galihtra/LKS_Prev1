package com.galih.lks_prev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.lks_prev1.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.hadir.setOnClickListener {
            startActivity(Intent(this, PresentActivity::class.java))
        }

        binding.tidakHadir.setOnClickListener {
            startActivity(Intent(this, NotPresentActivity::class.java))
        }

        binding.sakit.setOnClickListener {
            startActivity(Intent(this, SickActivity::class.java))
        }
    }
}
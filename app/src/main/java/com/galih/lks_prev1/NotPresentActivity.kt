package com.galih.lks_prev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.lks_prev1.databinding.ActivityNotPresentBinding

class NotPresentActivity : AppCompatActivity() {

    private val binding by lazy {ActivityNotPresentBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.btnSubmit.setOnClickListener {

        }
    }
}
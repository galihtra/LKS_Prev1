package com.galih.lks_prev1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.galih.lks_prev1.databinding.ActivityPresentBinding
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class PresentActivity : AppCompatActivity() {

    private val binding by lazy { ActivityPresentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.keluar.setOnClickListener {
            finishAffinity()
        }
    }
}
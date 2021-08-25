package com.galih.lks_prev1

import android.app.Activity
import android.content.Intent
import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.lks_prev1.databinding.ActivitySickBinding
import com.github.dhaval2404.imagepicker.ImagePicker

class SickActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySickBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.gallery.setOnClickListener {
            ImagePicker.with(this).galleryOnly().galleryMimeTypes(arrayOf("image/*"))
                .crop()
                .maxResultSize(400,400)
                .start()
        }

        binding.camera.setOnClickListener {
            ImagePicker.with(this).cameraOnly().crop().start()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK && requestCode == ImagePicker.REQUEST_CODE) {
            binding.imagePicker.setImageURI(data?.data)
        }
    }
}
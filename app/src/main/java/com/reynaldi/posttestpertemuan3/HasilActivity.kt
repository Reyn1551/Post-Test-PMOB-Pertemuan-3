package com.reynaldi.posttestpertemuan3

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reynaldi.posttestpertemuan3.databinding.HasilActivityBinding

class HasilActivity : AppCompatActivity() {
    private lateinit var binding: HasilActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HasilActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(DATA_NAMA)
        val username = intent.getStringExtra(DATA_USERNAME)
        val age = intent.getStringExtra(DATA_AGE)
        val email = intent.getStringExtra(DATA_EMAIL)
        val jenisKelamin = intent.getStringExtra(DATA_KELAMIN)

        binding.apply {
            tvResultFullName.text = "Full Name: $nama"
            tvResultUsername.text = "Username: $username"
            tvResultAge.text = "Age: $age"
            tvResultEmail.text = "Email: $email"
            tvResultGender.text = "Gender: $jenisKelamin"

            if (jenisKelamin == "Laki-laki") {
                tvResultGender.setBackgroundColor(Color.GRAY)
            }
            if (jenisKelamin == "Perempuan") {
                tvResultGender.setBackgroundColor(Color.MAGENTA)
            }
        }
    }

    companion object {
        const val DATA_NAMA = "data_nama"
        const val DATA_USERNAME = "data_username"
        const val DATA_AGE = "data_age"
        const val DATA_EMAIL = "data_email"
        const val DATA_KELAMIN = "data_kelamin"
    }
}

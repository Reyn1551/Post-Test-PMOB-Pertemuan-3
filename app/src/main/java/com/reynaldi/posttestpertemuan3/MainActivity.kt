package com.reynaldi.posttestpertemuan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reynaldi.posttestpertemuan3.HasilActivity.Companion.DATA_AGE
import com.reynaldi.posttestpertemuan3.HasilActivity.Companion.DATA_EMAIL
import com.reynaldi.posttestpertemuan3.HasilActivity.Companion.DATA_KELAMIN
import com.reynaldi.posttestpertemuan3.HasilActivity.Companion.DATA_NAMA
import com.reynaldi.posttestpertemuan3.HasilActivity.Companion.DATA_USERNAME
import com.reynaldi.posttestpertemuan3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var jenisKelamin = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSubmit.setOnClickListener {
                val nama = etFullName.text.toString()
                val username = etUsername.text.toString()
                val age = etAge.text.toString()
                val email = etEmail.text.toString()

                if (rbMale.isChecked) {
                    jenisKelamin = "Laki-laki"
                }
                if (rbFemale.isChecked) {
                    jenisKelamin = "Perempuan"
                }

                val intent = Intent(this@MainActivity, HasilActivity::class.java)
                    .putExtra(DATA_NAMA, nama)
                    .putExtra(DATA_USERNAME, username)
                    .putExtra(DATA_AGE, age)
                    .putExtra(DATA_EMAIL, email)
                    .putExtra(DATA_KELAMIN, jenisKelamin)
                startActivity(intent)
            }
        }
    }
}

package com.example.dsp_practical_3_mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.example.dsp_practical_3_mad.databinding.ActivityRegistrationBinding


class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val login = findViewById<TextView>(R.id.logins)
        login.setOnClickListener {
            Intent(this, login_activity::class.java).also{startActivity(it)}
            login.movementMethod = LinkMovementMethod.getInstance();
        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.bottom_nav_login -> {
                    Intent(this, login_activity::class.java).also {
                        startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}

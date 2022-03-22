package br.com.leandro.lima.base_project.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.leandro.lima.base_project.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
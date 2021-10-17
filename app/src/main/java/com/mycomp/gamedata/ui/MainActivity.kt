package com.mycomp.gamedata.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mycomp.gamedata.R
import com.mycomp.gamedata.databinding.ActivityMainBinding
import com.mycomp.gamedata.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .add(R.id.container, MainFragment())
        .commitAllowingStateLoss()
    }
  }
}
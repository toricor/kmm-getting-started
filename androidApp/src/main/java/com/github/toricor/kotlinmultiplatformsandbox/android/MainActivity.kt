package com.github.toricor.kotlinmultiplatformsandbox.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import com.github.toricor.kotlinmultiplatformsandbox.Greeting


class MainActivity : AppCompatActivity() {
    private val scope = MainScope()

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = getString(R.string.loading)

        scope.launch {
            kotlin.runCatching {
                Greeting().greeting()
            }.onSuccess {
                tv.text = it
            }.onFailure {
                tv.text = it.localizedMessage
            }
        }
    }
}
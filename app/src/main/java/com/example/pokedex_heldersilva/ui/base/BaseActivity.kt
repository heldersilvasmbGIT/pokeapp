package com.example.pokedex_heldersilva.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedex_heldersilva.ui.view.BaseView

abstract class BaseActivity : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}

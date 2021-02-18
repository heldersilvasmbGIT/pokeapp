package com.example.pokedex_heldersilva

import android.app.Application

class PokemonApp : Application(){
    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            PokemonApp.apply {
                return this
            }
    }
}
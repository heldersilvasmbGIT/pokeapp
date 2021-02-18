package com.example.pokedex_heldersilva.ui.view

import com.example.pokedex_heldersilva.network.response.PokemonListResponse
import com.example.pokedex_heldersilva.ui.view.BaseView

interface PokemonListView : BaseView {
    fun setPokemonList(response: PokemonListResponse)
}
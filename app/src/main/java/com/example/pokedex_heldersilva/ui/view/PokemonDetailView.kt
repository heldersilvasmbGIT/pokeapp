package com.example.pokedex_heldersilva.ui.view

import com.example.pokedex_heldersilva.network.response.PokemonDetailResponse
import com.example.pokedex_heldersilva.ui.view.BaseView

interface PokemonDetailView : BaseView {
    fun setPokemonDetail(response: PokemonDetailResponse)
}
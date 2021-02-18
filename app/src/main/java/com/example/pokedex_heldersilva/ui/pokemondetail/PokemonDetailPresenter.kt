package com.example.pokedex_heldersilva.ui.pokemondetail

import com.example.pokedex_heldersilva.ui.base.BasePresenter

interface PokemonDetailPresenter : BasePresenter {
    fun getPokemonDetail(name: String?)
}
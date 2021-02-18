package com.example.pokedex_heldersilva.ui.pokemondetail

import com.example.pokedex_heldersilva.network.response.PokemonDetailResponse

interface PokemonDetailConnector {
    interface PokemonDetailListener {

        fun onPokemonDetailFailed(e: Throwable, errorMessage: String)

        fun onPokemonDetailSuccess(response: PokemonDetailResponse)
    }

    fun getPokemonDetail(name: String?, listener: PokemonDetailListener)
}
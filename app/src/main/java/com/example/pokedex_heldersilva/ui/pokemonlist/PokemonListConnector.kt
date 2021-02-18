package com.example.pokedex_heldersilva.ui.pokemonlist

import com.example.pokedex_heldersilva.network.response.PokemonListResponse

interface PokemonListConnector {
    interface PokemonListListener {

        fun onPokemonListFailed(e: Throwable, errorMessage: String)

        fun onPokemonListSuccess(response: PokemonListResponse)
    }

    fun getPokemonList(listener: PokemonListListener)
}

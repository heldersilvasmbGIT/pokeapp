package com.example.pokedex_heldersilva.ui.pokemonlist

import com.example.pokedex_heldersilva.network.response.PokemonListResponse
import com.example.pokedex_heldersilva.ui.view.PokemonListView

class PokemonListPresenterImpl(private var view: PokemonListView?, private var interactor: PokemonListConnector?) :
        PokemonListPresenter, PokemonListConnector.PokemonListListener {
    override fun onPokemonListFailed(e: Throwable, errorMessage: String) {
        view?.showErrorMessage(errorMessage)
    }

    override fun onPokemonListSuccess(response: PokemonListResponse) {
        view?.setPokemonList(response)
    }

    override fun getPokemonList() {
        interactor?.getPokemonList(this)
    }

    override fun onDestroy() {
        view = null
    }

}

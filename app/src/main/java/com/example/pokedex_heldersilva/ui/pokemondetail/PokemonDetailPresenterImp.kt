package com.example.pokedex_heldersilva.ui.pokemondetail

import com.example.pokedex_heldersilva.network.response.PokemonDetailResponse
import com.example.pokedex_heldersilva.ui.view.PokemonDetailView

class PokemonDetailPresenterImpl(private var view: PokemonDetailView, private var interactor: PokemonDetailConnector) :
        PokemonDetailPresenter, PokemonDetailConnector.PokemonDetailListener {
    override fun onPokemonDetailFailed(e: Throwable, errorMessage: String) {
        view.showErrorMessage(errorMessage)
    }

    override fun onPokemonDetailSuccess(response: PokemonDetailResponse) {
        view.setPokemonDetail(response)
    }

    override fun getPokemonDetail(name: String?) {
        interactor.getPokemonDetail(name, this)
    }

    override fun onDestroy() {

    }

}
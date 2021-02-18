package com.example.pokedex_heldersilva.ui.pokemonlist

import com.example.pokedex_heldersilva.network.core.NetworkService
import com.example.pokedex_heldersilva.network.observer.PokemonListObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonListConnectorImpl : PokemonListConnector {
    override fun getPokemonList(listener: PokemonListConnector.PokemonListListener) {
        NetworkService.service()!!.getPokemonList()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(PokemonListObserver(listener))
    }

}

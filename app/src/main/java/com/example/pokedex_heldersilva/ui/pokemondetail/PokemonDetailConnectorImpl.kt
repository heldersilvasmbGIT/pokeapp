package com.example.pokedex_heldersilva.ui.pokemondetail

import com.example.pokedex_heldersilva.network.core.NetworkService
import com.example.pokedex_heldersilva.network.observer.PokemonDetailObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonDetailConnectorImpl : PokemonDetailConnector {
    override fun getPokemonDetail(name: String?, listener: PokemonDetailConnector.PokemonDetailListener) {
        NetworkService.service()!!.getPokemonDetail(name)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(PokemonDetailObserver(listener))
    }

}
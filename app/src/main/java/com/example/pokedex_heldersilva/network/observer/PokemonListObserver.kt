package com.example.pokedex_heldersilva.network.observer

import android.text.TextUtils
import com.example.pokedex_heldersilva.network.response.PokemonListResponse

class PokemonListObserver(private var listener: PokemonListInteractor.PokemonListListener) :
    BaseObserver<PokemonListResponse>() {

    override fun onNext(response: PokemonListResponse) {
        listener.onPokemonListSuccess(response)
    }

    override fun onError(e: Throwable) {
        super.onError(e)
        if (!TextUtils.isEmpty(errorMessage)) {
            listener.onPokemonListFailed(e, errorMessage)
        }
    }

}
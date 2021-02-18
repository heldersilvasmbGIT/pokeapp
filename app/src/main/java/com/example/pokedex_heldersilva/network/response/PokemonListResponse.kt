package com.example.pokedex_heldersilva.network.response

import com.example.pokedex_heldersilva.model.Pokemon
import com.google.gson.annotations.SerializedName

class PokemonListResponse : BaseResponse() {

    @SerializedName("count")
    var count: Int? = null

    @SerializedName("results")
    var results: ArrayList<Pokemon>? = null

}
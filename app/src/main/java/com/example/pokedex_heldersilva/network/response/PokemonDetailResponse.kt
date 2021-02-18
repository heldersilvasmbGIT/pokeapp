package com.example.pokedex_heldersilva.network.response

import com.example.pokedex_heldersilva.model.Ability
import com.example.pokedex_heldersilva.model.Move
import com.example.pokedex_heldersilva.model.Sprite
import com.google.gson.annotations.SerializedName

class PokemonDetailResponse : BaseResponse() {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("sprites")
    var sprites: Sprite? = null

    @SerializedName("moves")
    var moves: ArrayList<Move>? = null

    @SerializedName("weight")
    var weight: Int? = null

    @SerializedName("height")
    var height: Int? = null

    @SerializedName("abilities")
    var abilities: ArrayList<Ability>? = null
}
package com.pokecompose.data.services

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.parameters

class PokeService(
    private val httpClient: HttpClient
) {
    suspend fun getPokemonList(page: String) {
        httpClient.get("pokemon") {
            parameters {
                append("limit", "20")
                append("offset", page)
            }
        }
    }
}
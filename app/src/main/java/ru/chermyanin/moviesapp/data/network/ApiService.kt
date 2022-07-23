package ru.chermyanin.moviesapp.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.chermyanin.moviesapp.data.models.Movies

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}
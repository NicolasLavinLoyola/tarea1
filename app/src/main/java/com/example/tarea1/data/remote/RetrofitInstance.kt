package com.example.tarea1.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//Singleton que contiene la configuracion de Retrofit
object RetrofitInstance {

    //Se instancia el servicio de la API una sola vez
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com") //URL base de la api
            .addConverterFactory(GsonConverterFactory.create()) //Conversar JSON
            .build()
            .create(ApiService::class.java) // Implementa la interfaz ApiService
    }
}
package com.example.tarea1.repository

import com.example.tarea1.data.model.Post
import com.example.tarea1.data.remote.RetrofitInstance


//este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {
        //Funcion que obtiene los posts desde la API
        suspend fun getPosts(): List<Post> {
            return RetrofitInstance.api.getPosts()
        }
}
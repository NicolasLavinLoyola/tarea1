package com.example.tarea1.data.remote

import com.example.tarea1.data.model.Post
import retrofit2.http.GET


//Esta interfaz define los endpoints HTTP
interface ApiService {
    @GET("/posts")
    suspend fun getPosts():List<Post>
}
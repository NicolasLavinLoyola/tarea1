package com.example.tarea1.ui.theme.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.tarea1.viewmodel.PostViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostScreen(viewModel: PostViewModel){
    // Observamos el flujo de datos del ViewModel
    val posts = viewModel.postList.collectAsState().value
    // Scaffold con TopAppBar
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("Listado de Posts") }
            )
        }
    ) { innerPadding ->
        //Aplicamos el padding de seguridad del sistema
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)//Esto garantiza el uso de edge-to-edge
        ){
            //Listas de publicaciones
            LazyColumn {  }
        }
    }
}
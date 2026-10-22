package mx.itson.edu.examenu2_murrieta_mendez.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

//chip con imagen de perfilPost para dar click y visitar el post
@Composable
fun ChipPostPerfil(PerfilPosts: PerfilPost){}

// composable grid con chip anidados
@Composable
// mandar una lista de imagenes
fun GridComponent(PerfilPosts :List<PerfilPost>){
    LazyVerticalGrid( columns = GridCells.Adaptive(minSize = 128.dp)) {
        items(PerfilPosts) {
            perfilPosts ->
            PerfilPost("")
        }
    }


}

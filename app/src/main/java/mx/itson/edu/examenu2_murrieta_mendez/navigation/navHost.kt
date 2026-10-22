package mx.itson.edu.examenu2_murrieta_mendez.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.rememberWideNavigationRailState
import androidx.compose.runtime.Composable



@Composable
fun myApp(innerPadding: PaddingValues){
    val navController = rememberWideNavigationRailState()

    navHost(navController, StartDestination = perfil){
        Composable<perfil>
    }
}
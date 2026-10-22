package mx.itson.edu.examenu2_murrieta_mendez.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.itson.edu.examenu2_murrieta_mendez.R
import mx.itson.edu.examenu2_murrieta_mendez.R.drawable.ic_like
import mx.itson.edu.examenu2_murrieta_mendez.model.Post
import mx.itson.edu.examenu2_murrieta_mendez.model.Usuario
import mx.itson.edu.examenu2_murrieta_mendez.seed.getPost
import mx.itson.edu.examenu2_murrieta_mendez.seed.getUsuario
import mx.itson.edu.examenu2_murrieta_mendez.ui.theme.ExamenU2_Murrieta_MendezTheme

class post : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenU2_Murrieta_MendezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun post( usuario: Usuario, post: Post){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(usuario.imagenPerfil),
                contentDescription = "${usuario.username} foto",
                modifier = Modifier.size(50.dp)

            )
            Text(
                text = "${usuario.username}"
            )
        }

        Image(
            painterResource(post.image),
            contentDescription = "${post.description}"
        )

        Row(){

            Text("Likes + ${post.likes}")
        }

    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    val post = getPost()
    val usuario = getUsuario()
    ExamenU2_Murrieta_MendezTheme {
       post(usuario, post)
    }
}
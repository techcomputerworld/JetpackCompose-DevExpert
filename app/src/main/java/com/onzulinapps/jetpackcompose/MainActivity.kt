package com.onzulinapps.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.onzulinapps.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Surface(color = MaterialTheme.colorScheme.background){
                    ButtonText()
                }
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
            }
        }
    }
}
//@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun ButtonText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello Android!",
            modifier = Modifier
                .clickable() { /*TODO*/}
                .background(Color.Cyan)
                .border(width = 2.dp, color = Color.Blue)
                .padding(horizontal = 16.dp, vertical = 8.dp)



        )
    }
}
@Preview(showBackground = true)
@Composable
fun MediaItem() {
    Column() {
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(color = Color.Red)
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF02D7F8))
                .padding(16.dp)
        ) {
            Text("Title 1")
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}



/*@Preview(showBackground = true, name ="Android Greeting",
    widthDp = 400, heightDp = 100)*/
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        //Box es un objeto equivcalente a un Frame Layout
        Column (
            modifier = Modifier.fillMaxSize()
            //verticalArrangement = Arrangement.SpaceAround,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Greeting(
                name = "Onzulin",
                modifier = Modifier.background(Color.LightGray)


            )
            Greeting(
                name = "Jose",
                modifier = Modifier.background(Color.Magenta)

            )
            Row(modifier = Modifier.padding(top = 5.dp)) {
                Greeting(
                    name = "onzulinapps",
                    modifier =
                        Modifier.background(Color.Cyan)

                )
                Greeting(
                    name = "onzulinapps",
                    modifier =
                        Modifier.background(Color.Green)
                            .padding(start = 5.dp)

                )
            }
        }

    }
}
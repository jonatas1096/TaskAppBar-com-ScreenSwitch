package com.example.appbar.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun About(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Não conseguiu utilizar o nosso App?",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 62.dp),

                        )
                },
            )
        },
        content = {
            Column(Modifier.padding(16.dp)) {
                // Conteúdo da tela
                Text(
                    text = "Veja o passo a passo para conseguir utilizar:",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth(),
                )

                Text(
                    text = "1 - A verdade é que nem eu sei",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 35.dp)
                )
                Text(
                    text = "2 - Por que é que você continua lendo?",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 35.dp)
                )
                Text(
                    text = "3 - Eu realmente não sei",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 35.dp)
                )


            }
        },

        bottomBar = {
            BottomAppBar(

                content = {
                    //Botão para voltar
                    Button(
                        onClick = { navController.navigate("MainScreen") },
                        modifier = Modifier
                            .width(190.dp)
                            .height(45.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(255,255,255)),
                    ) {
                        Text(text = "Home",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,

                            )
                    } //


                },


                )
        }
    )
}


@Preview(showBackground = true)
@Composable
fun AboutPreview() {
    val navController = rememberNavController() // Importe rememberNavController
    About(navController = navController)
}


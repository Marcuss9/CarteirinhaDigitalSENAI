package com.example.carteirinhadigital

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDeEstudante(modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}

//diz que a função vai construir algo na tela (retirando o erro de "Column")
@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier){ //nome: tipo, padrao
    Column (modifier = modifier.fillMaxSize()){
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = "logo_senai_sp",
                modifier = Modifier
                    .size(200.dp)
                    .padding(top = 24.dp)
            )
        }
        Row {
            Text(text = "Nome: ", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Text(text = "Vierinha", fontSize = 20.sp)
        }
        Row {
            Text(text = "Curso: ", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Text(text = "Desenvolvimento de Sistemas", fontSize = 20.sp)
        }

        QrCode(
            conteudo = "vierinhadamassa"
        )

    }
}
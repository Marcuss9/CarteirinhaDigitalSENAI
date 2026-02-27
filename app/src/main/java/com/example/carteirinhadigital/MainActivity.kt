package com.example.carteirinhadigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDeEstudante(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo do SENAI no topo
        Image(
            painter = painterResource(R.drawable.senai_s_o_paulo_logo),
            contentDescription = "logo_senai_sp",
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(0.6f)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Cartão principal da carteirinha
        ElevatedCard(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.elevatedCardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Foto de Perfil com borda
                Box(
                    modifier = Modifier
                        .size(164.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(4.dp) // Espessura da borda
                ) {
                    Image(
                        painter = painterResource(R.drawable.perfil_de_usu_rio_do_vetor_avatar_padr_o_179376714),
                        contentDescription = "foto_perfil",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Informações do Aluno organizadas
                InfoField(label = "NOME", value = "re Seba's")
                Spacer(modifier = Modifier.height(12.dp))
                InfoField(label = "CURSO", value = "Desenvolvimento de Sistemas")

                Spacer(modifier = Modifier.height(24.dp))

                // Container para o QR Code para garantir contraste
                Surface(
                    modifier = Modifier.size(180.dp),
                    shape = RoundedCornerShape(12.dp),
                    color = Color.White
                ) {
                    Box(modifier = Modifier.padding(12.dp)) {
                        QrCode(conteudo = "Vai ser grande o chororô\n" +
                                "Vai ser grande o chororô\n" +
                                "O Gabigol fazendo gol\n" +
                                "O Cássio levando gol\n" +
                                "A torcida gritando gol\n" +
                                "E o narrador narrando o gol\n" +
                                "E a nação corintiana só naquele chororô\n" +
                                "\n" +
                                "Ninguém segura esse flamengo\n" +
                                "Ninguém segura esse flamengo\n" +
                                "O goleiro é bom\n" +
                                "O zagueiro é bom\n" +
                                "O lateral é bom\n" +
                                "O meio de campo é bom\n" +
                                "O atacante é bom\n" +
                                "Esse flamengo é bom")
                    }
                }

                Text(
                    text = "IDENTIDADE DIGITAL",
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun InfoField(label: String, value: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            fontSize = 11.sp,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary,
            letterSpacing = 1.sp
        )
        Text(
            text = value,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
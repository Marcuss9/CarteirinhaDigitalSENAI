package com.example.carteirinhadigital.feature.carteirinha.presentation.screen

import LoginScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.carteirinhadigital.R
import com.example.carteirinhadigital.core.theme.CarteirinhaDigitalTheme
import com.example.carteirinhadigital.feature.carteirinha.presentation.component.LabelText
import com.example.carteirinhadigital.feature.carteirinha.presentation.component.ValueText
import com.rafaelcosta.myapplication.QrCode

    @Composable
    fun CarteirinhaScreen(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo SENAI
            Image(
                painter = painterResource(id = R.drawable.senai_s_o_paulo_logo),
                contentDescription = "logo_senai_sp",
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth(0.6f)
            )

            Spacer(modifier = Modifier.height(16.dp))

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
                    // Foto de Perfil
                    Box(
                        modifier = Modifier
                            .size(160.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(3.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.avatar_login),
                            contentDescription = "foto_perfil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(CircleShape)
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Column(modifier = Modifier.fillMaxWidth()) {
                        LabelText(label = "NOME")
                        ValueText(value = "Marcus")

                        Spacer(modifier = Modifier.height(12.dp))

                        LabelText(label = "CURSO")
                        ValueText(value = "Desenvolvimento de Sistemas")
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // QR Code
                    Surface(
                        modifier = Modifier.size(180.dp),
                        shape = RoundedCornerShape(12.dp),
                        color = Color.White
                    ) {
                        Box(modifier = Modifier.padding(12.dp)) {
                            QrCode(conteudo = "Ola amigo")
                        }
                    }
                }
            }
        }
    }

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaClaro() {
    CarteirinhaDigitalTheme(darkTheme = false) {
        LoginScreen(navController = rememberNavController())
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaEscuro() {
    CarteirinhaDigitalTheme(darkTheme = true) {
        LoginScreen(navController = rememberNavController())
    }
}
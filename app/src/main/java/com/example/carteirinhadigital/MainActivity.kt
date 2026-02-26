package com.example.carteirinhadigital

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
                    CarteirinhaDeEstudante(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize())
                }
            }
        }
    }
}

//diz que a função vai construir algo na tela (retirando o erro de "Column")
@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) { //nome: tipo, padrao
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = "logo_senai_sp",
                modifier = Modifier
                    .size(180.dp)
                    .padding(top = 24.dp)
            )
        }

        androidx.compose.material3.ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            colors = androidx.compose.material3.CardDefaults.elevatedCardColors(
                containerColor = androidx.compose.material3.MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Informações do Aluno
                InfoRow(label = "NOME", value = "Vierinha")
                androidx.compose.foundation.layout.Spacer(modifier = Modifier.size(12.dp))
                InfoRow(label = "CURSO", value = "Desenvolvimento de Sistemas")

                androidx.compose.foundation.layout.Spacer(modifier = Modifier.size(32.dp))
                // QR Code centralizado com borda leve
                Box(
                    modifier = Modifier
                        .background(
                            androidx.compose.ui.graphics.Color.White,
                            androidx.compose.foundation.shape.RoundedCornerShape(8.dp)
                        )
                        .padding(8.dp)
                ) {
                    QrCode(
                        conteudo = "vierinhadamassa",
                        modifier = Modifier.size(200.dp)
                    )
                }

                Text(
                    text = "Aponte para o leitor",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 8.dp),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}
@Composable
fun InfoRow(label: String, value: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.material3.MaterialTheme.colorScheme.primary
        )
        Text(
            text = value,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            color = androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
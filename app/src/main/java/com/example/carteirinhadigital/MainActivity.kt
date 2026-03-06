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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    CarteirinhaView(
//                        modifier = Modifier
//                            .padding(innerPadding)
//                            .fillMaxSize()
//                    )
                }
            }
        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//
//@Composable
//fun PreviewCarteirinhaClaro() {
//    CarteirinhaDigitalTheme(darkTheme = false) {
//        CarteirinhaView(
//            modifier = Modifier.padding(all = 16.dp)
//        )
//    }
//}
//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//
//@Composable
//fun PreviewCarteirinhaEscuro() {
//    CarteirinhaDigitalTheme(darkTheme = true ) {
//        CarteirinhaView(
//            modifier = Modifier.padding(all = 16.dp)
//        )
//    }
//}

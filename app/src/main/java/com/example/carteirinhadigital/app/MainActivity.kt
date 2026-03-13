package com.example.carteirinhadigital.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.carteirinhadigital.core.designsystem.theme.CarteirinhaDigitalTheme
import com.example.carteirinhadigital.feature.carteirinha.presentation.CarteirinhaView

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
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text("Top app bar")
                            }
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            contentColor = MaterialTheme.colorScheme.primary,
                        ) {
                            Text(
                                modifier = Modifier.Companion
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Companion.Center,
                                text = "Bottom app bar",
                            )
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            Icon(Icons.Default.Add, contentDescription = "Add")
                        }
                    }
                ) { innerPadding ->
                    CarteirinhaView(
                        modifier = Modifier.Companion
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}
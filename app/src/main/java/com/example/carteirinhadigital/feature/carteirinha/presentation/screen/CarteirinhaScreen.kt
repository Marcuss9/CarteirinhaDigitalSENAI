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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun CarteirinhaScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    CarteirinhaContent(
        qrCodeContent = "seunumerodematriculaaqui",
        modifier = modifier,
        navController
    )
}
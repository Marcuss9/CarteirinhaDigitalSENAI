package com.example.carteirinhadigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinhadigital.core.theme.CarteirinhaDigitalTheme
import com.example.carteirinhadigital.core.navigation.AppNavHost

@Composable
fun App(){
    CarteirinhaDigitalTheme(){
        val navController = rememberNavController()
        AppNavHost(
            navController = navController
        )
    }
}
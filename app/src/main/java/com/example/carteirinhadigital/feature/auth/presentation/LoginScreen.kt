import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.carteirinhadigital.core.navigation.Routes
import com.example.carteirinhadigital.feature.auth.presentation.LoginContent

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    LoginContent(
        login = login,
        senha = senha,
        onLoginChange = { it },
        onSenhaChange = { it },
        onLoginClick = {
            navController.navigate(
                Routes.Home.route
            )
        },
        modifier = modifier
    )
}
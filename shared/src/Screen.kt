import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.AppTheme
import ui.components.AppBar

@Composable
fun Screen() {
    AppTheme {
        var incrementCounter by remember { mutableStateOf(0) }
        Scaffold(
                topBar = { AppBar(title = "Compose Demo Home Page") },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {
                            incrementCounter += 1
                        },
                        content = {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Increment"
                            )
                        }
                    )
                }
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = "You have pushed the button this many times")
                Text(
                    text = "$incrementCounter",
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    }
}

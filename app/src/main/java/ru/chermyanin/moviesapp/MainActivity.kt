package ru.chermyanin.moviesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.chermyanin.moviesapp.navigation.SetupNavHost
import ru.chermyanin.moviesapp.ui.theme.MoviesAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppTheme {
                val navController = rememberNavController()
                val viewModel = hiltViewModel<MainViewModel>()
                SetupNavHost(navController = navController, viewModel = viewModel)
            }
        }
    }
}
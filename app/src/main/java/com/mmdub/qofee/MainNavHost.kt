package com.mmdub.qofee

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mmdub.qofee.screen.home.HomeScreen
import com.mmdub.qofee.screen.splash.SplashScreen
import com.mmdub.qofee.util.NavRoutes
import com.mmdub.qofee.viewmodel.MainViewModel

@Composable
fun MainNavHost(
    navController: NavHostController,
    mainViewModel: MainViewModel
) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.SPLASH_SCREEN.name
    ){
        composable(NavRoutes.SPLASH_SCREEN.name){
            SplashScreen(navController = navController)
        }

        composable(NavRoutes.HOME_SCREEN.name){
            HomeScreen(navController = navController)
        }
    }
}
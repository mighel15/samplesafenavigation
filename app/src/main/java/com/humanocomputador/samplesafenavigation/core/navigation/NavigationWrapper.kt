package com.humanocomputador.samplesafenavigation.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.humanocomputador.samplesafenavigation.LoginScreen
import com.humanocomputador.samplesafenavigation.MainMenuScreen
import com.humanocomputador.samplesafenavigation.MenuUnoResultScreen
import com.humanocomputador.samplesafenavigation.MenuUnoScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen {
                navController.navigate(MainMenu)
            }
        }
        composable<MainMenu> {
            MainMenuScreen ({},{navController.navigate(MenuUno)})
        }

        composable<MenuUno> {
            MenuUnoScreen { navController.navigate(MenuUnoResult(name = it)) }
        }

        composable<MenuUnoResult> { backStackEntry->
            val previusMenu = backStackEntry.toRoute<MenuUnoResult>()
            MenuUnoResultScreen(previusMenu.name){
                //one back
                //navController.popBackStack()
                //navController.navigateUp()  with deeplinks has another function its come back other app
                //
                //navigate to any menu but without comeback
                navController.navigate(MainMenu){
                    popUpTo<MainMenu> { inclusive = true }
                }
            }
        }


    }
}
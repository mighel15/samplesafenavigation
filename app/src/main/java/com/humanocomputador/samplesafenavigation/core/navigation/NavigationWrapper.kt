package com.humanocomputador.samplesafenavigation.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.humanocomputador.samplesafenavigation.LoginScreen
import com.humanocomputador.samplesafenavigation.MainMenuScreen
import com.humanocomputador.samplesafenavigation.MenuDosResultScreen
import com.humanocomputador.samplesafenavigation.MenuDosScreen
import com.humanocomputador.samplesafenavigation.MenuUnoResultScreen
import com.humanocomputador.samplesafenavigation.MenuUnoScreen
import com.humanocomputador.samplesafenavigation.core.navigation.type.createNavType
import com.humanocomputador.samplesafenavigation.models.Person
import kotlin.reflect.typeOf

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
            MainMenuScreen({ navController.navigate(MenuDos) }, { navController.navigate(MenuUno) })
        }

        composable<MenuUno> {
            MenuUnoScreen { navController.navigate(MenuUnoResult(name = it)) }
        }

        composable<MenuDos> {
            MenuDosScreen { navController.navigate(MenuDosResult(it)) }
        }
        composable<MenuUnoResult> { backStackEntry ->
            val previousMenu = backStackEntry.toRoute<MenuUnoResult>()
            MenuUnoResultScreen(previousMenu.name) {
                //one back
                //navController.popBackStack()
                //navController.navigateUp()  with deeplinks has another function its come back other app
                //
                //navigate to any menu but without comeback
                navController.navigate(MainMenu) {
                    popUpTo<MainMenu> { inclusive = true }
                }
            }
        }
        composable<MenuDosResult>(typeMap = mapOf(typeOf<Person>() to createNavType<Person>())) { backStackEntry ->
            val previousMenu = backStackEntry.toRoute<MenuDosResult>()
            MenuDosResultScreen(previousMenu.person){
                navController.navigate(MainMenu) {
                    popUpTo<MainMenu> { inclusive = true }
                }
            }
        }


    }
}
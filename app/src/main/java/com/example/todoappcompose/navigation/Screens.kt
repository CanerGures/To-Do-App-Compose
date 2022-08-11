package com.example.todoappcompose.navigation

import androidx.navigation.NavHostController
import com.example.todoappcompose.util.Constants.LIST_SCREEN
import com.example.todoappcompose.util.Enums

class Screens(navController: NavHostController) {
    val list: (Enums.Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }
}
package com.example.todoappcompose.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todoappcompose.util.Constants
import com.example.todoappcompose.util.Constants.TASK_SCREEN
import com.example.todoappcompose.util.Enums

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Enums.Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}
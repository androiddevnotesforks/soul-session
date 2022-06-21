/*
 * Copyright 2022 zgsbrgr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zgsbrgr.soulsession.feature.player.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.zgsbrgr.soulsession.core.navigation.AppNavigationDestination

object PlayerDestination : AppNavigationDestination {
    override val destination: String
        get() = "player_destination"
    override val route: String
        get() = "player_route"
    const val topicIdArg = "topicId"
}

fun NavGraphBuilder.playerGraph(
    onBackClick: () -> Unit
) {

    composable(
        route = "${PlayerDestination.route}/{${PlayerDestination.topicIdArg}}",
        arguments = listOf(
            navArgument(PlayerDestination.topicIdArg) {
                type = NavType.StringType
            }
        )
    ) {
    }
}

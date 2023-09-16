package ru.pyroman.laza.feature.auth.screen.entity

import divkit.dsl.*
import ru.pyroman.laza.feature.auth.screen.AuthScreenConstants
import ru.pyroman.laza.screen.Screen
import ru.pyroman.laza.screen.ScreenData

class DummyAuthScreen : Screen {

    override fun getData(): ScreenData {
        val divan = divan {
            data(
                logId = AuthScreenConstants.AUTH_SCREEN_LAYOUT_ID,
                states = singleRoot(
                    div = container(
                        items = emptyList(),
                        background = listOf(solidBackground(color("#fefefe"))),
                        width = matchParentSize(),
                        height = wrapContentSize(),
                        orientation = overlap,
                        contentAlignmentHorizontal = center,
                        contentAlignmentVertical = center,
                    )
                )
            )
        }

        return ScreenData(
            divan = divan,
        )
    }
}
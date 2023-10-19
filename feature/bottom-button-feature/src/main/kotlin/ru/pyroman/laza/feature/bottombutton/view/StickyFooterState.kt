package ru.pyroman.laza.feature.bottombutton.view

import divkit.dsl.*
import divkit.dsl.scope.DivScope

object StickyFooter {
    const val DIV_ID = "stickyFooterDiv"
    const val VISIBLE_STATE_ID = "stickyFooterVisibleState"
    const val INVISIBLE_STATE_ID = "stickyFooterInvisibleState"
}

fun DivScope.stickyFooterState(
    view: Container,
) = state(
    divId = StickyFooter.DIV_ID,
    alignmentVertical = bottom,
    alignmentHorizontal = center,
    states = listOf(
        stateItem(
            stateId = StickyFooter.VISIBLE_STATE_ID,
            div = view.plus(
                additive = containerProps(
                    id = "${view.properties.id}visible",
                    visibility = visible,
                    transitionIn = slideTransition(
                        edge = bottom,
                        duration = 200,
                    ),
                    transitionOut = slideTransition(
                        edge = bottom,
                        duration = 200,
                    ),
                )
            ),
        ),
        stateItem(
            stateId = StickyFooter.INVISIBLE_STATE_ID,
            div = view.plus(
                additive = containerProps(
                    id = "${view.properties.id}invisible",
                    visibility = invisible,
                )
            ),
        )
    ),
)
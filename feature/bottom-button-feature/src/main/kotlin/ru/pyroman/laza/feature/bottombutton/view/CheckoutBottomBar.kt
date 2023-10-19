package ru.pyroman.laza.feature.bottombutton.view

import divkit.dsl.*
import divkit.dsl.scope.DivScope

fun DivScope.checkoutBottomBar() = container(
    width = matchParentSize(),
    height = wrapContentSize(),
    orientation = vertical,
    contentAlignmentHorizontal = center,
    contentAlignmentVertical = center,
    background = listOf(solidBackground(color("#ffffff"))),
    border = border(
        cornersRadius = cornersRadius(
            topLeft = 20,
            topRight = 20,
        )
    ),
    paddings = edgeInsets(
        top = 12,
        left = 12,
        right = 12,
        bottom = 20,
    ),
    items = listOf(
        checkoutBottomBarSummarySection(),
    ),
)

fun DivScope.checkoutBottomBarSplitSection() = container(
    width = matchParentSize(),
    height = wrapContentSize(),
    orientation = overlap,
    items = listOf(
        text(
            text = "Разбить в сплит от 4623 х 4",

            ),
    ),
)

fun DivScope.checkoutBottomBarSummarySection() = container(
    width = matchParentSize(),
    height = wrapContentSize(),
    orientation = overlap,
    alignmentVertical = center,
    alignmentHorizontal = center,
    items = listOf(
        container(
            width = wrapContentSize(),
            height = wrapContentSize(),
            orientation = vertical,
            alignmentVertical = center,
            alignmentHorizontal = left,
            contentAlignmentVertical = top,
            contentAlignmentHorizontal = left,
            items = listOf(
                text(
                    width = wrapContentSize(),
                    height = wrapContentSize(),
                    text = "Итого",
                    fontSize = 11,
                    lineHeight = 13,
                    fontWeight = medium,
                    textColor = color("#191918")
                ),
                text(
                    width = wrapContentSize(),
                    height = wrapContentSize(),
                    text = "18490 ₽",
                    fontSize = 22,
                    lineHeight = 28,
                    fontWeight = bold,
                    textColor = color("#191918")
                )
            ),
        ),
        button(),
    ),
)

fun DivScope.button() = container(
    width = fixedSize(
        value = 160,
        unit = dp,
    ),
    height = wrapContentSize(),
    orientation = overlap,
    alignmentVertical = center,
    alignmentHorizontal = right,
    contentAlignmentHorizontal = center,
    contentAlignmentVertical = center,
    background = listOf(solidBackground(color("#fce000"))),
    border = border(
        cornersRadius = cornersRadius(
            topLeft = 16,
            topRight = 16,
            bottomLeft = 16,
            bottomRight = 16,
        ),
    ),
    paddings = edgeInsets(
        top = 12,
        left = 18,
        bottom = 12,
        right = 18,
    ),
    items = listOf(
        text(
            text = "Оплатить",
            fontSize = 16,
            alignmentVertical = center,
            alignmentHorizontal = center,
            textAlignmentVertical = center,
            textAlignmentHorizontal = center,
            lineHeight = 19,
            fontWeight = bold,
            textColor = color("#21201f")
        ),
    ),
)

fun DivScope.checkoutBottomBarState() = state(
    divId = "bottomButton",
    alignmentVertical = bottom,
    alignmentHorizontal = center,
    states = listOf(
        stateItem(
            stateId = "visible",
            div = checkoutBottomBar()
                .plus(
                    additive = containerProps(
                        id = "visibleId",
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
            stateId = "invisible",
            div = checkoutBottomBar()
                .plus(
                    additive = containerProps(
                        id = "invisibleId",
                        visibility = invisible,
                    )
                ),
        )
    ),
)
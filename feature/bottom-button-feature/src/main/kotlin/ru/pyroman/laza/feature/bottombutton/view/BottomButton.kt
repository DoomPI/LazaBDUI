package ru.pyroman.laza.feature.bottombutton.view

import divkit.dsl.*
import divkit.dsl.scope.DivScope

fun DivScope.bottomButton(
    title: String,
) = container(
    width = matchParentSize(),
    height = wrapContentSize(),
    orientation = horizontal,
    background = listOf(solidBackground(color("#9775fa"))),
    contentAlignmentHorizontal = center,
    contentAlignmentVertical = top,
    alignmentHorizontal = center,
    alignmentVertical = bottom,
    paddings = edgeInsets(
        top = 15,
        left = 10,
        right = 10,
        bottom = 40,
    ),
    items = listOf(
        text(
            text = title,
            width = wrapContentSize(),
            height = wrapContentSize(),
            fontSize = 17,
            fontWeight = bold,
            lineHeight = 19,
            letterSpacing = 0.0,
            textColor = color("#fefefe"),
            textAlignmentHorizontal = center,
            textAlignmentVertical = center,
        )
    ),
)
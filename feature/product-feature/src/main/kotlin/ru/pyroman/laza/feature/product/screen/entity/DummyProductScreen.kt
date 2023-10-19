package ru.pyroman.laza.feature.product.screen.entity

import divkit.dsl.*
import divkit.dsl.scope.DivScope
import ru.pyroman.laza.feature.bottombutton.view.*
import ru.pyroman.laza.feature.product.screen.ProductScreenConstants
import ru.pyroman.laza.screen.Screen
import ru.pyroman.laza.screen.ScreenData

class DummyProductScreen : Screen {

    override fun getData(): ScreenData {
        val divan = divan {
            data(
                logId = ProductScreenConstants.PRODUCT_SCREEN_LAYOUT_ID,
                states = singleRoot(
                    div = container(
                        width = matchParentSize(),
                        height = matchParentSize(),
                        orientation = overlap,
                        items = listOf(
                            gallery(
                                width = matchParentSize(),
                                height = matchParentSize(),
                                orientation = vertical,
                                alignmentVertical = center,
                                alignmentHorizontal = center,
                                background = listOf(solidBackground(color("#fefefe"))),
                                items = listOf(
                                    productImage(),
                                    productImage(),
                                    productImage(),
                                    container(
                                        width = matchParentSize(),
                                        height = wrapContentSize(),
                                        orientation = overlap,
                                        background = listOf(solidBackground(color("#9775fa"))),
                                        contentAlignmentHorizontal = center,
                                        contentAlignmentVertical = center,
                                        alignmentHorizontal = left,
                                        alignmentVertical = top,
                                        paddings = edgeInsets(
                                            top = 15,
                                            left = 10,
                                            right = 10,
                                            bottom = 15,
                                        ),
                                        visibilityActions = listOf(
                                            visibilityAction(
                                                logId = "state_invisible",
                                                logLimit = 0,
                                                url = Url.create("div-action://set_state?state_id=0" +
                                                        "/${StickyFooter.DIV_ID}" +
                                                        "/${StickyFooter.INVISIBLE_STATE_ID}"
                                                ),
                                                visibilityDuration = 0,
                                                visibilityPercentage = 1,
                                            )
                                        ),
                                        disappearActions = listOf(
                                            disappearAction(
                                                logId = "state_visible",
                                                logLimit = 0,
                                                url = Url.create("div-action://set_state?state_id=0" +
                                                        "/${StickyFooter.DIV_ID}" +
                                                        "/${StickyFooter.VISIBLE_STATE_ID}"
                                                ),
                                                disappearDuration = 0,
                                                visibilityPercentage = 1,
                                            )
                                        ),
                                        items = listOf(
                                            text(
                                                text = ProductScreenConstants.ADD_TO_CART,
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
                                    ),
                                    productImage(),
                                )
                            ),
                            stickyFooterState(
                                view = bottomButton("Add to cart")
                            )
                        ),
                    )
                )
            )
        }

        return ScreenData(
            divan = divan,
        )
    }

    private fun DivScope.productImage() = image(
        aspect = aspect(
            ratio = 1.0,
        ),
        imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/98a2c11e-7e53-4358-a7fb-304615937a51"),
        width = matchParentSize(),
        height = wrapContentSize(),
        alignmentHorizontal = left,
        alignmentVertical = top,
    )
}
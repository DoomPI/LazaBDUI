package ru.pyroman.laza.feature.product.screen.entity

import divkit.dsl.*
import divkit.dsl.scope.DivScope
import ru.pyroman.laza.feature.product.screen.ProductScreenConstants
import ru.pyroman.laza.screen.Screen

class DummyProductScreen : Screen {

    override fun getDivan(): Divan {
        return divan {
            data(
                logId = ProductScreenConstants.PRODUCT_SCREEN_LAYOUT_ID,
                states = singleRoot(
                    div = container(
                        items = listOf(
                            productImage(),
                            container(
                                items = listOf(
                                    image(
                                        imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/9e09faf0-4c4f-44f3-87a4-de4cfcfb9458"),
                                        width = wrapContentSize(),
                                        height = wrapContentSize(),
                                    ),
                                    image(
                                        imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/fe25a9f0-2c76-453b-9f4a-6b6372101866"),
                                        width = wrapContentSize(),
                                        height = wrapContentSize(),
                                    ),
                                ),
                                width = wrapContentSize(),
                                height = wrapContentSize(),
                                orientation = overlap,
                                contentAlignmentHorizontal = center,
                                contentAlignmentVertical = center,
                                alignmentHorizontal = left,
                                alignmentVertical = top,
                            )
                        ),
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
    }

    private fun DivScope.productImage() = image(
        imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/98a2c11e-7e53-4358-a7fb-304615937a51"),
        width = matchParentSize(),
        height = wrapContentSize(),
        alignmentHorizontal = left,
        alignmentVertical = top,
    )
}
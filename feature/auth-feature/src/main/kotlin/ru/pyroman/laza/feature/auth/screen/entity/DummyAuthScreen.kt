package ru.pyroman.laza.feature.auth.screen.entity

import divkit.dsl.*
import divkit.dsl.scope.DivScope
import ru.pyroman.laza.feature.auth.screen.AuthScreenConstants
import ru.pyroman.laza.feature.bottombutton.view.bottomButton
import ru.pyroman.laza.screen.Screen
import ru.pyroman.laza.screen.ScreenData

class DummyAuthScreen : Screen {

    override fun getData(): ScreenData {
        val divan = divan {
            data(
                logId = AuthScreenConstants.AUTH_SCREEN_LAYOUT_ID,
                states = singleRoot(
                    div = container(
                        width = matchParentSize(),
                        height = matchParentSize(),
                        orientation = overlap,
                        contentAlignmentHorizontal = center,
                        contentAlignmentVertical = center,
                        background = listOf(solidBackground(color("#fefefe"))),
                        items = listOf(
                            text(
                                text = AuthScreenConstants.LETS_GET_STARTED,
                                width = wrapContentSize(),
                                height = wrapContentSize(),
                                fontSize = 28,
                                fontWeight = bold,
                                lineHeight = 31,
                                letterSpacing = 0.0,
                                textColor = color("#1d1e20"),
                                textAlignmentHorizontal = center,
                                textAlignmentVertical = center,
                                alignmentHorizontal = center,
                                alignmentVertical = top,
                                margins = edgeInsets(
                                    top = 105,
                                )
                            ),
                            authMethodsContainer(),
                            text(
                                text = "${AuthScreenConstants.ALREADY_HAVE_AN_ACCOUNT} ${AuthScreenConstants.SIGN_IN}",
                                width = wrapContentSize(),
                                height = wrapContentSize(),
                                alignmentVertical = bottom,
                                alignmentHorizontal = center,
                                textAlignmentVertical = center,
                                textAlignmentHorizontal = center,
                                ranges = listOf(
                                    textRange(
                                        start = 0,
                                        end = AuthScreenConstants.ALREADY_HAVE_AN_ACCOUNT.length,
                                        fontSize = 15,
                                        fontWeight = regular,
                                        lineHeight = 17,
                                        letterSpacing = 0.0,
                                        textColor = color("#8f959e"),
                                    ),
                                    textRange(
                                        start = AuthScreenConstants.ALREADY_HAVE_AN_ACCOUNT.length + 1,
                                        end = AuthScreenConstants.ALREADY_HAVE_AN_ACCOUNT.length + 1 + AuthScreenConstants.SIGN_IN.length,
                                        fontSize = 15,
                                        fontWeight = medium,
                                        lineHeight = 17,
                                        letterSpacing = 0.0,
                                        textColor = color("#1d1e20"),
                                    ),
                                ),
                                margins = edgeInsets(
                                    bottom = 100,
                                )
                            ),
                            bottomButton(
                                title = AuthScreenConstants.CREATE_AN_ACCOUNT
                            ),
                        ),
                    )
                )
            )
        }

        return ScreenData(
            divan = divan,
        )
    }
    private fun DivScope.authMethodsContainer(

    ) = container(
        width = matchParentSize(),
        height = wrapContentSize(),
        orientation = vertical,
        alignmentVertical = center,
        alignmentHorizontal = center,
        contentAlignmentVertical = center,
        contentAlignmentHorizontal = center,
        paddings = edgeInsets(
            left = 20,
            right = 20,
        ),
        items = listOf(
            authMethodButton(
                text = "Facebook",
                imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/10c39902-ee48-4fd4-87b1-4e7789c02da9"),
                background = listOf(solidBackground(color("#4267b2")))
            ),
            authMethodButton(
                text = "Twitter",
                imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/263ce95a-e0aa-4c9a-9ecf-8f0bf8228050"),
                background = listOf(solidBackground(color("#1da1f2"))),
            ),
            authMethodButton(
                text = "Google",
                imageUrl = Url.create("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/a1ca257c-5c1e-4eed-9d6b-8e2fb7bfbd40"),
                background = listOf(solidBackground(color("#ea4335")))
            ),
        )
    )

    private fun DivScope.authMethodButton(
        text: String,
        imageUrl: Url,
        background: List<Background>? = null,
    ) = container(
        width = matchParentSize(),
        height = wrapContentSize(),
        orientation = overlap,
        background = background,
        border = border(
            cornersRadius = cornersRadius(
                topLeft = 10,
                topRight = 10,
                bottomLeft = 10,
                bottomRight = 10,
            )
        ),
        contentAlignmentVertical = center,
        contentAlignmentHorizontal = center,
        alignmentVertical = center,
        alignmentHorizontal = center,
        margins = edgeInsets(
            top = 4,
            bottom = 4,
        ),
        items = listOf(
            container(
                width = wrapContentSize(),
                height = wrapContentSize(),
                orientation = horizontal,
                margins = edgeInsets(
                    top = 14,
                    bottom = 14,
                ),
                items = listOf(
                    container(
                        width = fixedSize(22),
                        height = fixedSize(22),
                        orientation = overlap,
                        alignmentVertical = center,
                        alignmentHorizontal = center,
                        contentAlignmentVertical = center,
                        contentAlignmentHorizontal = center,
                        items = listOf(
                            image(
                                width = wrapContentSize(),
                                height = wrapContentSize(),
                                imageUrl = imageUrl,
                                alignmentHorizontal = center,
                                alignmentVertical = center,
                            ),
                        ),
                    ),
                    text(
                        width = wrapContentSize(),
                        height = wrapContentSize(),
                        text = text,
                        alignmentVertical = center,
                        alignmentHorizontal = center,
                        fontSize = 17,
                        fontWeight = bold,
                        lineHeight = 22,
                        letterSpacing = 0.0,
                        textColor = color("#ffffff"),
                        textAlignmentVertical = center,
                        textAlignmentHorizontal = center,
                        margins = edgeInsets(
                            left = 4,
                        )
                    )
                ),
            )
        )
    )
}
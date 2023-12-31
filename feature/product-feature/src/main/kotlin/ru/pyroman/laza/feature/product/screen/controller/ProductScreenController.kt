package ru.pyroman.laza.feature.product.screen.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.pyroman.laza.feature.product.screen.service.ProductScreenService
import ru.pyroman.laza.screen.ScreenData

@RestController
class ProductScreenController(
    private val service: ProductScreenService,
) {

    @GetMapping("/product")
    fun getScreenData(): ScreenData {
        return service.getScreen().getData()
    }
}
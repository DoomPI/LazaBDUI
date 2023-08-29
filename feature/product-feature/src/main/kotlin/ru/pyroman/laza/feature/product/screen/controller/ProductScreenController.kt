package ru.pyroman.laza.feature.product.screen.controller

import divkit.dsl.Divan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.pyroman.laza.feature.product.screen.service.ProductScreenService

@RestController
class ProductScreenController(
    private val service: ProductScreenService,
) {

    @GetMapping("/product")
    fun getScreen(): Divan {
        return service.getScreen().getDivan()
    }
}
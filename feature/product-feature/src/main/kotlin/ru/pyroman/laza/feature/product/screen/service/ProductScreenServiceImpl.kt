package ru.pyroman.laza.feature.product.screen.service

import ru.pyroman.laza.feature.product.screen.repository.ProductScreenRepository
import ru.pyroman.laza.screen.Screen

class ProductScreenServiceImpl(
    private val repository: ProductScreenRepository,
) : ProductScreenService {

    override fun getScreen(): Screen {
        return repository.getScreen()
    }
}
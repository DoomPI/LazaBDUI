package ru.pyroman.laza.feature.product.screen.repository

import ru.pyroman.laza.feature.product.screen.entity.DummyProductScreen
import ru.pyroman.laza.screen.Screen

class DummyProductScreenRepositoryImpl : ProductScreenRepository {

    override fun getScreen(): Screen {
        return DummyProductScreen()
    }
}
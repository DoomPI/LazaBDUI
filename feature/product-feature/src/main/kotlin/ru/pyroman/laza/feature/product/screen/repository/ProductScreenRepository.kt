package ru.pyroman.laza.feature.product.screen.repository

import ru.pyroman.laza.screen.Screen

interface ProductScreenRepository {

    fun getScreen(): Screen
}
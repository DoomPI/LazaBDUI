package ru.pyroman.laza.feature.product.screen.service

import org.springframework.stereotype.Service
import ru.pyroman.laza.screen.Screen

@Service
interface ProductScreenService {

    fun getScreen(): Screen
}
package ru.pyroman.laza.feature.auth.screen.repository

import ru.pyroman.laza.screen.Screen

interface AuthScreenRepository {

    fun getScreen(): Screen
}
package ru.pyroman.laza.feature.auth.screen.repository

import ru.pyroman.laza.feature.auth.screen.entity.DummyAuthScreen
import ru.pyroman.laza.screen.Screen

class DummyAuthScreenRepositoryImpl : AuthScreenRepository {

    override fun getScreen(): Screen {
        return DummyAuthScreen()
    }
}
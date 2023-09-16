package ru.pyroman.laza.feature.auth.screen.service

import ru.pyroman.laza.feature.auth.screen.repository.AuthScreenRepository
import ru.pyroman.laza.screen.Screen

class AuthScreenServiceImpl(
    private val repository: AuthScreenRepository,
) : AuthScreenService {

    override fun getScreen(): Screen {
        return repository.getScreen()
    }
}
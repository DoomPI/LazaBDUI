package ru.pyroman.laza.feature.auth.screen.service

import org.springframework.stereotype.Service
import ru.pyroman.laza.screen.Screen

@Service
interface AuthScreenService {

    fun getScreen(): Screen
}
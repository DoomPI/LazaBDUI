package ru.pyroman.laza.feature.auth.screen.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.pyroman.laza.feature.auth.screen.service.AuthScreenService
import ru.pyroman.laza.screen.ScreenData

@RestController
class AuthScreenController(
    private val service: AuthScreenService,
) {

    @GetMapping("/auth")
    fun getScreenData(): ScreenData {
        return service.getScreen().getData()
    }
}
package ru.pyroman.laza.feature.auth.di

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.pyroman.laza.feature.auth.screen.controller.AuthScreenController
import ru.pyroman.laza.feature.auth.screen.repository.AuthScreenRepository
import ru.pyroman.laza.feature.auth.screen.repository.DummyAuthScreenRepositoryImpl
import ru.pyroman.laza.feature.auth.screen.service.AuthScreenService
import ru.pyroman.laza.feature.auth.screen.service.AuthScreenServiceImpl

@Configuration
class AuthConfig {

    @Bean("dummyAuthScreenRepositoryImpl")
    fun provideAuthScreenRepository(): AuthScreenRepository {
        return DummyAuthScreenRepositoryImpl()
    }

    @Bean("authScreenService")
    fun provideAuthScreenService(): AuthScreenService {
        return AuthScreenServiceImpl(
            repository = provideAuthScreenRepository(),
        )
    }

    @Bean("authScreenController")
    fun provideAuthScreenController(): AuthScreenController {
        return AuthScreenController(
            service = provideAuthScreenService(),
        )
    }
}
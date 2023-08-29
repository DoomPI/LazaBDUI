package ru.pyroman.laza.feature.product.di

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.pyroman.laza.feature.product.screen.controller.ProductScreenController
import ru.pyroman.laza.feature.product.screen.repository.DummyProductScreenRepositoryImpl
import ru.pyroman.laza.feature.product.screen.repository.ProductScreenRepository
import ru.pyroman.laza.feature.product.screen.service.ProductScreenServiceImpl
import ru.pyroman.laza.feature.product.screen.service.ProductScreenService

@Configuration
class ProductConfig {

    @Bean("dummyProductScreenRepositoryImpl")
    fun provideProductScreenRepository(): ProductScreenRepository {
        return DummyProductScreenRepositoryImpl()
    }

    @Bean("productScreenService")
    fun provideProductScreenService(): ProductScreenService {
        return ProductScreenServiceImpl(
            repository = provideProductScreenRepository(),
        )
    }

    @Bean("productScreenController")
    fun provideProductScreenController(): ProductScreenController {
        return ProductScreenController(
            service = provideProductScreenService(),
        )
    }
}
package io.github.kevinah95.kmpkoin.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

fun initKoin(config: KoinApplication.() -> Unit = {}) {
    startKoin {
        config()
        modules(dataModule)
    }
}
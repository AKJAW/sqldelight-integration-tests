package com.akjaw.sqldelight.testing.android

import android.app.Application
import android.content.Context
import com.akjaw.sqldelight.testing.initKoin
import org.koin.dsl.module

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            module {
                single<Context> { this@MainApp }
            }
        )
    }
}

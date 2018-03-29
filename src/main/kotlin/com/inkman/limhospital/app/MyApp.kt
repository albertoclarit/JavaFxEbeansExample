package com.inkman.limhospital.app

import com.inkman.limhospital.view.MainView
import io.ebean.EbeanServerFactory
import io.ebean.config.ServerConfig
import tornadofx.App

class MyApp: App(MainView::class, Styles::class)
{


    init {

        val config =  ServerConfig()

        config.loadFromProperties()
        val server = EbeanServerFactory.create(config)

    }
}
package com.inkman.limhospital.view

import com.inkman.limhospital.app.Styles
import com.inkman.limhospital.controllers.MainController
import com.inkman.limhospital.models.PatientInfoModel
import com.inkman.limhospital.models.RealViewModel
import io.ebean.Ebean
import tornadofx.*

class MainView : View("Hello TornadoFX") {


    val mainController: MainController by inject()
    val viewModel: RealViewModel by inject()


    init {

        primaryStage.minHeight = 600.0
        primaryStage.minWidth = 800.0
       // primaryStage.isMaximized = true


        mainController.load()

    }

    override val root = borderpane {
        top{
            textfield {
                promptText = "Enter search criteria"
            }
        }
        center {

            tableview(viewModel.records) {
                column("ID",PatientInfoModel::id )
                column("FIRSTNAME",PatientInfoModel::firstName)
                column("LASTNAME",PatientInfoModel::lastName)

                selectionModel.selectedItemProperty().onChange {


                }
            }
        }

        bottom {
            pagination {

            }
        }
    }
}
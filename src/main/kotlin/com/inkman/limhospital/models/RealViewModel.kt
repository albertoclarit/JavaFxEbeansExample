package com.inkman.limhospital.models

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.*

class PatientInfoModel(
        id:Long,
        firstName:String,
        lastName:String
){

    var id by property(id)
    fun idProperty() = getProperty(PatientInfoModel::id)


    var firstName by property(firstName)
    fun firstNameProperty() = getProperty(PatientInfoModel:: firstName)

    var lastName by property(lastName)
    fun lastNameProperty() = getProperty(PatientInfoModel:: lastName)


}


class MainViewModel(){

    private var recordsBacking : ObservableList<PatientInfoModel> = FXCollections.observableArrayList()
    private var _selectedRecord: PatientInfoModel?=null

    var records by property(recordsBacking)
    fun recordsProperty() = getProperty(MainViewModel::recordsBacking)


    var selectedRecord by property(_selectedRecord)
    fun selectedRecordProperty() = getProperty(MainViewModel::_selectedRecord)


}

class RealViewModel : ItemViewModel<MainViewModel>() {

    val records = bind { item?.recordsProperty()}


}
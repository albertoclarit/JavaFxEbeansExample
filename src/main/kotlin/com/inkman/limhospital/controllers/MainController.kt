package com.inkman.limhospital.controllers

import com.inkman.limhospital.domain.query.QPatientInfo
import com.inkman.limhospital.models.PatientInfoModel
import com.inkman.limhospital.models.RealViewModel
import tornadofx.*

class MainController : Controller(){

    val viewModel: RealViewModel by inject()

    fun load(){

        val patients= QPatientInfo().orderBy().lastName.asc().findList()

        viewModel.records.value.clear()

        patients?.forEach {

            val info = PatientInfoModel(it.id?:0,it.firstName?:"",it.lastName?:"")
            viewModel.records.value.add(info)
        }



    }

}
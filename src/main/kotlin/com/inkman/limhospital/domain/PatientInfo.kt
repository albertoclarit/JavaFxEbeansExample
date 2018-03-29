package com.inkman.limhospital.domain

import io.ebean.Model
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id



@Entity
@Table(name="patient_info_table")
class PatientInfo : Model() {
    @Id
    @Column(name = "patientno")
    var id: Long? = null

    @Column(name = "lastname")
    var lastName: String? = null

    @Column(name = "firstname")
    var firstName: String? = null


}
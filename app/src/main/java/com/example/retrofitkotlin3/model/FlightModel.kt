package com.example.retrofitkotlin3.model

data class FlightModel (
    val pgtID: Long,
    val dmlsts: String?=null,
    val newparkpos: String? = null,
    val preparkpos: String? = null,
    val rkgelcag: String,
    val rkarv: String,
    val rkarviata: String,
    val rkgelpltar: String,
    val rkgelplsaat: String,
    val rktescil: String,
    val rkgidcag: String? = null,
    val rkdprt: String? = null,
    val rkdprtiata: String? = null,
    val rkgidpltar: String,
    val rkgidplsaat: String,
    val send: Long,
    val delFly: Long
)
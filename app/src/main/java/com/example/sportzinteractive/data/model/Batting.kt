package com.example.sportzinteractive.data.model

import com.google.gson.annotations.SerializedName

data class Batting(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String
)
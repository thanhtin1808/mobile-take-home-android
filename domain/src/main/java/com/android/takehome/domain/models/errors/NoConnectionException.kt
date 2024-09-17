package com.android.takehome.domain.models.errors

data class NoConnectionException(
    override val message: String = "No connection",
) : Exception()
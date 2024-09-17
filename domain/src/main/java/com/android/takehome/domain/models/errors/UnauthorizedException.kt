package com.android.takehome.domain.models.errors

data class UnauthorizedException(
    override val message: String = "Unauthorized",
) : RuntimeException()
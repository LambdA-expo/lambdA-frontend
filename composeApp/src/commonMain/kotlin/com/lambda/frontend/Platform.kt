package com.lambda.frontend

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
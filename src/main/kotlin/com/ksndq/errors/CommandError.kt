package com.ksndq.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)
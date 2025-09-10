package com.siorpin.homie.domain.errorHandling

typealias RootError = Error

sealed interface Result<out T, out E: RootError> {
    data class Success<T, E: RootError>(val data: T): Result<T, E>
    data class Error<T, E: RootError>(val error: E): Result<T, E>
}
package com.awesomeapp.weatheridentity

sealed class State186_7 {
    data object Loading : State186_7()
    data class Success(val data: String) : State186_7()
    data class Error(val message: String) : State186_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
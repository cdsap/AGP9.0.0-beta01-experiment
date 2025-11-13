package com.awesomeapp.notificationidentity

sealed class State166_7 {
    data object Loading : State166_7()
    data class Success(val data: String) : State166_7()
    data class Error(val message: String) : State166_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
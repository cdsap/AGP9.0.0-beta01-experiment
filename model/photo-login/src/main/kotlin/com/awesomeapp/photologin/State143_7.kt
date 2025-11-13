package com.awesomeapp.photologin

sealed class State143_7 {
    data object Loading : State143_7()
    data class Success(val data: String) : State143_7()
    data class Error(val message: String) : State143_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
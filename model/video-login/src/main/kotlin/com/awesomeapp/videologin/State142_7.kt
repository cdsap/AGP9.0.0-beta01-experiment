package com.awesomeapp.videologin

sealed class State142_7 {
    data object Loading : State142_7()
    data class Success(val data: String) : State142_7()
    data class Error(val message: String) : State142_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
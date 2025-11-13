package com.awesomeapp.file

sealed class State33_7 {
    data object Loading : State33_7()
    data class Success(val data: String) : State33_7()
    data class Error(val message: String) : State33_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
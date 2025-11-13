package com.awesomeapp.postcheckout

sealed class State207_7 {
    data object Loading : State207_7()
    data class Success(val data: String) : State207_7()
    data class Error(val message: String) : State207_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
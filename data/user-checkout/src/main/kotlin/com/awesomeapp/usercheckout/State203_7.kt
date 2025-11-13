package com.awesomeapp.usercheckout

sealed class State203_7 {
    data object Loading : State203_7()
    data class Success(val data: String) : State203_7()
    data class Error(val message: String) : State203_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
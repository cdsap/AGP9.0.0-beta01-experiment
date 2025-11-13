package com.awesomeapp.messagecheckout

sealed class State214_7 {
    data object Loading : State214_7()
    data class Success(val data: String) : State214_7()
    data class Error(val message: String) : State214_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
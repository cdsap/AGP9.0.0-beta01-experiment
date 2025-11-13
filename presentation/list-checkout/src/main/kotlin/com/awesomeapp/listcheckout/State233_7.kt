package com.awesomeapp.listcheckout

sealed class State233_7 {
    data object Loading : State233_7()
    data class Success(val data: String) : State233_7()
    data class Error(val message: String) : State233_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
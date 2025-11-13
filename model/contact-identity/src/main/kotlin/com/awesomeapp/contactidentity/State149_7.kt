package com.awesomeapp.contactidentity

sealed class State149_7 {
    data object Loading : State149_7()
    data class Success(val data: String) : State149_7()
    data class Error(val message: String) : State149_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
package com.awesomeapp.podcastcheckout

sealed class State239_7 {
    data object Loading : State239_7()
    data class Success(val data: String) : State239_7()
    data class Error(val message: String) : State239_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
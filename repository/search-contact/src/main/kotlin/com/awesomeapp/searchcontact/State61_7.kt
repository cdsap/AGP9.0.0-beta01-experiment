package com.awesomeapp.searchcontact

sealed class State61_7 {
    data object Loading : State61_7()
    data class Success(val data: String) : State61_7()
    data class Error(val message: String) : State61_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
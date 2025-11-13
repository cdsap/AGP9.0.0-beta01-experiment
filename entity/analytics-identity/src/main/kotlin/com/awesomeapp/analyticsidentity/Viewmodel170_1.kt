package com.awesomeapp.analyticsidentity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.statuslogin.Repository124_5


@HiltViewModel
class Viewmodel170_1 @Inject constructor(
    private val repository0: Repository100_5,
    private val repository1: Repository116_5,
    private val repository2: Repository96_5,
    private val repository3: Repository136_5,
    private val repository4: Repository132_5,
    private val repository5: Repository104_5,
    private val repository6: Repository120_5,
    private val repository7: Repository148_5,
    private val repository8: Repository156_5,
    private val repository9: Repository140_5,
    private val repository10: Repository108_5,
    private val repository11: Repository124_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
                    val fetchers = listOf<suspend () -> String>(
                        { repository0.getData() },
                            { repository1.getData() },
                            { repository2.getData() },
                            { repository3.getData() },
                            { repository4.getData() },
                            { repository5.getData() },
                            { repository6.getData() },
                            { repository7.getData() },
                            { repository8.getData() },
                            { repository9.getData() },
                            { repository10.getData() },
                            { repository11.getData() }
                    )
                    val results = fetchers.map { fetcher ->
                        async { fetcher() }
                    }.awaitAll()
                    results.joinToString("")
                }
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: ${e.message}")
            }
        }
    }
}
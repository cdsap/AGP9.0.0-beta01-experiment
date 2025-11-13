package com.awesomeapp.searchcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.newsidentity.Api188_6


@Singleton
class Repository208_5 @Inject constructor(
    private val api0: Api192_6,
    private val api1: Api164_6,
    private val api2: Api160_6,
    private val api3: Api180_6,
    private val api4: Api188_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}
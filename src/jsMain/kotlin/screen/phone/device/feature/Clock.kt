package screen.phone.device.feature

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.js.Date

suspend fun Clock(): Flow<String> = flow {
    while (true) {
        val data = Date()
        val hour = data.getHours()
        val minute = data.getMinutes()

        emit("$hour:$minute")
        delay(1000)
    }
}
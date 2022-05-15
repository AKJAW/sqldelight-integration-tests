package com.akjaw.sqldelight.testing

import com.akjaw.sqldelight.testing.data.time.TimestampProvider

class MockTimestampProvider : TimestampProvider {
    var timestamp: Long = 0

    override fun getTimestampSeconds(): Long = timestamp
}
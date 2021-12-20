package com.example.task5_bookfilter_onboardsql

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Authors")
data class Author(
    @PrimaryKey(autoGenerate = true)
    val author_id:Int,
    val author:String,
    val country:String
)

package com.kelvin5360.budget

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity
class Spending(@PrimaryKey val id: Int, val date: LocalDate, val type: String, val value: Int)
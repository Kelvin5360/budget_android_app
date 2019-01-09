package com.kelvin5360.budget

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface SpendingDao {

    @Query("SELECT * from spending ORDER BY id ASC")
    fun getAllSpendings(): List<Spending>

    @Insert
    fun insert(spending: Spending)

    @Query("DELETE FROM spending")
    fun deleteAll()

}

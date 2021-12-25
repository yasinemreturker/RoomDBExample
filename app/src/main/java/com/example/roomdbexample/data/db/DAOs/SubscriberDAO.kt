package com.example.roomdbexample.data.db.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomdbexample.data.models.database.Subscriber

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber): Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber): Int

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll(): Int

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers(): LiveData<List<Subscriber>>

    //If we used Flow instead of LiveData, the following would be below.
    //@Query("SELECT * FROM subscriber_data_table")
    //fun getAllSubscribers(): Flow<List<Subscriber>>
}
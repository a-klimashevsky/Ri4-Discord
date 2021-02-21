package tv.z85.app.controllers

import kotlinx.coroutines.flow.Flow

interface Controller<T> {
    fun viewModel(): Flow<T>
}
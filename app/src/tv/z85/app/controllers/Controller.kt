package tv.z85.app.controllers

import kotlinx.coroutines.flow.Flow
import java.util.*;

interface Controller<T> {
    fun viewModel(): Flow<T>
}
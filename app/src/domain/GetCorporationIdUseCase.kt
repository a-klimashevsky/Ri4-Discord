package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface GetCorporationIdUseCase {
    fun invoke(): Flow<Int>
}
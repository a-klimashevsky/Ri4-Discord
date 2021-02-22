package tv.z85.usecases

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import tv.z85.Log
import tv.z85.domain.CorporationStructuresRepository

interface GetLocationNameUseCase {
    fun invoke(id: Long): Flow<String>
}

class GetLocationNameUseCaseImpl(
    private val repo: CorporationStructuresRepository
) : GetLocationNameUseCase {
    override fun invoke(id: Long): Flow<String> =
        repo.getById(id).map { it.name }.onEach {
            Log.debug("R4: location name is $it")
        }

}
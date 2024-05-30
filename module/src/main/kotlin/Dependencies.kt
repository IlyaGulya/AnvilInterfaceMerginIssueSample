import com.squareup.anvil.annotations.ContributesTo
import javax.inject.Inject

@ContributesTo(Any::class)
interface Dependencies {
    fun someClass(): SomeClass

    companion object {
        lateinit var instance: Dependencies
    }
}

class SomeClass @Inject constructor()
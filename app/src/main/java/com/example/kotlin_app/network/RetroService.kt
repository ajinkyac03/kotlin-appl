
import com.example.kotlin_app.models.EventsList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("character")
    suspend fun getDataFromAPI(@Query("page") query: Int) : RickAndMortyList

    @GET("/")
    suspend fun getEventsDataFromAPI() : EventsList
}
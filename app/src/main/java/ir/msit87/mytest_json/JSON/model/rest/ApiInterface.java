package ir.msit87.mytest_json.JSON.model.rest;


import ir.msit87.mytest_json.JSON.model.MovieResponse;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface ApiInterface {

    String BASE_URL = "http://msit87.ir/";
    String API_KEY = "189f7d233259f1e7e590c47e3c61a8430";

    @GET("movie/top_rated.php")
    Observable<MovieResponse> getTopRatedMovies(@Query("api_key") String api_key);
}

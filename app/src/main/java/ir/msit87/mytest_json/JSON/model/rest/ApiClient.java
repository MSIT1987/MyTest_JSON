package ir.msit87.mytest_json.JSON.model.rest;

import ir.msit87.mytest_json.JSON.model.MovieResponse;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;

public class ApiClient {

    private static ApiClient instance;
    private ApiInterface apiInterface;

    public ApiClient() {
        Retrofit retrofit =
                new Retrofit.Builder()
                        .baseUrl(ApiInterface.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();

        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static ApiClient getInstance() {
        if (instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }

    public Observable<MovieResponse> getMovie(){
        Observable<MovieResponse> responseObservable = apiInterface.getTopRatedMovies(ApiInterface.API_KEY);
        return responseObservable;
    }
}

//private static final String BASE_URL = "http://api.themoviedb.org/3/";
//    private static final String BASE_URL = "http://msit87.ir/";
//    private static Retrofit retrofit = null;

//    public static Retrofit getRetrofit() {
//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }

//        OkHttpClient httpClient = new OkHttpClient.Builder()
//                .connectTimeout(30, TimeUnit.SECONDS)
//                .readTimeout(30, TimeUnit.SECONDS)
//                .build();
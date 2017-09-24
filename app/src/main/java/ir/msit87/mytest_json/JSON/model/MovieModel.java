package ir.msit87.mytest_json.JSON.model;

import java.util.List;

public interface MovieModel {
    //void getDataFromServer(GetMovieResponseCallback callback);

    public interface GetMovieResponseCallback {
        void onSuccess(List<Movie> movies);

        void onFailure(String message);

        void onNetworkFailure();

    }
}

//    private static final String API_KEY = "189f7d233259f1e7e590c47e3c61a840";
//    private Activity activity;
//
//    ///////////////
//    private MovieListener movieListener;
//    private MoviePresenter moviePresenter;
//    //private List<Movie> movies;
//
//
//    public MovieModel(MovieListener movieListener) {
//        //moviePresenter = new MoviePresenter();
//        this.movieListener = movieListener;
//        FetchData();
//    }
//
//    private void FetchData() {
//        ApiInterface apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
//
//        Call<MovieResponse> call = apiInterface.getTopRatedMovies(API_KEY);
//
//        call.enqueue(new Callback<MovieResponse>() {
//            @Override
//            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
//                Log.d("MainActivity", "Status Code = " + response.code());
//                if (response.isSuccessful()) {
//                    //int statusCode = response.code();
//                    //Log.d("Response", "Number of movies received: " + movies.size());
//                    List<Movie> movies = response.body().getResults();
//                    if (movieListener != null)
//                        movieListener.setMovie(movies); // <---- fire listener here
//                } else {
//                    Log.d("Cancel", "Is not successful: " + response.body().toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<MovieResponse> call, Throwable t) {
//                Log.e("Failure", t.toString());
//            }
//        });
//    }
//
////    /////////////////
//    public void setMovieListener(MovieListener movieListener) {
//        this.movieListener = movieListener;
//    }
//
//
//    public void setMovies(List<Movie> movies) {
//        //this.movies = movies;
//        movieListener.setMovie(movies);
//    }
//
//    public List<Movie> getMovies() {
//        return movieListener.getMovie();
//    }
//
//
//    public interface MovieListener {
//        void setMovie(List<Movie> movies);
//
//        List<Movie> getMovie();
//    }
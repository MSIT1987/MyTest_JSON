package ir.msit87.mytest_json.JSON.presenter;

import android.app.ProgressDialog;
import android.content.Context;

import java.util.List;

import ir.msit87.mytest_json.JSON.App;
import ir.msit87.mytest_json.JSON.model.Movie;
import ir.msit87.mytest_json.JSON.model.MovieModel;
import ir.msit87.mytest_json.JSON.model.MovieModelImpl;
import ir.msit87.mytest_json.JSON.model.MovieResponse;
import ir.msit87.mytest_json.JSON.model.rest.ApiClient;
import ir.msit87.mytest_json.JSON.view.MovieView;
import ir.msit87.mytest_json.JSON.view.activity.MainActivity;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * MoviePresenterImpl Class Created by MSIT on 9/24/2017.
 */

public class MoviePresenterImpl implements MoviePresenter {

    private MovieModelImpl movieModel;
    private MovieView movieView;

    public MoviePresenterImpl(MovieModelImpl movieModel) {
        this.movieModel = movieModel;
    }

    @Override
    public void getData() {
        movieModel.getDataFromServer(new MovieModel.GetMovieResponseCallback() {
            @Override
            public void onSuccess(List<Movie> movies) {
                movieView.onMovieObtain(movies);
            }

            @Override
            public void onFailure(String message) {
                movieView.errorProgress(message);
            }

            @Override
            public void onNetworkFailure() {

            }
        });
    }

    @Override
    public void setView(MovieView movieView) {
        this.movieView = movieView;
        movieView.setProgress(new ProgressDialog(MainActivity.context));
    }

    @Override
    public MovieView getMainView() {
        return movieView == null ? null : movieView;
    }

}

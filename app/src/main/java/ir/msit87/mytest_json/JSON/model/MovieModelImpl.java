package ir.msit87.mytest_json.JSON.model;

import java.util.List;

import ir.msit87.mytest_json.JSON.model.rest.ApiClient;
import ir.msit87.mytest_json.JSON.presenter.MoviePresenter;
import ir.msit87.mytest_json.JSON.presenter.MoviePresenterImpl;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * MovieModelImpl Class Created by MSIT on 9/24/2017.
 */

public class MovieModelImpl implements MovieModel {

    public MovieModelImpl() {
    }

    public void getDataFromServer(final GetMovieResponseCallback callback) {

        ApiClient
                .getInstance()
                .getMovie()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MovieResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onFailure(e.getMessage());
                        //moviePresenter.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(MovieResponse response) {
                        //moviePresenter.setMovie(response);
                        List<Movie> movies = response.getResults();
                        callback.onSuccess(movies);
                    }
                });
    }

}

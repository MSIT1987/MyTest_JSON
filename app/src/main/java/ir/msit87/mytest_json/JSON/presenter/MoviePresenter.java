package ir.msit87.mytest_json.JSON.presenter;

import android.app.ProgressDialog;

import ir.msit87.mytest_json.JSON.model.MovieResponse;
import ir.msit87.mytest_json.JSON.view.MovieView;

public interface MoviePresenter {

    void setView(MovieView movieView);

    //void showError(String message);

    void getData();

    //void setMovie(MovieResponse response);

    MovieView getMainView();

}

//    private MovieView view;
//    private MovieModel model;
//    //private List<Movie> movies;
//
//    public MoviePresenter() {
//        //this.view = view;
//        //init();
//    }
//
//    public void onCreate() {
//        view.setPresenter(this);
//    }
//
//    ///////////
//    @Override
//    public void setMovie(List<Movie> movies) {
//        this.model.setMovies(movies);
//    }
//
//    @Override
//    public List<Movie> getMovie() {
//        return this.model.getMovies();
//    }
//
//    public void init(){
//        this.model = MovieModel.getInstance();
//    }
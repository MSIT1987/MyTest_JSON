package ir.msit87.mytest_json.JSON.view;

import android.app.ProgressDialog;

import java.util.List;

import ir.msit87.mytest_json.JSON.model.Movie;
import ir.msit87.mytest_json.JSON.model.MovieResponse;

public interface MovieView {

    void setProgress(ProgressDialog progress);

    void showProgress();

    void hideProgress();

    void errorProgress(String error);

    void onMovieObtain(List<Movie> response);
}

//public class MovieView extends FrameLayout implements View.OnClickListener{

//    private MoviePresenter presenter;
//
//    public MovieView(Activity activity) {
//        super(activity);
//        View view = inflate(getContext(), R.layout.activity_main, this);
////        ViewGroup mainFrame = (ViewGroup) view.findViewById(R.id.mainFrame);
////
////        FragmentManager fragmentManager = ((FragmentActivity)activity).getSupportFragmentManager();
////        MovieListFragment movieListFragment = (MovieListFragment) fragmentManager.findFragmentByTag("movie_fragment");
////        if(movieListFragment == null){
////            movieListFragment = new MovieListFragment();
////            fragmentManager
////                    .beginTransaction()
////                    .add(R.id.mainFrame, movieListFragment, "movie_fragment")
////                    .commitAllowingStateLoss();
////        }
//
//    }
//
//
//    public void setPresenter(MoviePresenter presenter){
//        this.presenter = presenter;
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }
//}

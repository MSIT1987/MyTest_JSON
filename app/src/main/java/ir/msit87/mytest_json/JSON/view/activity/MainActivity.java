package ir.msit87.mytest_json.JSON.view.activity;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.msit87.mytest_json.JSON.model.MovieModelImpl;
import ir.msit87.mytest_json.JSON.presenter.MoviePresenter;
import ir.msit87.mytest_json.JSON.presenter.MoviePresenterImpl;
import ir.msit87.mytest_json.JSON.view.MovieView;
import ir.msit87.mytest_json.JSON.view.MovieViewImpl;
import ir.msit87.mytest_json.R;

public class MainActivity extends AppCompatActivity {

    MovieView view;
    MoviePresenter presenter;

    //ProgressDialog progressDialog;

    public static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        presenter = new MoviePresenterImpl(new MovieModelImpl());
        view = new MovieViewImpl(presenter);
        InitiateView();
    }

    private void InitiateView() {
        //???
        setContentView(R.layout.activity_main);
        //???
        getFragmentManager().beginTransaction().add(R.id.mainFrame, (Fragment) view).commit();
    }
}


//        FragmentManager fragmentManager = getSupportFragmentManager();
//        MovieListFragment movieListFragment = (MovieListFragment) fragmentManager.findFragmentByTag("movie_fragment");
//        if(movieListFragment == null){
//            movieListFragment = new MovieListFragment();
//            fragmentManager
//                    .beginTransaction()
//                    .add(R.id.mainFrame, movieListFragment, "movie_fragment")
//                    .commitAllowingStateLoss();
//        }
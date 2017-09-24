package ir.msit87.mytest_json.JSON.view;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ir.msit87.mytest_json.JSON.model.Movie;
import ir.msit87.mytest_json.JSON.model.MovieResponse;
import ir.msit87.mytest_json.JSON.presenter.MoviePresenter;
import ir.msit87.mytest_json.JSON.view.activity.MainActivity;
import ir.msit87.mytest_json.JSON.view.adapter.MovieListAdapter;
import ir.msit87.mytest_json.R;

/**
 * MovieViewImpl Interface Created by Mohammad Soltanmohammadi on 9/24/2017.
 */

@SuppressLint("ValidFragment")
public class MovieViewImpl extends Fragment implements MovieView {

    private ProgressDialog progressDialog;
    private MoviePresenter presenter;
    private View rootView;

    private MovieListAdapter adapter;

    public MovieViewImpl(MoviePresenter presenter) {
        this.presenter = presenter;
        //Set View For Presenter
        presenter.setView(this);
        //progressDialog = new ProgressDialog(getContext());
        //progressDialog.setMessage("منتظر بمانید");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.from(getActivity()).inflate(R.layout.movie_fragment_list, container, false);

        presenter.getData();

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.movie_Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.context));
        adapter = new MovieListAdapter(MainActivity.context);
        recyclerView.setAdapter(adapter);

        showProgress();
        return rootView;
    }

    @Override
    public void setProgress(ProgressDialog progressDialog) {
        this.progressDialog = progressDialog;
        progressDialog.setMessage("منتظر بمانید");
    }

    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.hide();
    }

    @Override
    public void errorProgress(String error) {
        hideProgress();
        Snackbar.make(rootView, error, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void onMovieObtain(List<Movie> movies) {
        hideProgress();
        adapter.updateData(movies);
    }
}


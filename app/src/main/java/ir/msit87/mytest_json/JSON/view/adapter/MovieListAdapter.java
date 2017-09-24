package ir.msit87.mytest_json.JSON.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ir.msit87.mytest_json.JSON.model.Movie;
import ir.msit87.mytest_json.R;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.viewHolder> {

    private Context mContext;
    private List<Movie> movieList;
    //private OnMovieListAdapterClickListener onMovieListAdapterClickListener;


    public MovieListAdapter(Context context) {
        this.mContext = context;
        movieList = new ArrayList<>();
        //this.movieList = movies;
        //this.onMovieListAdapterClickListener = onMovieListAdapterClickListener;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_fragment_list_item, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, final int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.subtitle.setText(movie.getRelease_date());
        holder.description.setText(movie.getOverview());
        holder.rating.setText(movie.getVote_count().toString());
//        holder.view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onMovieListAdapterClickListener.onMovieListAdapterClick(movieList.get(position));
//            }
//        });

    }

    public void updateData(List<Movie> movies) {
        movieList.clear();
        movieList.addAll(movies);
        notifyDataSetChanged();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        //@Bind(R.id.movies_layout)
        //View mView;
        //@Bind(R.id.title)
        TextView title;
        //@Bind(R.id.subtitle)
        TextView subtitle;
        //@Bind(R.id.description)
        TextView description;
        //@Bind(R.id.rating)
        TextView rating;

        public viewHolder(View view) {
            super(view);
            //ButterKnife.bind(itemView);
            title = (TextView) view.findViewById(R.id.title);
            subtitle = (TextView) view.findViewById(R.id.subtitle);
            description = (TextView) view.findViewById(R.id.description);
            rating = (TextView) view.findViewById(R.id.rating);
        }
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


    public interface OnMovieListAdapterClickListener {
        void onMovieListAdapterClick(Movie movie);
    }

}

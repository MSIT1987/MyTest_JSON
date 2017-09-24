package ir.msit87.mytest_json.JSON.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSIT on 8/28/2017.
 */

public class Movie {
    /**
     * An annotation that indicates this member should be serialized to JSON
     * with the provided name value as its field name.
     */
    @SerializedName("vote_count")
    private Integer vote_count;

    @SerializedName("id")
    private Integer id;

    @SerializedName("original_title")
    private String original_title;

    @SerializedName("video")
    private Boolean video;

    @SerializedName("vote_average")
    private Double vote_average;

    @SerializedName("title")
    private String title;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("poster_path")
    private String poster_path;

    @SerializedName("original_language")
    private String original_language;

    @SerializedName("genre_ids")
    private List<Integer> genre_ids = new ArrayList<>();

    @SerializedName("backdrop_path")
    private String backdrop_path;

    @SerializedName("adult")
    private boolean adult;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String release_date;

    public Movie(Integer vote_count, Integer id, String original_title, Boolean video, Double vote_average, String title,
                 Double popularity, String poster_path, String original_language, List<Integer> genre_ids, String backdrop_path,
                 boolean adult, String overview, String release_date) {
        this.vote_count = vote_count;
        this.id = id;
        this.original_title = original_title;
        this.video = video;
        this.vote_average = vote_average;
        this.title = title;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.original_language = original_language;
        this.genre_ids = genre_ids;
        this.backdrop_path = backdrop_path;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVote_average() {
        return vote_average;
    }

    public void setVote_average(Double vote_average) {
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

}



//
//public class Movie {
//
//    @SerializedName("vote_count")
//    private Integer vote_count;
//
//    @SerializedName("id")
//    private Integer id;
//
//    @SerializedName("video")
//    private Boolean video;
//
//    @SerializedName("vote_average")
//    private Double vote_average;
//
//    @SerializedName("title")
//    private String title;
//
//    @SerializedName("popularity")
//    private Double popularity;
//
//    @SerializedName("poster_path")
//    private String poster_path;
//
//    @SerializedName("original_language")
//    private String original_language;
//
//    @SerializedName("original_title")
//    private String original_title;
//
//    @SerializedName("genre_ids")
//    private List<Integer> genre_ids;
//
//    @SerializedName("backdrop_path")
//    private String backdrop_path;
//
//    @SerializedName("adult")
//    private Boolean adult;
//
//    @SerializedName("overview")
//    private String overview;
//
//    @SerializedName("release_date")
//    private String release_date;
//
////    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds, Integer id,
////                 String originalTitle, String originalLanguage, String title, String backdropPath, Double popularity,
////                 Integer voteCount, Boolean video, Double voteAverage) {
////        this.posterPath = posterPath;
////        this.adult = adult;
////        this.overview = overview;
////        this.releaseDate = releaseDate;
////        this.genreIds = genreIds;
////        this.id = id;
////        this.originalTitle = originalTitle;
////        this.originalLanguage = originalLanguage;
////        this.title = title;
////        this.backdropPath = backdropPath;
////        this.popularity = popularity;
////        this.voteCount = voteCount;
////        this.video = video;
////        this.voteAverage = voteAverage;
////    }
//
//    public Integer getVote_count() {
//        return vote_count;
//    }
//
//    public void setVote_count(Integer vote_count) {
//        this.vote_count = vote_count;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Boolean getVideo() {
//        return video;
//    }
//
//    public void setVideo(Boolean video) {
//        this.video = video;
//    }
//
//    public Double getVote_average() {
//        return vote_average;
//    }
//
//    public void setVote_average(Double vote_average) {
//        this.vote_average = vote_average;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Double getPopularity() {
//        return popularity;
//    }
//
//    public void setPopularity(Double popularity) {
//        this.popularity = popularity;
//    }
//
//    public String getPoster_path() {
//        return poster_path;
//    }
//
//    public void setPoster_path(String poster_path) {
//        this.poster_path = poster_path;
//    }
//
//    public String getOriginal_language() {
//        return original_language;
//    }
//
//    public void setOriginal_language(String original_language) {
//        this.original_language = original_language;
//    }
//
//    public String getOriginal_title() {
//        return original_title;
//    }
//
//    public void setOriginal_title(String original_title) {
//        this.original_title = original_title;
//    }
//
//    public List<Integer> getGenre_ids() {
//        return genre_ids;
//    }
//
//    public void setGenre_ids(List<Integer> genre_ids) {
//        this.genre_ids = genre_ids;
//    }
//
//    public String getBackdrop_path() {
//        return backdrop_path;
//    }
//
//    public void setBackdrop_path(String backdrop_path) {
//        this.backdrop_path = backdrop_path;
//    }
//
//    public Boolean getAdult() {
//        return adult;
//    }
//
//    public void setAdult(Boolean adult) {
//        this.adult = adult;
//    }
//
//    public String getOverview() {
//        return overview;
//    }
//
//    public void setOverview(String overview) {
//        this.overview = overview;
//    }
//
//    public String getRelease_date() {
//        return release_date;
//    }
//
//    public void setRelease_date(String release_date) {
//        this.release_date = release_date;
//    }
//}

package com.padc.themoviebooking.data.vos

import com.google.gson.annotations.SerializedName


data class MovieVO (
    @SerializedName("adult")
    val adult: Boolean?,

    @SerializedName("genres")
    val genres: List<GenreVO>?,

    @SerializedName("backdrop_path")
    val backDropPath: String?,

    @SerializedName("budget")
    val budget: String?,

    @SerializedName("homepage")
    val homepage: String?,

    @SerializedName("imdb_id")
    val imdb_id: String?,

    @SerializedName("revenue")
    val revenue: Int?,

    @SerializedName("runtime")
    val runtime: Int?,

    @SerializedName("genre_ids")
    val genreIds: List<Int>?,

    @SerializedName("belongs_to_collection")
    val belongsToCollection: CollectionVO?,

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("original_language")
    val originalLanguage: String?,

    @SerializedName("original_title")
    val originalTitle: String?,

    @SerializedName("overview")
    val overview: String?,

    @SerializedName("popularity")
    val popularity: Double?,

    @SerializedName("poster_path")
    val posterPath: String?,

    @SerializedName("status")
    val status: String?,

    @SerializedName("tagline")
    val tagline: String?,

    @SerializedName("release_date")
    val releaseDate: String?,

    @SerializedName("production_companies")
    val productionCompanies: List<ProductionCompaniesVO>?,

    @SerializedName("production_countries")
    val productionCountries: List<ProductionCountriesVO>?,

    @SerializedName("spoken_languages")
    val spokenLanguages: List<SpokenLanguagesVO>?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("video")
    val video: Boolean?,

    @SerializedName("vote_average")
    val voteAverage: Double?,

    @SerializedName("vote_count")
    val voteCount: Int = 0,


    ){
    fun getRatingBasedOnFiveStar(): Float {
        return voteAverage?.div(2)?.toFloat()?: 0.0f
    }

    fun getGenreAsCommaSeparatedString(): String {
        return genres?.map { it.name }?.joinToString (",") ?: ""
    }
    fun getProductionCountriesAsCommaSeparatedString(): String {
        return productionCountries?.map { it.name }?.joinToString ( "," )?:""
    }

}

const val NOW_PLAYING = "NOW_PLAYING"
const val POPULAR = "POPULAR"
const val TOP_RATED = "TOP_RATED"

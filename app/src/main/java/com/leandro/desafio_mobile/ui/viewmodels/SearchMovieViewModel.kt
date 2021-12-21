package com.leandro.desafio_mobile.ui.viewmodels

import com.leandro.desafio_mobile.repositories.MovieRepository
import com.leandro.desafio_mobile.ui.home.HomeViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchMovieViewModel @Inject constructor(private val repository: MovieRepository) :
    HomeViewModel(repository) {

}
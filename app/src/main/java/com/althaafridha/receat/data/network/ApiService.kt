package com.althaafridha.receat.data.network

import com.althaafridha.receat.data.DetailResponse
import com.althaafridha.receat.data.NewRecipeResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {

	@GET("api/recipes")
	fun getNewRecipe(): Flowable<NewRecipeResponse>

	@GET("/api/recipe/key")
	fun getRecipe(): Flowable<DetailResponse>

}
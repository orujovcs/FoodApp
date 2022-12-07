package com.example.myfoodapp.di

import com.example.myfoodapp.data.repo.FoodDaoRepo
import com.example.myfoodapp.retrofit.ApiUtils
import com.example.myfoodapp.retrofit.FoodDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFoodDaoRepo(fdao : FoodDao) : FoodDaoRepo {
        return FoodDaoRepo(fdao)
    }

    @Provides
    @Singleton
    fun provideFoodDao() : FoodDao{
        return ApiUtils.getFoodDao()
    }
}
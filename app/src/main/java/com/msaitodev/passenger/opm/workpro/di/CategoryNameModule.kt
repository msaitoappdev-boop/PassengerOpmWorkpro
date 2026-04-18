package com.msaitodev.passenger.opm.workpro.di

import com.msaitodev.passenger.opm.workpro.notifications.QuizCategoryNameProvider
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CategoryNameModule {

    @Binds
    @Singleton
    abstract fun bindCategoryNameProvider(
        impl: QuizCategoryNameProvider
    ): CategoryNameProvider
}

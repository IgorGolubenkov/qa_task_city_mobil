package com.google.samples.apps.iosched.ui.search;

import java.lang.System;

/**
 * Module where classes needed to create the [SearchFragment] are defined.
 */
@kotlin.Suppress(names = {"UNUSED"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH!\u00a2\u0006\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/search/SearchModule;", "", "()V", "bindSearchViewModel", "Landroidx/lifecycle/ViewModel;", "viewmodel", "Lcom/google/samples/apps/iosched/ui/search/SearchViewModel;", "bindSearchViewModel$mobile_debug", "contributeSearchFragment", "Lcom/google/samples/apps/iosched/ui/search/SearchFragment;", "contributeSearchFragment$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class SearchModule {
    
    /**
     * Generates an [AndroidInjector] for the [SearchFragment]
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.google.samples.apps.iosched.shared.di.FragmentScoped()
    public abstract com.google.samples.apps.iosched.ui.search.SearchFragment contributeSearchFragment$mobile_debug();
    
    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SearchViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.search.SearchViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindSearchViewModel$mobile_debug(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.search.SearchViewModel viewmodel);
    
    public SearchModule() {
        super();
    }
}
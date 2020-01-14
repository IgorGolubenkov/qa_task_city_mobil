package com.google.samples.apps.iosched.ui.search;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SearchModule_ContributeSearchFragment$mobile_debug.SearchFragmentSubcomponent.class
)
public abstract class SearchModule_ContributeSearchFragment$mobile_debug {
  private SearchModule_ContributeSearchFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SearchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface SearchFragmentSubcomponent extends AndroidInjector<SearchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchFragment> {}
  }
}

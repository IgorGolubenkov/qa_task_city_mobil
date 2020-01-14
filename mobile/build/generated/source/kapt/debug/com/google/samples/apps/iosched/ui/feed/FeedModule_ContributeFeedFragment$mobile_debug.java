package com.google.samples.apps.iosched.ui.feed;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FeedModule_ContributeFeedFragment$mobile_debug.FeedFragmentSubcomponent.class
)
public abstract class FeedModule_ContributeFeedFragment$mobile_debug {
  private FeedModule_ContributeFeedFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(FeedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FeedFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FeedFragmentSubcomponent extends AndroidInjector<FeedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FeedFragment> {}
  }
}

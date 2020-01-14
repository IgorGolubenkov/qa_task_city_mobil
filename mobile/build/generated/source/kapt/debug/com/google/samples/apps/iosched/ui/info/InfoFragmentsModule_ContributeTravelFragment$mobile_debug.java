package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      InfoFragmentsModule_ContributeTravelFragment$mobile_debug.TravelFragmentSubcomponent.class
)
public abstract class InfoFragmentsModule_ContributeTravelFragment$mobile_debug {
  private InfoFragmentsModule_ContributeTravelFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(TravelFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TravelFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface TravelFragmentSubcomponent extends AndroidInjector<TravelFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TravelFragment> {}
  }
}

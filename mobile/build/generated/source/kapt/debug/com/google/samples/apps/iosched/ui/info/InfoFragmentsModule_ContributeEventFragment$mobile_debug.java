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
      InfoFragmentsModule_ContributeEventFragment$mobile_debug.EventFragmentSubcomponent.class
)
public abstract class InfoFragmentsModule_ContributeEventFragment$mobile_debug {
  private InfoFragmentsModule_ContributeEventFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(EventFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EventFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface EventFragmentSubcomponent extends AndroidInjector<EventFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EventFragment> {}
  }
}

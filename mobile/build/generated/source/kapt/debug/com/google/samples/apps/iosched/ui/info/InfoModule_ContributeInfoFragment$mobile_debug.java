package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = InfoModule_ContributeInfoFragment$mobile_debug.InfoFragmentSubcomponent.class
)
public abstract class InfoModule_ContributeInfoFragment$mobile_debug {
  private InfoModule_ContributeInfoFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(InfoFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      InfoFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = InfoFragmentsModule.class)
  @FragmentScoped
  public interface InfoFragmentSubcomponent extends AndroidInjector<InfoFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<InfoFragment> {}
  }
}

package com.google.samples.apps.iosched.ui.settings;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SettingsModule_ContributeSettingsFragment$mobile_debug.SettingsFragmentSubcomponent.class
)
public abstract class SettingsModule_ContributeSettingsFragment$mobile_debug {
  private SettingsModule_ContributeSettingsFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface SettingsFragmentSubcomponent extends AndroidInjector<SettingsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsFragment> {}
  }
}

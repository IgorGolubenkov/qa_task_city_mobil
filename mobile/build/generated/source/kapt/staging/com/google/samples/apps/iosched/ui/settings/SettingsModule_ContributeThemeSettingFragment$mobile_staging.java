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
      SettingsModule_ContributeThemeSettingFragment$mobile_staging
          .ThemeSettingDialogFragmentSubcomponent.class
)
public abstract class SettingsModule_ContributeThemeSettingFragment$mobile_staging {
  private SettingsModule_ContributeThemeSettingFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(ThemeSettingDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ThemeSettingDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface ThemeSettingDialogFragmentSubcomponent
      extends AndroidInjector<ThemeSettingDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ThemeSettingDialogFragment> {}
  }
}

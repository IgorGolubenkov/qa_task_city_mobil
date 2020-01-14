package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.di.ActivityScoped;
import com.google.samples.apps.iosched.ui.LaunchModule;
import com.google.samples.apps.iosched.ui.LauncherActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_LauncherActivity$mobile_debug.LauncherActivitySubcomponent.class
)
public abstract class ActivityBindingModule_LauncherActivity$mobile_debug {
  private ActivityBindingModule_LauncherActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(LauncherActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LauncherActivitySubcomponent.Factory builder);

  @Subcomponent(modules = LaunchModule.class)
  @ActivityScoped
  public interface LauncherActivitySubcomponent extends AndroidInjector<LauncherActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LauncherActivity> {}
  }
}

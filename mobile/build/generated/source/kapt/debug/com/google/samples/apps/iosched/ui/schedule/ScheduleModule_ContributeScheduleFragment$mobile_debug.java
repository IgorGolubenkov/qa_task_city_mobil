package com.google.samples.apps.iosched.ui.schedule;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleFragment$mobile_debug.ScheduleFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SessionViewPoolModule.class)
  @FragmentScoped
  public interface ScheduleFragmentSubcomponent extends AndroidInjector<ScheduleFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ScheduleFragment> {}
  }
}

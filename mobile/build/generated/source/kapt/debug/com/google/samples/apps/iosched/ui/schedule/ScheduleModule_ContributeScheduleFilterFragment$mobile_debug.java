package com.google.samples.apps.iosched.ui.schedule;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleFilterFragment$mobile_debug
          .ScheduleFilterFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleFilterFragment$mobile_debug {
  private ScheduleModule_ContributeScheduleFilterFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleFilterFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleFilterFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface ScheduleFilterFragmentSubcomponent
      extends AndroidInjector<ScheduleFilterFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ScheduleFilterFragment> {}
  }
}

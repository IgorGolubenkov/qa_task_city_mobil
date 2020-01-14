package com.google.samples.apps.iosched.ui.schedule;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScheduleModule_ContributeScheduleUiHintsDialogFragment$mobile_staging
          .ScheduleUiHintsDialogFragmentSubcomponent.class
)
public abstract class ScheduleModule_ContributeScheduleUiHintsDialogFragment$mobile_staging {
  private ScheduleModule_ContributeScheduleUiHintsDialogFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(ScheduleUiHintsDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ScheduleUiHintsDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface ScheduleUiHintsDialogFragmentSubcomponent
      extends AndroidInjector<ScheduleUiHintsDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ScheduleUiHintsDialogFragment> {}
  }
}

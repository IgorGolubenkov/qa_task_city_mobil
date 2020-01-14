package com.google.samples.apps.iosched.ui.reservation;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ReservationModule_ContributeRemoveReservationDialogFragment$mobile_debug
          .RemoveReservationDialogFragmentSubcomponent.class
)
public abstract class ReservationModule_ContributeRemoveReservationDialogFragment$mobile_debug {
  private ReservationModule_ContributeRemoveReservationDialogFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(RemoveReservationDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RemoveReservationDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface RemoveReservationDialogFragmentSubcomponent
      extends AndroidInjector<RemoveReservationDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RemoveReservationDialogFragment> {}
  }
}

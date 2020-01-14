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
      ReservationModule_ContributeRemoveReservationDialogFragment$mobile_staging
          .RemoveReservationDialogFragmentSubcomponent.class
)
public abstract class ReservationModule_ContributeRemoveReservationDialogFragment$mobile_staging {
  private ReservationModule_ContributeRemoveReservationDialogFragment$mobile_staging() {}

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

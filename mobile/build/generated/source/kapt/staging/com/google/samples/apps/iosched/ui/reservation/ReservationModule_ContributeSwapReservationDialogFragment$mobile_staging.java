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
      ReservationModule_ContributeSwapReservationDialogFragment$mobile_staging
          .SwapReservationDialogFragmentSubcomponent.class
)
public abstract class ReservationModule_ContributeSwapReservationDialogFragment$mobile_staging {
  private ReservationModule_ContributeSwapReservationDialogFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(SwapReservationDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SwapReservationDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface SwapReservationDialogFragmentSubcomponent
      extends AndroidInjector<SwapReservationDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SwapReservationDialogFragment> {}
  }
}

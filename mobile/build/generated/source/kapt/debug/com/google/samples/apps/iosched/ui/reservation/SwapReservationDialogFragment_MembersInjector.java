// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.reservation;

import com.google.samples.apps.iosched.shared.domain.users.SwapActionUseCase;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatDialogFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SwapReservationDialogFragment_MembersInjector implements MembersInjector<SwapReservationDialogFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SwapActionUseCase> swapActionUseCaseProvider;

  public SwapReservationDialogFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SwapActionUseCase> swapActionUseCaseProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.swapActionUseCaseProvider = swapActionUseCaseProvider;
  }

  public static MembersInjector<SwapReservationDialogFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SwapActionUseCase> swapActionUseCaseProvider) {
    return new SwapReservationDialogFragment_MembersInjector(androidInjectorProvider, swapActionUseCaseProvider);}

  @Override
  public void injectMembers(SwapReservationDialogFragment instance) {
    DaggerAppCompatDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSwapActionUseCase(instance, swapActionUseCaseProvider.get());
  }

  public static void injectSwapActionUseCase(SwapReservationDialogFragment instance,
      SwapActionUseCase swapActionUseCase) {
    instance.swapActionUseCase = swapActionUseCase;
  }
}

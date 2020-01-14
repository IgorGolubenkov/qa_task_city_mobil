package com.google.samples.apps.iosched.ui.onboarding;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      OnboardingModule_ContributeOnboardingSignInFragment$mobile_staging
          .OnboardingSignInFragmentSubcomponent.class
)
public abstract class OnboardingModule_ContributeOnboardingSignInFragment$mobile_staging {
  private OnboardingModule_ContributeOnboardingSignInFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(OnboardingSignInFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OnboardingSignInFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface OnboardingSignInFragmentSubcomponent
      extends AndroidInjector<OnboardingSignInFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OnboardingSignInFragment> {}
  }
}

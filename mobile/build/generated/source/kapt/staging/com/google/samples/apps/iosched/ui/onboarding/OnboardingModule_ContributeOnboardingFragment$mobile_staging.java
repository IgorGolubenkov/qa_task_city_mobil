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
      OnboardingModule_ContributeOnboardingFragment$mobile_staging.OnboardingFragmentSubcomponent
          .class
)
public abstract class OnboardingModule_ContributeOnboardingFragment$mobile_staging {
  private OnboardingModule_ContributeOnboardingFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(OnboardingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OnboardingFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface OnboardingFragmentSubcomponent extends AndroidInjector<OnboardingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OnboardingFragment> {}
  }
}

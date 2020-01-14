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
      OnboardingModule_ContributeWelcomeDuringConferenceFragment$mobile_debug
          .WelcomeDuringConferenceFragmentSubcomponent.class
)
public abstract class OnboardingModule_ContributeWelcomeDuringConferenceFragment$mobile_debug {
  private OnboardingModule_ContributeWelcomeDuringConferenceFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(WelcomeDuringConferenceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WelcomeDuringConferenceFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface WelcomeDuringConferenceFragmentSubcomponent
      extends AndroidInjector<WelcomeDuringConferenceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WelcomeDuringConferenceFragment> {}
  }
}

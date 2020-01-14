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
      OnboardingModule_ContributeWelcomePreConferenceFragment$mobile_debug
          .WelcomePreConferenceFragmentSubcomponent.class
)
public abstract class OnboardingModule_ContributeWelcomePreConferenceFragment$mobile_debug {
  private OnboardingModule_ContributeWelcomePreConferenceFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(WelcomePreConferenceFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WelcomePreConferenceFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface WelcomePreConferenceFragmentSubcomponent
      extends AndroidInjector<WelcomePreConferenceFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<WelcomePreConferenceFragment> {}
  }
}

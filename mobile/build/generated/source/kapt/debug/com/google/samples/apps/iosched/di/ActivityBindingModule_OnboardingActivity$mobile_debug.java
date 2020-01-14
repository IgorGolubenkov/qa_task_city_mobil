package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.di.ActivityScoped;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingActivity;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingModule;
import com.google.samples.apps.iosched.ui.signin.SignInDialogModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_OnboardingActivity$mobile_debug.OnboardingActivitySubcomponent.class
)
public abstract class ActivityBindingModule_OnboardingActivity$mobile_debug {
  private ActivityBindingModule_OnboardingActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(OnboardingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OnboardingActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {OnboardingModule.class, SignInDialogModule.class})
  @ActivityScoped
  public interface OnboardingActivitySubcomponent extends AndroidInjector<OnboardingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OnboardingActivity> {}
  }
}

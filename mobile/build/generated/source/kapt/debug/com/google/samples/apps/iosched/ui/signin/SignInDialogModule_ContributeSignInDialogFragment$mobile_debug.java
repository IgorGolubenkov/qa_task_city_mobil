package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SignInDialogModule_ContributeSignInDialogFragment$mobile_debug
          .SignInDialogFragmentSubcomponent.class
)
public abstract class SignInDialogModule_ContributeSignInDialogFragment$mobile_debug {
  private SignInDialogModule_ContributeSignInDialogFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SignInDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignInDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface SignInDialogFragmentSubcomponent extends AndroidInjector<SignInDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignInDialogFragment> {}
  }
}

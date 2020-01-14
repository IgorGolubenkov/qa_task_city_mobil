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
      SignInDialogModule_ContributeSignOutDialogFragment$mobile_staging
          .SignOutDialogFragmentSubcomponent.class
)
public abstract class SignInDialogModule_ContributeSignOutDialogFragment$mobile_staging {
  private SignInDialogModule_ContributeSignOutDialogFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(SignOutDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignOutDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface SignOutDialogFragmentSubcomponent
      extends AndroidInjector<SignOutDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignOutDialogFragment> {}
  }
}

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
      SignInDialogModule_ContributeNotificationsPreferenceDialogFragment$mobile_staging
          .NotificationsPreferenceDialogFragmentSubcomponent.class
)
public abstract
class SignInDialogModule_ContributeNotificationsPreferenceDialogFragment$mobile_staging {
  private SignInDialogModule_ContributeNotificationsPreferenceDialogFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationsPreferenceDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationsPreferenceDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface NotificationsPreferenceDialogFragmentSubcomponent
      extends AndroidInjector<NotificationsPreferenceDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NotificationsPreferenceDialogFragment> {}
  }
}

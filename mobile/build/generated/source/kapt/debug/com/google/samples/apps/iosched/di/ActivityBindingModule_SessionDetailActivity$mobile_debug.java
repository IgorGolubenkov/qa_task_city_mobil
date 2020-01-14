package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.di.ActivityScoped;
import com.google.samples.apps.iosched.ui.prefs.PreferenceModule;
import com.google.samples.apps.iosched.ui.reservation.ReservationModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackModule;
import com.google.samples.apps.iosched.ui.signin.SignInDialogModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_SessionDetailActivity$mobile_debug.SessionDetailActivitySubcomponent
          .class
)
public abstract class ActivityBindingModule_SessionDetailActivity$mobile_debug {
  private ActivityBindingModule_SessionDetailActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SessionDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SessionDetailActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      SessionDetailModule.class,
      SessionFeedbackModule.class,
      SignInDialogModule.class,
      ReservationModule.class,
      PreferenceModule.class
    }
  )
  @ActivityScoped
  public interface SessionDetailActivitySubcomponent
      extends AndroidInjector<SessionDetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SessionDetailActivity> {}
  }
}

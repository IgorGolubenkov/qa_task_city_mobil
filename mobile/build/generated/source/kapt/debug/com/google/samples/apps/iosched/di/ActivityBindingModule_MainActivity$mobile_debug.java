package com.google.samples.apps.iosched.di;

import com.google.samples.apps.iosched.shared.di.ActivityScoped;
import com.google.samples.apps.iosched.ui.MainActivity;
import com.google.samples.apps.iosched.ui.MainActivityModule;
import com.google.samples.apps.iosched.ui.agenda.AgendaModule;
import com.google.samples.apps.iosched.ui.codelabs.CodelabsModule;
import com.google.samples.apps.iosched.ui.feed.FeedModule;
import com.google.samples.apps.iosched.ui.info.InfoModule;
import com.google.samples.apps.iosched.ui.map.MapModule;
import com.google.samples.apps.iosched.ui.prefs.PreferenceModule;
import com.google.samples.apps.iosched.ui.reservation.ReservationModule;
import com.google.samples.apps.iosched.ui.schedule.ScheduleModule;
import com.google.samples.apps.iosched.ui.search.SearchModule;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegateModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailModule;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackModule;
import com.google.samples.apps.iosched.ui.settings.SettingsModule;
import com.google.samples.apps.iosched.ui.signin.SignInDialogModule;
import com.google.samples.apps.iosched.ui.speaker.SpeakerModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_MainActivity$mobile_debug.MainActivitySubcomponent.class
)
public abstract class ActivityBindingModule_MainActivity$mobile_debug {
  private ActivityBindingModule_MainActivity$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      MainActivityModule.class,
      AgendaModule.class,
      CodelabsModule.class,
      FeedModule.class,
      InfoModule.class,
      MapModule.class,
      ScheduleModule.class,
      SearchModule.class,
      SessionDetailModule.class,
      SettingsModule.class,
      SpeakerModule.class,
      PreferenceModule.class,
      ReservationModule.class,
      SessionFeedbackModule.class,
      SignInDialogModule.class,
      EventActionsViewModelDelegateModule.class
    }
  )
  @ActivityScoped
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}

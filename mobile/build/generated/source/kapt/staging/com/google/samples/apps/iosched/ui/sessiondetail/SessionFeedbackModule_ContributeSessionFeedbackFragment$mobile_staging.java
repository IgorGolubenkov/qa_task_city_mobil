package com.google.samples.apps.iosched.ui.sessiondetail;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import com.google.samples.apps.iosched.ui.sessioncommon.SessionViewPoolModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SessionFeedbackModule_ContributeSessionFeedbackFragment$mobile_staging
          .SessionFeedbackFragmentSubcomponent.class
)
public abstract class SessionFeedbackModule_ContributeSessionFeedbackFragment$mobile_staging {
  private SessionFeedbackModule_ContributeSessionFeedbackFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(SessionFeedbackFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SessionFeedbackFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SessionViewPoolModule.class)
  @FragmentScoped
  public interface SessionFeedbackFragmentSubcomponent
      extends AndroidInjector<SessionFeedbackFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SessionFeedbackFragment> {}
  }
}

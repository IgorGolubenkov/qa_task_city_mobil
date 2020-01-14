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
      SessionDetailModule_ContributeSessionDetailFragment$mobile_debug
          .SessionDetailFragmentSubcomponent.class
)
public abstract class SessionDetailModule_ContributeSessionDetailFragment$mobile_debug {
  private SessionDetailModule_ContributeSessionDetailFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SessionDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SessionDetailFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SessionViewPoolModule.class)
  @FragmentScoped
  public interface SessionDetailFragmentSubcomponent
      extends AndroidInjector<SessionDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SessionDetailFragment> {}
  }
}

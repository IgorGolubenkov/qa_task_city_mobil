package com.google.samples.apps.iosched.ui.speaker;

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
      SpeakerModule_ContributeSpeakerFragment$mobile_debug.SpeakerFragmentSubcomponent.class
)
public abstract class SpeakerModule_ContributeSpeakerFragment$mobile_debug {
  private SpeakerModule_ContributeSpeakerFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SpeakerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SpeakerFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SessionViewPoolModule.class)
  @FragmentScoped
  public interface SpeakerFragmentSubcomponent extends AndroidInjector<SpeakerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SpeakerFragment> {}
  }
}

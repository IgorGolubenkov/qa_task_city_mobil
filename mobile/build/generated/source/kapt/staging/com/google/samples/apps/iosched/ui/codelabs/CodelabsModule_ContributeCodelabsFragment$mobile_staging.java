package com.google.samples.apps.iosched.ui.codelabs;

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
      CodelabsModule_ContributeCodelabsFragment$mobile_staging.CodelabsFragmentSubcomponent.class
)
public abstract class CodelabsModule_ContributeCodelabsFragment$mobile_staging {
  private CodelabsModule_ContributeCodelabsFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(CodelabsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CodelabsFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SessionViewPoolModule.class)
  @FragmentScoped
  public interface CodelabsFragmentSubcomponent extends AndroidInjector<CodelabsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CodelabsFragment> {}
  }
}

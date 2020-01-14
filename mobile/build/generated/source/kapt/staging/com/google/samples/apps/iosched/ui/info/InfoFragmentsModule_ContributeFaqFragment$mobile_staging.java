package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      InfoFragmentsModule_ContributeFaqFragment$mobile_staging.FaqFragmentSubcomponent.class
)
public abstract class InfoFragmentsModule_ContributeFaqFragment$mobile_staging {
  private InfoFragmentsModule_ContributeFaqFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(FaqFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FaqFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface FaqFragmentSubcomponent extends AndroidInjector<FaqFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FaqFragment> {}
  }
}

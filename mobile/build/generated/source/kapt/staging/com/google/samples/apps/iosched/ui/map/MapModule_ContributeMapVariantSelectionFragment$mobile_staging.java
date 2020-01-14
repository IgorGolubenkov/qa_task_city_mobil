package com.google.samples.apps.iosched.ui.map;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MapModule_ContributeMapVariantSelectionFragment$mobile_staging
          .MapVariantSelectionDialogFragmentSubcomponent.class
)
public abstract class MapModule_ContributeMapVariantSelectionFragment$mobile_staging {
  private MapModule_ContributeMapVariantSelectionFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(MapVariantSelectionDialogFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MapVariantSelectionDialogFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface MapVariantSelectionDialogFragmentSubcomponent
      extends AndroidInjector<MapVariantSelectionDialogFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MapVariantSelectionDialogFragment> {}
  }
}

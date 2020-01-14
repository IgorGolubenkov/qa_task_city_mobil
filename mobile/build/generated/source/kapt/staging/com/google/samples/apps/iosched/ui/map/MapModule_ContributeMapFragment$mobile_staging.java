package com.google.samples.apps.iosched.ui.map;

import com.google.samples.apps.iosched.shared.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MapModule_ContributeMapFragment$mobile_staging.MapFragmentSubcomponent.class
)
public abstract class MapModule_ContributeMapFragment$mobile_staging {
  private MapModule_ContributeMapFragment$mobile_staging() {}

  @Binds
  @IntoMap
  @ClassKey(MapFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MapFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface MapFragmentSubcomponent extends AndroidInjector<MapFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MapFragment> {}
  }
}

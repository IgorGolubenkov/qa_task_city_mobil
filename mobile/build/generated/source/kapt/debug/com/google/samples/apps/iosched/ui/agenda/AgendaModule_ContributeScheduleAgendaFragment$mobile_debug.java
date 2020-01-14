package com.google.samples.apps.iosched.ui.agenda;

import com.google.samples.apps.iosched.shared.di.ChildFragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      AgendaModule_ContributeScheduleAgendaFragment$mobile_debug.AgendaFragmentSubcomponent.class
)
public abstract class AgendaModule_ContributeScheduleAgendaFragment$mobile_debug {
  private AgendaModule_ContributeScheduleAgendaFragment$mobile_debug() {}

  @Binds
  @IntoMap
  @ClassKey(AgendaFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AgendaFragmentSubcomponent.Factory builder);

  @Subcomponent
  @ChildFragmentScoped
  public interface AgendaFragmentSubcomponent extends AndroidInjector<AgendaFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AgendaFragment> {}
  }
}

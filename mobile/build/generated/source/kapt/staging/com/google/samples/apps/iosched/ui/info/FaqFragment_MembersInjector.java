// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.ui.info;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FaqFragment_MembersInjector implements MembersInjector<FaqFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public FaqFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<FaqFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new FaqFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(FaqFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}

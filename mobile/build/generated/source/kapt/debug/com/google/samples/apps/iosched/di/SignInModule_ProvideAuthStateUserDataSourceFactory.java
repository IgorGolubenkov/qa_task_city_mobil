// Generated by Dagger (https://dagger.dev).
package com.google.samples.apps.iosched.di;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource;
import com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInModule_ProvideAuthStateUserDataSourceFactory implements Factory<AuthStateUserDataSource> {
  private final SignInModule module;

  private final Provider<FirebaseAuth> firebaseProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider;

  public SignInModule_ProvideAuthStateUserDataSourceFactory(SignInModule module,
      Provider<FirebaseAuth> firebaseProvider, Provider<FirebaseFirestore> firestoreProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider) {
    this.module = module;
    this.firebaseProvider = firebaseProvider;
    this.firestoreProvider = firestoreProvider;
    this.notificationAlarmUpdaterProvider = notificationAlarmUpdaterProvider;
  }

  @Override
  public AuthStateUserDataSource get() {
    return provideAuthStateUserDataSource(module, firebaseProvider.get(), firestoreProvider.get(), notificationAlarmUpdaterProvider.get());
  }

  public static SignInModule_ProvideAuthStateUserDataSourceFactory create(SignInModule module,
      Provider<FirebaseAuth> firebaseProvider, Provider<FirebaseFirestore> firestoreProvider,
      Provider<NotificationAlarmUpdater> notificationAlarmUpdaterProvider) {
    return new SignInModule_ProvideAuthStateUserDataSourceFactory(module, firebaseProvider, firestoreProvider, notificationAlarmUpdaterProvider);
  }

  public static AuthStateUserDataSource provideAuthStateUserDataSource(SignInModule instance,
      FirebaseAuth firebase, FirebaseFirestore firestore,
      NotificationAlarmUpdater notificationAlarmUpdater) {
    return Preconditions.checkNotNull(instance.provideAuthStateUserDataSource(firebase, firestore, notificationAlarmUpdater), "Cannot return null from a non-@Nullable @Provides method");
  }
}

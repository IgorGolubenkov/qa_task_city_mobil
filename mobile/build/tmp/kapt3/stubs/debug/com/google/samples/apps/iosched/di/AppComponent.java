package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * Main component of the app, created and persisted in the Application class.
 *
 * Whenever a new module is created, it should be added to the list of modules.
 * [AndroidSupportInjectionModule] is the module from Dagger.Android that helps with the
 * generation and location of subcomponents.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/google/samples/apps/iosched/MainApplication;", "Factory", "mobile_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.google.samples.apps.iosched.di.AppModule.class, com.google.samples.apps.iosched.di.ActivityBindingModule.class, com.google.samples.apps.iosched.shared.di.BroadcastReceiverBindingModule.class, com.google.samples.apps.iosched.shared.di.ViewModelModule.class, com.google.samples.apps.iosched.shared.di.ServiceBindingModule.class, com.google.samples.apps.iosched.shared.di.SharedModule.class, com.google.samples.apps.iosched.shared.di.FeatureFlagsModule.class, com.google.samples.apps.iosched.di.SignInModule.class, com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegateModule.class, com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegateModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.google.samples.apps.iosched.MainApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppComponent$Factory;", "", "create", "Lcom/google/samples/apps/iosched/di/AppComponent;", "application", "Lcom/google/samples/apps/iosched/MainApplication;", "mobile_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.google.samples.apps.iosched.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.google.samples.apps.iosched.MainApplication application);
    }
}
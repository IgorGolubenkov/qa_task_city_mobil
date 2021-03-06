// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.onboarding.OnboardingViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOnboardingSigninBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonSignin;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final ImageView onboardingSchedule;

  @NonNull
  public final TextView onboardingSigninMessage;

  @NonNull
  public final Space spacer;

  @Bindable
  protected OnboardingViewModel mActivityViewModel;

  protected FragmentOnboardingSigninBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button buttonSignin, Guideline guidelineEnd, Guideline guidelineStart,
      ImageView onboardingSchedule, TextView onboardingSigninMessage, Space spacer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonSignin = buttonSignin;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.onboardingSchedule = onboardingSchedule;
    this.onboardingSigninMessage = onboardingSigninMessage;
    this.spacer = spacer;
  }

  public abstract void setActivityViewModel(@Nullable OnboardingViewModel activityViewModel);

  @Nullable
  public OnboardingViewModel getActivityViewModel() {
    return mActivityViewModel;
  }

  @NonNull
  public static FragmentOnboardingSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_signin, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingSigninBinding>inflateInternal(inflater, R.layout.fragment_onboarding_signin, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOnboardingSigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_signin, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboardingSigninBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboardingSigninBinding>inflateInternal(inflater, R.layout.fragment_onboarding_signin, null, false, component);
  }

  public static FragmentOnboardingSigninBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentOnboardingSigninBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentOnboardingSigninBinding)bind(component, view, R.layout.fragment_onboarding_signin);
  }
}

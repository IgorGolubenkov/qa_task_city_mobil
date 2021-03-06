// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.speaker.ImageLoadListener;
import com.google.samples.apps.iosched.ui.speaker.SpeakerViewModel;
import com.google.samples.apps.iosched.widget.FadingSnackbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSpeakerBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final FadingSnackbar snackbar;

  @NonNull
  public final RecyclerView speakerDetailRecyclerView;

  @NonNull
  public final ImageView speakerImage;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected SpeakerViewModel mViewModel;

  @Bindable
  protected ImageLoadListener mHeadshotLoadListener;

  protected FragmentSpeakerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      CoordinatorLayout coordinatorLayout, FadingSnackbar snackbar,
      RecyclerView speakerDetailRecyclerView, ImageView speakerImage, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.coordinatorLayout = coordinatorLayout;
    this.snackbar = snackbar;
    this.speakerDetailRecyclerView = speakerDetailRecyclerView;
    this.speakerImage = speakerImage;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable SpeakerViewModel viewModel);

  @Nullable
  public SpeakerViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHeadshotLoadListener(@Nullable ImageLoadListener headshotLoadListener);

  @Nullable
  public ImageLoadListener getHeadshotLoadListener() {
    return mHeadshotLoadListener;
  }

  @NonNull
  public static FragmentSpeakerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_speaker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpeakerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSpeakerBinding>inflateInternal(inflater, R.layout.fragment_speaker, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSpeakerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_speaker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSpeakerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSpeakerBinding>inflateInternal(inflater, R.layout.fragment_speaker, null, false, component);
  }

  public static FragmentSpeakerBinding bind(@NonNull View view) {
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
  public static FragmentSpeakerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSpeakerBinding)bind(component, view, R.layout.fragment_speaker);
  }
}

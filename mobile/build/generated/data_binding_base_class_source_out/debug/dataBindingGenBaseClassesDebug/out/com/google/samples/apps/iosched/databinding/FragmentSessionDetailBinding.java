// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.reservation.StarReserveFab;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel;
import com.google.samples.apps.iosched.widget.FadingSnackbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSessionDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final CoordinatorLayout coordinatorLayoutSessionDetail;

  @NonNull
  public final ImageView detailImage;

  @NonNull
  public final View navBarScrim;

  @NonNull
  public final ImageButton playButton;

  @NonNull
  public final BottomAppBar sessionDetailBottomAppBar;

  @NonNull
  public final StarReserveFab sessionDetailFab;

  @NonNull
  public final RecyclerView sessionDetailRecyclerView;

  @NonNull
  public final FadingSnackbar snackbar;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected SessionDetailViewModel mViewModel;

  protected FragmentSessionDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      CoordinatorLayout coordinatorLayoutSessionDetail, ImageView detailImage, View navBarScrim,
      ImageButton playButton, BottomAppBar sessionDetailBottomAppBar,
      StarReserveFab sessionDetailFab, RecyclerView sessionDetailRecyclerView,
      FadingSnackbar snackbar, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.coordinatorLayoutSessionDetail = coordinatorLayoutSessionDetail;
    this.detailImage = detailImage;
    this.navBarScrim = navBarScrim;
    this.playButton = playButton;
    this.sessionDetailBottomAppBar = sessionDetailBottomAppBar;
    this.sessionDetailFab = sessionDetailFab;
    this.sessionDetailRecyclerView = sessionDetailRecyclerView;
    this.snackbar = snackbar;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable SessionDetailViewModel viewModel);

  @Nullable
  public SessionDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_session_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSessionDetailBinding>inflateInternal(inflater, R.layout.fragment_session_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_session_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSessionDetailBinding>inflateInternal(inflater, R.layout.fragment_session_detail, null, false, component);
  }

  public static FragmentSessionDetailBinding bind(@NonNull View view) {
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
  public static FragmentSessionDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSessionDetailBinding)bind(component, view, R.layout.fragment_session_detail);
  }
}

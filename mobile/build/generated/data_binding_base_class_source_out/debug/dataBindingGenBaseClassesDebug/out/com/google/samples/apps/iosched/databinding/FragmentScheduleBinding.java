// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel;
import com.google.samples.apps.iosched.widget.FadingSnackbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentScheduleBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final TextView empty;

  @NonNull
  public final FloatingActionButton filterFab;

  @NonNull
  public final IncludeScheduleAppbarBinding includeScheduleAppbar;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final RecyclerView recyclerviewSchedule;

  @NonNull
  public final FadingSnackbar snackbar;

  @Bindable
  protected ScheduleViewModel mViewModel;

  @Bindable
  protected boolean mIsEmpty;

  protected FragmentScheduleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CoordinatorLayout coordinatorLayout, TextView empty, FloatingActionButton filterFab,
      IncludeScheduleAppbarBinding includeScheduleAppbar, ProgressBar loading,
      RecyclerView recyclerviewSchedule, FadingSnackbar snackbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinatorLayout = coordinatorLayout;
    this.empty = empty;
    this.filterFab = filterFab;
    this.includeScheduleAppbar = includeScheduleAppbar;
    setContainedBinding(this.includeScheduleAppbar);
    this.loading = loading;
    this.recyclerviewSchedule = recyclerviewSchedule;
    this.snackbar = snackbar;
  }

  public abstract void setViewModel(@Nullable ScheduleViewModel viewModel);

  @Nullable
  public ScheduleViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setIsEmpty(boolean isEmpty);

  public boolean getIsEmpty() {
    return mIsEmpty;
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentScheduleBinding>inflateInternal(inflater, R.layout.fragment_schedule, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_schedule, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentScheduleBinding>inflateInternal(inflater, R.layout.fragment_schedule, null, false, component);
  }

  public static FragmentScheduleBinding bind(@NonNull View view) {
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
  public static FragmentScheduleBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentScheduleBinding)bind(component, view, R.layout.fragment_schedule);
  }
}

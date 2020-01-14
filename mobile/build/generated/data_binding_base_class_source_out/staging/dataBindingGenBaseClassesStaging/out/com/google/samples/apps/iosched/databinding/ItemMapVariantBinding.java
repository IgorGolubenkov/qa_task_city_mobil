// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.map.MapVariant;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMapVariantBinding extends ViewDataBinding {
  @NonNull
  public final CheckedTextView mapVariantLabel;

  @Bindable
  protected MapVariant mVariant;

  @Bindable
  protected Boolean mIsChecked;

  protected ItemMapVariantBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckedTextView mapVariantLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mapVariantLabel = mapVariantLabel;
  }

  public abstract void setVariant(@Nullable MapVariant variant);

  @Nullable
  public MapVariant getVariant() {
    return mVariant;
  }

  public abstract void setIsChecked(@Nullable Boolean isChecked);

  @Nullable
  public Boolean getIsChecked() {
    return mIsChecked;
  }

  @NonNull
  public static ItemMapVariantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_map_variant, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMapVariantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMapVariantBinding>inflateInternal(inflater, R.layout.item_map_variant, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMapVariantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_map_variant, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMapVariantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMapVariantBinding>inflateInternal(inflater, R.layout.item_map_variant, null, false, component);
  }

  public static ItemMapVariantBinding bind(@NonNull View view) {
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
  public static ItemMapVariantBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMapVariantBinding)bind(component, view, R.layout.item_map_variant);
  }
}

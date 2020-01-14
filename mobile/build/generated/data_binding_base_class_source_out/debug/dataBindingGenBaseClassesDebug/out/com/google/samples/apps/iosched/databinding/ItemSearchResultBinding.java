// Generated by data binding compiler. Do not edit!
package com.google.samples.apps.iosched.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.ui.search.SearchResult;
import com.google.samples.apps.iosched.ui.search.SearchResultActionHandler;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSearchResultBinding extends ViewDataBinding {
  @NonNull
  public final ImageView searchResultIcon;

  @NonNull
  public final TextView searchResultTitle;

  @NonNull
  public final TextView searchResultType;

  @Bindable
  protected SearchResultActionHandler mEventListener;

  @Bindable
  protected SearchResult mSearchResult;

  protected ItemSearchResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView searchResultIcon, TextView searchResultTitle, TextView searchResultType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.searchResultIcon = searchResultIcon;
    this.searchResultTitle = searchResultTitle;
    this.searchResultType = searchResultType;
  }

  public abstract void setEventListener(@Nullable SearchResultActionHandler eventListener);

  @Nullable
  public SearchResultActionHandler getEventListener() {
    return mEventListener;
  }

  public abstract void setSearchResult(@Nullable SearchResult searchResult);

  @Nullable
  public SearchResult getSearchResult() {
    return mSearchResult;
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSearchResultBinding>inflateInternal(inflater, R.layout.item_search_result, null, false, component);
  }

  public static ItemSearchResultBinding bind(@NonNull View view) {
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
  public static ItemSearchResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSearchResultBinding)bind(component, view, R.layout.item_search_result);
  }
}

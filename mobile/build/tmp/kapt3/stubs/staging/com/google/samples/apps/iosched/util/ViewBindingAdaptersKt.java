package com.google.samples.apps.iosched.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007\u001a\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0007\u001a$\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007\u001a$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007\u001a.\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u001a\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010\u001a\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0001\u001a\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020!H\u0007\u001a\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007\u001a\u001a\u0010\'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020*H\u0007\u001a$\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010-\u001a\u00020\u0007H\u0007\u001a\f\u0010.\u001a\u00020\u0007*\u00020\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"CHROME_PACKAGE", "", "clipToCircle", "", "view", "Landroid/view/View;", "clip", "", "fabVisibility", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "visible", "goneUnless", "imageUri", "imageView", "Landroid/widget/ImageView;", "Landroid/net/Uri;", "placeholder", "Landroid/graphics/drawable/Drawable;", "imageUrl", "momentImageUrl", "momentImageUrlDarkTheme", "momentTheme", "Lcom/google/samples/apps/iosched/model/Theme;", "openWebsiteUri", "context", "Landroid/content/Context;", "uri", "openWebsiteUrl", "url", "pageMargin", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "", "setSwipeRefreshColors", "swipeRefreshLayout", "Lcom/google/samples/apps/iosched/widget/CustomSwipeRefreshLayout;", "colorResIds", "", "setText", "Landroid/widget/TextView;", "resId", "", "websiteLink", "button", "hideWhenEmpty", "isChromeCustomTabsSupported", "mobile_staging"})
public final class ViewBindingAdaptersKt {
    private static final java.lang.String CHROME_PACKAGE = "com.android.chrome";
    
    @androidx.databinding.BindingAdapter(value = {"goneUnless"})
    public static final void goneUnless(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"fabVisibility"})
    public static final void fabVisibility(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton fab, boolean visible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"pageMargin"})
    public static final void pageMargin(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager viewPager, float pageMargin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"clipToCircle"})
    public static final void clipToCircle(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean clip) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"momentImageUrl", "momentImageUrlDarkTheme", "momentTheme"})
    public static final void momentImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String momentImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String momentImageUrlDarkTheme, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Theme momentTheme) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"imageUri", "placeholder"})
    public static final void imageUri(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"imageUrl", "placeholder"})
    public static final void imageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    /**
     * Sets the colors of the [CustomSwipeRefreshLayout] loading indicator.
     */
    @androidx.databinding.BindingAdapter(value = {"swipeRefreshColors"})
    public static final void setSwipeRefreshColors(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.widget.CustomSwipeRefreshLayout swipeRefreshLayout, @org.jetbrains.annotations.NotNull()
    int[] colorResIds) {
    }
    
    /**
     * Set text on a [TextView] from a string resource.
     */
    @androidx.databinding.BindingAdapter(value = {"android:text"})
    public static final void setText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @androidx.annotation.StringRes()
    int resId) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"websiteLink", "hideWhenEmpty"})
    public static final void websiteLink(@org.jetbrains.annotations.NotNull()
    android.view.View button, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean hideWhenEmpty) {
    }
    
    public static final void openWebsiteUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void openWebsiteUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    private static final boolean isChromeCustomTabsSupported(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isChromeCustomTabsSupported) {
        return false;
    }
}
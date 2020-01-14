package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a8\u0006\u0018"}, d2 = {"setProfileAvatar", "", "context", "Landroid/content/Context;", "target", "Lcom/bumptech/glide/request/target/Target;", "Landroid/graphics/drawable/Drawable;", "imageUri", "Landroid/net/Uri;", "placeholder", "", "setProfileContentDescription", "item", "Landroid/view/MenuItem;", "res", "Landroid/content/res/Resources;", "user", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "setupProfileMenuItem", "Landroidx/appcompat/widget/Toolbar;", "viewModel", "Lcom/google/samples/apps/iosched/ui/MainActivityViewModel;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "mobile_staging"})
public final class SignInViewExtensionsKt {
    
    public static final void setupProfileMenuItem(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar $this$setupProfileMenuItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.MainActivityViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    public static final void setProfileContentDescription(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item, @org.jetbrains.annotations.NotNull()
    android.content.res.Resources res, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo user) {
    }
    
    public static final void setProfileAvatar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.target.Target<android.graphics.drawable.Drawable> target, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, int placeholder) {
    }
}
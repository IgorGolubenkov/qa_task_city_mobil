package com.google.samples.apps.iosched.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00ba\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u001a>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016\u001aP\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u001a0\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00182\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u00190\u001e\u001aj\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010\u001f\"\u0004\b\u0003\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u001a0\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00182\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\u00190\"\u001a*\u0010#\u001a\u00020\u0016\"\u0004\b\u0000\u0010$*\b\u0012\u0004\u0012\u0002H$0%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00160\'\u001a*\u0010(\u001a\u00020)*\u00020\u00032\u001e\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020)0\"\u001a5\u0010,\u001a\u00020)\"\b\b\u0000\u0010$*\u00020-*\u0002H$2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020)0\'\u00a2\u0006\u0002\b/H\u0086\b\u00a2\u0006\u0002\u00100\u001a\u0014\u00101\u001a\u00020\u0005*\u0002022\b\b\u0001\u00103\u001a\u00020\u0010\u001a\u0012\u00104\u001a\u00020\u0016*\u0002052\u0006\u0010\u001c\u001a\u000205\u001a\n\u00106\u001a\u00020\u0016*\u00020\u0010\u001a\n\u00107\u001a\u00020\u0016*\u00020\u0003\u001a\u0012\u00108\u001a\u00020\f*\u00020\f2\u0006\u00109\u001a\u00020:\u001a\u0012\u0010;\u001a\u00020)*\u00020<2\u0006\u0010=\u001a\u00020>\u001a\n\u0010?\u001a\u00020@*\u00020@\u001a\n\u0010A\u001a\u00020)*\u00020\u0003\u001a\f\u0010B\u001a\u00020\u0016*\u00020CH\u0007\u001a\n\u0010D\u001a\u00020\u0010*\u00020\n\u001a\n\u0010E\u001a\u00020@*\u00020@\u001a\n\u0010F\u001a\u00020:*\u00020:\u001a\u0014\u0010G\u001a\u00020)*\u00020H2\u0006\u0010I\u001a\u00020JH\u0007\u001a\n\u0010K\u001a\u00020:*\u00020:\u00a8\u0006L"}, d2 = {"createStateForView", "Lcom/google/samples/apps/iosched/util/ViewPaddingState;", "view", "Landroid/view/View;", "lerp", "", "a", "b", "t", "newStaticLayout", "Landroid/text/StaticLayout;", "source", "", "paint", "Landroid/text/TextPaint;", "width", "", "alignment", "Landroid/text/Layout$Alignment;", "spacingmult", "spacingadd", "includepad", "", "combine", "Landroidx/lifecycle/LiveData;", "Result", "A", "B", "other", "combiner", "Lkotlin/Function2;", "C", "other1", "other2", "Lkotlin/Function3;", "compatRemoveIf", "T", "", "predicate", "Lkotlin/Function1;", "doOnApplyWindowInsets", "", "f", "Landroidx/core/view/WindowInsetsCompat;", "executeAfter", "Landroidx/databinding/ViewDataBinding;", "block", "Lkotlin/ExtensionFunctionType;", "(Landroidx/databinding/ViewDataBinding;Lkotlin/jvm/functions/Function1;)V", "getFloatUsingCompat", "Landroid/content/res/Resources;", "resId", "hasSameValue", "Landroidx/databinding/ObservableBoolean;", "isEven", "isRtl", "makeBold", "boldText", "", "postponeEnterTransition", "Ldagger/android/support/DaggerFragment;", "timeout", "", "quoteSsidAndPassword", "Landroid/net/wifi/WifiConfiguration;", "requestApplyInsetsWhenAttached", "shouldCloseDrawerFromBackPress", "Landroidx/drawerlayout/widget/DrawerLayout;", "textWidth", "unquoteSsidAndPassword", "unwrapQuotes", "updateForTheme", "Landroidx/appcompat/app/AppCompatActivity;", "theme", "Lcom/google/samples/apps/iosched/model/Theme;", "wrapInQuotes", "mobile_debug"})
public final class ExtensionsKt {
    
    public static final boolean hasSameValue(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean $this$hasSameValue, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean other) {
        return false;
    }
    
    public static final boolean isEven(int $this$isEven) {
        return false;
    }
    
    public static final boolean isRtl(@org.jetbrains.annotations.NotNull()
    android.view.View $this$isRtl) {
        return false;
    }
    
    public static final <T extends androidx.databinding.ViewDataBinding>void executeAfter(@org.jetbrains.annotations.NotNull()
    T $this$executeAfter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
    }
    
    /**
     * An extension to `postponeEnterTransition` which will resume after a timeout.
     */
    public static final void postponeEnterTransition(@org.jetbrains.annotations.NotNull()
    dagger.android.support.DaggerFragment $this$postponeEnterTransition, long timeout) {
    }
    
    /**
     * Calculated the widest line in a [StaticLayout].
     */
    public static final int textWidth(@org.jetbrains.annotations.NotNull()
    android.text.StaticLayout $this$textWidth) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.text.StaticLayout newStaticLayout(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence source, @org.jetbrains.annotations.NotNull()
    android.text.TextPaint paint, int width, @org.jetbrains.annotations.NotNull()
    android.text.Layout.Alignment alignment, float spacingmult, float spacingadd, boolean includepad) {
        return null;
    }
    
    /**
     * Linearly interpolate between two values.
     */
    public static final float lerp(float a, float b, float t) {
        return 0.0F;
    }
    
    /**
     * Alternative to Resources.getDimension() for values that are TYPE_FLOAT.
     */
    public static final float getFloatUsingCompat(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources $this$getFloatUsingCompat, @androidx.annotation.DimenRes()
    int resId) {
        return 0.0F;
    }
    
    /**
     * Return the Wifi config wrapped in quotes.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.net.wifi.WifiConfiguration quoteSsidAndPassword(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiConfiguration $this$quoteSsidAndPassword) {
        return null;
    }
    
    /**
     * Return the Wifi config without quotes.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.net.wifi.WifiConfiguration unquoteSsidAndPassword(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiConfiguration $this$unquoteSsidAndPassword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String wrapInQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$wrapInQuotes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String unwrapQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$unwrapQuotes) {
        return null;
    }
    
    /**
     * Make the first instance of [boldText] in a CharSequece bold.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence makeBold(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence $this$makeBold, @org.jetbrains.annotations.NotNull()
    java.lang.String boldText) {
        return null;
    }
    
    /**
     * Having to suppress lint. Bug raised: 128789886
     */
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    public static final void updateForTheme(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$updateForTheme, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Theme theme) {
    }
    
    /**
     * Combines this [LiveData] with another [LiveData] using the specified [combiner] and returns the
     * result as a [LiveData].
     */
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object, Result extends java.lang.Object>androidx.lifecycle.LiveData<Result> combine(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<A> $this$combine, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<B> other, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super B, ? extends Result> combiner) {
        return null;
    }
    
    /**
     * Combines this [LiveData] with other two [LiveData]s using the specified [combiner] and returns
     * the result as a [LiveData].
     */
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, Result extends java.lang.Object>androidx.lifecycle.LiveData<Result> combine(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<A> $this$combine, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<B> other1, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<C> other2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends Result> combiner) {
        return null;
    }
    
    public static final void doOnApplyWindowInsets(@org.jetbrains.annotations.NotNull()
    android.view.View $this$doOnApplyWindowInsets, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super androidx.core.view.WindowInsetsCompat, ? super com.google.samples.apps.iosched.util.ViewPaddingState, kotlin.Unit> f) {
    }
    
    /**
     * Call [View.requestApplyInsets] in a safe away. If we're attached it calls it straight-away.
     * If not it sets an [View.OnAttachStateChangeListener] and waits to be attached before calling
     * [View.requestApplyInsets].
     */
    public static final void requestApplyInsetsWhenAttached(@org.jetbrains.annotations.NotNull()
    android.view.View $this$requestApplyInsetsWhenAttached) {
    }
    
    private static final com.google.samples.apps.iosched.util.ViewPaddingState createStateForView(android.view.View view) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    public static final boolean shouldCloseDrawerFromBackPress(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout $this$shouldCloseDrawerFromBackPress) {
        return false;
    }
    
    /**
     * Compatibility removeIf since it was added in API 24
     */
    public static final <T extends java.lang.Object>boolean compatRemoveIf(@org.jetbrains.annotations.NotNull()
    java.util.Collection<T> $this$compatRemoveIf, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        return false;
    }
}
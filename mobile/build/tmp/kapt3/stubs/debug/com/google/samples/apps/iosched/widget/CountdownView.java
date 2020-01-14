package com.google.samples.apps.iosched.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00029:B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u00106\u001a\u000207H\u0014J\b\u00108\u001a\u000207H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R+\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R+\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R+\u0010\"\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R+\u0010&\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b\'\u0010\u0011\"\u0004\b(\u0010\u0013R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010,\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b/\u0010\u0015\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R+\u00100\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010\u0015\u001a\u0004\b1\u0010\u0011\"\u0004\b2\u0010\u0013R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CountdownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compositions", "Lcom/google/samples/apps/iosched/widget/CompositionSet;", "conferenceStart", "Lorg/threeten/bp/ZonedDateTime;", "kotlin.jvm.PlatformType", "<set-?>", "days1", "getDays1", "()I", "setDays1", "(I)V", "days1$delegate", "Lcom/google/samples/apps/iosched/widget/CountdownView$AnimateDigitDelegate;", "days2", "getDays2", "setDays2", "days2$delegate", "hours1", "getHours1", "setHours1", "hours1$delegate", "hours2", "getHours2", "setHours2", "hours2$delegate", "mins1", "getMins1", "setMins1", "mins1$delegate", "mins2", "getMins2", "setMins2", "mins2$delegate", "root", "Landroid/view/View;", "secs1", "getSecs1", "setSecs1", "secs1$delegate", "secs2", "getSecs2", "setSecs2", "secs2$delegate", "updateTime", "Ljava/lang/Runnable;", "onAttachedToWindow", "", "onDetachedFromWindow", "AnimateDigitDelegate", "Countdown", "mobile_debug"})
public final class CountdownView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.google.samples.apps.iosched.widget.CompositionSet compositions = null;
    private final android.view.View root = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate days1$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate days2$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate hours1$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate hours2$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate mins1$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate mins2$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate secs1$delegate = null;
    private final com.google.samples.apps.iosched.widget.CountdownView.AnimateDigitDelegate secs2$delegate = null;
    private final org.threeten.bp.ZonedDateTime conferenceStart = null;
    private final java.lang.Runnable updateTime = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getDays1() {
        return 0;
    }
    
    private final void setDays1(int p0) {
    }
    
    private final int getDays2() {
        return 0;
    }
    
    private final void setDays2(int p0) {
    }
    
    private final int getHours1() {
        return 0;
    }
    
    private final void setHours1(int p0) {
    }
    
    private final int getHours2() {
        return 0;
    }
    
    private final void setHours2(int p0) {
    }
    
    private final int getMins1() {
        return 0;
    }
    
    private final void setMins1(int p0) {
    }
    
    private final int getMins2() {
        return 0;
    }
    
    private final void setMins2(int p0) {
    }
    
    private final int getSecs1() {
        return 0;
    }
    
    private final void setSecs1(int p0) {
    }
    
    private final int getSecs2() {
        return 0;
    }
    
    private final void setSecs2(int p0) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public CountdownView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public CountdownView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CountdownView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CountdownView$Countdown;", "", "days", "", "hours", "minutes", "seconds", "(IIII)V", "getDays", "()I", "getHours", "getMinutes", "getSeconds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "mobile_debug"})
    public static final class Countdown {
        private final int days = 0;
        private final int hours = 0;
        private final int minutes = 0;
        private final int seconds = 0;
        public static final com.google.samples.apps.iosched.widget.CountdownView.Countdown.Companion Companion = null;
        
        public final int getDays() {
            return 0;
        }
        
        public final int getHours() {
            return 0;
        }
        
        public final int getMinutes() {
            return 0;
        }
        
        public final int getSeconds() {
            return 0;
        }
        
        public Countdown(int days, int hours, int minutes, int seconds) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.widget.CountdownView.Countdown copy(int days, int hours, int minutes, int seconds) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CountdownView$Countdown$Companion;", "", "()V", "until", "Lcom/google/samples/apps/iosched/widget/CountdownView$Countdown;", "time", "Lorg/threeten/bp/ZonedDateTime;", "mobile_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.google.samples.apps.iosched.widget.CountdownView.Countdown until(@org.jetbrains.annotations.NotNull()
            org.threeten.bp.ZonedDateTime time) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * A delegate who upon receiving a new value, runs animations on a view obtained from
     * [viewProvider]
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/widget/CountdownView$AnimateDigitDelegate;", "Lkotlin/properties/ObservableProperty;", "", "compositions", "Lcom/google/samples/apps/iosched/widget/CompositionSet;", "viewProvider", "Lkotlin/Function0;", "Lcom/airbnb/lottie/LottieAnimationView;", "(Lcom/google/samples/apps/iosched/widget/CompositionSet;Lkotlin/jvm/functions/Function0;)V", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "mobile_debug"})
    static final class AnimateDigitDelegate extends kotlin.properties.ObservableProperty<java.lang.Integer> {
        private final com.google.samples.apps.iosched.widget.CompositionSet compositions = null;
        private final kotlin.jvm.functions.Function0<com.airbnb.lottie.LottieAnimationView> viewProvider = null;
        
        @java.lang.Override()
        protected void afterChange(@org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property, int oldValue, int newValue) {
        }
        
        public AnimateDigitDelegate(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.widget.CompositionSet compositions, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends com.airbnb.lottie.LottieAnimationView> viewProvider) {
            super(null);
        }
    }
}
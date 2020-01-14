package com.google.samples.apps.iosched.ui.onboarding;

import java.lang.System;

/**
 * Helper class for automatically scrolling pages of a [ViewPager] which does not allow you to
 * customize the speed at which it changes page when directly setting the current page.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/onboarding/ViewPagerPager;", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "(Landroidx/viewpager/widget/ViewPager;)V", "fastOutSlowIn", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "advance", "", "Companion", "mobile_staging"})
public final class ViewPagerPager {
    private final android.view.animation.Interpolator fastOutSlowIn = null;
    private final androidx.viewpager.widget.ViewPager viewPager = null;
    private static final long PAGE_CHANGE_DURATION = 400L;
    private static final long MULTI_PAGE_CHANGE_DURATION = 600L;
    public static final com.google.samples.apps.iosched.ui.onboarding.ViewPagerPager.Companion Companion = null;
    
    public final void advance() {
    }
    
    public ViewPagerPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager viewPager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/onboarding/ViewPagerPager$Companion;", "", "()V", "MULTI_PAGE_CHANGE_DURATION", "", "PAGE_CHANGE_DURATION", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
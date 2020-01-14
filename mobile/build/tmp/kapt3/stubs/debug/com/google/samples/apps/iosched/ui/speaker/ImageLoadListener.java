package com.google.samples.apps.iosched.ui.speaker;

import java.lang.System;

/**
 * An interface for responding to image loading completion.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/ui/speaker/ImageLoadListener;", "", "onImageLoadFailed", "", "onImageLoaded", "mobile_debug"})
public abstract interface ImageLoadListener {
    
    public abstract void onImageLoaded();
    
    public abstract void onImageLoadFailed();
}
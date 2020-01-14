package com.google.samples.apps.iosched.ui.speaker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\b"}, d2 = {"speakerImage", "", "imageView", "Landroid/widget/ImageView;", "speaker", "Lcom/google/samples/apps/iosched/model/Speaker;", "listener", "Lcom/google/samples/apps/iosched/ui/speaker/ImageLoadListener;", "mobile_debug"})
public final class SpeakerBindingAdaptersKt {
    
    /**
     * Loads a [Speaker]'s photo or picks a default avatar if no photo is specified.
     */
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"speakerImage", "listener"})
    public static final void speakerImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Speaker speaker, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.ui.speaker.ImageLoadListener listener) {
    }
}
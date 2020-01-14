package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * [RecyclerView.ViewHolder] types used by this adapter.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "HeaderViewHolder", "RelatedViewHolder", "SessionInfoViewHolder", "SpeakerViewHolder", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$SessionInfoViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$SpeakerViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$RelatedViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$HeaderViewHolder;", "mobile_debug"})
public abstract class SessionDetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    private SessionDetailViewHolder(android.view.View itemView) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$SessionInfoViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemSessionInfoBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemSessionInfoBinding;)V", "getBinding", "()Lcom/google/samples/apps/iosched/databinding/ItemSessionInfoBinding;", "mobile_debug"})
    public static final class SessionInfoViewHolder extends com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.databinding.ItemSessionInfoBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.databinding.ItemSessionInfoBinding getBinding() {
            return null;
        }
        
        public SessionInfoViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemSessionInfoBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$SpeakerViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemSpeakerBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemSpeakerBinding;)V", "getBinding", "()Lcom/google/samples/apps/iosched/databinding/ItemSpeakerBinding;", "mobile_debug"})
    public static final class SpeakerViewHolder extends com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.databinding.ItemSpeakerBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.databinding.ItemSpeakerBinding getBinding() {
            return null;
        }
        
        public SpeakerViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemSpeakerBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$RelatedViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemSessionBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemSessionBinding;)V", "getBinding", "()Lcom/google/samples/apps/iosched/databinding/ItemSessionBinding;", "mobile_debug"})
    public static final class RelatedViewHolder extends com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.databinding.ItemSessionBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.databinding.ItemSessionBinding getBinding() {
            return null;
        }
        
        public RelatedViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemSessionBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder$HeaderViewHolder;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;", "(Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;)V", "getBinding", "()Lcom/google/samples/apps/iosched/databinding/ItemGenericSectionHeaderBinding;", "mobile_debug"})
    public static final class HeaderViewHolder extends com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding getBinding() {
            return null;
        }
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ItemGenericSectionHeaderBinding binding) {
            super(null);
        }
    }
}
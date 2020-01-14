package com.google.samples.apps.iosched.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"searchResultIcon", "", "imageView", "Landroid/widget/ImageView;", "type", "Lcom/google/samples/apps/iosched/ui/search/SearchResultType;", "searchResultItems", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/google/samples/apps/iosched/ui/search/SearchResult;", "searchViewModel", "Lcom/google/samples/apps/iosched/ui/search/SearchViewModel;", "mobile_staging"})
public final class SearchBindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"searchResultIcon"})
    public static final void searchResultIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.search.SearchResultType type) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"searchResultItems", "searchViewModel"})
    public static final void searchResultItems(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult> list, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.search.SearchViewModel searchViewModel) {
    }
}
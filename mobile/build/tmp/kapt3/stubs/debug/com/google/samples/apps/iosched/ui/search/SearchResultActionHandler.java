package com.google.samples.apps.iosched.ui.search;

import java.lang.System;

/**
 * Actions that can be performed on a [SearchResult]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/search/SearchResultActionHandler;", "", "openSearchResult", "", "searchResult", "Lcom/google/samples/apps/iosched/ui/search/SearchResult;", "mobile_debug"})
public abstract interface SearchResultActionHandler {
    
    public abstract void openSearchResult(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.search.SearchResult searchResult);
}
package com.google.samples.apps.iosched.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020(H\u0002J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0010J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0017H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00140\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u001c0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR!\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00120\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR!\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00140\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0012\u0010&\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/google/samples/apps/iosched/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/search/SearchResultActionHandler;", "analyticsHelper", "Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;", "loadSearchResultsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/search/SearchUseCase;", "loadDbSearchResultsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/search/SearchDbUseCase;", "(Lcom/google/samples/apps/iosched/shared/analytics/AnalyticsHelper;Lcom/google/samples/apps/iosched/shared/domain/search/SearchUseCase;Lcom/google/samples/apps/iosched/shared/domain/search/SearchDbUseCase;)V", "_isEmpty", "Landroidx/lifecycle/MediatorLiveData;", "", "_navigateToCodelabAction", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "", "_navigateToSessionAction", "Lcom/google/samples/apps/iosched/model/SessionId;", "_navigateToSpeakerAction", "Lcom/google/samples/apps/iosched/model/SpeakerId;", "_searchResults", "", "Lcom/google/samples/apps/iosched/ui/search/SearchResult;", "isEmpty", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "loadSearchResults", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/search/Searchable;", "navigateToCodelabAction", "getNavigateToCodelabAction", "navigateToSessionAction", "getNavigateToSessionAction", "navigateToSpeakerAction", "getNavigateToSpeakerAction", "searchResults", "getSearchResults", "searchUsingRoomFeatureEnabled", "executeSearch", "", "query", "onQueryCleared", "onSearchQueryChanged", "newQuery", "openSearchResult", "searchResult", "mobile_staging"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.search.SearchResultActionHandler {
    @com.google.samples.apps.iosched.shared.di.SearchUsingRoomEnabledFlag()
    @javax.inject.Inject()
    public boolean searchUsingRoomFeatureEnabled;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSessionAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToSessionAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToSpeakerAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToSpeakerAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> _navigateToCodelabAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> navigateToCodelabAction = null;
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.shared.domain.search.Searchable>>> loadSearchResults = null;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>> _searchResults = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>> searchResults = null;
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> _isEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private final com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper = null;
    private final com.google.samples.apps.iosched.shared.domain.search.SearchUseCase loadSearchResultsUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.search.SearchDbUseCase loadDbSearchResultsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToSpeakerAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.String>> getNavigateToCodelabAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.search.SearchResult>> getSearchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    @java.lang.Override()
    public void openSearchResult(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.search.SearchResult searchResult) {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String newQuery) {
    }
    
    private final void executeSearch(java.lang.String query) {
    }
    
    private final void onQueryCleared() {
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper analyticsHelper, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.SearchUseCase loadSearchResultsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.SearchDbUseCase loadDbSearchResultsUseCase) {
        super();
    }
}
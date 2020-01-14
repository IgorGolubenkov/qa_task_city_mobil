package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

/**
 * Use case that loads a list of [TagFilter]s for the schedule filters UI.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/LoadEventFiltersUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "Lcom/google/samples/apps/iosched/shared/schedule/UserSessionMatcher;", "", "Lcom/google/samples/apps/iosched/ui/schedule/filters/EventFilter;", "tagRepository", "Lcom/google/samples/apps/iosched/shared/data/tag/TagRepository;", "(Lcom/google/samples/apps/iosched/shared/data/tag/TagRepository;)V", "execute", "parameters", "interleaveSort", "Lcom/google/samples/apps/iosched/model/Tag;", "tags", "mobile_debug"})
public class LoadEventFiltersUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<com.google.samples.apps.iosched.shared.schedule.UserSessionMatcher, java.util.List<? extends com.google.samples.apps.iosched.ui.schedule.filters.EventFilter>> {
    private final com.google.samples.apps.iosched.shared.data.tag.TagRepository tagRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.List<com.google.samples.apps.iosched.ui.schedule.filters.EventFilter> execute(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.schedule.UserSessionMatcher parameters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Tag> interleaveSort(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Tag> tags) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadEventFiltersUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.tag.TagRepository tagRepository) {
        super();
    }
}
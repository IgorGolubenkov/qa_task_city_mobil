package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\'\u001a\u00020(H\u0096\u0001J\t\u0010)\u001a\u00020(H\u0096\u0001J\u000b\u0010*\u001a\u0004\u0018\u00010\nH\u0096\u0001J\t\u0010+\u001a\u00020#H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\rH\u0096\u0001J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0\rH\u0096\u0001J\u0012\u0010/\u001a\u00020(2\n\u00100\u001a\u00060\nj\u0002`\u000bJ\u001a\u00101\u001a\u00020(2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020403R\u0016\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0010\u00a8\u00066"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "signInViewModelDelegate", "loadUserSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;", "feedbackUseCase", "Lcom/google/samples/apps/iosched/shared/domain/users/FeedbackUseCase;", "(Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;Lcom/google/samples/apps/iosched/shared/domain/users/FeedbackUseCase;)V", "_sessionId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "getCurrentUserInfo", "loadUserSessionResult", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "performSignInEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "questions", "", "Lcom/google/samples/apps/iosched/ui/sessiondetail/Question;", "getQuestions", "shouldShowNotificationsPrefAction", "", "getShouldShowNotificationsPrefAction", "title", "getTitle", "emitSignInRequest", "", "emitSignOutRequest", "getUserId", "isRegistered", "isSignedIn", "observeRegisteredUser", "observeSignedInUser", "setSessionId", "sessionId", "submit", "feedbackUpdates", "", "", "Companion", "mobile_staging"})
public final class SessionFeedbackViewModel extends androidx.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    private java.lang.String _sessionId;
    private final androidx.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> loadUserSessionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.sessiondetail.Question>> questions = null;
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase feedbackUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> MESSAGES = null;
    public static final com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.google.samples.apps.iosched.ui.sessiondetail.Question>> getQuestions() {
        return null;
    }
    
    public final void setSessionId(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
    }
    
    public final void submit(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> feedbackUpdates) {
    }
    
    @javax.inject.Inject()
    public SessionFeedbackViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate signInViewModelDelegate, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase loadUserSessionUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.FeedbackUseCase feedbackUseCase) {
        super();
    }
    
    /**
     * Live updated value of the current firebase users image url
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    /**
     * Live updated value of the current firebase user
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    /**
     * Emits Events when a sign-in event should be attempted
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    /**
     * Emits an non-null Event when the dialog to ask the user notifications preference should be
     * shown.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-in
     */
    @java.lang.Override()
    public void emitSignInRequest() {
    }
    
    /**
     * Emit an Event on performSignInEvent to request sign-out
     */
    @java.lang.Override()
    public void emitSignOutRequest() {
    }
    
    /**
     * Returns the current user ID or null if not available.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackViewModel$Companion;", "", "()V", "MESSAGES", "", "", "Lkotlin/Triple;", "", "getMESSAGES", "()Ljava/util/Map;", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> getMESSAGES() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.Feature;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class UserMe extends UserProfile {
    public static final int $stable = 8;
    private final Feature.Capabilities capabilities;
    private final int latestLiveStartedAt;
    private final String liveThumbnailImageUrl;
    private final OnboardingLiveGame onboardingLiveGame;
    @b(BooleanTypeAdapter.class)
    private final boolean purchaseContinuousLiveHolidayEnabled;
    private final long purchaseContinuousLiveHolidayEnabledAt;
    private final int purchaseContinuousLiveHolidayRequiredCoin;
    @b(BooleanTypeAdapter.class)
    private final boolean shouldShowDemographicForm;
    private final int usedContinuousStreamHolidaysNum;
    private final int userAvatarPartsNum;

    public UserMe() {
        this(null, null, 0, false, false, 0L, 0, 0, 0, null, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
    }

    public /* synthetic */ UserMe(Feature.Capabilities capabilities, String str, int i10, boolean z10, boolean z11, long j10, int i11, int i12, int i13, OnboardingLiveGame onboardingLiveGame, int i14, h hVar) {
        this((i14 & 1) != 0 ? null : capabilities, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i10, (i14 & 8) != 0 ? false : z10, (i14 & 16) != 0 ? false : z11, (i14 & 32) != 0 ? 0L : j10, (i14 & 64) != 0 ? 0 : i11, (i14 & 128) != 0 ? 0 : i12, (i14 & 256) == 0 ? i13 : 0, (i14 & 512) == 0 ? onboardingLiveGame : null);
    }

    public final Feature.Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final int getLatestLiveStartedAt() {
        return this.latestLiveStartedAt;
    }

    public final String getLiveThumbnailImageUrl() {
        return this.liveThumbnailImageUrl;
    }

    public final OnboardingLiveGame getOnboardingLiveGame() {
        return this.onboardingLiveGame;
    }

    public final boolean getPurchaseContinuousLiveHolidayEnabled() {
        return this.purchaseContinuousLiveHolidayEnabled;
    }

    public final long getPurchaseContinuousLiveHolidayEnabledAt() {
        return this.purchaseContinuousLiveHolidayEnabledAt;
    }

    public final int getPurchaseContinuousLiveHolidayRequiredCoin() {
        return this.purchaseContinuousLiveHolidayRequiredCoin;
    }

    public final boolean getShouldShowDemographicForm() {
        return this.shouldShowDemographicForm;
    }

    public final int getUsedContinuousStreamHolidaysNum() {
        return this.usedContinuousStreamHolidaysNum;
    }

    public final int getUserAvatarPartsNum() {
        return this.userAvatarPartsNum;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMe(Feature.Capabilities capabilities, String str, int i10, boolean z10, boolean z11, long j10, int i11, int i12, int i13, OnboardingLiveGame onboardingLiveGame) {
        super(null, 0, null, null, 0, 0, 0, null, null, 0, null, null, 0, 0, null, false, null, 0, false, null, 0, null, null, null, null, false, null, null, false, 536870911, null);
        p.h(str, "liveThumbnailImageUrl");
        this.capabilities = capabilities;
        this.liveThumbnailImageUrl = str;
        this.userAvatarPartsNum = i10;
        this.shouldShowDemographicForm = z10;
        this.purchaseContinuousLiveHolidayEnabled = z11;
        this.purchaseContinuousLiveHolidayEnabledAt = j10;
        this.purchaseContinuousLiveHolidayRequiredCoin = i11;
        this.usedContinuousStreamHolidaysNum = i12;
        this.latestLiveStartedAt = i13;
        this.onboardingLiveGame = onboardingLiveGame;
    }
}

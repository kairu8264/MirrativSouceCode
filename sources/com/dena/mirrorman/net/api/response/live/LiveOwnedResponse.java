package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import com.google.android.exoplayer2.C;
import java.util.List;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public class LiveOwnedResponse extends LiveDetailParams {
    public static final int $stable = 8;
    private int adaptiveBitrateAvailable;
    private AppUserDetailResponse appUserDetail;
    private final LiveOwnedBitrateControlParams bitrateControlParams;
    private LiveOwnedCustomResolutions customResolutions;
    private final LiveOwnedCustomVideoBitrate customVideoBitrates;
    @b(BooleanTypeAdapter.class)
    private Boolean highQualityAvailable;
    @b(BooleanTypeAdapter.class)
    private final boolean isMatchingCollabEnabled;
    private final String matchingCollabEnabledText;
    private int projectionUseDisplaySize;
    private final RequestPackageUsageStats requestPackageUsageStats;
    private final Status status;
    private String streamingKey;
    private String streamingUploadUrl2;
    private String streamingUploadUrl3;
    private List<StunServer> stunServers;
    private List<TurnServer> turnServers;
    private final boolean userMatchingCollabEnabled;

    public LiveOwnedResponse() {
        this(null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, null, 131071, null);
    }

    public /* synthetic */ LiveOwnedResponse(Status status, String str, String str2, String str3, List list, List list2, Boolean bool, int i10, int i11, LiveOwnedCustomResolutions liveOwnedCustomResolutions, AppUserDetailResponse appUserDetailResponse, boolean z10, boolean z11, RequestPackageUsageStats requestPackageUsageStats, String str4, LiveOwnedCustomVideoBitrate liveOwnedCustomVideoBitrate, LiveOwnedBitrateControlParams liveOwnedBitrateControlParams, int i12, h hVar) {
        this((i12 & 1) != 0 ? Status.Companion.createEmptyStatus() : status, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : list2, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? 0 : i10, (i12 & 256) != 0 ? 0 : i11, (i12 & 512) != 0 ? null : liveOwnedCustomResolutions, (i12 & 1024) != 0 ? null : appUserDetailResponse, (i12 & 2048) != 0 ? true : z10, (i12 & 4096) == 0 ? z11 : false, (i12 & 8192) != 0 ? null : requestPackageUsageStats, (i12 & 16384) != 0 ? null : str4, (i12 & 32768) != 0 ? null : liveOwnedCustomVideoBitrate, (i12 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : liveOwnedBitrateControlParams);
    }

    public final int getAdaptiveBitrateAvailable() {
        return this.adaptiveBitrateAvailable;
    }

    public final AppUserDetailResponse getAppUserDetail() {
        return this.appUserDetail;
    }

    public final LiveOwnedBitrateControlParams getBitrateControlParams() {
        return this.bitrateControlParams;
    }

    public final LiveOwnedCustomResolutions getCustomResolutions() {
        return this.customResolutions;
    }

    public final LiveOwnedCustomVideoBitrate getCustomVideoBitrates() {
        return this.customVideoBitrates;
    }

    public final Boolean getHighQualityAvailable() {
        return this.highQualityAvailable;
    }

    public final String getMatchingCollabEnabledText() {
        return this.matchingCollabEnabledText;
    }

    public final int getProjectionUseDisplaySize() {
        return this.projectionUseDisplaySize;
    }

    public final RequestPackageUsageStats getRequestPackageUsageStats() {
        return this.requestPackageUsageStats;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStreamingKey() {
        return this.streamingKey;
    }

    public final String getStreamingUploadUrl2() {
        return this.streamingUploadUrl2;
    }

    public final String getStreamingUploadUrl3() {
        return this.streamingUploadUrl3;
    }

    public final List<StunServer> getStunServers() {
        return this.stunServers;
    }

    public final List<TurnServer> getTurnServers() {
        return this.turnServers;
    }

    public final boolean getUserMatchingCollabEnabled() {
        return this.userMatchingCollabEnabled;
    }

    public final boolean isMatchingCollabEnabled() {
        return this.isMatchingCollabEnabled;
    }

    public final void setAdaptiveBitrateAvailable(int i10) {
        this.adaptiveBitrateAvailable = i10;
    }

    public final void setAppUserDetail(AppUserDetailResponse appUserDetailResponse) {
        this.appUserDetail = appUserDetailResponse;
    }

    public final void setCustomResolutions(LiveOwnedCustomResolutions liveOwnedCustomResolutions) {
        this.customResolutions = liveOwnedCustomResolutions;
    }

    public final void setHighQualityAvailable(Boolean bool) {
        this.highQualityAvailable = bool;
    }

    public final void setProjectionUseDisplaySize(int i10) {
        this.projectionUseDisplaySize = i10;
    }

    public final void setStreamingKey(String str) {
        this.streamingKey = str;
    }

    public final void setStreamingUploadUrl2(String str) {
        this.streamingUploadUrl2 = str;
    }

    public final void setStreamingUploadUrl3(String str) {
        this.streamingUploadUrl3 = str;
    }

    public final void setStunServers(List<StunServer> list) {
        this.stunServers = list;
    }

    public final void setTurnServers(List<TurnServer> list) {
        this.turnServers = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveOwnedResponse(Status status, String str, String str2, String str3, List<StunServer> list, List<TurnServer> list2, Boolean bool, int i10, int i11, LiveOwnedCustomResolutions liveOwnedCustomResolutions, AppUserDetailResponse appUserDetailResponse, boolean z10, boolean z11, RequestPackageUsageStats requestPackageUsageStats, String str4, LiveOwnedCustomVideoBitrate liveOwnedCustomVideoBitrate, LiveOwnedBitrateControlParams liveOwnedBitrateControlParams) {
        super(null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, false, null, 1073741823, null);
        p.h(status, "status");
        this.status = status;
        this.streamingUploadUrl2 = str;
        this.streamingUploadUrl3 = str2;
        this.streamingKey = str3;
        this.stunServers = list;
        this.turnServers = list2;
        this.highQualityAvailable = bool;
        this.adaptiveBitrateAvailable = i10;
        this.projectionUseDisplaySize = i11;
        this.customResolutions = liveOwnedCustomResolutions;
        this.appUserDetail = appUserDetailResponse;
        this.isMatchingCollabEnabled = z10;
        this.userMatchingCollabEnabled = z11;
        this.requestPackageUsageStats = requestPackageUsageStats;
        this.matchingCollabEnabledText = str4;
        this.customVideoBitrates = liveOwnedCustomVideoBitrate;
        this.bitrateControlParams = liveOwnedBitrateControlParams;
    }
}

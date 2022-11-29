package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.google.android.exoplayer2.C;
import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.b;

/* loaded from: classes2.dex */
public class UserBasicParams implements Serializable {
    public static final int $stable = 8;
    private final String ambassadorImageUrl;
    private final List<UserBadgeImageUrl> badges;
    private final String catalogLabelImageUrl;
    private final String description;
    private final int gradeId;
    @b(BooleanTypeAdapter.class)
    private final boolean hasAvatar;
    private final String headerImageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isAlreadySetHandoverCode;
    @b(BooleanTypeAdapter.class)
    private final boolean isCollaborating;
    @b(BooleanTypeAdapter.class)
    private final boolean isContinuousStreamer;
    private final int isNew;
    private final List<UserLink> links;
    private final int maxContinuousLiveHoliday;
    private final String name;
    private final String profileImageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean recordingEnabled;
    private final long registeredAt;
    private final List<RibbonResponse> ribbons;
    private final String userId;

    public UserBasicParams() {
        this(null, null, null, null, null, 0, null, null, null, null, null, 0, false, false, 0L, false, false, false, 0, 524287, null);
    }

    public UserBasicParams(String str, String str2, String str3, String str4, String str5, int i10, List<UserBadgeImageUrl> list, List<RibbonResponse> list2, String str6, String str7, List<UserLink> list3, int i11, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, int i12) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "profileImageUrl");
        p.h(str4, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str5, "headerImageUrl");
        p.h(list, "badges");
        p.h(list2, "ribbons");
        p.h(str6, "ambassadorImageUrl");
        this.userId = str;
        this.name = str2;
        this.profileImageUrl = str3;
        this.description = str4;
        this.headerImageUrl = str5;
        this.gradeId = i10;
        this.badges = list;
        this.ribbons = list2;
        this.ambassadorImageUrl = str6;
        this.catalogLabelImageUrl = str7;
        this.links = list3;
        this.isNew = i11;
        this.isContinuousStreamer = z10;
        this.isAlreadySetHandoverCode = z11;
        this.registeredAt = j10;
        this.hasAvatar = z12;
        this.isCollaborating = z13;
        this.recordingEnabled = z14;
        this.maxContinuousLiveHoliday = i12;
    }

    public final String getAmbassadorImageUrl() {
        return this.ambassadorImageUrl;
    }

    public final List<UserBadgeImageUrl> getBadges() {
        return this.badges;
    }

    public final String getCatalogLabelImageUrl() {
        return this.catalogLabelImageUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getGradeId() {
        return this.gradeId;
    }

    public final boolean getHasAvatar() {
        return this.hasAvatar;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final List<UserLink> getLinks() {
        return this.links;
    }

    public final int getMaxContinuousLiveHoliday() {
        return this.maxContinuousLiveHoliday;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final boolean getRecordingEnabled() {
        return this.recordingEnabled;
    }

    public final long getRegisteredAt() {
        return this.registeredAt;
    }

    public final List<RibbonResponse> getRibbons() {
        return this.ribbons;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isAlreadySetHandoverCode() {
        return this.isAlreadySetHandoverCode;
    }

    public final boolean isCollaborating() {
        return this.isCollaborating;
    }

    public final boolean isContinuousStreamer() {
        return this.isContinuousStreamer;
    }

    public final int isNew() {
        return this.isNew;
    }

    public /* synthetic */ UserBasicParams(String str, String str2, String str3, String str4, String str5, int i10, List list, List list2, String str6, String str7, List list3, int i11, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? s.k() : list, (i13 & 128) != 0 ? s.k() : list2, (i13 & 256) == 0 ? str6 : "", (i13 & 512) != 0 ? null : str7, (i13 & 1024) == 0 ? list3 : null, (i13 & 2048) != 0 ? 0 : i11, (i13 & 4096) != 0 ? false : z10, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) != 0 ? 0L : j10, (32768 & i13) != 0 ? false : z12, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z13, (i13 & 131072) != 0 ? false : z14, (i13 & 262144) != 0 ? 0 : i12);
    }
}

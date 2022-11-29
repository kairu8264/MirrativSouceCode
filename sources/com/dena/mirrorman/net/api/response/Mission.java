package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.h;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class Mission {
    public static final int $stable = 0;
    private final String description;
    private final boolean hasRewardDetail;

    /* renamed from: id  reason: collision with root package name */
    private final int f26157id;
    @c("status")
    @b(MissionStatusTypeAdapter.class)
    private final MissionStatus missionStatus;
    private final MissionProgressStatus progressStatus;
    private final String rewardAvatarPartTypeIconUrl;
    private final String rewardImageUrl;
    private final int rewardNum;
    private final String rewardText;
    private final String rewardTextDescription;
    private final String title;

    public Mission(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardText");
        p.h(missionStatus, "missionStatus");
        p.h(str5, "title");
        p.h(missionProgressStatus, "progressStatus");
        p.h(str6, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.f26157id = i10;
        this.rewardImageUrl = str;
        this.hasRewardDetail = z10;
        this.rewardText = str2;
        this.rewardAvatarPartTypeIconUrl = str3;
        this.rewardTextDescription = str4;
        this.rewardNum = i11;
        this.missionStatus = missionStatus;
        this.title = str5;
        this.progressStatus = missionProgressStatus;
        this.description = str6;
    }

    public final int component1() {
        return this.f26157id;
    }

    public final MissionProgressStatus component10() {
        return this.progressStatus;
    }

    public final String component11() {
        return this.description;
    }

    public final String component2() {
        return this.rewardImageUrl;
    }

    public final boolean component3() {
        return this.hasRewardDetail;
    }

    public final String component4() {
        return this.rewardText;
    }

    public final String component5() {
        return this.rewardAvatarPartTypeIconUrl;
    }

    public final String component6() {
        return this.rewardTextDescription;
    }

    public final int component7() {
        return this.rewardNum;
    }

    public final MissionStatus component8() {
        return this.missionStatus;
    }

    public final String component9() {
        return this.title;
    }

    public final Mission copy(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardText");
        p.h(missionStatus, "missionStatus");
        p.h(str5, "title");
        p.h(missionProgressStatus, "progressStatus");
        p.h(str6, MRLog.PAYLOAD_KEY_DESCRIPTION);
        return new Mission(i10, str, z10, str2, str3, str4, i11, missionStatus, str5, missionProgressStatus, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mission) {
            Mission mission = (Mission) obj;
            return this.f26157id == mission.f26157id && p.c(this.rewardImageUrl, mission.rewardImageUrl) && this.hasRewardDetail == mission.hasRewardDetail && p.c(this.rewardText, mission.rewardText) && p.c(this.rewardAvatarPartTypeIconUrl, mission.rewardAvatarPartTypeIconUrl) && p.c(this.rewardTextDescription, mission.rewardTextDescription) && this.rewardNum == mission.rewardNum && this.missionStatus == mission.missionStatus && p.c(this.title, mission.title) && p.c(this.progressStatus, mission.progressStatus) && p.c(this.description, mission.description);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasRewardDetail() {
        return this.hasRewardDetail;
    }

    public final int getId() {
        return this.f26157id;
    }

    public final MissionStatus getMissionStatus() {
        return this.missionStatus;
    }

    public final MissionProgressStatus getProgressStatus() {
        return this.progressStatus;
    }

    public final String getRewardAvatarPartTypeIconUrl() {
        return this.rewardAvatarPartTypeIconUrl;
    }

    public final String getRewardImageUrl() {
        return this.rewardImageUrl;
    }

    public final int getRewardNum() {
        return this.rewardNum;
    }

    public final String getRewardText() {
        return this.rewardText;
    }

    public final String getRewardTextDescription() {
        return this.rewardTextDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f26157id) * 31) + this.rewardImageUrl.hashCode()) * 31;
        boolean z10 = this.hasRewardDetail;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.rewardText.hashCode()) * 31;
        String str = this.rewardAvatarPartTypeIconUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rewardTextDescription;
        return ((((((((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.rewardNum)) * 31) + this.missionStatus.hashCode()) * 31) + this.title.hashCode()) * 31) + this.progressStatus.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "Mission(id=" + this.f26157id + ", rewardImageUrl=" + this.rewardImageUrl + ", hasRewardDetail=" + this.hasRewardDetail + ", rewardText=" + this.rewardText + ", rewardAvatarPartTypeIconUrl=" + this.rewardAvatarPartTypeIconUrl + ", rewardTextDescription=" + this.rewardTextDescription + ", rewardNum=" + this.rewardNum + ", missionStatus=" + this.missionStatus + ", title=" + this.title + ", progressStatus=" + this.progressStatus + ", description=" + this.description + ')';
    }

    public /* synthetic */ Mission(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6, int i12, h hVar) {
        this(i10, str, z10, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, i11, missionStatus, str5, missionProgressStatus, str6);
    }
}

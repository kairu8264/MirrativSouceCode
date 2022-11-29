package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.h;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class MissionSpecial {
    public static final int $stable = 0;
    private final String appTitle;
    private final String description;
    private final String downloadUrl;
    private final boolean hasRewardDetail;
    private final String iconImageUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f26158id;
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
    private final String videoUrl;

    public MissionSpecial(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6, String str7, String str8, String str9, String str10) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardText");
        p.h(missionStatus, "missionStatus");
        p.h(str5, "title");
        p.h(missionProgressStatus, "progressStatus");
        p.h(str6, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str7, "videoUrl");
        p.h(str8, "iconImageUrl");
        p.h(str9, "downloadUrl");
        this.f26158id = i10;
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
        this.videoUrl = str7;
        this.iconImageUrl = str8;
        this.downloadUrl = str9;
        this.appTitle = str10;
    }

    public final int component1() {
        return this.f26158id;
    }

    public final MissionProgressStatus component10() {
        return this.progressStatus;
    }

    public final String component11() {
        return this.description;
    }

    public final String component12() {
        return this.videoUrl;
    }

    public final String component13() {
        return this.iconImageUrl;
    }

    public final String component14() {
        return this.downloadUrl;
    }

    public final String component15() {
        return this.appTitle;
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

    public final MissionSpecial copy(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6, String str7, String str8, String str9, String str10) {
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardText");
        p.h(missionStatus, "missionStatus");
        p.h(str5, "title");
        p.h(missionProgressStatus, "progressStatus");
        p.h(str6, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str7, "videoUrl");
        p.h(str8, "iconImageUrl");
        p.h(str9, "downloadUrl");
        return new MissionSpecial(i10, str, z10, str2, str3, str4, i11, missionStatus, str5, missionProgressStatus, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionSpecial) {
            MissionSpecial missionSpecial = (MissionSpecial) obj;
            return this.f26158id == missionSpecial.f26158id && p.c(this.rewardImageUrl, missionSpecial.rewardImageUrl) && this.hasRewardDetail == missionSpecial.hasRewardDetail && p.c(this.rewardText, missionSpecial.rewardText) && p.c(this.rewardAvatarPartTypeIconUrl, missionSpecial.rewardAvatarPartTypeIconUrl) && p.c(this.rewardTextDescription, missionSpecial.rewardTextDescription) && this.rewardNum == missionSpecial.rewardNum && this.missionStatus == missionSpecial.missionStatus && p.c(this.title, missionSpecial.title) && p.c(this.progressStatus, missionSpecial.progressStatus) && p.c(this.description, missionSpecial.description) && p.c(this.videoUrl, missionSpecial.videoUrl) && p.c(this.iconImageUrl, missionSpecial.iconImageUrl) && p.c(this.downloadUrl, missionSpecial.downloadUrl) && p.c(this.appTitle, missionSpecial.appTitle);
        }
        return false;
    }

    public final String getAppTitle() {
        return this.appTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final boolean getHasRewardDetail() {
        return this.hasRewardDetail;
    }

    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final int getId() {
        return this.f26158id;
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

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f26158id) * 31) + this.rewardImageUrl.hashCode()) * 31;
        boolean z10 = this.hasRewardDetail;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.rewardText.hashCode()) * 31;
        String str = this.rewardAvatarPartTypeIconUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rewardTextDescription;
        int hashCode4 = (((((((((((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.rewardNum)) * 31) + this.missionStatus.hashCode()) * 31) + this.title.hashCode()) * 31) + this.progressStatus.hashCode()) * 31) + this.description.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.iconImageUrl.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31;
        String str3 = this.appTitle;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MissionSpecial(id=" + this.f26158id + ", rewardImageUrl=" + this.rewardImageUrl + ", hasRewardDetail=" + this.hasRewardDetail + ", rewardText=" + this.rewardText + ", rewardAvatarPartTypeIconUrl=" + this.rewardAvatarPartTypeIconUrl + ", rewardTextDescription=" + this.rewardTextDescription + ", rewardNum=" + this.rewardNum + ", missionStatus=" + this.missionStatus + ", title=" + this.title + ", progressStatus=" + this.progressStatus + ", description=" + this.description + ", videoUrl=" + this.videoUrl + ", iconImageUrl=" + this.iconImageUrl + ", downloadUrl=" + this.downloadUrl + ", appTitle=" + this.appTitle + ')';
    }

    public /* synthetic */ MissionSpecial(int i10, String str, boolean z10, String str2, String str3, String str4, int i11, MissionStatus missionStatus, String str5, MissionProgressStatus missionProgressStatus, String str6, String str7, String str8, String str9, String str10, int i12, h hVar) {
        this(i10, str, z10, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, i11, missionStatus, str5, missionProgressStatus, str6, str7, str8, str9, str10);
    }
}

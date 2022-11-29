package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class MissionInfoResponse {
    public static final int $stable = 8;
    private final MissionCategory categoryFirst;
    private final MissionCategory categorySecond;
    private final MissionCategorySpecial categorySpecial;
    private final String description;
    private final String headerImageUrl;
    private final String missionDescription;
    private final Status status;
    private final int unreceivedMissionNum;

    public MissionInfoResponse(Status status, String str, String str2, MissionCategory missionCategory, MissionCategory missionCategory2, MissionCategorySpecial missionCategorySpecial, int i10, String str3) {
        p.h(status, "status");
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str2, "headerImageUrl");
        p.h(missionCategory, "categoryFirst");
        p.h(missionCategory2, "categorySecond");
        p.h(str3, "missionDescription");
        this.status = status;
        this.description = str;
        this.headerImageUrl = str2;
        this.categoryFirst = missionCategory;
        this.categorySecond = missionCategory2;
        this.categorySpecial = missionCategorySpecial;
        this.unreceivedMissionNum = i10;
        this.missionDescription = str3;
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.headerImageUrl;
    }

    public final MissionCategory component4() {
        return this.categoryFirst;
    }

    public final MissionCategory component5() {
        return this.categorySecond;
    }

    public final MissionCategorySpecial component6() {
        return this.categorySpecial;
    }

    public final int component7() {
        return this.unreceivedMissionNum;
    }

    public final String component8() {
        return this.missionDescription;
    }

    public final MissionInfoResponse copy(Status status, String str, String str2, MissionCategory missionCategory, MissionCategory missionCategory2, MissionCategorySpecial missionCategorySpecial, int i10, String str3) {
        p.h(status, "status");
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str2, "headerImageUrl");
        p.h(missionCategory, "categoryFirst");
        p.h(missionCategory2, "categorySecond");
        p.h(str3, "missionDescription");
        return new MissionInfoResponse(status, str, str2, missionCategory, missionCategory2, missionCategorySpecial, i10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionInfoResponse) {
            MissionInfoResponse missionInfoResponse = (MissionInfoResponse) obj;
            return p.c(this.status, missionInfoResponse.status) && p.c(this.description, missionInfoResponse.description) && p.c(this.headerImageUrl, missionInfoResponse.headerImageUrl) && p.c(this.categoryFirst, missionInfoResponse.categoryFirst) && p.c(this.categorySecond, missionInfoResponse.categorySecond) && p.c(this.categorySpecial, missionInfoResponse.categorySpecial) && this.unreceivedMissionNum == missionInfoResponse.unreceivedMissionNum && p.c(this.missionDescription, missionInfoResponse.missionDescription);
        }
        return false;
    }

    public final MissionCategory getCategoryFirst() {
        return this.categoryFirst;
    }

    public final MissionCategory getCategorySecond() {
        return this.categorySecond;
    }

    public final MissionCategorySpecial getCategorySpecial() {
        return this.categorySpecial;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final String getMissionDescription() {
        return this.missionDescription;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getUnreceivedMissionNum() {
        return this.unreceivedMissionNum;
    }

    public int hashCode() {
        int hashCode = ((((((((this.status.hashCode() * 31) + this.description.hashCode()) * 31) + this.headerImageUrl.hashCode()) * 31) + this.categoryFirst.hashCode()) * 31) + this.categorySecond.hashCode()) * 31;
        MissionCategorySpecial missionCategorySpecial = this.categorySpecial;
        return ((((hashCode + (missionCategorySpecial == null ? 0 : missionCategorySpecial.hashCode())) * 31) + Integer.hashCode(this.unreceivedMissionNum)) * 31) + this.missionDescription.hashCode();
    }

    public String toString() {
        return "MissionInfoResponse(status=" + this.status + ", description=" + this.description + ", headerImageUrl=" + this.headerImageUrl + ", categoryFirst=" + this.categoryFirst + ", categorySecond=" + this.categorySecond + ", categorySpecial=" + this.categorySpecial + ", unreceivedMissionNum=" + this.unreceivedMissionNum + ", missionDescription=" + this.missionDescription + ')';
    }
}

package com.dena.mirrorman.clientlog.logs.detail;

import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class AvatarItemBannerClickTargetDetail {
    public static final int $stable = 0;
    private final String lpUrl;
    private final UpdateClosetAvatarRequest partList;

    public AvatarItemBannerClickTargetDetail(String str, UpdateClosetAvatarRequest updateClosetAvatarRequest) {
        p.h(str, "lpUrl");
        this.lpUrl = str;
        this.partList = updateClosetAvatarRequest;
    }

    public static /* synthetic */ AvatarItemBannerClickTargetDetail copy$default(AvatarItemBannerClickTargetDetail avatarItemBannerClickTargetDetail, String str, UpdateClosetAvatarRequest updateClosetAvatarRequest, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = avatarItemBannerClickTargetDetail.lpUrl;
        }
        if ((i10 & 2) != 0) {
            updateClosetAvatarRequest = avatarItemBannerClickTargetDetail.partList;
        }
        return avatarItemBannerClickTargetDetail.copy(str, updateClosetAvatarRequest);
    }

    public final String component1() {
        return this.lpUrl;
    }

    public final UpdateClosetAvatarRequest component2() {
        return this.partList;
    }

    public final AvatarItemBannerClickTargetDetail copy(String str, UpdateClosetAvatarRequest updateClosetAvatarRequest) {
        p.h(str, "lpUrl");
        return new AvatarItemBannerClickTargetDetail(str, updateClosetAvatarRequest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarItemBannerClickTargetDetail) {
            AvatarItemBannerClickTargetDetail avatarItemBannerClickTargetDetail = (AvatarItemBannerClickTargetDetail) obj;
            return p.c(this.lpUrl, avatarItemBannerClickTargetDetail.lpUrl) && p.c(this.partList, avatarItemBannerClickTargetDetail.partList);
        }
        return false;
    }

    public final String getLpUrl() {
        return this.lpUrl;
    }

    public final UpdateClosetAvatarRequest getPartList() {
        return this.partList;
    }

    public int hashCode() {
        int hashCode = this.lpUrl.hashCode() * 31;
        UpdateClosetAvatarRequest updateClosetAvatarRequest = this.partList;
        return hashCode + (updateClosetAvatarRequest == null ? 0 : updateClosetAvatarRequest.hashCode());
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "AvatarItemBannerClickTargetDetail(lpUrl=" + this.lpUrl + ", partList=" + this.partList + ')';
    }
}

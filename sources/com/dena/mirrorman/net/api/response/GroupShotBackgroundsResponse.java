package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GroupShotBackgroundsResponse {
    public static final int $stable = 8;
    private final List<GroupShotBackground> backgrounds;
    @c("explain_image_url")
    private final String groupShotGalleryHelpImageUrl;
    private final Status status;

    public GroupShotBackgroundsResponse(List<GroupShotBackground> list, String str, Status status) {
        p.h(list, "backgrounds");
        p.h(str, "groupShotGalleryHelpImageUrl");
        p.h(status, "status");
        this.backgrounds = list;
        this.groupShotGalleryHelpImageUrl = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupShotBackgroundsResponse copy$default(GroupShotBackgroundsResponse groupShotBackgroundsResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = groupShotBackgroundsResponse.backgrounds;
        }
        if ((i10 & 2) != 0) {
            str = groupShotBackgroundsResponse.groupShotGalleryHelpImageUrl;
        }
        if ((i10 & 4) != 0) {
            status = groupShotBackgroundsResponse.status;
        }
        return groupShotBackgroundsResponse.copy(list, str, status);
    }

    public final List<GroupShotBackground> component1() {
        return this.backgrounds;
    }

    public final String component2() {
        return this.groupShotGalleryHelpImageUrl;
    }

    public final Status component3() {
        return this.status;
    }

    public final GroupShotBackgroundsResponse copy(List<GroupShotBackground> list, String str, Status status) {
        p.h(list, "backgrounds");
        p.h(str, "groupShotGalleryHelpImageUrl");
        p.h(status, "status");
        return new GroupShotBackgroundsResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotBackgroundsResponse) {
            GroupShotBackgroundsResponse groupShotBackgroundsResponse = (GroupShotBackgroundsResponse) obj;
            return p.c(this.backgrounds, groupShotBackgroundsResponse.backgrounds) && p.c(this.groupShotGalleryHelpImageUrl, groupShotBackgroundsResponse.groupShotGalleryHelpImageUrl) && p.c(this.status, groupShotBackgroundsResponse.status);
        }
        return false;
    }

    public final List<GroupShotBackground> getBackgrounds() {
        return this.backgrounds;
    }

    public final String getGroupShotGalleryHelpImageUrl() {
        return this.groupShotGalleryHelpImageUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.backgrounds.hashCode() * 31) + this.groupShotGalleryHelpImageUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GroupShotBackgroundsResponse(backgrounds=" + this.backgrounds + ", groupShotGalleryHelpImageUrl=" + this.groupShotGalleryHelpImageUrl + ", status=" + this.status + ')';
    }
}

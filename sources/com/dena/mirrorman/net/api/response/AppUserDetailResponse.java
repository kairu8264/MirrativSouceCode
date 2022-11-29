package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class AppUserDetailResponse implements Serializable {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private final boolean isPublishedUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isPublishedUserId;
    private final String name;
    @b(BooleanTypeAdapter.class)
    private final boolean requireConfirmation;
    private final Status status;
    private final String url;
    private final String userId;

    public AppUserDetailResponse(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, Status status) {
        p.h(str, "url");
        p.h(str2, "userId");
        p.h(str3, "name");
        p.h(status, "status");
        this.url = str;
        this.userId = str2;
        this.isPublishedUrl = z10;
        this.isPublishedUserId = z11;
        this.requireConfirmation = z12;
        this.name = str3;
        this.status = status;
    }

    public static /* synthetic */ AppUserDetailResponse copy$default(AppUserDetailResponse appUserDetailResponse, String str, String str2, boolean z10, boolean z11, boolean z12, String str3, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appUserDetailResponse.url;
        }
        if ((i10 & 2) != 0) {
            str2 = appUserDetailResponse.userId;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            z10 = appUserDetailResponse.isPublishedUrl;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = appUserDetailResponse.isPublishedUserId;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            z12 = appUserDetailResponse.requireConfirmation;
        }
        boolean z15 = z12;
        if ((i10 & 32) != 0) {
            str3 = appUserDetailResponse.name;
        }
        String str5 = str3;
        if ((i10 & 64) != 0) {
            status = appUserDetailResponse.status;
        }
        return appUserDetailResponse.copy(str, str4, z13, z14, z15, str5, status);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.userId;
    }

    public final boolean component3() {
        return this.isPublishedUrl;
    }

    public final boolean component4() {
        return this.isPublishedUserId;
    }

    public final boolean component5() {
        return this.requireConfirmation;
    }

    public final String component6() {
        return this.name;
    }

    public final Status component7() {
        return this.status;
    }

    public final AppUserDetailResponse copy(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, Status status) {
        p.h(str, "url");
        p.h(str2, "userId");
        p.h(str3, "name");
        p.h(status, "status");
        return new AppUserDetailResponse(str, str2, z10, z11, z12, str3, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppUserDetailResponse) {
            AppUserDetailResponse appUserDetailResponse = (AppUserDetailResponse) obj;
            return p.c(this.url, appUserDetailResponse.url) && p.c(this.userId, appUserDetailResponse.userId) && this.isPublishedUrl == appUserDetailResponse.isPublishedUrl && this.isPublishedUserId == appUserDetailResponse.isPublishedUserId && this.requireConfirmation == appUserDetailResponse.requireConfirmation && p.c(this.name, appUserDetailResponse.name) && p.c(this.status, appUserDetailResponse.status);
        }
        return false;
    }

    public final boolean getHasUserId() {
        return this.userId.length() > 0;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPublishedUrl() {
        if (this.isPublishedUrl) {
            if (this.url.length() > 0) {
                return this.url;
            }
        }
        return null;
    }

    public final boolean getPublishedUrlVisibility() {
        return this.url.length() > 0;
    }

    public final String getPublishedUserId() {
        if (this.isPublishedUserId) {
            if (this.userId.length() > 0) {
                return this.userId;
            }
        }
        return null;
    }

    public final boolean getRequireConfirmation() {
        return this.requireConfirmation;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.userId.hashCode()) * 31;
        boolean z10 = this.isPublishedUrl;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isPublishedUserId;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.requireConfirmation;
        return ((((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.name.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean isPublishedUrl() {
        return this.isPublishedUrl;
    }

    public final boolean isPublishedUserId() {
        return this.isPublishedUserId;
    }

    public String toString() {
        return "AppUserDetailResponse(url=" + this.url + ", userId=" + this.userId + ", isPublishedUrl=" + this.isPublishedUrl + ", isPublishedUserId=" + this.isPublishedUserId + ", requireConfirmation=" + this.requireConfirmation + ", name=" + this.name + ", status=" + this.status + ')';
    }
}

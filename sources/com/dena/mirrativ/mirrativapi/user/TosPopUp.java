package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class TosPopUp {
    private final String description;

    /* renamed from: id  reason: collision with root package name */
    private final int f21658id;
    private final String imageUrl;
    private final String linkUrl;
    private final String title;

    public TosPopUp(int i10, String str, String str2, String str3, String str4) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(str4, "linkUrl");
        this.f21658id = i10;
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.linkUrl = str4;
    }

    public static /* synthetic */ TosPopUp copy$default(TosPopUp tosPopUp, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = tosPopUp.f21658id;
        }
        if ((i11 & 2) != 0) {
            str = tosPopUp.title;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = tosPopUp.description;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = tosPopUp.imageUrl;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = tosPopUp.linkUrl;
        }
        return tosPopUp.copy(i10, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f21658id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.linkUrl;
    }

    public final TosPopUp copy(int i10, String str, String str2, String str3, String str4) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(str4, "linkUrl");
        return new TosPopUp(i10, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TosPopUp) {
            TosPopUp tosPopUp = (TosPopUp) obj;
            return this.f21658id == tosPopUp.f21658id && p.c(this.title, tosPopUp.title) && p.c(this.description, tosPopUp.description) && p.c(this.imageUrl, tosPopUp.imageUrl) && p.c(this.linkUrl, tosPopUp.linkUrl);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f21658id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f21658id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.linkUrl.hashCode();
    }

    public String toString() {
        return "TosPopUp(id=" + this.f21658id + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", linkUrl=" + this.linkUrl + ')';
    }
}

package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonRating implements Serializable {
    public static final int $stable = 0;
    private final String className;
    private final String iconUrl;

    public SeasonRating() {
        this(null, null, 3, null);
    }

    public SeasonRating(String str, String str2) {
        p.h(str, "className");
        p.h(str2, "iconUrl");
        this.className = str;
        this.iconUrl = str2;
    }

    public static /* synthetic */ SeasonRating copy$default(SeasonRating seasonRating, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = seasonRating.className;
        }
        if ((i10 & 2) != 0) {
            str2 = seasonRating.iconUrl;
        }
        return seasonRating.copy(str, str2);
    }

    public final String component1() {
        return this.className;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final SeasonRating copy(String str, String str2) {
        p.h(str, "className");
        p.h(str2, "iconUrl");
        return new SeasonRating(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonRating) {
            SeasonRating seasonRating = (SeasonRating) obj;
            return p.c(this.className, seasonRating.className) && p.c(this.iconUrl, seasonRating.iconUrl);
        }
        return false;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "SeasonRating(className=" + this.className + ", iconUrl=" + this.iconUrl + ')';
    }

    public /* synthetic */ SeasonRating(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}

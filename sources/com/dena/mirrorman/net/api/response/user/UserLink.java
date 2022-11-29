package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UserLink implements Serializable {
    public static final int $stable = 8;
    private String url;

    public UserLink() {
        this(null, 1, null);
    }

    public UserLink(String str) {
        p.h(str, "url");
        this.url = str;
    }

    public static /* synthetic */ UserLink copy$default(UserLink userLink, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userLink.url;
        }
        return userLink.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final UserLink copy(String str) {
        p.h(str, "url");
        return new UserLink(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserLink) && p.c(this.url, ((UserLink) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "UserLink(url=" + this.url + ')';
    }

    public /* synthetic */ UserLink(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}

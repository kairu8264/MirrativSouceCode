package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.LogBase;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class UserAppStatus implements Serializable {
    public static final int $stable = 0;
    private final String iconUrl;
    private final String label;
    private final String value;

    public UserAppStatus(String str, String str2, String str3) {
        p.h(str, "iconUrl");
        p.h(str2, LogBase.LABEL);
        p.h(str3, "value");
        this.iconUrl = str;
        this.label = str2;
        this.value = str3;
    }

    public static /* synthetic */ UserAppStatus copy$default(UserAppStatus userAppStatus, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userAppStatus.iconUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = userAppStatus.label;
        }
        if ((i10 & 4) != 0) {
            str3 = userAppStatus.value;
        }
        return userAppStatus.copy(str, str2, str3);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.value;
    }

    public final UserAppStatus copy(String str, String str2, String str3) {
        p.h(str, "iconUrl");
        p.h(str2, LogBase.LABEL);
        p.h(str3, "value");
        return new UserAppStatus(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserAppStatus) {
            UserAppStatus userAppStatus = (UserAppStatus) obj;
            return p.c(this.iconUrl, userAppStatus.iconUrl) && p.c(this.label, userAppStatus.label) && p.c(this.value, userAppStatus.value);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.iconUrl.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "UserAppStatus(iconUrl=" + this.iconUrl + ", label=" + this.label + ", value=" + this.value + ')';
    }
}

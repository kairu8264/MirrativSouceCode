package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class FavoriteLiveSettingResponse {
    public static final int $stable = 8;
    private final FavoriteLiveSetting setting;
    private final Status status;

    public FavoriteLiveSettingResponse(Status status, FavoriteLiveSetting favoriteLiveSetting) {
        p.h(status, "status");
        p.h(favoriteLiveSetting, MRLog.PAYLOAD_KEY_SETTING);
        this.status = status;
        this.setting = favoriteLiveSetting;
    }

    public static /* synthetic */ FavoriteLiveSettingResponse copy$default(FavoriteLiveSettingResponse favoriteLiveSettingResponse, Status status, FavoriteLiveSetting favoriteLiveSetting, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = favoriteLiveSettingResponse.status;
        }
        if ((i10 & 2) != 0) {
            favoriteLiveSetting = favoriteLiveSettingResponse.setting;
        }
        return favoriteLiveSettingResponse.copy(status, favoriteLiveSetting);
    }

    public final Status component1() {
        return this.status;
    }

    public final FavoriteLiveSetting component2() {
        return this.setting;
    }

    public final FavoriteLiveSettingResponse copy(Status status, FavoriteLiveSetting favoriteLiveSetting) {
        p.h(status, "status");
        p.h(favoriteLiveSetting, MRLog.PAYLOAD_KEY_SETTING);
        return new FavoriteLiveSettingResponse(status, favoriteLiveSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavoriteLiveSettingResponse) {
            FavoriteLiveSettingResponse favoriteLiveSettingResponse = (FavoriteLiveSettingResponse) obj;
            return p.c(this.status, favoriteLiveSettingResponse.status) && p.c(this.setting, favoriteLiveSettingResponse.setting);
        }
        return false;
    }

    public final FavoriteLiveSetting getSetting() {
        return this.setting;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.setting.hashCode();
    }

    public String toString() {
        return "FavoriteLiveSettingResponse(status=" + this.status + ", setting=" + this.setting + ')';
    }
}

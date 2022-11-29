package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class FavoriteLiveSettingsResponse {
    public static final int $stable = 8;
    private final List<FavoriteLiveSetting> settings;
    private final Status status;

    public FavoriteLiveSettingsResponse(Status status, List<FavoriteLiveSetting> list) {
        p.h(status, "status");
        p.h(list, Referer.SETTINGS);
        this.status = status;
        this.settings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteLiveSettingsResponse copy$default(FavoriteLiveSettingsResponse favoriteLiveSettingsResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = favoriteLiveSettingsResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = favoriteLiveSettingsResponse.settings;
        }
        return favoriteLiveSettingsResponse.copy(status, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<FavoriteLiveSetting> component2() {
        return this.settings;
    }

    public final FavoriteLiveSettingsResponse copy(Status status, List<FavoriteLiveSetting> list) {
        p.h(status, "status");
        p.h(list, Referer.SETTINGS);
        return new FavoriteLiveSettingsResponse(status, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavoriteLiveSettingsResponse) {
            FavoriteLiveSettingsResponse favoriteLiveSettingsResponse = (FavoriteLiveSettingsResponse) obj;
            return p.c(this.status, favoriteLiveSettingsResponse.status) && p.c(this.settings, favoriteLiveSettingsResponse.settings);
        }
        return false;
    }

    public final List<FavoriteLiveSetting> getSettings() {
        return this.settings;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.settings.hashCode();
    }

    public String toString() {
        return "FavoriteLiveSettingsResponse(status=" + this.status + ", settings=" + this.settings + ')';
    }
}

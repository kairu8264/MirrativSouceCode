package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.net.api.response.Ad;
import java.io.Serializable;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class LiveAd implements Serializable {
    public static final int $stable = 8;
    private LiveAdAppBanner appBanner;
    @c("settings_app_install")
    private Ad.Actions appInstall;

    public LiveAd() {
        this(null, null, 3, null);
    }

    public LiveAd(LiveAdAppBanner liveAdAppBanner, Ad.Actions actions) {
        this.appBanner = liveAdAppBanner;
        this.appInstall = actions;
    }

    public static /* synthetic */ LiveAd copy$default(LiveAd liveAd, LiveAdAppBanner liveAdAppBanner, Ad.Actions actions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            liveAdAppBanner = liveAd.appBanner;
        }
        if ((i10 & 2) != 0) {
            actions = liveAd.appInstall;
        }
        return liveAd.copy(liveAdAppBanner, actions);
    }

    public final LiveAdAppBanner component1() {
        return this.appBanner;
    }

    public final Ad.Actions component2() {
        return this.appInstall;
    }

    public final LiveAd copy(LiveAdAppBanner liveAdAppBanner, Ad.Actions actions) {
        return new LiveAd(liveAdAppBanner, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveAd) {
            LiveAd liveAd = (LiveAd) obj;
            return p.c(this.appBanner, liveAd.appBanner) && p.c(this.appInstall, liveAd.appInstall);
        }
        return false;
    }

    public final LiveAdAppBanner getAppBanner() {
        return this.appBanner;
    }

    public final Ad.Actions getAppInstall() {
        return this.appInstall;
    }

    public int hashCode() {
        LiveAdAppBanner liveAdAppBanner = this.appBanner;
        int hashCode = (liveAdAppBanner == null ? 0 : liveAdAppBanner.hashCode()) * 31;
        Ad.Actions actions = this.appInstall;
        return hashCode + (actions != null ? actions.hashCode() : 0);
    }

    public final void setAppBanner(LiveAdAppBanner liveAdAppBanner) {
        this.appBanner = liveAdAppBanner;
    }

    public final void setAppInstall(Ad.Actions actions) {
        this.appInstall = actions;
    }

    public String toString() {
        return "LiveAd(appBanner=" + this.appBanner + ", appInstall=" + this.appInstall + ')';
    }

    public /* synthetic */ LiveAd(LiveAdAppBanner liveAdAppBanner, Ad.Actions actions, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : liveAdAppBanner, (i10 & 2) != 0 ? null : actions);
    }
}

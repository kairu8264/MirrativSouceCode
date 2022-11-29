package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class NotificationPushSettingsV3Response {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledCampaigns;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledChats;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledLives;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledNews;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledPresentBoxes;
    @b(BooleanTypeAdapter.class)
    private final boolean isEnabledYours;
    private final Status status;

    public NotificationPushSettingsV3Response(Status status, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        p.h(status, "status");
        this.status = status;
        this.isEnabledLives = z10;
        this.isEnabledPresentBoxes = z11;
        this.isEnabledYours = z12;
        this.isEnabledCampaigns = z13;
        this.isEnabledNews = z14;
        this.isEnabledChats = z15;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final boolean isEnabledCampaigns() {
        return this.isEnabledCampaigns;
    }

    public final boolean isEnabledChats() {
        return this.isEnabledChats;
    }

    public final boolean isEnabledLives() {
        return this.isEnabledLives;
    }

    public final boolean isEnabledNews() {
        return this.isEnabledNews;
    }

    public final boolean isEnabledPresentBoxes() {
        return this.isEnabledPresentBoxes;
    }

    public final boolean isEnabledYours() {
        return this.isEnabledYours;
    }
}

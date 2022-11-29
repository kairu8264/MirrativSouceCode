package com.dena.mirrorman.clientlog.logs.detail;

import com.dena.mirrorman.net.api.Referer;

/* loaded from: classes2.dex */
public enum CampaignModalButtonTapTargetDetail {
    BROADCAST(Referer.BROADCAST),
    VIEW("view"),
    DOWNLOAD("download"),
    TWITTER("twitter"),
    OFFICIAL("official"),
    BUTTON1("button1"),
    BUTTON2("button2");
    
    private final String type;

    CampaignModalButtonTapTargetDetail(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}

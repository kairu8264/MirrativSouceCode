package com.dena.mirrorman.net.api.response.campaign;

import jo.h;

/* loaded from: classes2.dex */
public enum CampaignProgressType {
    PROGRESS_BAR(1),
    DATE(2),
    UNDEFINED_API_PARAM(-1);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final CampaignProgressType fromInt(int i10) {
            CampaignProgressType campaignProgressType;
            CampaignProgressType[] values = CampaignProgressType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    campaignProgressType = null;
                    break;
                }
                campaignProgressType = values[i11];
                if (campaignProgressType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return campaignProgressType == null ? CampaignProgressType.UNDEFINED_API_PARAM : campaignProgressType;
        }
    }

    CampaignProgressType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

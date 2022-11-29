package com.dena.mirrorman.net.api.response.campaign;

import jo.h;

/* loaded from: classes2.dex */
public enum CampaignMissionReceiveStatus {
    HIDDEN(0),
    CAN_RECEIVE(1),
    ALREADY_RECEIVED(2),
    APP_USER_ID_REQUIRED(3),
    CANNOT_RECEIVE(-1);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final CampaignMissionReceiveStatus fromInt(int i10) {
            CampaignMissionReceiveStatus campaignMissionReceiveStatus;
            CampaignMissionReceiveStatus[] values = CampaignMissionReceiveStatus.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    campaignMissionReceiveStatus = null;
                    break;
                }
                campaignMissionReceiveStatus = values[i11];
                if (campaignMissionReceiveStatus.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return campaignMissionReceiveStatus == null ? CampaignMissionReceiveStatus.HIDDEN : campaignMissionReceiveStatus;
        }
    }

    CampaignMissionReceiveStatus(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

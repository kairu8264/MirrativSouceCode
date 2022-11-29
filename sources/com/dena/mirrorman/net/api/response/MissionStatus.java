package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public enum MissionStatus {
    NOT_COMPLETED(0),
    IN_PROGRESS(1),
    COMPLETED(2),
    REWARD_RECEIVED(3),
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

        public final MissionStatus fromInt(int i10) {
            MissionStatus missionStatus;
            MissionStatus[] values = MissionStatus.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    missionStatus = null;
                    break;
                }
                missionStatus = values[i11];
                if (missionStatus.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return missionStatus == null ? MissionStatus.UNDEFINED_API_PARAM : missionStatus;
        }
    }

    MissionStatus(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

package com.dena.mirrativ.mirrativapi.livegame;

import jo.h;

/* loaded from: classes2.dex */
public enum LiveGameMissionStatusType {
    NOT_COMPLETED(0),
    COMPLETED(1),
    INVALID(2),
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

        public final LiveGameMissionStatusType fromInt(int i10) {
            LiveGameMissionStatusType liveGameMissionStatusType;
            LiveGameMissionStatusType[] values = LiveGameMissionStatusType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    liveGameMissionStatusType = null;
                    break;
                }
                liveGameMissionStatusType = values[i11];
                if (liveGameMissionStatusType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return liveGameMissionStatusType == null ? LiveGameMissionStatusType.UNDEFINED_API_PARAM : liveGameMissionStatusType;
        }
    }

    LiveGameMissionStatusType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

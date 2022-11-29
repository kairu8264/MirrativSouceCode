package com.dena.mirrorman.net.api.response.user;

import jo.h;

/* loaded from: classes2.dex */
public enum AnniversaryType {
    BIRTHDAY(1),
    FOLLOWER(2),
    NORMAL_CONTINUOUS(3),
    MASTER_CONTINUOUS(4),
    SUPER_CONTINUOUS(5),
    EXTREME_CONTINUOUS(6),
    MASTER_MONTHLY_CONTINUOUS(7),
    SUPER_MONTHLY_CONTINUOUS(8),
    EXTREME_MONTHLY_CONTINUOUS(9),
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

        public final AnniversaryType fromInt(int i10) {
            AnniversaryType anniversaryType;
            AnniversaryType[] values = AnniversaryType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    anniversaryType = null;
                    break;
                }
                anniversaryType = values[i11];
                if (anniversaryType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return anniversaryType == null ? AnniversaryType.UNDEFINED_API_PARAM : anniversaryType;
        }
    }

    AnniversaryType(int i10) {
        this.rawValue = i10;
    }

    private final boolean isMonthly() {
        return this == MASTER_MONTHLY_CONTINUOUS || this == SUPER_MONTHLY_CONTINUOUS || this == EXTREME_MONTHLY_CONTINUOUS;
    }

    public final int getRawValue() {
        return this.rawValue;
    }

    public final boolean isStreamContinuous() {
        return this == NORMAL_CONTINUOUS || this == MASTER_CONTINUOUS || this == SUPER_CONTINUOUS || this == EXTREME_CONTINUOUS || isMonthly();
    }
}

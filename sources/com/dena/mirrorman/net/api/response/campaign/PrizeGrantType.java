package com.dena.mirrorman.net.api.response.campaign;

import jo.h;

/* loaded from: classes2.dex */
public enum PrizeGrantType {
    ALL_APPLICANTS_GIVEN_PRESENT(1),
    LOTTERY(2),
    DIVIDE_EQUALLY(3),
    DAILY_LOTTERY(4),
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

        public final PrizeGrantType fromInt(int i10) {
            PrizeGrantType prizeGrantType;
            PrizeGrantType[] values = PrizeGrantType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    prizeGrantType = null;
                    break;
                }
                prizeGrantType = values[i11];
                if (prizeGrantType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return prizeGrantType == null ? PrizeGrantType.UNDEFINED_API_PARAM : prizeGrantType;
        }
    }

    PrizeGrantType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

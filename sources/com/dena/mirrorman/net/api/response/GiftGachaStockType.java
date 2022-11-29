package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public enum GiftGachaStockType {
    NORMAL(1),
    FEVER(2),
    VIEWER_RARE4(3),
    STREAMER_RARE4(4);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final GiftGachaStockType fromInt(int i10) {
            GiftGachaStockType giftGachaStockType;
            GiftGachaStockType[] values = GiftGachaStockType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    giftGachaStockType = null;
                    break;
                }
                giftGachaStockType = values[i11];
                if (giftGachaStockType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return giftGachaStockType == null ? GiftGachaStockType.NORMAL : giftGachaStockType;
        }
    }

    GiftGachaStockType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }

    public final boolean isFever() {
        return this == FEVER;
    }

    public final boolean isRare() {
        return this == VIEWER_RARE4 || this == STREAMER_RARE4;
    }
}

package com.dena.mirrativ.mirrativapi.emomo.event;

import jo.h;

/* loaded from: classes2.dex */
public enum EmomoGameStatusType {
    Ready(0),
    Running(1),
    Finished(2);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final EmomoGameStatusType fromInt(int i10) {
            EmomoGameStatusType emomoGameStatusType;
            EmomoGameStatusType[] values = EmomoGameStatusType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    emomoGameStatusType = null;
                    break;
                }
                emomoGameStatusType = values[i11];
                if (emomoGameStatusType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return emomoGameStatusType == null ? EmomoGameStatusType.Ready : emomoGameStatusType;
        }
    }

    EmomoGameStatusType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

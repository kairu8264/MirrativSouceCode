package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public enum BroadcastResultEventType {
    NONE(0),
    DEBUT(1),
    MAINICHI(2),
    MEI_MAINICHI(3),
    CHO_MAINICHI(4),
    KIWAMI_MAINICHI(5),
    DENDO_MAINICHI(6);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final BroadcastResultEventType fromInt(int i10) {
            BroadcastResultEventType broadcastResultEventType;
            BroadcastResultEventType[] values = BroadcastResultEventType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    broadcastResultEventType = null;
                    break;
                }
                broadcastResultEventType = values[i11];
                if (broadcastResultEventType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return broadcastResultEventType == null ? BroadcastResultEventType.NONE : broadcastResultEventType;
        }
    }

    BroadcastResultEventType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

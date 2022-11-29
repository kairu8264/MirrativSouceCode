package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public enum LiveArchiveStatus {
    PREPARING(0),
    PREPARED(1),
    REVOKED(2);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final LiveArchiveStatus fromInt(int i10) {
            LiveArchiveStatus liveArchiveStatus;
            LiveArchiveStatus[] values = LiveArchiveStatus.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    liveArchiveStatus = null;
                    break;
                }
                liveArchiveStatus = values[i11];
                if (liveArchiveStatus.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return liveArchiveStatus == null ? LiveArchiveStatus.PREPARING : liveArchiveStatus;
        }
    }

    LiveArchiveStatus(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

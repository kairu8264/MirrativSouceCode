package com.dena.mirrorman.net.api.response;

import jo.h;

/* loaded from: classes2.dex */
public enum CollabType {
    CALL(1),
    LIVE(2);
    
    public static final Companion Companion = new Companion(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final CollabType fromInt(int i10) {
            CollabType collabType;
            CollabType[] values = CollabType.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    collabType = null;
                    break;
                }
                collabType = values[i11];
                if (collabType.getRawValue() == i10) {
                    break;
                }
                i11++;
            }
            return collabType == null ? CollabType.CALL : collabType;
        }
    }

    CollabType(int i10) {
        this.rawValue = i10;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}

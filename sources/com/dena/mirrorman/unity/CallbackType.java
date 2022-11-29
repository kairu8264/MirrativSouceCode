package com.dena.mirrorman.unity;

import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public enum CallbackType {
    UNKNOWN("Unknown"),
    COMPLETE("Complete"),
    ERROR("Error"),
    MINI_GAME("MiniGame");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final CallbackType fromString(String str) {
            CallbackType callbackType;
            p.h(str, "value");
            CallbackType[] values = CallbackType.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    callbackType = null;
                    break;
                }
                callbackType = values[i10];
                if (p.c(callbackType.getRawValue(), str)) {
                    break;
                }
                i10++;
            }
            return callbackType == null ? CallbackType.UNKNOWN : callbackType;
        }
    }

    CallbackType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

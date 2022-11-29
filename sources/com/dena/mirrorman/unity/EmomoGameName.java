package com.dena.mirrorman.unity;

import java.util.NoSuchElementException;
import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public enum EmomoGameName {
    EMOMO_RUN("MiniGame_001"),
    SHOOTER("MiniGame_002"),
    FLAG_UP("MiniGame_003"),
    EMOMO_QUEST("MiniGame_004");
    
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final EmomoGameName fromValue(String str) {
            EmomoGameName[] values;
            p.h(str, "value");
            for (EmomoGameName emomoGameName : EmomoGameName.values()) {
                if (p.c(emomoGameName.getValue(), str)) {
                    return emomoGameName;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    EmomoGameName(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

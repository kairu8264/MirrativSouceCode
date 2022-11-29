package com.dena.mirrorman.clientlog.logs;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import jo.p;

/* loaded from: classes2.dex */
public final class Quiz {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Click extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(String str, boolean z10) {
            super("quiz.click", "dialog", str);
            p.h(str, "dialogType");
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Imp extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Imp(String str) {
            super("quiz.imp", "dialog", str);
            p.h(str, "dialogType");
        }
    }
}

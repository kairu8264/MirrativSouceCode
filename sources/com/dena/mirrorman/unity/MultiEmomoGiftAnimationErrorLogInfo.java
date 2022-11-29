package com.dena.mirrorman.unity;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes3.dex */
public final class MultiEmomoGiftAnimationErrorLogInfo {
    public static final int $stable = 0;
    private final String error;
    private final MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo;

    public MultiEmomoGiftAnimationErrorLogInfo(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, String str) {
        p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        this.multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationLogInfo;
        this.error = str;
    }

    public static /* synthetic */ MultiEmomoGiftAnimationErrorLogInfo copy$default(MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo, MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationErrorLogInfo.multiEmomoGiftAnimationLogInfo;
        }
        if ((i10 & 2) != 0) {
            str = multiEmomoGiftAnimationErrorLogInfo.error;
        }
        return multiEmomoGiftAnimationErrorLogInfo.copy(multiEmomoGiftAnimationLogInfo, str);
    }

    public final MultiEmomoGiftAnimationLogInfo component1() {
        return this.multiEmomoGiftAnimationLogInfo;
    }

    public final String component2() {
        return this.error;
    }

    public final MultiEmomoGiftAnimationErrorLogInfo copy(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, String str) {
        p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
        p.h(str, MRLog.PAYLOAD_KEY_ERROR);
        return new MultiEmomoGiftAnimationErrorLogInfo(multiEmomoGiftAnimationLogInfo, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiEmomoGiftAnimationErrorLogInfo) {
            MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo = (MultiEmomoGiftAnimationErrorLogInfo) obj;
            return p.c(this.multiEmomoGiftAnimationLogInfo, multiEmomoGiftAnimationErrorLogInfo.multiEmomoGiftAnimationLogInfo) && p.c(this.error, multiEmomoGiftAnimationErrorLogInfo.error);
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final MultiEmomoGiftAnimationLogInfo getMultiEmomoGiftAnimationLogInfo() {
        return this.multiEmomoGiftAnimationLogInfo;
    }

    public int hashCode() {
        return (this.multiEmomoGiftAnimationLogInfo.hashCode() * 31) + this.error.hashCode();
    }

    public String toString() {
        return "MultiEmomoGiftAnimationErrorLogInfo(multiEmomoGiftAnimationLogInfo=" + this.multiEmomoGiftAnimationLogInfo + ", error=" + this.error + ')';
    }
}

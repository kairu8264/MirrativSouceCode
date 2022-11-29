package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class MultiEmomoGiftAnimationLogInfo {
    public static final int $stable = 0;
    private final String giftEffectTrigger;
    private final String liveSentGiftId;

    public MultiEmomoGiftAnimationLogInfo(String str, String str2) {
        p.h(str, "liveSentGiftId");
        p.h(str2, "giftEffectTrigger");
        this.liveSentGiftId = str;
        this.giftEffectTrigger = str2;
    }

    public static /* synthetic */ MultiEmomoGiftAnimationLogInfo copy$default(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = multiEmomoGiftAnimationLogInfo.liveSentGiftId;
        }
        if ((i10 & 2) != 0) {
            str2 = multiEmomoGiftAnimationLogInfo.giftEffectTrigger;
        }
        return multiEmomoGiftAnimationLogInfo.copy(str, str2);
    }

    public final String component1() {
        return this.liveSentGiftId;
    }

    public final String component2() {
        return this.giftEffectTrigger;
    }

    public final MultiEmomoGiftAnimationLogInfo copy(String str, String str2) {
        p.h(str, "liveSentGiftId");
        p.h(str2, "giftEffectTrigger");
        return new MultiEmomoGiftAnimationLogInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiEmomoGiftAnimationLogInfo) {
            MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo = (MultiEmomoGiftAnimationLogInfo) obj;
            return p.c(this.liveSentGiftId, multiEmomoGiftAnimationLogInfo.liveSentGiftId) && p.c(this.giftEffectTrigger, multiEmomoGiftAnimationLogInfo.giftEffectTrigger);
        }
        return false;
    }

    public final String getGiftEffectTrigger() {
        return this.giftEffectTrigger;
    }

    public final String getLiveSentGiftId() {
        return this.liveSentGiftId;
    }

    public int hashCode() {
        return (this.liveSentGiftId.hashCode() * 31) + this.giftEffectTrigger.hashCode();
    }

    public String toString() {
        return "MultiEmomoGiftAnimationLogInfo(liveSentGiftId=" + this.liveSentGiftId + ", giftEffectTrigger=" + this.giftEffectTrigger + ')';
    }
}

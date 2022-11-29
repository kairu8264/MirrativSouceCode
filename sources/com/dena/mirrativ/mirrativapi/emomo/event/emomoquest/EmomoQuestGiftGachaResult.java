package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestGiftGachaResult {
    private final EmomoQuestGiftGachaUser streamer;
    private final EmomoQuestGiftGachaUser viewer;

    public EmomoQuestGiftGachaResult(EmomoQuestGiftGachaUser emomoQuestGiftGachaUser, EmomoQuestGiftGachaUser emomoQuestGiftGachaUser2) {
        p.h(emomoQuestGiftGachaUser, "streamer");
        p.h(emomoQuestGiftGachaUser2, MRLog.TARGET_TYPE_VIEWER);
        this.streamer = emomoQuestGiftGachaUser;
        this.viewer = emomoQuestGiftGachaUser2;
    }

    public static /* synthetic */ EmomoQuestGiftGachaResult copy$default(EmomoQuestGiftGachaResult emomoQuestGiftGachaResult, EmomoQuestGiftGachaUser emomoQuestGiftGachaUser, EmomoQuestGiftGachaUser emomoQuestGiftGachaUser2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            emomoQuestGiftGachaUser = emomoQuestGiftGachaResult.streamer;
        }
        if ((i10 & 2) != 0) {
            emomoQuestGiftGachaUser2 = emomoQuestGiftGachaResult.viewer;
        }
        return emomoQuestGiftGachaResult.copy(emomoQuestGiftGachaUser, emomoQuestGiftGachaUser2);
    }

    public final EmomoQuestGiftGachaUser component1() {
        return this.streamer;
    }

    public final EmomoQuestGiftGachaUser component2() {
        return this.viewer;
    }

    public final EmomoQuestGiftGachaResult copy(EmomoQuestGiftGachaUser emomoQuestGiftGachaUser, EmomoQuestGiftGachaUser emomoQuestGiftGachaUser2) {
        p.h(emomoQuestGiftGachaUser, "streamer");
        p.h(emomoQuestGiftGachaUser2, MRLog.TARGET_TYPE_VIEWER);
        return new EmomoQuestGiftGachaResult(emomoQuestGiftGachaUser, emomoQuestGiftGachaUser2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestGiftGachaResult) {
            EmomoQuestGiftGachaResult emomoQuestGiftGachaResult = (EmomoQuestGiftGachaResult) obj;
            return p.c(this.streamer, emomoQuestGiftGachaResult.streamer) && p.c(this.viewer, emomoQuestGiftGachaResult.viewer);
        }
        return false;
    }

    public final EmomoQuestGiftGachaUser getStreamer() {
        return this.streamer;
    }

    public final EmomoQuestGiftGachaUser getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        return (this.streamer.hashCode() * 31) + this.viewer.hashCode();
    }

    public String toString() {
        return "EmomoQuestGiftGachaResult(streamer=" + this.streamer + ", viewer=" + this.viewer + ')';
    }
}

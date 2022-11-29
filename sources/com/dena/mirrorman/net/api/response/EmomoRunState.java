package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoRunState {
    public static final int $stable = 0;
    private final int giftEventId;
    @b(BooleanTypeAdapter.class)
    private final boolean isRunning;

    public EmomoRunState(int i10, boolean z10) {
        this.giftEventId = i10;
        this.isRunning = z10;
    }

    public static /* synthetic */ EmomoRunState copy$default(EmomoRunState emomoRunState, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = emomoRunState.giftEventId;
        }
        if ((i11 & 2) != 0) {
            z10 = emomoRunState.isRunning;
        }
        return emomoRunState.copy(i10, z10);
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final boolean component2() {
        return this.isRunning;
    }

    public final EmomoRunState copy(int i10, boolean z10) {
        return new EmomoRunState(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunState) {
            EmomoRunState emomoRunState = (EmomoRunState) obj;
            return this.giftEventId == emomoRunState.giftEventId && this.isRunning == emomoRunState.isRunning;
        }
        return false;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.giftEventId) * 31;
        boolean z10 = this.isRunning;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public String toString() {
        return "EmomoRunState(giftEventId=" + this.giftEventId + ", isRunning=" + this.isRunning + ')';
    }
}

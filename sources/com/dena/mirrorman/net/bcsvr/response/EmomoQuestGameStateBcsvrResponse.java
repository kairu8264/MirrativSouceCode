package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoQuestGameStateBcsvrResponse {
    public static final int $stable = 0;
    private final int giftEventId;
    @b(BooleanTypeAdapter.class)
    private final boolean isQuesting;

    public EmomoQuestGameStateBcsvrResponse(int i10, boolean z10) {
        this.giftEventId = i10;
        this.isQuesting = z10;
    }

    public static /* synthetic */ EmomoQuestGameStateBcsvrResponse copy$default(EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = emomoQuestGameStateBcsvrResponse.giftEventId;
        }
        if ((i11 & 2) != 0) {
            z10 = emomoQuestGameStateBcsvrResponse.isQuesting;
        }
        return emomoQuestGameStateBcsvrResponse.copy(i10, z10);
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final boolean component2() {
        return this.isQuesting;
    }

    public final EmomoQuestGameStateBcsvrResponse copy(int i10, boolean z10) {
        return new EmomoQuestGameStateBcsvrResponse(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestGameStateBcsvrResponse) {
            EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse = (EmomoQuestGameStateBcsvrResponse) obj;
            return this.giftEventId == emomoQuestGameStateBcsvrResponse.giftEventId && this.isQuesting == emomoQuestGameStateBcsvrResponse.isQuesting;
        }
        return false;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.giftEventId) * 31;
        boolean z10 = this.isQuesting;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isQuesting() {
        return this.isQuesting;
    }

    public String toString() {
        return "EmomoQuestGameStateBcsvrResponse(giftEventId=" + this.giftEventId + ", isQuesting=" + this.isQuesting + ')';
    }
}

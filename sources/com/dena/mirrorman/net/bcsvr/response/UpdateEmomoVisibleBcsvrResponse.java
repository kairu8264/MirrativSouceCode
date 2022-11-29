package com.dena.mirrorman.net.bcsvr.response;

/* loaded from: classes2.dex */
public final class UpdateEmomoVisibleBcsvrResponse {
    public static final int $stable = 0;
    private final boolean isVisible;

    public UpdateEmomoVisibleBcsvrResponse(boolean z10) {
        this.isVisible = z10;
    }

    public static /* synthetic */ UpdateEmomoVisibleBcsvrResponse copy$default(UpdateEmomoVisibleBcsvrResponse updateEmomoVisibleBcsvrResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = updateEmomoVisibleBcsvrResponse.isVisible;
        }
        return updateEmomoVisibleBcsvrResponse.copy(z10);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final UpdateEmomoVisibleBcsvrResponse copy(boolean z10) {
        return new UpdateEmomoVisibleBcsvrResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateEmomoVisibleBcsvrResponse) && this.isVisible == ((UpdateEmomoVisibleBcsvrResponse) obj).isVisible;
    }

    public int hashCode() {
        boolean z10 = this.isVisible;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return "UpdateEmomoVisibleBcsvrResponse(isVisible=" + this.isVisible + ')';
    }
}

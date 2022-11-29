package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.h;
import ym.b;

/* loaded from: classes2.dex */
public final class CollabChangedBcsvrResponse {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private boolean isConnectedStreamingCollab;

    public CollabChangedBcsvrResponse() {
        this(false, 1, null);
    }

    public CollabChangedBcsvrResponse(boolean z10) {
        this.isConnectedStreamingCollab = z10;
    }

    public static /* synthetic */ CollabChangedBcsvrResponse copy$default(CollabChangedBcsvrResponse collabChangedBcsvrResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = collabChangedBcsvrResponse.isConnectedStreamingCollab;
        }
        return collabChangedBcsvrResponse.copy(z10);
    }

    public final boolean component1() {
        return this.isConnectedStreamingCollab;
    }

    public final CollabChangedBcsvrResponse copy(boolean z10) {
        return new CollabChangedBcsvrResponse(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollabChangedBcsvrResponse) && this.isConnectedStreamingCollab == ((CollabChangedBcsvrResponse) obj).isConnectedStreamingCollab;
    }

    public int hashCode() {
        boolean z10 = this.isConnectedStreamingCollab;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final boolean isConnectedStreamingCollab() {
        return this.isConnectedStreamingCollab;
    }

    public final void setConnectedStreamingCollab(boolean z10) {
        this.isConnectedStreamingCollab = z10;
    }

    public String toString() {
        return "CollabChangedBcsvrResponse(isConnectedStreamingCollab=" + this.isConnectedStreamingCollab + ')';
    }

    public /* synthetic */ CollabChangedBcsvrResponse(boolean z10, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}

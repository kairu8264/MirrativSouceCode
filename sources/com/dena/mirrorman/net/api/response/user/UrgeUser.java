package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.h;
import ym.b;

/* loaded from: classes2.dex */
public final class UrgeUser extends UserBasicWithGraphParams {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private boolean pushEnabled;
    private final UrgeUserReason reason;
    private boolean requestFollow;
    private final int totalViewerNum;

    public /* synthetic */ UrgeUser(UrgeUserReason urgeUserReason, int i10, boolean z10, boolean z11, int i11, h hVar) {
        this(urgeUserReason, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? true : z11);
    }

    public final boolean getPushEnabled() {
        return this.pushEnabled;
    }

    public final UrgeUserReason getReason() {
        return this.reason;
    }

    public final boolean getRequestFollow() {
        return this.requestFollow;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public final void setPushEnabled(boolean z10) {
        this.pushEnabled = z10;
    }

    public final void setRequestFollow(boolean z10) {
        this.requestFollow = z10;
    }

    public UrgeUser(UrgeUserReason urgeUserReason, int i10, boolean z10, boolean z11) {
        super(false, false, false, false, false, 0, null, 0, 0, 0, 0, null, 0L, false, null, null, false, false, null, 0, 1048575, null);
        this.reason = urgeUserReason;
        this.totalViewerNum = i10;
        this.pushEnabled = z10;
        this.requestFollow = z11;
    }
}

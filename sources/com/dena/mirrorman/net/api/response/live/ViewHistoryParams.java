package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.h;
import ym.b;

/* loaded from: classes2.dex */
public class ViewHistoryParams extends LiveBasicParams {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private boolean isFollow;
    private long viewingTime;

    public ViewHistoryParams() {
        this(false, 0L, 3, null);
    }

    public /* synthetic */ ViewHistoryParams(boolean z10, long j10, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0L : j10);
    }

    public final long getViewingTime() {
        return this.viewingTime;
    }

    public final boolean isFollow() {
        return this.isFollow;
    }

    public final void setFollow(boolean z10) {
        this.isFollow = z10;
    }

    public final void setViewingTime(long j10) {
        this.viewingTime = j10;
    }

    public ViewHistoryParams(boolean z10, long j10) {
        super(null, null, null, null, null, null, 0, 0, 0L, 0L, false, false, null, 0, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0, null, false, 0, null, 0, null, false, false, 0, 0, null, false, null, null, null, null, null, null, 0L, null, false, null, null, 0, 0, null, null, false, null, false, -1, 33554431, null);
        this.isFollow = z10;
        this.viewingTime = j10;
    }
}

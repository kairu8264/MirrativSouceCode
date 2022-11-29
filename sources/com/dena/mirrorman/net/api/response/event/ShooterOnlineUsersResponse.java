package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class ShooterOnlineUsersResponse {
    public static final int $stable = 8;
    private final long nextCursor;
    private final Status status;
    private final List<ShooterViewingUser> viewers;

    public ShooterOnlineUsersResponse(Status status, long j10, List<ShooterViewingUser> list) {
        p.h(status, "status");
        p.h(list, "viewers");
        this.status = status;
        this.nextCursor = j10;
        this.viewers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShooterOnlineUsersResponse copy$default(ShooterOnlineUsersResponse shooterOnlineUsersResponse, Status status, long j10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = shooterOnlineUsersResponse.status;
        }
        if ((i10 & 2) != 0) {
            j10 = shooterOnlineUsersResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            list = shooterOnlineUsersResponse.viewers;
        }
        return shooterOnlineUsersResponse.copy(status, j10, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final long component2() {
        return this.nextCursor;
    }

    public final List<ShooterViewingUser> component3() {
        return this.viewers;
    }

    public final ShooterOnlineUsersResponse copy(Status status, long j10, List<ShooterViewingUser> list) {
        p.h(status, "status");
        p.h(list, "viewers");
        return new ShooterOnlineUsersResponse(status, j10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterOnlineUsersResponse) {
            ShooterOnlineUsersResponse shooterOnlineUsersResponse = (ShooterOnlineUsersResponse) obj;
            return p.c(this.status, shooterOnlineUsersResponse.status) && this.nextCursor == shooterOnlineUsersResponse.nextCursor && p.c(this.viewers, shooterOnlineUsersResponse.viewers);
        }
        return false;
    }

    public final long getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<ShooterViewingUser> getViewers() {
        return this.viewers;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + Long.hashCode(this.nextCursor)) * 31) + this.viewers.hashCode();
    }

    public String toString() {
        return "ShooterOnlineUsersResponse(status=" + this.status + ", nextCursor=" + this.nextCursor + ", viewers=" + this.viewers + ')';
    }

    public /* synthetic */ ShooterOnlineUsersResponse(Status status, long j10, List list, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? s.k() : list);
    }
}

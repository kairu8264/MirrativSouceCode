package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterMemberAvatarsResponse {
    public static final int $stable = 8;
    private final int diarkisClientTimeout;
    private final int gameStartInterval;
    private final int gameType;
    private final int lobbyWaitingTimeout;
    private final Status status;
    private final List<ShooterMemberAvatar> viewers;

    public ShooterMemberAvatarsResponse(List<ShooterMemberAvatar> list, int i10, int i11, int i12, int i13, Status status) {
        p.h(list, "viewers");
        p.h(status, "status");
        this.viewers = list;
        this.gameType = i10;
        this.gameStartInterval = i11;
        this.diarkisClientTimeout = i12;
        this.lobbyWaitingTimeout = i13;
        this.status = status;
    }

    public static /* synthetic */ ShooterMemberAvatarsResponse copy$default(ShooterMemberAvatarsResponse shooterMemberAvatarsResponse, List list, int i10, int i11, int i12, int i13, Status status, int i14, Object obj) {
        List<ShooterMemberAvatar> list2 = list;
        if ((i14 & 1) != 0) {
            list2 = shooterMemberAvatarsResponse.viewers;
        }
        if ((i14 & 2) != 0) {
            i10 = shooterMemberAvatarsResponse.gameType;
        }
        int i15 = i10;
        if ((i14 & 4) != 0) {
            i11 = shooterMemberAvatarsResponse.gameStartInterval;
        }
        int i16 = i11;
        if ((i14 & 8) != 0) {
            i12 = shooterMemberAvatarsResponse.diarkisClientTimeout;
        }
        int i17 = i12;
        if ((i14 & 16) != 0) {
            i13 = shooterMemberAvatarsResponse.lobbyWaitingTimeout;
        }
        int i18 = i13;
        if ((i14 & 32) != 0) {
            status = shooterMemberAvatarsResponse.status;
        }
        return shooterMemberAvatarsResponse.copy(list2, i15, i16, i17, i18, status);
    }

    public final List<ShooterMemberAvatar> component1() {
        return this.viewers;
    }

    public final int component2() {
        return this.gameType;
    }

    public final int component3() {
        return this.gameStartInterval;
    }

    public final int component4() {
        return this.diarkisClientTimeout;
    }

    public final int component5() {
        return this.lobbyWaitingTimeout;
    }

    public final Status component6() {
        return this.status;
    }

    public final ShooterMemberAvatarsResponse copy(List<ShooterMemberAvatar> list, int i10, int i11, int i12, int i13, Status status) {
        p.h(list, "viewers");
        p.h(status, "status");
        return new ShooterMemberAvatarsResponse(list, i10, i11, i12, i13, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMemberAvatarsResponse) {
            ShooterMemberAvatarsResponse shooterMemberAvatarsResponse = (ShooterMemberAvatarsResponse) obj;
            return p.c(this.viewers, shooterMemberAvatarsResponse.viewers) && this.gameType == shooterMemberAvatarsResponse.gameType && this.gameStartInterval == shooterMemberAvatarsResponse.gameStartInterval && this.diarkisClientTimeout == shooterMemberAvatarsResponse.diarkisClientTimeout && this.lobbyWaitingTimeout == shooterMemberAvatarsResponse.lobbyWaitingTimeout && p.c(this.status, shooterMemberAvatarsResponse.status);
        }
        return false;
    }

    public final int getDiarkisClientTimeout() {
        return this.diarkisClientTimeout;
    }

    public final int getGameStartInterval() {
        return this.gameStartInterval;
    }

    public final int getGameType() {
        return this.gameType;
    }

    public final int getLobbyWaitingTimeout() {
        return this.lobbyWaitingTimeout;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<ShooterMemberAvatar> getViewers() {
        return this.viewers;
    }

    public int hashCode() {
        return (((((((((this.viewers.hashCode() * 31) + Integer.hashCode(this.gameType)) * 31) + Integer.hashCode(this.gameStartInterval)) * 31) + Integer.hashCode(this.diarkisClientTimeout)) * 31) + Integer.hashCode(this.lobbyWaitingTimeout)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ShooterMemberAvatarsResponse(viewers=" + this.viewers + ", gameType=" + this.gameType + ", gameStartInterval=" + this.gameStartInterval + ", diarkisClientTimeout=" + this.diarkisClientTimeout + ", lobbyWaitingTimeout=" + this.lobbyWaitingTimeout + ", status=" + this.status + ')';
    }
}

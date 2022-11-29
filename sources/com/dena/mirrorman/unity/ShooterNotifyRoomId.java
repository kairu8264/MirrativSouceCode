package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class ShooterNotifyRoomId {
    public static final int $stable = 0;
    private final EmomoGameName gameName;
    private final String roomId;

    public ShooterNotifyRoomId(EmomoGameName emomoGameName, String str) {
        p.h(emomoGameName, "gameName");
        p.h(str, "roomId");
        this.gameName = emomoGameName;
        this.roomId = str;
    }

    public static /* synthetic */ ShooterNotifyRoomId copy$default(ShooterNotifyRoomId shooterNotifyRoomId, EmomoGameName emomoGameName, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            emomoGameName = shooterNotifyRoomId.gameName;
        }
        if ((i10 & 2) != 0) {
            str = shooterNotifyRoomId.roomId;
        }
        return shooterNotifyRoomId.copy(emomoGameName, str);
    }

    public final EmomoGameName component1() {
        return this.gameName;
    }

    public final String component2() {
        return this.roomId;
    }

    public final ShooterNotifyRoomId copy(EmomoGameName emomoGameName, String str) {
        p.h(emomoGameName, "gameName");
        p.h(str, "roomId");
        return new ShooterNotifyRoomId(emomoGameName, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterNotifyRoomId) {
            ShooterNotifyRoomId shooterNotifyRoomId = (ShooterNotifyRoomId) obj;
            return this.gameName == shooterNotifyRoomId.gameName && p.c(this.roomId, shooterNotifyRoomId.roomId);
        }
        return false;
    }

    public final EmomoGameName getGameName() {
        return this.gameName;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return (this.gameName.hashCode() * 31) + this.roomId.hashCode();
    }

    public String toString() {
        return "ShooterNotifyRoomId(gameName=" + this.gameName + ", roomId=" + this.roomId + ')';
    }
}

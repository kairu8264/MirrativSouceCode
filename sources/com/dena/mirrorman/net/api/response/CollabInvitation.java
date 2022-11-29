package com.dena.mirrorman.net.api.response;

import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class CollabInvitation {
    public static final int $stable = 0;
    @b(CollabTypeAdapter.class)
    private final CollabType collabType;

    public CollabInvitation(CollabType collabType) {
        p.h(collabType, "collabType");
        this.collabType = collabType;
    }

    public static /* synthetic */ CollabInvitation copy$default(CollabInvitation collabInvitation, CollabType collabType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collabType = collabInvitation.collabType;
        }
        return collabInvitation.copy(collabType);
    }

    public final CollabType component1() {
        return this.collabType;
    }

    public final CollabInvitation copy(CollabType collabType) {
        p.h(collabType, "collabType");
        return new CollabInvitation(collabType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollabInvitation) && this.collabType == ((CollabInvitation) obj).collabType;
    }

    public final CollabType getCollabType() {
        return this.collabType;
    }

    public int hashCode() {
        return this.collabType.hashCode();
    }

    public String toString() {
        return "CollabInvitation(collabType=" + this.collabType + ')';
    }
}

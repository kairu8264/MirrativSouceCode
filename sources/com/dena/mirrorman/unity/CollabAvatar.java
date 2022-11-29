package com.dena.mirrorman.unity;

import jf.c;
import jo.p;

/* loaded from: classes3.dex */
public final class CollabAvatar {
    public static final int $stable = 8;
    private c closetAvatarModel;
    private int slot;
    private int userId;

    public CollabAvatar(int i10, int i11, c cVar) {
        p.h(cVar, "closetAvatarModel");
        this.userId = i10;
        this.slot = i11;
        this.closetAvatarModel = cVar;
    }

    public static /* synthetic */ CollabAvatar copy$default(CollabAvatar collabAvatar, int i10, int i11, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = collabAvatar.userId;
        }
        if ((i12 & 2) != 0) {
            i11 = collabAvatar.slot;
        }
        if ((i12 & 4) != 0) {
            cVar = collabAvatar.closetAvatarModel;
        }
        return collabAvatar.copy(i10, i11, cVar);
    }

    public final int component1() {
        return this.userId;
    }

    public final int component2() {
        return this.slot;
    }

    public final c component3() {
        return this.closetAvatarModel;
    }

    public final CollabAvatar copy(int i10, int i11, c cVar) {
        p.h(cVar, "closetAvatarModel");
        return new CollabAvatar(i10, i11, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabAvatar) {
            CollabAvatar collabAvatar = (CollabAvatar) obj;
            return this.userId == collabAvatar.userId && this.slot == collabAvatar.slot && p.c(this.closetAvatarModel, collabAvatar.closetAvatarModel);
        }
        return false;
    }

    public final c getClosetAvatarModel() {
        return this.closetAvatarModel;
    }

    public final int getSlot() {
        return this.slot;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.slot)) * 31) + this.closetAvatarModel.hashCode();
    }

    public final void setClosetAvatarModel(c cVar) {
        p.h(cVar, "<set-?>");
        this.closetAvatarModel = cVar;
    }

    public final void setSlot(int i10) {
        this.slot = i10;
    }

    public final void setUserId(int i10) {
        this.userId = i10;
    }

    public String toString() {
        return "CollabAvatar(userId=" + this.userId + ", slot=" + this.slot + ", closetAvatarModel=" + this.closetAvatarModel + ')';
    }
}

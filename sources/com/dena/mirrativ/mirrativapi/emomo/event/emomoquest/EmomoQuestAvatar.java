package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestAvatar {
    private final ClosetAvatar avatar;
    private final Status status;

    public EmomoQuestAvatar(ClosetAvatar closetAvatar, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(status, "status");
        this.avatar = closetAvatar;
        this.status = status;
    }

    public static /* synthetic */ EmomoQuestAvatar copy$default(EmomoQuestAvatar emomoQuestAvatar, ClosetAvatar closetAvatar, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closetAvatar = emomoQuestAvatar.avatar;
        }
        if ((i10 & 2) != 0) {
            status = emomoQuestAvatar.status;
        }
        return emomoQuestAvatar.copy(closetAvatar, status);
    }

    public final ClosetAvatar component1() {
        return this.avatar;
    }

    public final Status component2() {
        return this.status;
    }

    public final EmomoQuestAvatar copy(ClosetAvatar closetAvatar, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(status, "status");
        return new EmomoQuestAvatar(closetAvatar, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestAvatar) {
            EmomoQuestAvatar emomoQuestAvatar = (EmomoQuestAvatar) obj;
            return p.c(this.avatar, emomoQuestAvatar.avatar) && p.c(this.status, emomoQuestAvatar.status);
        }
        return false;
    }

    public final ClosetAvatar getAvatar() {
        return this.avatar;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.avatar.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoQuestAvatar(avatar=" + this.avatar + ", status=" + this.status + ')';
    }
}

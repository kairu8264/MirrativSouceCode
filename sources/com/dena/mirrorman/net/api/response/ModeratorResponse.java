package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class ModeratorResponse {
    public static final int $stable = 8;
    private final Moderator moderator;
    private final Status status;

    public ModeratorResponse(Moderator moderator, Status status) {
        p.h(moderator, "moderator");
        p.h(status, "status");
        this.moderator = moderator;
        this.status = status;
    }

    public static /* synthetic */ ModeratorResponse copy$default(ModeratorResponse moderatorResponse, Moderator moderator, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            moderator = moderatorResponse.moderator;
        }
        if ((i10 & 2) != 0) {
            status = moderatorResponse.status;
        }
        return moderatorResponse.copy(moderator, status);
    }

    public final Moderator component1() {
        return this.moderator;
    }

    public final Status component2() {
        return this.status;
    }

    public final ModeratorResponse copy(Moderator moderator, Status status) {
        p.h(moderator, "moderator");
        p.h(status, "status");
        return new ModeratorResponse(moderator, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModeratorResponse) {
            ModeratorResponse moderatorResponse = (ModeratorResponse) obj;
            return p.c(this.moderator, moderatorResponse.moderator) && p.c(this.status, moderatorResponse.status);
        }
        return false;
    }

    public final Moderator getModerator() {
        return this.moderator;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.moderator.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ModeratorResponse(moderator=" + this.moderator + ", status=" + this.status + ')';
    }
}

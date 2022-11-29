package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.CollabTypeAdapter;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public class LiveViewingUser extends UserBasicParams {
    public static final int $stable = 8;
    @b(CollabTypeAdapter.class)
    private final CollabType collabType;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    @b(BooleanTypeAdapter.class)
    private final Boolean isStartedCollab;
    private final String liveId;
    private final Status status;
    private final int yellLevel;
    private final int yellRank;

    public /* synthetic */ LiveViewingUser(Status status, boolean z10, String str, CollabType collabType, Boolean bool, int i10, int i11, int i12, h hVar) {
        this(status, z10, str, collabType, bool, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? 0 : i11);
    }

    public final CollabType getCollabType() {
        return this.collabType;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final int getYellRank() {
        return this.yellRank;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public final Boolean isStartedCollab() {
        return this.isStartedCollab;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveViewingUser(Status status, boolean z10, String str, CollabType collabType, Boolean bool, int i10, int i11) {
        super(null, null, null, null, null, 0, null, null, null, null, null, 0, false, false, 0L, false, false, false, 0, 524287, null);
        p.h(status, "status");
        this.status = status;
        this.isModerator = z10;
        this.liveId = str;
        this.collabType = collabType;
        this.isStartedCollab = bool;
        this.yellRank = i10;
        this.yellLevel = i11;
    }
}

package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class ChatMessageRead {
    public static final int $stable = 0;
    private final long invitedMessageId;
    private final long lastReadMessageId;

    /* renamed from: t  reason: collision with root package name */
    private final int f26181t;
    private final String userId;

    public ChatMessageRead(int i10, String str, long j10, long j11) {
        p.h(str, "userId");
        this.f26181t = i10;
        this.userId = str;
        this.invitedMessageId = j10;
        this.lastReadMessageId = j11;
    }

    public final long getInvitedMessageId() {
        return this.invitedMessageId;
    }

    public final long getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final int getT() {
        return this.f26181t;
    }

    public final String getUserId() {
        return this.userId;
    }
}

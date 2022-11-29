package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class ChatConfirmationResponse {
    private final ChatStatus chatStatus;
    private final Status status;

    public ChatConfirmationResponse(Status status, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(chatStatus, "chatStatus");
        this.status = status;
        this.chatStatus = chatStatus;
    }

    public static /* synthetic */ ChatConfirmationResponse copy$default(ChatConfirmationResponse chatConfirmationResponse, Status status, ChatStatus chatStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = chatConfirmationResponse.status;
        }
        if ((i10 & 2) != 0) {
            chatStatus = chatConfirmationResponse.chatStatus;
        }
        return chatConfirmationResponse.copy(status, chatStatus);
    }

    public final Status component1() {
        return this.status;
    }

    public final ChatStatus component2() {
        return this.chatStatus;
    }

    public final ChatConfirmationResponse copy(Status status, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(chatStatus, "chatStatus");
        return new ChatConfirmationResponse(status, chatStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatConfirmationResponse) {
            ChatConfirmationResponse chatConfirmationResponse = (ChatConfirmationResponse) obj;
            return p.c(this.status, chatConfirmationResponse.status) && p.c(this.chatStatus, chatConfirmationResponse.chatStatus);
        }
        return false;
    }

    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.chatStatus.hashCode();
    }

    public String toString() {
        return "ChatConfirmationResponse(status=" + this.status + ", chatStatus=" + this.chatStatus + ')';
    }
}

package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ChatThreadMessages {
    public static final int $stable = 8;
    private final int chatEntirePushEnabled;
    private final ChatStatus chatStatus;
    private final int hasNew;
    private final int hasOld;
    private final String isKickedBy;
    private final List<Chat.Message> messages;
    private final Status status;
    private final Chat.Thread thread;

    public ChatThreadMessages(Status status, int i10, Chat.Thread thread, String str, int i11, int i12, List<Chat.Message> list, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(thread, "thread");
        p.h(str, "isKickedBy");
        p.h(list, "messages");
        p.h(chatStatus, "chatStatus");
        this.status = status;
        this.chatEntirePushEnabled = i10;
        this.thread = thread;
        this.isKickedBy = str;
        this.hasNew = i11;
        this.hasOld = i12;
        this.messages = list;
        this.chatStatus = chatStatus;
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.chatEntirePushEnabled;
    }

    public final Chat.Thread component3() {
        return this.thread;
    }

    public final String component4() {
        return this.isKickedBy;
    }

    public final int component5() {
        return this.hasNew;
    }

    public final int component6() {
        return this.hasOld;
    }

    public final List<Chat.Message> component7() {
        return this.messages;
    }

    public final ChatStatus component8() {
        return this.chatStatus;
    }

    public final ChatThreadMessages copy(Status status, int i10, Chat.Thread thread, String str, int i11, int i12, List<Chat.Message> list, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(thread, "thread");
        p.h(str, "isKickedBy");
        p.h(list, "messages");
        p.h(chatStatus, "chatStatus");
        return new ChatThreadMessages(status, i10, thread, str, i11, i12, list, chatStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatThreadMessages) {
            ChatThreadMessages chatThreadMessages = (ChatThreadMessages) obj;
            return p.c(this.status, chatThreadMessages.status) && this.chatEntirePushEnabled == chatThreadMessages.chatEntirePushEnabled && p.c(this.thread, chatThreadMessages.thread) && p.c(this.isKickedBy, chatThreadMessages.isKickedBy) && this.hasNew == chatThreadMessages.hasNew && this.hasOld == chatThreadMessages.hasOld && p.c(this.messages, chatThreadMessages.messages) && p.c(this.chatStatus, chatThreadMessages.chatStatus);
        }
        return false;
    }

    public final int getChatEntirePushEnabled() {
        return this.chatEntirePushEnabled;
    }

    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    public final int getHasNew() {
        return this.hasNew;
    }

    public final int getHasOld() {
        return this.hasOld;
    }

    public final List<Chat.Message> getMessages() {
        return this.messages;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Chat.Thread getThread() {
        return this.thread;
    }

    public int hashCode() {
        return (((((((((((((this.status.hashCode() * 31) + Integer.hashCode(this.chatEntirePushEnabled)) * 31) + this.thread.hashCode()) * 31) + this.isKickedBy.hashCode()) * 31) + Integer.hashCode(this.hasNew)) * 31) + Integer.hashCode(this.hasOld)) * 31) + this.messages.hashCode()) * 31) + this.chatStatus.hashCode();
    }

    public final String isKickedBy() {
        return this.isKickedBy;
    }

    public String toString() {
        return "ChatThreadMessages(status=" + this.status + ", chatEntirePushEnabled=" + this.chatEntirePushEnabled + ", thread=" + this.thread + ", isKickedBy=" + this.isKickedBy + ", hasNew=" + this.hasNew + ", hasOld=" + this.hasOld + ", messages=" + this.messages + ", chatStatus=" + this.chatStatus + ')';
    }
}

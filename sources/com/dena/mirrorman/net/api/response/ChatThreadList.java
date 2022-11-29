package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.net.api.response.Chat;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ChatThreadList {
    public static final int $stable = 8;
    private final ChatStatus chatStatus;
    private final int currentPage;
    private final int nextPage;
    private final Status status;
    private final List<Chat.Thread> threads;

    public ChatThreadList(Status status, int i10, int i11, List<Chat.Thread> list, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(list, "threads");
        p.h(chatStatus, "chatStatus");
        this.status = status;
        this.nextPage = i10;
        this.currentPage = i11;
        this.threads = list;
        this.chatStatus = chatStatus;
    }

    public static /* synthetic */ ChatThreadList copy$default(ChatThreadList chatThreadList, Status status, int i10, int i11, List list, ChatStatus chatStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = chatThreadList.status;
        }
        if ((i12 & 2) != 0) {
            i10 = chatThreadList.nextPage;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = chatThreadList.currentPage;
        }
        int i14 = i11;
        List<Chat.Thread> list2 = list;
        if ((i12 & 8) != 0) {
            list2 = chatThreadList.threads;
        }
        List list3 = list2;
        if ((i12 & 16) != 0) {
            chatStatus = chatThreadList.chatStatus;
        }
        return chatThreadList.copy(status, i13, i14, list3, chatStatus);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.nextPage;
    }

    public final int component3() {
        return this.currentPage;
    }

    public final List<Chat.Thread> component4() {
        return this.threads;
    }

    public final ChatStatus component5() {
        return this.chatStatus;
    }

    public final ChatThreadList copy(Status status, int i10, int i11, List<Chat.Thread> list, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(list, "threads");
        p.h(chatStatus, "chatStatus");
        return new ChatThreadList(status, i10, i11, list, chatStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatThreadList) {
            ChatThreadList chatThreadList = (ChatThreadList) obj;
            return p.c(this.status, chatThreadList.status) && this.nextPage == chatThreadList.nextPage && this.currentPage == chatThreadList.currentPage && p.c(this.threads, chatThreadList.threads) && p.c(this.chatStatus, chatThreadList.chatStatus);
        }
        return false;
    }

    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<Chat.Thread> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        return (((((((this.status.hashCode() * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.threads.hashCode()) * 31) + this.chatStatus.hashCode();
    }

    public String toString() {
        return "ChatThreadList(status=" + this.status + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", threads=" + this.threads + ", chatStatus=" + this.chatStatus + ')';
    }
}

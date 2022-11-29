package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunUserList implements Serializable {
    private final String title;
    private final List<EmomoRunUserDetail> users;

    public EmomoRunUserList(String str, List<EmomoRunUserDetail> list) {
        p.h(str, "title");
        p.h(list, "users");
        this.title = str;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmomoRunUserList copy$default(EmomoRunUserList emomoRunUserList, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emomoRunUserList.title;
        }
        if ((i10 & 2) != 0) {
            list = emomoRunUserList.users;
        }
        return emomoRunUserList.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<EmomoRunUserDetail> component2() {
        return this.users;
    }

    public final EmomoRunUserList copy(String str, List<EmomoRunUserDetail> list) {
        p.h(str, "title");
        p.h(list, "users");
        return new EmomoRunUserList(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunUserList) {
            EmomoRunUserList emomoRunUserList = (EmomoRunUserList) obj;
            return p.c(this.title, emomoRunUserList.title) && p.c(this.users, emomoRunUserList.users);
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<EmomoRunUserDetail> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.users.hashCode();
    }

    public String toString() {
        return "EmomoRunUserList(title=" + this.title + ", users=" + this.users + ')';
    }
}

package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingUserList implements Serializable {
    private final String title;
    private final List<GiftRankingUserDetail> users;

    public GiftRankingUserList(String str, List<GiftRankingUserDetail> list) {
        p.h(str, "title");
        p.h(list, "users");
        this.title = str;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftRankingUserList copy$default(GiftRankingUserList giftRankingUserList, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftRankingUserList.title;
        }
        if ((i10 & 2) != 0) {
            list = giftRankingUserList.users;
        }
        return giftRankingUserList.copy(str, list);
    }

    public final String component1() {
        return this.title;
    }

    public final List<GiftRankingUserDetail> component2() {
        return this.users;
    }

    public final GiftRankingUserList copy(String str, List<GiftRankingUserDetail> list) {
        p.h(str, "title");
        p.h(list, "users");
        return new GiftRankingUserList(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingUserList) {
            GiftRankingUserList giftRankingUserList = (GiftRankingUserList) obj;
            return p.c(this.title, giftRankingUserList.title) && p.c(this.users, giftRankingUserList.users);
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<GiftRankingUserDetail> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.users.hashCode();
    }

    public String toString() {
        return "GiftRankingUserList(title=" + this.title + ", users=" + this.users + ')';
    }
}

package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftRankingTopUsers {
    public static final int $stable = 8;
    @c(TopicConstant.PACKET_TYPE_TEXT)

    /* renamed from: t  reason: collision with root package name */
    private final int f26185t;
    @c("users")
    private final List<RankingUser> users;

    public GiftRankingTopUsers(int i10, List<RankingUser> list) {
        this.f26185t = i10;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftRankingTopUsers copy$default(GiftRankingTopUsers giftRankingTopUsers, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftRankingTopUsers.f26185t;
        }
        if ((i11 & 2) != 0) {
            list = giftRankingTopUsers.users;
        }
        return giftRankingTopUsers.copy(i10, list);
    }

    public final int component1() {
        return this.f26185t;
    }

    public final List<RankingUser> component2() {
        return this.users;
    }

    public final GiftRankingTopUsers copy(int i10, List<RankingUser> list) {
        return new GiftRankingTopUsers(i10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingTopUsers) {
            GiftRankingTopUsers giftRankingTopUsers = (GiftRankingTopUsers) obj;
            return this.f26185t == giftRankingTopUsers.f26185t && p.c(this.users, giftRankingTopUsers.users);
        }
        return false;
    }

    public final int getT() {
        return this.f26185t;
    }

    public final List<RankingUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f26185t) * 31;
        List<RankingUser> list = this.users;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GiftRankingTopUsers(t=" + this.f26185t + ", users=" + this.users + ')';
    }
}

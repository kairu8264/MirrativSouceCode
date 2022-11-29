package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGiftRankingUser {
    public static final int $stable = 8;
    private final int point;
    private final UserBasicParams user;
    private final int yellLevel;
    private final int yellRank;

    public LiveGiftRankingUser(UserBasicParams userBasicParams, int i10, int i11, int i12) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        this.user = userBasicParams;
        this.point = i10;
        this.yellRank = i11;
        this.yellLevel = i12;
    }

    public static /* synthetic */ LiveGiftRankingUser copy$default(LiveGiftRankingUser liveGiftRankingUser, UserBasicParams userBasicParams, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userBasicParams = liveGiftRankingUser.user;
        }
        if ((i13 & 2) != 0) {
            i10 = liveGiftRankingUser.point;
        }
        if ((i13 & 4) != 0) {
            i11 = liveGiftRankingUser.yellRank;
        }
        if ((i13 & 8) != 0) {
            i12 = liveGiftRankingUser.yellLevel;
        }
        return liveGiftRankingUser.copy(userBasicParams, i10, i11, i12);
    }

    public final UserBasicParams component1() {
        return this.user;
    }

    public final int component2() {
        return this.point;
    }

    public final int component3() {
        return this.yellRank;
    }

    public final int component4() {
        return this.yellLevel;
    }

    public final LiveGiftRankingUser copy(UserBasicParams userBasicParams, int i10, int i11, int i12) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        return new LiveGiftRankingUser(userBasicParams, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGiftRankingUser) {
            LiveGiftRankingUser liveGiftRankingUser = (LiveGiftRankingUser) obj;
            return p.c(this.user, liveGiftRankingUser.user) && this.point == liveGiftRankingUser.point && this.yellRank == liveGiftRankingUser.yellRank && this.yellLevel == liveGiftRankingUser.yellLevel;
        }
        return false;
    }

    public final int getPoint() {
        return this.point;
    }

    public final UserBasicParams getUser() {
        return this.user;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final int getYellRank() {
        return this.yellRank;
    }

    public int hashCode() {
        return (((((this.user.hashCode() * 31) + Integer.hashCode(this.point)) * 31) + Integer.hashCode(this.yellRank)) * 31) + Integer.hashCode(this.yellLevel);
    }

    public String toString() {
        return "LiveGiftRankingUser(user=" + this.user + ", point=" + this.point + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ')';
    }
}

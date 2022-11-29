package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveCommentFromApi implements Serializable {
    public static final int $stable = 0;
    private final String badgeImageUrl;
    private final String comment;
    private final int createdAt;

    /* renamed from: id  reason: collision with root package name */
    private final String f26167id;
    @b(BooleanTypeAdapter.class)
    private final boolean isCheerleader;
    @b(BooleanTypeAdapter.class)
    private final boolean isContinuousStreamer;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    private final String profileImageUrl;
    private final String userId;
    private final String userName;
    private final int yellLevel;
    private final int yellRank;

    public LiveCommentFromApi() {
        this(null, null, null, null, 0, null, null, false, false, false, 0, 0, 4095, null);
    }

    public LiveCommentFromApi(String str, String str2, String str3, String str4, int i10, String str5, String str6, boolean z10, boolean z11, boolean z12, int i11, int i12) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "comment");
        p.h(str3, "userId");
        p.h(str4, "userName");
        p.h(str5, "profileImageUrl");
        p.h(str6, "badgeImageUrl");
        this.f26167id = str;
        this.comment = str2;
        this.userId = str3;
        this.userName = str4;
        this.createdAt = i10;
        this.profileImageUrl = str5;
        this.badgeImageUrl = str6;
        this.isCheerleader = z10;
        this.isModerator = z11;
        this.isContinuousStreamer = z12;
        this.yellRank = i11;
        this.yellLevel = i12;
    }

    public final String component1() {
        return this.f26167id;
    }

    public final boolean component10() {
        return this.isContinuousStreamer;
    }

    public final int component11() {
        return this.yellRank;
    }

    public final int component12() {
        return this.yellLevel;
    }

    public final String component2() {
        return this.comment;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.userName;
    }

    public final int component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.profileImageUrl;
    }

    public final String component7() {
        return this.badgeImageUrl;
    }

    public final boolean component8() {
        return this.isCheerleader;
    }

    public final boolean component9() {
        return this.isModerator;
    }

    public final LiveCommentFromApi copy(String str, String str2, String str3, String str4, int i10, String str5, String str6, boolean z10, boolean z11, boolean z12, int i11, int i12) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "comment");
        p.h(str3, "userId");
        p.h(str4, "userName");
        p.h(str5, "profileImageUrl");
        p.h(str6, "badgeImageUrl");
        return new LiveCommentFromApi(str, str2, str3, str4, i10, str5, str6, z10, z11, z12, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCommentFromApi) {
            LiveCommentFromApi liveCommentFromApi = (LiveCommentFromApi) obj;
            return p.c(this.f26167id, liveCommentFromApi.f26167id) && p.c(this.comment, liveCommentFromApi.comment) && p.c(this.userId, liveCommentFromApi.userId) && p.c(this.userName, liveCommentFromApi.userName) && this.createdAt == liveCommentFromApi.createdAt && p.c(this.profileImageUrl, liveCommentFromApi.profileImageUrl) && p.c(this.badgeImageUrl, liveCommentFromApi.badgeImageUrl) && this.isCheerleader == liveCommentFromApi.isCheerleader && this.isModerator == liveCommentFromApi.isModerator && this.isContinuousStreamer == liveCommentFromApi.isContinuousStreamer && this.yellRank == liveCommentFromApi.yellRank && this.yellLevel == liveCommentFromApi.yellLevel;
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getComment() {
        return this.comment;
    }

    public final int getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f26167id;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final int getYellRank() {
        return this.yellRank;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f26167id.hashCode() * 31) + this.comment.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + Integer.hashCode(this.createdAt)) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        boolean z10 = this.isCheerleader;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isModerator;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.isContinuousStreamer;
        return ((((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.yellRank)) * 31) + Integer.hashCode(this.yellLevel);
    }

    public final boolean isCheerleader() {
        return this.isCheerleader;
    }

    public final boolean isContinuousStreamer() {
        return this.isContinuousStreamer;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public String toString() {
        return "LiveCommentFromApi(id=" + this.f26167id + ", comment=" + this.comment + ", userId=" + this.userId + ", userName=" + this.userName + ", createdAt=" + this.createdAt + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isCheerleader=" + this.isCheerleader + ", isModerator=" + this.isModerator + ", isContinuousStreamer=" + this.isContinuousStreamer + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ')';
    }

    public /* synthetic */ LiveCommentFromApi(String str, String str2, String str3, String str4, int i10, String str5, String str6, boolean z10, boolean z11, boolean z12, int i11, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? 0 : i10, (i13 & 32) != 0 ? "" : str5, (i13 & 64) == 0 ? str6 : "", (i13 & 128) != 0 ? false : z10, (i13 & 256) != 0 ? false : z11, (i13 & 512) != 0 ? false : z12, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) == 0 ? i12 : 0);
    }
}

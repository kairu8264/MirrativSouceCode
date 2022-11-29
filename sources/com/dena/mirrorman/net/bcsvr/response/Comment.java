package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class Comment {
    public static final int $stable = 0;
    private final String avatarBodyImageUrl;
    @c("burl")
    private final String badgeImageUrl;
    @c("collab_streamer_ac")
    private final String collabStreamerUserName;
    private final String description;
    @b(BooleanTypeAdapter.class)
    private final boolean isCheerleader;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    private final String linkedLiveOwnerName;
    @c("cm")
    private final String liveComment;
    @c("lci")
    private final String liveCommentId;
    @c("iurl")
    private final String profileImageUrl;
    private final String speech;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;
    private final int yellLevel;
    private final int yellRank;

    public Comment(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, String str8, String str9, String str10, int i11, int i12, String str11) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "liveCommentId");
        this.type = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.liveCommentId = str5;
        this.liveComment = str6;
        this.speech = str7;
        this.isCheerleader = z10;
        this.isModerator = z11;
        this.linkedLiveOwnerName = str8;
        this.description = str9;
        this.collabStreamerUserName = str10;
        this.yellRank = i11;
        this.yellLevel = i12;
        this.avatarBodyImageUrl = str11;
    }

    public final int component1() {
        return this.type;
    }

    public final boolean component10() {
        return this.isModerator;
    }

    public final String component11() {
        return this.linkedLiveOwnerName;
    }

    public final String component12() {
        return this.description;
    }

    public final String component13() {
        return this.collabStreamerUserName;
    }

    public final int component14() {
        return this.yellRank;
    }

    public final int component15() {
        return this.yellLevel;
    }

    public final String component16() {
        return this.avatarBodyImageUrl;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.userName;
    }

    public final String component4() {
        return this.profileImageUrl;
    }

    public final String component5() {
        return this.badgeImageUrl;
    }

    public final String component6() {
        return this.liveCommentId;
    }

    public final String component7() {
        return this.liveComment;
    }

    public final String component8() {
        return this.speech;
    }

    public final boolean component9() {
        return this.isCheerleader;
    }

    public final Comment copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, String str8, String str9, String str10, int i11, int i12, String str11) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "liveCommentId");
        return new Comment(i10, str, str2, str3, str4, str5, str6, str7, z10, z11, str8, str9, str10, i11, i12, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Comment) {
            Comment comment = (Comment) obj;
            return this.type == comment.type && p.c(this.userId, comment.userId) && p.c(this.userName, comment.userName) && p.c(this.profileImageUrl, comment.profileImageUrl) && p.c(this.badgeImageUrl, comment.badgeImageUrl) && p.c(this.liveCommentId, comment.liveCommentId) && p.c(this.liveComment, comment.liveComment) && p.c(this.speech, comment.speech) && this.isCheerleader == comment.isCheerleader && this.isModerator == comment.isModerator && p.c(this.linkedLiveOwnerName, comment.linkedLiveOwnerName) && p.c(this.description, comment.description) && p.c(this.collabStreamerUserName, comment.collabStreamerUserName) && this.yellRank == comment.yellRank && this.yellLevel == comment.yellLevel && p.c(this.avatarBodyImageUrl, comment.avatarBodyImageUrl);
        }
        return false;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getCollabStreamerUserName() {
        return this.collabStreamerUserName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLinkedLiveOwnerName() {
        return this.linkedLiveOwnerName;
    }

    public final String getLiveComment() {
        return this.liveComment;
    }

    public final String getLiveCommentId() {
        return this.liveCommentId;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getSpeech() {
        return this.speech;
    }

    public final int getType() {
        return this.type;
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
        int hashCode = ((((((((((Integer.hashCode(this.type) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.liveCommentId.hashCode()) * 31;
        String str = this.liveComment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.speech;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.isCheerleader;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode3 + i10) * 31;
        boolean z11 = this.isModerator;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str3 = this.linkedLiveOwnerName;
        int hashCode4 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.collabStreamerUserName;
        int hashCode6 = (((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.yellRank)) * 31) + Integer.hashCode(this.yellLevel)) * 31;
        String str6 = this.avatarBodyImageUrl;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isCheerleader() {
        return this.isCheerleader;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public String toString() {
        return "Comment(type=" + this.type + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", liveCommentId=" + this.liveCommentId + ", liveComment=" + this.liveComment + ", speech=" + this.speech + ", isCheerleader=" + this.isCheerleader + ", isModerator=" + this.isModerator + ", linkedLiveOwnerName=" + this.linkedLiveOwnerName + ", description=" + this.description + ", collabStreamerUserName=" + this.collabStreamerUserName + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ", avatarBodyImageUrl=" + this.avatarBodyImageUrl + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Comment(int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, java.lang.String r36, int r37, jo.h r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r7 = r2
            goto Lc
        La:
            r7 = r24
        Lc:
            r1 = r0 & 16
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r25
        L14:
            r1 = r0 & 32
            if (r1 == 0) goto L27
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "randomUUID().toString()"
            jo.p.g(r1, r2)
            r9 = r1
            goto L29
        L27:
            r9 = r26
        L29:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L31
            r17 = r2
            goto L33
        L31:
            r17 = r34
        L33:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L3a
            r18 = r2
            goto L3c
        L3a:
            r18 = r35
        L3c:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            r19 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.net.bcsvr.response.Comment.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, int, jo.h):void");
    }
}

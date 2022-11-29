package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class LiveGameConnectBcsvrResponse {
    public static final int $stable = 8;
    private final String liveGameId;
    private final String playId;
    private final String requestUserBadgeUrl;
    private final String requestUserId;
    private final String requestUserImageUrl;
    private final String requestUserName;
    private final String title;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    private final List<String> userIds;

    public LiveGameConnectBcsvrResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
        p.h(str, "liveGameId");
        p.h(str2, "title");
        p.h(str3, "requestUserId");
        p.h(str4, "requestUserName");
        p.h(str5, "requestUserImageUrl");
        p.h(str6, "requestUserBadgeUrl");
        p.h(list, "userIds");
        p.h(str7, "playId");
        this.type = i10;
        this.liveGameId = str;
        this.title = str2;
        this.requestUserId = str3;
        this.requestUserName = str4;
        this.requestUserImageUrl = str5;
        this.requestUserBadgeUrl = str6;
        this.userIds = list;
        this.playId = str7;
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.liveGameId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.requestUserId;
    }

    public final String component5() {
        return this.requestUserName;
    }

    public final String component6() {
        return this.requestUserImageUrl;
    }

    public final String component7() {
        return this.requestUserBadgeUrl;
    }

    public final List<String> component8() {
        return this.userIds;
    }

    public final String component9() {
        return this.playId;
    }

    public final LiveGameConnectBcsvrResponse copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
        p.h(str, "liveGameId");
        p.h(str2, "title");
        p.h(str3, "requestUserId");
        p.h(str4, "requestUserName");
        p.h(str5, "requestUserImageUrl");
        p.h(str6, "requestUserBadgeUrl");
        p.h(list, "userIds");
        p.h(str7, "playId");
        return new LiveGameConnectBcsvrResponse(i10, str, str2, str3, str4, str5, str6, list, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameConnectBcsvrResponse) {
            LiveGameConnectBcsvrResponse liveGameConnectBcsvrResponse = (LiveGameConnectBcsvrResponse) obj;
            return this.type == liveGameConnectBcsvrResponse.type && p.c(this.liveGameId, liveGameConnectBcsvrResponse.liveGameId) && p.c(this.title, liveGameConnectBcsvrResponse.title) && p.c(this.requestUserId, liveGameConnectBcsvrResponse.requestUserId) && p.c(this.requestUserName, liveGameConnectBcsvrResponse.requestUserName) && p.c(this.requestUserImageUrl, liveGameConnectBcsvrResponse.requestUserImageUrl) && p.c(this.requestUserBadgeUrl, liveGameConnectBcsvrResponse.requestUserBadgeUrl) && p.c(this.userIds, liveGameConnectBcsvrResponse.userIds) && p.c(this.playId, liveGameConnectBcsvrResponse.playId);
        }
        return false;
    }

    public final String getLiveGameId() {
        return this.liveGameId;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final String getRequestUserBadgeUrl() {
        return this.requestUserBadgeUrl;
    }

    public final String getRequestUserId() {
        return this.requestUserId;
    }

    public final String getRequestUserImageUrl() {
        return this.requestUserImageUrl;
    }

    public final String getRequestUserName() {
        return this.requestUserName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final List<String> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.type) * 31) + this.liveGameId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.requestUserId.hashCode()) * 31) + this.requestUserName.hashCode()) * 31) + this.requestUserImageUrl.hashCode()) * 31) + this.requestUserBadgeUrl.hashCode()) * 31) + this.userIds.hashCode()) * 31) + this.playId.hashCode();
    }

    public String toString() {
        return "LiveGameConnectBcsvrResponse(type=" + this.type + ", liveGameId=" + this.liveGameId + ", title=" + this.title + ", requestUserId=" + this.requestUserId + ", requestUserName=" + this.requestUserName + ", requestUserImageUrl=" + this.requestUserImageUrl + ", requestUserBadgeUrl=" + this.requestUserBadgeUrl + ", userIds=" + this.userIds + ", playId=" + this.playId + ')';
    }
}

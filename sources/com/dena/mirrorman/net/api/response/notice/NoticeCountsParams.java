package com.dena.mirrorman.net.api.response.notice;

import jo.p;

/* loaded from: classes2.dex */
public final class NoticeCountsParams {
    public static final int $stable = 0;
    private final String appCampaigns;
    private final String campaigns;
    private final String chats;
    private final String emomoCampaigns;
    private final String followeeLives;
    private final String news;
    private final String presentBoxes;
    private final String recommendCampaigns;
    private final String yours;

    public NoticeCountsParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        p.h(str, "followeeLives");
        p.h(str2, "yours");
        p.h(str3, "news");
        p.h(str4, "chats");
        p.h(str5, "campaigns");
        p.h(str6, "presentBoxes");
        p.h(str7, "recommendCampaigns");
        p.h(str8, "emomoCampaigns");
        p.h(str9, "appCampaigns");
        this.followeeLives = str;
        this.yours = str2;
        this.news = str3;
        this.chats = str4;
        this.campaigns = str5;
        this.presentBoxes = str6;
        this.recommendCampaigns = str7;
        this.emomoCampaigns = str8;
        this.appCampaigns = str9;
    }

    public final String component1() {
        return this.followeeLives;
    }

    public final String component2() {
        return this.yours;
    }

    public final String component3() {
        return this.news;
    }

    public final String component4() {
        return this.chats;
    }

    public final String component5() {
        return this.campaigns;
    }

    public final String component6() {
        return this.presentBoxes;
    }

    public final String component7() {
        return this.recommendCampaigns;
    }

    public final String component8() {
        return this.emomoCampaigns;
    }

    public final String component9() {
        return this.appCampaigns;
    }

    public final NoticeCountsParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        p.h(str, "followeeLives");
        p.h(str2, "yours");
        p.h(str3, "news");
        p.h(str4, "chats");
        p.h(str5, "campaigns");
        p.h(str6, "presentBoxes");
        p.h(str7, "recommendCampaigns");
        p.h(str8, "emomoCampaigns");
        p.h(str9, "appCampaigns");
        return new NoticeCountsParams(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCountsParams) {
            NoticeCountsParams noticeCountsParams = (NoticeCountsParams) obj;
            return p.c(this.followeeLives, noticeCountsParams.followeeLives) && p.c(this.yours, noticeCountsParams.yours) && p.c(this.news, noticeCountsParams.news) && p.c(this.chats, noticeCountsParams.chats) && p.c(this.campaigns, noticeCountsParams.campaigns) && p.c(this.presentBoxes, noticeCountsParams.presentBoxes) && p.c(this.recommendCampaigns, noticeCountsParams.recommendCampaigns) && p.c(this.emomoCampaigns, noticeCountsParams.emomoCampaigns) && p.c(this.appCampaigns, noticeCountsParams.appCampaigns);
        }
        return false;
    }

    public final String getAppCampaigns() {
        return this.appCampaigns;
    }

    public final String getCampaigns() {
        return this.campaigns;
    }

    public final String getChats() {
        return this.chats;
    }

    public final String getEmomoCampaigns() {
        return this.emomoCampaigns;
    }

    public final String getFolloweeLives() {
        return this.followeeLives;
    }

    public final String getNews() {
        return this.news;
    }

    public final String getPresentBoxes() {
        return this.presentBoxes;
    }

    public final String getRecommendCampaigns() {
        return this.recommendCampaigns;
    }

    public final String getYours() {
        return this.yours;
    }

    public int hashCode() {
        return (((((((((((((((this.followeeLives.hashCode() * 31) + this.yours.hashCode()) * 31) + this.news.hashCode()) * 31) + this.chats.hashCode()) * 31) + this.campaigns.hashCode()) * 31) + this.presentBoxes.hashCode()) * 31) + this.recommendCampaigns.hashCode()) * 31) + this.emomoCampaigns.hashCode()) * 31) + this.appCampaigns.hashCode();
    }

    public String toString() {
        return "NoticeCountsParams(followeeLives=" + this.followeeLives + ", yours=" + this.yours + ", news=" + this.news + ", chats=" + this.chats + ", campaigns=" + this.campaigns + ", presentBoxes=" + this.presentBoxes + ", recommendCampaigns=" + this.recommendCampaigns + ", emomoCampaigns=" + this.emomoCampaigns + ", appCampaigns=" + this.appCampaigns + ')';
    }
}

package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.ShareTwitter;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignDetailResponse {
    public static final int $stable = 8;
    private final CampaignApp app;
    private final String appUserIdRegistrationNotes;
    private final CampaignAward broadcastAwards;
    private final List<String> copyrights;
    private final List<String> disclaimers;
    private final CampaignLink link;
    private final List<String> notes;
    private final String period;
    private final String periodNotes;
    private final ShareTwitter shareTwitter;
    private final SharingAward sharingAward;
    private final Status status;
    private final String title;
    private final String titleImageUrl;
    private final CampaignAward viewingAwards;

    public CampaignDetailResponse(Status status, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, CampaignAward campaignAward, CampaignApp campaignApp, String str5, CampaignAward campaignAward2, SharingAward sharingAward, ShareTwitter shareTwitter, CampaignLink campaignLink) {
        p.h(status, "status");
        p.h(str, "titleImageUrl");
        p.h(str2, "title");
        p.h(str3, "period");
        p.h(str4, "periodNotes");
        p.h(list, "notes");
        p.h(list2, "disclaimers");
        p.h(list3, "copyrights");
        p.h(campaignAward, "broadcastAwards");
        p.h(campaignApp, "app");
        p.h(str5, "appUserIdRegistrationNotes");
        this.status = status;
        this.titleImageUrl = str;
        this.title = str2;
        this.period = str3;
        this.periodNotes = str4;
        this.notes = list;
        this.disclaimers = list2;
        this.copyrights = list3;
        this.broadcastAwards = campaignAward;
        this.app = campaignApp;
        this.appUserIdRegistrationNotes = str5;
        this.viewingAwards = campaignAward2;
        this.sharingAward = sharingAward;
        this.shareTwitter = shareTwitter;
        this.link = campaignLink;
    }

    public final Status component1() {
        return this.status;
    }

    public final CampaignApp component10() {
        return this.app;
    }

    public final String component11() {
        return this.appUserIdRegistrationNotes;
    }

    public final CampaignAward component12() {
        return this.viewingAwards;
    }

    public final SharingAward component13() {
        return this.sharingAward;
    }

    public final ShareTwitter component14() {
        return this.shareTwitter;
    }

    public final CampaignLink component15() {
        return this.link;
    }

    public final String component2() {
        return this.titleImageUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.period;
    }

    public final String component5() {
        return this.periodNotes;
    }

    public final List<String> component6() {
        return this.notes;
    }

    public final List<String> component7() {
        return this.disclaimers;
    }

    public final List<String> component8() {
        return this.copyrights;
    }

    public final CampaignAward component9() {
        return this.broadcastAwards;
    }

    public final CampaignDetailResponse copy(Status status, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, CampaignAward campaignAward, CampaignApp campaignApp, String str5, CampaignAward campaignAward2, SharingAward sharingAward, ShareTwitter shareTwitter, CampaignLink campaignLink) {
        p.h(status, "status");
        p.h(str, "titleImageUrl");
        p.h(str2, "title");
        p.h(str3, "period");
        p.h(str4, "periodNotes");
        p.h(list, "notes");
        p.h(list2, "disclaimers");
        p.h(list3, "copyrights");
        p.h(campaignAward, "broadcastAwards");
        p.h(campaignApp, "app");
        p.h(str5, "appUserIdRegistrationNotes");
        return new CampaignDetailResponse(status, str, str2, str3, str4, list, list2, list3, campaignAward, campaignApp, str5, campaignAward2, sharingAward, shareTwitter, campaignLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignDetailResponse) {
            CampaignDetailResponse campaignDetailResponse = (CampaignDetailResponse) obj;
            return p.c(this.status, campaignDetailResponse.status) && p.c(this.titleImageUrl, campaignDetailResponse.titleImageUrl) && p.c(this.title, campaignDetailResponse.title) && p.c(this.period, campaignDetailResponse.period) && p.c(this.periodNotes, campaignDetailResponse.periodNotes) && p.c(this.notes, campaignDetailResponse.notes) && p.c(this.disclaimers, campaignDetailResponse.disclaimers) && p.c(this.copyrights, campaignDetailResponse.copyrights) && p.c(this.broadcastAwards, campaignDetailResponse.broadcastAwards) && p.c(this.app, campaignDetailResponse.app) && p.c(this.appUserIdRegistrationNotes, campaignDetailResponse.appUserIdRegistrationNotes) && p.c(this.viewingAwards, campaignDetailResponse.viewingAwards) && p.c(this.sharingAward, campaignDetailResponse.sharingAward) && p.c(this.shareTwitter, campaignDetailResponse.shareTwitter) && p.c(this.link, campaignDetailResponse.link);
        }
        return false;
    }

    public final CampaignApp getApp() {
        return this.app;
    }

    public final String getAppUserIdRegistrationNotes() {
        return this.appUserIdRegistrationNotes;
    }

    public final CampaignAward getBroadcastAwards() {
        return this.broadcastAwards;
    }

    public final List<String> getCopyrights() {
        return this.copyrights;
    }

    public final List<String> getDisclaimers() {
        return this.disclaimers;
    }

    public final CampaignLink getLink() {
        return this.link;
    }

    public final List<String> getNotes() {
        return this.notes;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final String getPeriodNotes() {
        return this.periodNotes;
    }

    public final ShareTwitter getShareTwitter() {
        return this.shareTwitter;
    }

    public final SharingAward getSharingAward() {
        return this.sharingAward;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleImageUrl() {
        return this.titleImageUrl;
    }

    public final CampaignAward getViewingAwards() {
        return this.viewingAwards;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.status.hashCode() * 31) + this.titleImageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.period.hashCode()) * 31) + this.periodNotes.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.disclaimers.hashCode()) * 31) + this.copyrights.hashCode()) * 31) + this.broadcastAwards.hashCode()) * 31) + this.app.hashCode()) * 31) + this.appUserIdRegistrationNotes.hashCode()) * 31;
        CampaignAward campaignAward = this.viewingAwards;
        int hashCode2 = (hashCode + (campaignAward == null ? 0 : campaignAward.hashCode())) * 31;
        SharingAward sharingAward = this.sharingAward;
        int hashCode3 = (hashCode2 + (sharingAward == null ? 0 : sharingAward.hashCode())) * 31;
        ShareTwitter shareTwitter = this.shareTwitter;
        int hashCode4 = (hashCode3 + (shareTwitter == null ? 0 : shareTwitter.hashCode())) * 31;
        CampaignLink campaignLink = this.link;
        return hashCode4 + (campaignLink != null ? campaignLink.hashCode() : 0);
    }

    public String toString() {
        return "CampaignDetailResponse(status=" + this.status + ", titleImageUrl=" + this.titleImageUrl + ", title=" + this.title + ", period=" + this.period + ", periodNotes=" + this.periodNotes + ", notes=" + this.notes + ", disclaimers=" + this.disclaimers + ", copyrights=" + this.copyrights + ", broadcastAwards=" + this.broadcastAwards + ", app=" + this.app + ", appUserIdRegistrationNotes=" + this.appUserIdRegistrationNotes + ", viewingAwards=" + this.viewingAwards + ", sharingAward=" + this.sharingAward + ", shareTwitter=" + this.shareTwitter + ", link=" + this.link + ')';
    }
}

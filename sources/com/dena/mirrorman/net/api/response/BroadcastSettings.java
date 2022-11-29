package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class BroadcastSettings {
    public static final int $stable = 8;
    private final List<AppCampaign> appCampaigns;
    private final String avatarBodyImageUrl;
    private final List<CarouselItem> carousel;
    private final boolean isOmotenashiLiveEnable;
    private final String omotenashiLiveNoticeText;
    private final String omotenashiLpUrl;
    private final int selectedThumbnailFrameId;
    private final Status status;
    private final List<ThumbnailFrame> thumbnailFrames;
    private final int twitterAutopost;
    private final int twitterAutopostLiveAnnouncement;

    public BroadcastSettings(Status status, int i10, int i11, List<ThumbnailFrame> list, int i12, List<CarouselItem> list2, List<AppCampaign> list3, String str, boolean z10, String str2, String str3) {
        p.h(status, "status");
        p.h(list, "thumbnailFrames");
        p.h(list2, "carousel");
        p.h(list3, "appCampaigns");
        p.h(str, "avatarBodyImageUrl");
        p.h(str2, "omotenashiLiveNoticeText");
        p.h(str3, "omotenashiLpUrl");
        this.status = status;
        this.twitterAutopost = i10;
        this.twitterAutopostLiveAnnouncement = i11;
        this.thumbnailFrames = list;
        this.selectedThumbnailFrameId = i12;
        this.carousel = list2;
        this.appCampaigns = list3;
        this.avatarBodyImageUrl = str;
        this.isOmotenashiLiveEnable = z10;
        this.omotenashiLiveNoticeText = str2;
        this.omotenashiLpUrl = str3;
    }

    public final Status component1() {
        return this.status;
    }

    public final String component10() {
        return this.omotenashiLiveNoticeText;
    }

    public final String component11() {
        return this.omotenashiLpUrl;
    }

    public final int component2() {
        return this.twitterAutopost;
    }

    public final int component3() {
        return this.twitterAutopostLiveAnnouncement;
    }

    public final List<ThumbnailFrame> component4() {
        return this.thumbnailFrames;
    }

    public final int component5() {
        return this.selectedThumbnailFrameId;
    }

    public final List<CarouselItem> component6() {
        return this.carousel;
    }

    public final List<AppCampaign> component7() {
        return this.appCampaigns;
    }

    public final String component8() {
        return this.avatarBodyImageUrl;
    }

    public final boolean component9() {
        return this.isOmotenashiLiveEnable;
    }

    public final BroadcastSettings copy(Status status, int i10, int i11, List<ThumbnailFrame> list, int i12, List<CarouselItem> list2, List<AppCampaign> list3, String str, boolean z10, String str2, String str3) {
        p.h(status, "status");
        p.h(list, "thumbnailFrames");
        p.h(list2, "carousel");
        p.h(list3, "appCampaigns");
        p.h(str, "avatarBodyImageUrl");
        p.h(str2, "omotenashiLiveNoticeText");
        p.h(str3, "omotenashiLpUrl");
        return new BroadcastSettings(status, i10, i11, list, i12, list2, list3, str, z10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BroadcastSettings) {
            BroadcastSettings broadcastSettings = (BroadcastSettings) obj;
            return p.c(this.status, broadcastSettings.status) && this.twitterAutopost == broadcastSettings.twitterAutopost && this.twitterAutopostLiveAnnouncement == broadcastSettings.twitterAutopostLiveAnnouncement && p.c(this.thumbnailFrames, broadcastSettings.thumbnailFrames) && this.selectedThumbnailFrameId == broadcastSettings.selectedThumbnailFrameId && p.c(this.carousel, broadcastSettings.carousel) && p.c(this.appCampaigns, broadcastSettings.appCampaigns) && p.c(this.avatarBodyImageUrl, broadcastSettings.avatarBodyImageUrl) && this.isOmotenashiLiveEnable == broadcastSettings.isOmotenashiLiveEnable && p.c(this.omotenashiLiveNoticeText, broadcastSettings.omotenashiLiveNoticeText) && p.c(this.omotenashiLpUrl, broadcastSettings.omotenashiLpUrl);
        }
        return false;
    }

    public final List<AppCampaign> getAppCampaigns() {
        return this.appCampaigns;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final List<CarouselItem> getCarousel() {
        return this.carousel;
    }

    public final String getOmotenashiLiveNoticeText() {
        return this.omotenashiLiveNoticeText;
    }

    public final String getOmotenashiLpUrl() {
        return this.omotenashiLpUrl;
    }

    public final int getSelectedThumbnailFrameId() {
        return this.selectedThumbnailFrameId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<ThumbnailFrame> getThumbnailFrames() {
        return this.thumbnailFrames;
    }

    public final int getTwitterAutopost() {
        return this.twitterAutopost;
    }

    public final int getTwitterAutopostLiveAnnouncement() {
        return this.twitterAutopostLiveAnnouncement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.status.hashCode() * 31) + Integer.hashCode(this.twitterAutopost)) * 31) + Integer.hashCode(this.twitterAutopostLiveAnnouncement)) * 31) + this.thumbnailFrames.hashCode()) * 31) + Integer.hashCode(this.selectedThumbnailFrameId)) * 31) + this.carousel.hashCode()) * 31) + this.appCampaigns.hashCode()) * 31) + this.avatarBodyImageUrl.hashCode()) * 31;
        boolean z10 = this.isOmotenashiLiveEnable;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.omotenashiLiveNoticeText.hashCode()) * 31) + this.omotenashiLpUrl.hashCode();
    }

    public final boolean isOmotenashiLiveEnable() {
        return this.isOmotenashiLiveEnable;
    }

    public String toString() {
        return "BroadcastSettings(status=" + this.status + ", twitterAutopost=" + this.twitterAutopost + ", twitterAutopostLiveAnnouncement=" + this.twitterAutopostLiveAnnouncement + ", thumbnailFrames=" + this.thumbnailFrames + ", selectedThumbnailFrameId=" + this.selectedThumbnailFrameId + ", carousel=" + this.carousel + ", appCampaigns=" + this.appCampaigns + ", avatarBodyImageUrl=" + this.avatarBodyImageUrl + ", isOmotenashiLiveEnable=" + this.isOmotenashiLiveEnable + ", omotenashiLiveNoticeText=" + this.omotenashiLiveNoticeText + ", omotenashiLpUrl=" + this.omotenashiLpUrl + ')';
    }
}

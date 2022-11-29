package com.dena.mirrativ.mirrativapi.common;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EventBannerResponse implements Serializable {
    private final String buttonText;
    private final String description;
    private final String eventBackgroundImageUrl;
    private final String eventHelpPageUrl;
    private final Integer eventId;
    private final List<Integer> eventItemPartTypes;
    private final String eventPageUrl;
    private final String eventPopupImageUrl;
    private final String eventPopupTextMain;
    private final String eventPopupTextSub;
    private final Integer eventType;
    private final String iconUrl;
    private final boolean isFocus;
    private final String title;
    private final int type;
    private final String url;

    public EventBannerResponse(String str, String str2, String str3, String str4, int i10, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, List<Integer> list, String str11, boolean z10) {
        p.h(str, "iconUrl");
        p.h(str2, "title");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "buttonText");
        p.h(str5, "url");
        this.iconUrl = str;
        this.title = str2;
        this.description = str3;
        this.buttonText = str4;
        this.type = i10;
        this.url = str5;
        this.eventType = num;
        this.eventId = num2;
        this.eventPageUrl = str6;
        this.eventPopupImageUrl = str7;
        this.eventPopupTextMain = str8;
        this.eventPopupTextSub = str9;
        this.eventBackgroundImageUrl = str10;
        this.eventItemPartTypes = list;
        this.eventHelpPageUrl = str11;
        this.isFocus = z10;
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component10() {
        return this.eventPopupImageUrl;
    }

    public final String component11() {
        return this.eventPopupTextMain;
    }

    public final String component12() {
        return this.eventPopupTextSub;
    }

    public final String component13() {
        return this.eventBackgroundImageUrl;
    }

    public final List<Integer> component14() {
        return this.eventItemPartTypes;
    }

    public final String component15() {
        return this.eventHelpPageUrl;
    }

    public final boolean component16() {
        return this.isFocus;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.buttonText;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.url;
    }

    public final Integer component7() {
        return this.eventType;
    }

    public final Integer component8() {
        return this.eventId;
    }

    public final String component9() {
        return this.eventPageUrl;
    }

    public final EventBannerResponse copy(String str, String str2, String str3, String str4, int i10, String str5, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, List<Integer> list, String str11, boolean z10) {
        p.h(str, "iconUrl");
        p.h(str2, "title");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "buttonText");
        p.h(str5, "url");
        return new EventBannerResponse(str, str2, str3, str4, i10, str5, num, num2, str6, str7, str8, str9, str10, list, str11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventBannerResponse) {
            EventBannerResponse eventBannerResponse = (EventBannerResponse) obj;
            return p.c(this.iconUrl, eventBannerResponse.iconUrl) && p.c(this.title, eventBannerResponse.title) && p.c(this.description, eventBannerResponse.description) && p.c(this.buttonText, eventBannerResponse.buttonText) && this.type == eventBannerResponse.type && p.c(this.url, eventBannerResponse.url) && p.c(this.eventType, eventBannerResponse.eventType) && p.c(this.eventId, eventBannerResponse.eventId) && p.c(this.eventPageUrl, eventBannerResponse.eventPageUrl) && p.c(this.eventPopupImageUrl, eventBannerResponse.eventPopupImageUrl) && p.c(this.eventPopupTextMain, eventBannerResponse.eventPopupTextMain) && p.c(this.eventPopupTextSub, eventBannerResponse.eventPopupTextSub) && p.c(this.eventBackgroundImageUrl, eventBannerResponse.eventBackgroundImageUrl) && p.c(this.eventItemPartTypes, eventBannerResponse.eventItemPartTypes) && p.c(this.eventHelpPageUrl, eventBannerResponse.eventHelpPageUrl) && this.isFocus == eventBannerResponse.isFocus;
        }
        return false;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventBackgroundImageUrl() {
        return this.eventBackgroundImageUrl;
    }

    public final String getEventHelpPageUrl() {
        return this.eventHelpPageUrl;
    }

    public final Integer getEventId() {
        return this.eventId;
    }

    public final List<Integer> getEventItemPartTypes() {
        return this.eventItemPartTypes;
    }

    public final String getEventPageUrl() {
        return this.eventPageUrl;
    }

    public final String getEventPopupImageUrl() {
        return this.eventPopupImageUrl;
    }

    public final String getEventPopupTextMain() {
        return this.eventPopupTextMain;
    }

    public final String getEventPopupTextSub() {
        return this.eventPopupTextSub;
    }

    public final Integer getEventType() {
        return this.eventType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.url.hashCode()) * 31;
        Integer num = this.eventType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.eventId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.eventPageUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventPopupImageUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventPopupTextMain;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventPopupTextSub;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventBackgroundImageUrl;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Integer> list = this.eventItemPartTypes;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.eventHelpPageUrl;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z10 = this.isFocus;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode10 + i10;
    }

    public final boolean isFocus() {
        return this.isFocus;
    }

    public String toString() {
        return "EventBannerResponse(iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ", buttonText=" + this.buttonText + ", type=" + this.type + ", url=" + this.url + ", eventType=" + this.eventType + ", eventId=" + this.eventId + ", eventPageUrl=" + this.eventPageUrl + ", eventPopupImageUrl=" + this.eventPopupImageUrl + ", eventPopupTextMain=" + this.eventPopupTextMain + ", eventPopupTextSub=" + this.eventPopupTextSub + ", eventBackgroundImageUrl=" + this.eventBackgroundImageUrl + ", eventItemPartTypes=" + this.eventItemPartTypes + ", eventHelpPageUrl=" + this.eventHelpPageUrl + ", isFocus=" + this.isFocus + ')';
    }
}

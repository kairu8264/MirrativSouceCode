package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EventNoticeResponse {
    public static final int $stable = 8;
    private final List<EventBannerResponse> banners;
    private final DisplayTimingResponse displayTiming;
    private final Status status;

    public EventNoticeResponse(List<EventBannerResponse> list, DisplayTimingResponse displayTimingResponse, Status status) {
        p.h(list, "banners");
        p.h(displayTimingResponse, "displayTiming");
        p.h(status, "status");
        this.banners = list;
        this.displayTiming = displayTimingResponse;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventNoticeResponse copy$default(EventNoticeResponse eventNoticeResponse, List list, DisplayTimingResponse displayTimingResponse, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = eventNoticeResponse.banners;
        }
        if ((i10 & 2) != 0) {
            displayTimingResponse = eventNoticeResponse.displayTiming;
        }
        if ((i10 & 4) != 0) {
            status = eventNoticeResponse.status;
        }
        return eventNoticeResponse.copy(list, displayTimingResponse, status);
    }

    public final List<EventBannerResponse> component1() {
        return this.banners;
    }

    public final DisplayTimingResponse component2() {
        return this.displayTiming;
    }

    public final Status component3() {
        return this.status;
    }

    public final EventNoticeResponse copy(List<EventBannerResponse> list, DisplayTimingResponse displayTimingResponse, Status status) {
        p.h(list, "banners");
        p.h(displayTimingResponse, "displayTiming");
        p.h(status, "status");
        return new EventNoticeResponse(list, displayTimingResponse, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventNoticeResponse) {
            EventNoticeResponse eventNoticeResponse = (EventNoticeResponse) obj;
            return p.c(this.banners, eventNoticeResponse.banners) && p.c(this.displayTiming, eventNoticeResponse.displayTiming) && p.c(this.status, eventNoticeResponse.status);
        }
        return false;
    }

    public final List<EventBannerResponse> getBanners() {
        return this.banners;
    }

    public final DisplayTimingResponse getDisplayTiming() {
        return this.displayTiming;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.banners.hashCode() * 31) + this.displayTiming.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EventNoticeResponse(banners=" + this.banners + ", displayTiming=" + this.displayTiming + ", status=" + this.status + ')';
    }
}

package com.dena.mirrorman.net.bcsvr.response;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class AnnouncementPopup {
    public static final int $stable = 8;
    @c("announcement_popup_url")
    private String popupUrl;

    /* renamed from: t  reason: collision with root package name */
    private int f26179t;

    public AnnouncementPopup(int i10, String str) {
        p.h(str, "popupUrl");
        this.f26179t = i10;
        this.popupUrl = str;
    }

    public static /* synthetic */ AnnouncementPopup copy$default(AnnouncementPopup announcementPopup, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = announcementPopup.f26179t;
        }
        if ((i11 & 2) != 0) {
            str = announcementPopup.popupUrl;
        }
        return announcementPopup.copy(i10, str);
    }

    public final int component1() {
        return this.f26179t;
    }

    public final String component2() {
        return this.popupUrl;
    }

    public final AnnouncementPopup copy(int i10, String str) {
        p.h(str, "popupUrl");
        return new AnnouncementPopup(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnnouncementPopup) {
            AnnouncementPopup announcementPopup = (AnnouncementPopup) obj;
            return this.f26179t == announcementPopup.f26179t && p.c(this.popupUrl, announcementPopup.popupUrl);
        }
        return false;
    }

    public final String getPopupUrl() {
        return this.popupUrl;
    }

    public final int getT() {
        return this.f26179t;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f26179t) * 31) + this.popupUrl.hashCode();
    }

    public final void setPopupUrl(String str) {
        p.h(str, "<set-?>");
        this.popupUrl = str;
    }

    public final void setT(int i10) {
        this.f26179t = i10;
    }

    public String toString() {
        return "AnnouncementPopup(t=" + this.f26179t + ", popupUrl=" + this.popupUrl + ')';
    }
}

package com.dena.mirrativ.mirrativapi.livegame;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameGiftHelpResponse {
    private final String gachaRateUrl;
    private final List<LiveGameGift> gifts;
    private final String notes;
    private final String title;

    public LiveGameGiftHelpResponse(List<LiveGameGift> list, String str, String str2, String str3) {
        p.h(list, "gifts");
        p.h(str, "notes");
        p.h(str2, "gachaRateUrl");
        p.h(str3, "title");
        this.gifts = list;
        this.notes = str;
        this.gachaRateUrl = str2;
        this.title = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGameGiftHelpResponse copy$default(LiveGameGiftHelpResponse liveGameGiftHelpResponse, List list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = liveGameGiftHelpResponse.gifts;
        }
        if ((i10 & 2) != 0) {
            str = liveGameGiftHelpResponse.notes;
        }
        if ((i10 & 4) != 0) {
            str2 = liveGameGiftHelpResponse.gachaRateUrl;
        }
        if ((i10 & 8) != 0) {
            str3 = liveGameGiftHelpResponse.title;
        }
        return liveGameGiftHelpResponse.copy(list, str, str2, str3);
    }

    public final List<LiveGameGift> component1() {
        return this.gifts;
    }

    public final String component2() {
        return this.notes;
    }

    public final String component3() {
        return this.gachaRateUrl;
    }

    public final String component4() {
        return this.title;
    }

    public final LiveGameGiftHelpResponse copy(List<LiveGameGift> list, String str, String str2, String str3) {
        p.h(list, "gifts");
        p.h(str, "notes");
        p.h(str2, "gachaRateUrl");
        p.h(str3, "title");
        return new LiveGameGiftHelpResponse(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameGiftHelpResponse) {
            LiveGameGiftHelpResponse liveGameGiftHelpResponse = (LiveGameGiftHelpResponse) obj;
            return p.c(this.gifts, liveGameGiftHelpResponse.gifts) && p.c(this.notes, liveGameGiftHelpResponse.notes) && p.c(this.gachaRateUrl, liveGameGiftHelpResponse.gachaRateUrl) && p.c(this.title, liveGameGiftHelpResponse.title);
        }
        return false;
    }

    public final String getGachaRateUrl() {
        return this.gachaRateUrl;
    }

    public final List<LiveGameGift> getGifts() {
        return this.gifts;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.gifts.hashCode() * 31) + this.notes.hashCode()) * 31) + this.gachaRateUrl.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "LiveGameGiftHelpResponse(gifts=" + this.gifts + ", notes=" + this.notes + ", gachaRateUrl=" + this.gachaRateUrl + ", title=" + this.title + ')';
    }
}

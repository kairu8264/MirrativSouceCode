package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingDate implements Serializable {
    private final String day;
    private final String description;
    private final int key;
    private final String month;
    private final int type;

    public GiftRankingDate(int i10, int i11, String str, String str2, String str3) {
        p.h(str, "month");
        p.h(str2, "day");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.key = i10;
        this.type = i11;
        this.month = str;
        this.day = str2;
        this.description = str3;
    }

    public static /* synthetic */ GiftRankingDate copy$default(GiftRankingDate giftRankingDate, int i10, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = giftRankingDate.key;
        }
        if ((i12 & 2) != 0) {
            i11 = giftRankingDate.type;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = giftRankingDate.month;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = giftRankingDate.day;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = giftRankingDate.description;
        }
        return giftRankingDate.copy(i10, i13, str4, str5, str3);
    }

    public final int component1() {
        return this.key;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.month;
    }

    public final String component4() {
        return this.day;
    }

    public final String component5() {
        return this.description;
    }

    public final GiftRankingDate copy(int i10, int i11, String str, String str2, String str3) {
        p.h(str, "month");
        p.h(str2, "day");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        return new GiftRankingDate(i10, i11, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingDate) {
            GiftRankingDate giftRankingDate = (GiftRankingDate) obj;
            return this.key == giftRankingDate.key && this.type == giftRankingDate.type && p.c(this.month, giftRankingDate.month) && p.c(this.day, giftRankingDate.day) && p.c(this.description, giftRankingDate.description);
        }
        return false;
    }

    public final String getDay() {
        return this.day;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getMonth() {
        return this.month;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.key) * 31) + Integer.hashCode(this.type)) * 31) + this.month.hashCode()) * 31) + this.day.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "GiftRankingDate(key=" + this.key + ", type=" + this.type + ", month=" + this.month + ", day=" + this.day + ", description=" + this.description + ')';
    }
}

package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestGiftGachaUser {
    private final String iconUrl;
    private final List<GiftGachaItem> items;
    private final String name;
    private final int userId;

    public EmomoQuestGiftGachaUser(int i10, String str, String str2, List<GiftGachaItem> list) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(list, "items");
        this.userId = i10;
        this.name = str;
        this.iconUrl = str2;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmomoQuestGiftGachaUser copy$default(EmomoQuestGiftGachaUser emomoQuestGiftGachaUser, int i10, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = emomoQuestGiftGachaUser.userId;
        }
        if ((i11 & 2) != 0) {
            str = emomoQuestGiftGachaUser.name;
        }
        if ((i11 & 4) != 0) {
            str2 = emomoQuestGiftGachaUser.iconUrl;
        }
        if ((i11 & 8) != 0) {
            list = emomoQuestGiftGachaUser.items;
        }
        return emomoQuestGiftGachaUser.copy(i10, str, str2, list);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final List<GiftGachaItem> component4() {
        return this.items;
    }

    public final EmomoQuestGiftGachaUser copy(int i10, String str, String str2, List<GiftGachaItem> list) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(list, "items");
        return new EmomoQuestGiftGachaUser(i10, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestGiftGachaUser) {
            EmomoQuestGiftGachaUser emomoQuestGiftGachaUser = (EmomoQuestGiftGachaUser) obj;
            return this.userId == emomoQuestGiftGachaUser.userId && p.c(this.name, emomoQuestGiftGachaUser.name) && p.c(this.iconUrl, emomoQuestGiftGachaUser.iconUrl) && p.c(this.items, emomoQuestGiftGachaUser.items);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final List<GiftGachaItem> getItems() {
        return this.items;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "EmomoQuestGiftGachaUser(userId=" + this.userId + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", items=" + this.items + ')';
    }
}

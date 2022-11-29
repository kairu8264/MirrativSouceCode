package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftTypeConfig {
    public static final int $stable = 0;
    private final int coins;
    private final String iconUrl;

    public UniqueEmomoGiftTypeConfig(int i10, String str) {
        p.h(str, "iconUrl");
        this.coins = i10;
        this.iconUrl = str;
    }

    public static /* synthetic */ UniqueEmomoGiftTypeConfig copy$default(UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = uniqueEmomoGiftTypeConfig.coins;
        }
        if ((i11 & 2) != 0) {
            str = uniqueEmomoGiftTypeConfig.iconUrl;
        }
        return uniqueEmomoGiftTypeConfig.copy(i10, str);
    }

    public final int component1() {
        return this.coins;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final UniqueEmomoGiftTypeConfig copy(int i10, String str) {
        p.h(str, "iconUrl");
        return new UniqueEmomoGiftTypeConfig(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftTypeConfig) {
            UniqueEmomoGiftTypeConfig uniqueEmomoGiftTypeConfig = (UniqueEmomoGiftTypeConfig) obj;
            return this.coins == uniqueEmomoGiftTypeConfig.coins && p.c(this.iconUrl, uniqueEmomoGiftTypeConfig.iconUrl);
        }
        return false;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.coins) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftTypeConfig(coins=" + this.coins + ", iconUrl=" + this.iconUrl + ')';
    }
}

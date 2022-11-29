package com.dena.mirrativ.mirrativapi.closet;

import java.io.Serializable;

/* loaded from: classes2.dex */
public interface ClosetBuyable extends Serializable {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static boolean isOwn(ClosetBuyable closetBuyable) {
            Integer isBuyable = closetBuyable.isBuyable();
            return (isBuyable == null || isBuyable.intValue() != 1) && !closetBuyable.isTrial();
        }
    }

    String getBannerImageUrl();

    String getBannerLink();

    GameEffect getGameEffect();

    String getIconUrl();

    String getId();

    String getPartTitle();

    Integer getRequiredCoin();

    Long getUpdatedAt();

    Integer isBuyable();

    boolean isLimitedTime();

    boolean isOwn();

    boolean isTrial();

    void setBuyable(Integer num);

    void setUpdatedAt(Long l10);
}

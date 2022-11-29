package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;
import xn.s;
import ym.b;

/* loaded from: classes2.dex */
public final class Gift {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class EmomoRunGifts {
        public static final int $stable = 8;
        private Status status = Status.Companion.createEmptyStatus();
        private final String helpPageUrl = "";
        private List<GiftParams> gifts = s.k();

        public final List<GiftParams> getGifts() {
            return this.gifts;
        }

        public final String getHelpPageUrl() {
            return this.helpPageUrl;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setGifts(List<GiftParams> list) {
            p.h(list, "<set-?>");
            this.gifts = list;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class GiftParams implements Serializable {
        public static final int $stable = 8;
        private long availableFrom;
        private long availableTo;
        private int coins;
        private boolean isPaidCoinOnly;
        private String lockedMessage;
        private int panelReasonId;
        private int panelType;
        @b(BooleanTypeAdapter.class)
        private boolean requiredReload;
        private int type;

        /* renamed from: id  reason: collision with root package name */
        private String f26150id = "";
        private String small_image_url = "";
        private String large_image_url = "";
        private final String bonusImageUrl = "";
        private final String eventIconUrl = "";

        public final long getAvailableFrom() {
            return this.availableFrom;
        }

        public final long getAvailableTo() {
            return this.availableTo;
        }

        public final String getBonusImageUrl() {
            return this.bonusImageUrl;
        }

        public final int getCoins() {
            return this.coins;
        }

        public final String getEventIconUrl() {
            return this.eventIconUrl;
        }

        public final String getId() {
            return this.f26150id;
        }

        public final String getLarge_image_url() {
            return this.large_image_url;
        }

        public final String getLockedMessage() {
            return this.lockedMessage;
        }

        public final int getPanelReasonId() {
            return this.panelReasonId;
        }

        public final int getPanelType() {
            return this.panelType;
        }

        public final boolean getRequiredReload() {
            return this.requiredReload;
        }

        public final String getSmall_image_url() {
            return this.small_image_url;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean isPaidCoinOnly() {
            return this.isPaidCoinOnly;
        }

        public final void setAvailableFrom(long j10) {
            this.availableFrom = j10;
        }

        public final void setAvailableTo(long j10) {
            this.availableTo = j10;
        }

        public final void setCoins(int i10) {
            this.coins = i10;
        }

        public final void setId(String str) {
            p.h(str, "<set-?>");
            this.f26150id = str;
        }

        public final void setLarge_image_url(String str) {
            p.h(str, "<set-?>");
            this.large_image_url = str;
        }

        public final void setLockedMessage(String str) {
            this.lockedMessage = str;
        }

        public final void setPaidCoinOnly(boolean z10) {
            this.isPaidCoinOnly = z10;
        }

        public final void setPanelReasonId(int i10) {
            this.panelReasonId = i10;
        }

        public final void setPanelType(int i10) {
            this.panelType = i10;
        }

        public final void setRequiredReload(boolean z10) {
            this.requiredReload = z10;
        }

        public final void setSmall_image_url(String str) {
            p.h(str, "<set-?>");
            this.small_image_url = str;
        }

        public final void setType(int i10) {
            this.type = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class SendGift {
        public static final int $stable = 8;
        private final boolean isAppMutualGiftEventAchieved;
        private final int remainingFreeCoins;
        private final int remainingPaidCoins;
        private final Status status;

        public SendGift(Status status, int i10, int i11, boolean z10) {
            p.h(status, "status");
            this.status = status;
            this.remainingPaidCoins = i10;
            this.remainingFreeCoins = i11;
            this.isAppMutualGiftEventAchieved = z10;
        }

        public static /* synthetic */ SendGift copy$default(SendGift sendGift, Status status, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                status = sendGift.status;
            }
            if ((i12 & 2) != 0) {
                i10 = sendGift.remainingPaidCoins;
            }
            if ((i12 & 4) != 0) {
                i11 = sendGift.remainingFreeCoins;
            }
            if ((i12 & 8) != 0) {
                z10 = sendGift.isAppMutualGiftEventAchieved;
            }
            return sendGift.copy(status, i10, i11, z10);
        }

        public final Status component1() {
            return this.status;
        }

        public final int component2() {
            return this.remainingPaidCoins;
        }

        public final int component3() {
            return this.remainingFreeCoins;
        }

        public final boolean component4() {
            return this.isAppMutualGiftEventAchieved;
        }

        public final SendGift copy(Status status, int i10, int i11, boolean z10) {
            p.h(status, "status");
            return new SendGift(status, i10, i11, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SendGift) {
                SendGift sendGift = (SendGift) obj;
                return p.c(this.status, sendGift.status) && this.remainingPaidCoins == sendGift.remainingPaidCoins && this.remainingFreeCoins == sendGift.remainingFreeCoins && this.isAppMutualGiftEventAchieved == sendGift.isAppMutualGiftEventAchieved;
            }
            return false;
        }

        public final int getRemainingFreeCoins() {
            return this.remainingFreeCoins;
        }

        public final int getRemainingPaidCoins() {
            return this.remainingPaidCoins;
        }

        public final Status getStatus() {
            return this.status;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.status.hashCode() * 31) + Integer.hashCode(this.remainingPaidCoins)) * 31) + Integer.hashCode(this.remainingFreeCoins)) * 31;
            boolean z10 = this.isAppMutualGiftEventAchieved;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public final boolean isAppMutualGiftEventAchieved() {
            return this.isAppMutualGiftEventAchieved;
        }

        public String toString() {
            return "SendGift(status=" + this.status + ", remainingPaidCoins=" + this.remainingPaidCoins + ", remainingFreeCoins=" + this.remainingFreeCoins + ", isAppMutualGiftEventAchieved=" + this.isAppMutualGiftEventAchieved + ')';
        }
    }
}

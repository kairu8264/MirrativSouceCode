package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import ym.b;

/* loaded from: classes2.dex */
public final class Social {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class SocialAccount {
        public static final int $stable = 8;
        private String failedHandoverCodeMessage;
        private Integer isFollowOfficialTwitter;
        @b(BooleanTypeAdapter.class)
        private boolean isLock;
        @b(BooleanTypeAdapter.class)
        private boolean shouldHandoverCode;
        @b(BooleanTypeAdapter.class)
        private boolean signedInAsConnectedUser;
        private Status status;

        public final String getFailedHandoverCodeMessage() {
            return this.failedHandoverCodeMessage;
        }

        public final boolean getShouldHandoverCode() {
            return this.shouldHandoverCode;
        }

        public final boolean getSignedInAsConnectedUser() {
            return this.signedInAsConnectedUser;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final Integer isFollowOfficialTwitter() {
            return this.isFollowOfficialTwitter;
        }

        public final boolean isLock() {
            return this.isLock;
        }

        public final void setFailedHandoverCodeMessage(String str) {
            this.failedHandoverCodeMessage = str;
        }

        public final void setFollowOfficialTwitter(Integer num) {
            this.isFollowOfficialTwitter = num;
        }

        public final void setLock(boolean z10) {
            this.isLock = z10;
        }

        public final void setShouldHandoverCode(boolean z10) {
            this.shouldHandoverCode = z10;
        }

        public final void setSignedInAsConnectedUser(boolean z10) {
            this.signedInAsConnectedUser = z10;
        }

        public final void setStatus(Status status) {
            this.status = status;
        }
    }
}

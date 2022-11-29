package com.dena.mirrativ.mirrativapi.user;

import jo.h;

/* loaded from: classes2.dex */
public final class ChatStatus {
    public static final Companion Companion = new Companion(null);
    private final boolean isEnabled;
    private final boolean requireBirthday;
    private final boolean requireChatConfirmationAgreement;
    private final boolean requireGeneration;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ChatStatus createChatAvailable() {
            return new ChatStatus(false, false, false, true);
        }
    }

    public ChatStatus(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.requireBirthday = z10;
        this.requireGeneration = z11;
        this.requireChatConfirmationAgreement = z12;
        this.isEnabled = z13;
    }

    public static /* synthetic */ ChatStatus copy$default(ChatStatus chatStatus, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = chatStatus.requireBirthday;
        }
        if ((i10 & 2) != 0) {
            z11 = chatStatus.requireGeneration;
        }
        if ((i10 & 4) != 0) {
            z12 = chatStatus.requireChatConfirmationAgreement;
        }
        if ((i10 & 8) != 0) {
            z13 = chatStatus.isEnabled;
        }
        return chatStatus.copy(z10, z11, z12, z13);
    }

    public final boolean component1() {
        return this.requireBirthday;
    }

    public final boolean component2() {
        return this.requireGeneration;
    }

    public final boolean component3() {
        return this.requireChatConfirmationAgreement;
    }

    public final boolean component4() {
        return this.isEnabled;
    }

    public final ChatStatus copy(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new ChatStatus(z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatStatus) {
            ChatStatus chatStatus = (ChatStatus) obj;
            return this.requireBirthday == chatStatus.requireBirthday && this.requireGeneration == chatStatus.requireGeneration && this.requireChatConfirmationAgreement == chatStatus.requireChatConfirmationAgreement && this.isEnabled == chatStatus.isEnabled;
        }
        return false;
    }

    public final boolean getRequireBirthday() {
        return this.requireBirthday;
    }

    public final boolean getRequireChatConfirmationAgreement() {
        return this.requireChatConfirmationAgreement;
    }

    public final boolean getRequireGeneration() {
        return this.requireGeneration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.requireBirthday;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.requireGeneration;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.requireChatConfirmationAgreement;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.isEnabled;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isUnder18() {
        return (this.isEnabled || this.requireChatConfirmationAgreement || this.requireGeneration || this.requireBirthday) ? false : true;
    }

    public String toString() {
        return "ChatStatus(requireBirthday=" + this.requireBirthday + ", requireGeneration=" + this.requireGeneration + ", requireChatConfirmationAgreement=" + this.requireChatConfirmationAgreement + ", isEnabled=" + this.isEnabled + ')';
    }
}

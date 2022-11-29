package com.dena.mirrativ.mirrativapi.user;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class ContractBank implements Serializable {
    private final String bankId;
    private final String bankName;
    private final int noticeType;

    public ContractBank(String str, String str2, int i10) {
        p.h(str, "bankId");
        p.h(str2, "bankName");
        this.bankId = str;
        this.bankName = str2;
        this.noticeType = i10;
    }

    public static /* synthetic */ ContractBank copy$default(ContractBank contractBank, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contractBank.bankId;
        }
        if ((i11 & 2) != 0) {
            str2 = contractBank.bankName;
        }
        if ((i11 & 4) != 0) {
            i10 = contractBank.noticeType;
        }
        return contractBank.copy(str, str2, i10);
    }

    public final String component1() {
        return this.bankId;
    }

    public final String component2() {
        return this.bankName;
    }

    public final int component3() {
        return this.noticeType;
    }

    public final ContractBank copy(String str, String str2, int i10) {
        p.h(str, "bankId");
        p.h(str2, "bankName");
        return new ContractBank(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractBank) {
            ContractBank contractBank = (ContractBank) obj;
            return p.c(this.bankId, contractBank.bankId) && p.c(this.bankName, contractBank.bankName) && this.noticeType == contractBank.noticeType;
        }
        return false;
    }

    public final String getBankId() {
        return this.bankId;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final int getNoticeType() {
        return this.noticeType;
    }

    public int hashCode() {
        return (((this.bankId.hashCode() * 31) + this.bankName.hashCode()) * 31) + Integer.hashCode(this.noticeType);
    }

    public String toString() {
        return "ContractBank(bankId=" + this.bankId + ", bankName=" + this.bankName + ", noticeType=" + this.noticeType + ')';
    }
}

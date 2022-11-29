package com.dena.mirrativ.mirrativapi.user;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class KycInfo implements Serializable {
    private final String accountNumber;
    private final String address;
    private final String applicationUrl;
    private final String bankCode;
    private final String bankName;
    private final int birthday;
    private final String branchCode;
    private final String familyName;
    private final String familyNameKana;
    private final String givenName;
    private final String givenNameKana;
    private final boolean isEditLimited;
    private final String postCode;

    public KycInfo(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, boolean z10) {
        p.h(str, "familyName");
        p.h(str2, "givenName");
        p.h(str3, "familyNameKana");
        p.h(str4, "givenNameKana");
        p.h(str5, "postCode");
        p.h(str6, "address");
        p.h(str7, "bankCode");
        p.h(str8, "bankName");
        p.h(str9, "branchCode");
        p.h(str10, "accountNumber");
        p.h(str11, "applicationUrl");
        this.familyName = str;
        this.givenName = str2;
        this.familyNameKana = str3;
        this.givenNameKana = str4;
        this.postCode = str5;
        this.address = str6;
        this.birthday = i10;
        this.bankCode = str7;
        this.bankName = str8;
        this.branchCode = str9;
        this.accountNumber = str10;
        this.applicationUrl = str11;
        this.isEditLimited = z10;
    }

    public final String component1() {
        return this.familyName;
    }

    public final String component10() {
        return this.branchCode;
    }

    public final String component11() {
        return this.accountNumber;
    }

    public final String component12() {
        return this.applicationUrl;
    }

    public final boolean component13() {
        return this.isEditLimited;
    }

    public final String component2() {
        return this.givenName;
    }

    public final String component3() {
        return this.familyNameKana;
    }

    public final String component4() {
        return this.givenNameKana;
    }

    public final String component5() {
        return this.postCode;
    }

    public final String component6() {
        return this.address;
    }

    public final int component7() {
        return this.birthday;
    }

    public final String component8() {
        return this.bankCode;
    }

    public final String component9() {
        return this.bankName;
    }

    public final KycInfo copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9, String str10, String str11, boolean z10) {
        p.h(str, "familyName");
        p.h(str2, "givenName");
        p.h(str3, "familyNameKana");
        p.h(str4, "givenNameKana");
        p.h(str5, "postCode");
        p.h(str6, "address");
        p.h(str7, "bankCode");
        p.h(str8, "bankName");
        p.h(str9, "branchCode");
        p.h(str10, "accountNumber");
        p.h(str11, "applicationUrl");
        return new KycInfo(str, str2, str3, str4, str5, str6, i10, str7, str8, str9, str10, str11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KycInfo) {
            KycInfo kycInfo = (KycInfo) obj;
            return p.c(this.familyName, kycInfo.familyName) && p.c(this.givenName, kycInfo.givenName) && p.c(this.familyNameKana, kycInfo.familyNameKana) && p.c(this.givenNameKana, kycInfo.givenNameKana) && p.c(this.postCode, kycInfo.postCode) && p.c(this.address, kycInfo.address) && this.birthday == kycInfo.birthday && p.c(this.bankCode, kycInfo.bankCode) && p.c(this.bankName, kycInfo.bankName) && p.c(this.branchCode, kycInfo.branchCode) && p.c(this.accountNumber, kycInfo.accountNumber) && p.c(this.applicationUrl, kycInfo.applicationUrl) && this.isEditLimited == kycInfo.isEditLimited;
        }
        return false;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getApplicationUrl() {
        return this.applicationUrl;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final int getBirthday() {
        return this.birthday;
    }

    public final String getBranchCode() {
        return this.branchCode;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getFamilyNameKana() {
        return this.familyNameKana;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getGivenNameKana() {
        return this.givenNameKana;
    }

    public final String getPostCode() {
        return this.postCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.familyName.hashCode() * 31) + this.givenName.hashCode()) * 31) + this.familyNameKana.hashCode()) * 31) + this.givenNameKana.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.birthday)) * 31) + this.bankCode.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.branchCode.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.applicationUrl.hashCode()) * 31;
        boolean z10 = this.isEditLimited;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isEditLimited() {
        return this.isEditLimited;
    }

    public String toString() {
        return "KycInfo(familyName=" + this.familyName + ", givenName=" + this.givenName + ", familyNameKana=" + this.familyNameKana + ", givenNameKana=" + this.givenNameKana + ", postCode=" + this.postCode + ", address=" + this.address + ", birthday=" + this.birthday + ", bankCode=" + this.bankCode + ", bankName=" + this.bankName + ", branchCode=" + this.branchCode + ", accountNumber=" + this.accountNumber + ", applicationUrl=" + this.applicationUrl + ", isEditLimited=" + this.isEditLimited + ')';
    }
}

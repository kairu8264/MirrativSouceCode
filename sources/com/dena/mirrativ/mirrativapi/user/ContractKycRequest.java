package com.dena.mirrativ.mirrativapi.user;

import jo.p;

/* loaded from: classes2.dex */
public final class ContractKycRequest {
    private final String accountNumber;
    private final String address;
    private final String bankCode;
    private final Integer birthday;
    private final String branchCode;
    private final String familyName;
    private final String familyNameKana;
    private final String givenName;
    private final String givenNameKana;
    private final String postCode;

    public ContractKycRequest(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9) {
        this.familyName = str;
        this.givenName = str2;
        this.familyNameKana = str3;
        this.givenNameKana = str4;
        this.postCode = str5;
        this.birthday = num;
        this.address = str6;
        this.bankCode = str7;
        this.branchCode = str8;
        this.accountNumber = str9;
    }

    public final String component1() {
        return this.familyName;
    }

    public final String component10() {
        return this.accountNumber;
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

    public final Integer component6() {
        return this.birthday;
    }

    public final String component7() {
        return this.address;
    }

    public final String component8() {
        return this.bankCode;
    }

    public final String component9() {
        return this.branchCode;
    }

    public final ContractKycRequest copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9) {
        return new ContractKycRequest(str, str2, str3, str4, str5, num, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractKycRequest) {
            ContractKycRequest contractKycRequest = (ContractKycRequest) obj;
            return p.c(this.familyName, contractKycRequest.familyName) && p.c(this.givenName, contractKycRequest.givenName) && p.c(this.familyNameKana, contractKycRequest.familyNameKana) && p.c(this.givenNameKana, contractKycRequest.givenNameKana) && p.c(this.postCode, contractKycRequest.postCode) && p.c(this.birthday, contractKycRequest.birthday) && p.c(this.address, contractKycRequest.address) && p.c(this.bankCode, contractKycRequest.bankCode) && p.c(this.branchCode, contractKycRequest.branchCode) && p.c(this.accountNumber, contractKycRequest.accountNumber);
        }
        return false;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final Integer getBirthday() {
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

    public int hashCode() {
        String str = this.familyName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.givenName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.familyNameKana;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.givenNameKana;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.birthday;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.address;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bankCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.branchCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.accountNumber;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "ContractKycRequest(familyName=" + this.familyName + ", givenName=" + this.givenName + ", familyNameKana=" + this.familyNameKana + ", givenNameKana=" + this.givenNameKana + ", postCode=" + this.postCode + ", birthday=" + this.birthday + ", address=" + this.address + ", bankCode=" + this.bankCode + ", branchCode=" + this.branchCode + ", accountNumber=" + this.accountNumber + ')';
    }
}

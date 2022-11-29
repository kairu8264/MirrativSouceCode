package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class ContractKycResponse {
    private final KycInfo kycInfo;
    private final Status status;

    public ContractKycResponse(KycInfo kycInfo, Status status) {
        p.h(status, "status");
        this.kycInfo = kycInfo;
        this.status = status;
    }

    public static /* synthetic */ ContractKycResponse copy$default(ContractKycResponse contractKycResponse, KycInfo kycInfo, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kycInfo = contractKycResponse.kycInfo;
        }
        if ((i10 & 2) != 0) {
            status = contractKycResponse.status;
        }
        return contractKycResponse.copy(kycInfo, status);
    }

    public final KycInfo component1() {
        return this.kycInfo;
    }

    public final Status component2() {
        return this.status;
    }

    public final ContractKycResponse copy(KycInfo kycInfo, Status status) {
        p.h(status, "status");
        return new ContractKycResponse(kycInfo, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractKycResponse) {
            ContractKycResponse contractKycResponse = (ContractKycResponse) obj;
            return p.c(this.kycInfo, contractKycResponse.kycInfo) && p.c(this.status, contractKycResponse.status);
        }
        return false;
    }

    public final KycInfo getKycInfo() {
        return this.kycInfo;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        KycInfo kycInfo = this.kycInfo;
        return ((kycInfo == null ? 0 : kycInfo.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ContractKycResponse(kycInfo=" + this.kycInfo + ", status=" + this.status + ')';
    }
}

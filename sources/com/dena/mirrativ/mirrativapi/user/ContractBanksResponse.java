package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ContractBanksResponse {
    private final List<ContractBank> banks;
    private final Status status;

    public ContractBanksResponse(List<ContractBank> list, Status status) {
        p.h(list, "banks");
        p.h(status, "status");
        this.banks = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractBanksResponse copy$default(ContractBanksResponse contractBanksResponse, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = contractBanksResponse.banks;
        }
        if ((i10 & 2) != 0) {
            status = contractBanksResponse.status;
        }
        return contractBanksResponse.copy(list, status);
    }

    public final List<ContractBank> component1() {
        return this.banks;
    }

    public final Status component2() {
        return this.status;
    }

    public final ContractBanksResponse copy(List<ContractBank> list, Status status) {
        p.h(list, "banks");
        p.h(status, "status");
        return new ContractBanksResponse(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractBanksResponse) {
            ContractBanksResponse contractBanksResponse = (ContractBanksResponse) obj;
            return p.c(this.banks, contractBanksResponse.banks) && p.c(this.status, contractBanksResponse.status);
        }
        return false;
    }

    public final List<ContractBank> getBanks() {
        return this.banks;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.banks.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ContractBanksResponse(banks=" + this.banks + ", status=" + this.status + ')';
    }
}

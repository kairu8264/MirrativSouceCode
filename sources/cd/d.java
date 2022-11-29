package cd;

import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;

/* loaded from: classes2.dex */
public final class d extends p {

    /* renamed from: a  reason: collision with root package name */
    public final ContractKycResponse f19209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ContractKycResponse contractKycResponse) {
        super(null);
        jo.p.h(contractKycResponse, "response");
        this.f19209a = contractKycResponse;
    }

    public final ContractKycResponse a() {
        return this.f19209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && jo.p.c(this.f19209a, ((d) obj).f19209a);
    }

    public int hashCode() {
        return this.f19209a.hashCode();
    }

    public String toString() {
        return "LoadSucceeded(response=" + this.f19209a + ')';
    }
}

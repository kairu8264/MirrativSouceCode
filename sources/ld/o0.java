package ld;

import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;

/* loaded from: classes2.dex */
public abstract class o0 {

    /* loaded from: classes2.dex */
    public static final class a extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f40065a;

        public a(boolean z10) {
            super(null);
            this.f40065a = z10;
        }

        public final boolean a() {
            return this.f40065a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f40065a == ((a) obj).f40065a;
        }

        public int hashCode() {
            boolean z10 = this.f40065a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CheckedCashBonusHistory(isChecked=" + this.f40065a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f40066a;

        public b(boolean z10) {
            super(null);
            this.f40066a = z10;
        }

        public final boolean a() {
            return this.f40066a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f40066a == ((b) obj).f40066a;
        }

        public int hashCode() {
            boolean z10 = this.f40066a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CheckedEditBankAccount(isChecked=" + this.f40066a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f40067a;

        public c(boolean z10) {
            super(null);
            this.f40067a = z10;
        }

        public final boolean a() {
            return this.f40067a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f40067a == ((c) obj).f40067a;
        }

        public int hashCode() {
            boolean z10 = this.f40067a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "CheckedEditIdentification(isChecked=" + this.f40067a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends o0 {
    }

    /* loaded from: classes2.dex */
    public static final class e extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final KycInfo f40068a;

        public e(KycInfo kycInfo) {
            super(null);
            this.f40068a = kycInfo;
        }

        public final KycInfo a() {
            return this.f40068a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f40068a, ((e) obj).f40068a);
        }

        public int hashCode() {
            KycInfo kycInfo = this.f40068a;
            if (kycInfo == null) {
                return 0;
            }
            return kycInfo.hashCode();
        }

        public String toString() {
            return "FetchEditIdentificationParamsSucceeded(kycInfo=" + this.f40068a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f40069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "summary");
            this.f40069a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f40069a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f40069a, ((f) obj).f40069a);
        }

        public int hashCode() {
            return this.f40069a.hashCode();
        }

        public String toString() {
            return "LoadSucceededSummary(summary=" + this.f40069a + ')';
        }
    }

    public o0() {
    }

    public /* synthetic */ o0(jo.h hVar) {
        this();
    }
}

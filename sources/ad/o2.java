package ad;

import com.dena.mirrativ.mirrativapi.core.MRException;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class o2 {

    /* loaded from: classes2.dex */
    public static final class a extends o2 {

        /* renamed from: a  reason: collision with root package name */
        public final KycInfo f1242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KycInfo kycInfo) {
            super(null);
            jo.p.h(kycInfo, "kycInfo");
            this.f1242a = kycInfo;
        }

        public final KycInfo a() {
            return this.f1242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f1242a, ((a) obj).f1242a);
        }

        public int hashCode() {
            return this.f1242a.hashCode();
        }

        public String toString() {
            return "EditBankAccountSucceeded(kycInfo=" + this.f1242a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends o2 {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f1243a;

        /* renamed from: b  reason: collision with root package name */
        public final ContractKycResponse f1244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContractSummaryResponse contractSummaryResponse, ContractKycResponse contractKycResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "response");
            jo.p.h(contractKycResponse, "kycResponse");
            this.f1243a = contractSummaryResponse;
            this.f1244b = contractKycResponse;
        }

        public final ContractKycResponse a() {
            return this.f1244b;
        }

        public final ContractSummaryResponse b() {
            return this.f1243a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f1243a, bVar.f1243a) && jo.p.c(this.f1244b, bVar.f1244b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f1243a.hashCode() * 31) + this.f1244b.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f1243a + ", kycResponse=" + this.f1244b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o2 {

        /* renamed from: a  reason: collision with root package name */
        public final MRException f1245a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRException mRException) {
            super(null);
            jo.p.h(mRException, MRLog.PAYLOAD_KEY_ERROR);
            this.f1245a = mRException;
        }

        public final MRException a() {
            return this.f1245a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f1245a, ((c) obj).f1245a);
        }

        public int hashCode() {
            return this.f1245a.hashCode();
        }

        public String toString() {
            return "PostPaymentTypeFailed(error=" + this.f1245a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends o2 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1246a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends o2 {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryPaymentType f1247a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContractSummaryPaymentType contractSummaryPaymentType) {
            super(null);
            jo.p.h(contractSummaryPaymentType, "type");
            this.f1247a = contractSummaryPaymentType;
        }

        public final ContractSummaryPaymentType a() {
            return this.f1247a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f1247a == ((e) obj).f1247a;
        }

        public int hashCode() {
            return this.f1247a.hashCode();
        }

        public String toString() {
            return "PostPaymentTypeSucceeded(type=" + this.f1247a + ')';
        }
    }

    public o2() {
    }

    public /* synthetic */ o2(jo.h hVar) {
        this();
    }
}

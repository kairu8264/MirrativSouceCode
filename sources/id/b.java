package id;

import ad.g2;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36744f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36745a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36746b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36747c;

    /* renamed from: d  reason: collision with root package name */
    public final ub.a f36748d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f36749e;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(ContractSummaryResponse contractSummaryResponse) {
            p.h(contractSummaryResponse, "summary");
            String accountUrl = contractSummaryResponse.getAccountUrl();
            String howToPageUrl = contractSummaryResponse.getHowToPageUrl();
            String termsPageUrl = contractSummaryResponse.getTermsPageUrl();
            int kycStatus = contractSummaryResponse.getKycStatus();
            g2 g2Var = g2.PENDING;
            return new b(accountUrl, howToPageUrl, termsPageUrl, kycStatus == g2Var.c() ? ub.a.SUBMISSION_IDENTIFICATION : ub.a.NONE, (contractSummaryResponse.getKycStatus() == g2Var.c()) | (contractSummaryResponse.getKycStatus() == g2.CONFIRMED.c()) | (contractSummaryResponse.getKycStatus() == g2.NG.c()));
        }
    }

    public b(String str, String str2, String str3, ub.a aVar, boolean z10) {
        p.h(str, "changeMailAddressUrl");
        p.h(str2, "checkDetailUrl");
        p.h(str3, "termsUrl");
        p.h(aVar, "editIdentificationTransition");
        this.f36745a = str;
        this.f36746b = str2;
        this.f36747c = str3;
        this.f36748d = aVar;
        this.f36749e = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return p.c(this.f36745a, bVar.f36745a) && p.c(this.f36746b, bVar.f36746b) && p.c(this.f36747c, bVar.f36747c) && this.f36748d == bVar.f36748d && this.f36749e == bVar.f36749e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f36745a.hashCode() * 31) + this.f36746b.hashCode()) * 31) + this.f36747c.hashCode()) * 31) + this.f36748d.hashCode()) * 31;
        boolean z10 = this.f36749e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ContractMemberPassBookMenuBindModel(changeMailAddressUrl=" + this.f36745a + ", checkDetailUrl=" + this.f36746b + ", termsUrl=" + this.f36747c + ", editIdentificationTransition=" + this.f36748d + ", isVisibleEditIdentificationButton=" + this.f36749e + ')';
    }
}

package id;

import ad.s1;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import java.text.SimpleDateFormat;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0484a f36737f = new C0484a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f36738g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final d f36739a;

    /* renamed from: b  reason: collision with root package name */
    public final e f36740b;

    /* renamed from: c  reason: collision with root package name */
    public final c f36741c;

    /* renamed from: d  reason: collision with root package name */
    public final b f36742d;

    /* renamed from: e  reason: collision with root package name */
    public final String f36743e;

    /* renamed from: id.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0484a {
        public C0484a() {
        }

        public /* synthetic */ C0484a(h hVar) {
            this();
        }

        @SuppressLint({"SimpleDateFormat"})
        public final a a(ContractSummaryResponse contractSummaryResponse, Resources resources) {
            p.h(contractSummaryResponse, "response");
            p.h(resources, "resources");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            d a10 = d.f36757i.a(contractSummaryResponse);
            e a11 = e.f36767u.a(simpleDateFormat, contractSummaryResponse, resources);
            c a12 = c.f36750f.a(contractSummaryResponse, resources);
            b a13 = b.f36744f.a(contractSummaryResponse);
            boolean z10 = contractSummaryResponse.getCurrentContractStatus() == s1.COMPLETE.c();
            boolean z11 = contractSummaryResponse.getPaidCash() > 0;
            if (!z11) {
                a12 = null;
            }
            return new a(a10, a11, a12, z10 | z11 ? a13 : null, contractSummaryResponse.getHowToPageUrl());
        }
    }

    public a(d dVar, e eVar, c cVar, b bVar, String str) {
        p.h(str, "howToPageUrl");
        this.f36739a = dVar;
        this.f36740b = eVar;
        this.f36741c = cVar;
        this.f36742d = bVar;
        this.f36743e = str;
    }

    public final String a() {
        return this.f36743e;
    }

    public final c b() {
        return this.f36741c;
    }

    public final d c() {
        return this.f36739a;
    }

    public final e d() {
        return this.f36740b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f36739a, aVar.f36739a) && p.c(this.f36740b, aVar.f36740b) && p.c(this.f36741c, aVar.f36741c) && p.c(this.f36742d, aVar.f36742d) && p.c(this.f36743e, aVar.f36743e);
        }
        return false;
    }

    public int hashCode() {
        d dVar = this.f36739a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        e eVar = this.f36740b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f36741c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.f36742d;
        return ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f36743e.hashCode();
    }

    public String toString() {
        return "ContractMemberPassBookHeaderBindModel(rankBindModel=" + this.f36739a + ", rewardBindModel=" + this.f36740b + ", notReceivedBindModel=" + this.f36741c + ", menuBindModel=" + this.f36742d + ", howToPageUrl=" + this.f36743e + ')';
    }
}

package ad;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f957a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f957a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f957a, ((a) obj).f957a);
        }

        public int hashCode() {
            return this.f957a.hashCode();
        }

        public String toString() {
            return "LoadFailed(error=" + this.f957a + ')';
        }
    }

    /* renamed from: ad.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0020b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0020b f958a = new C0020b();

        public C0020b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final ContractBanksResponse f959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractBanksResponse contractBanksResponse) {
            super(null);
            jo.p.h(contractBanksResponse, "response");
            this.f959a = contractBanksResponse;
        }

        public final ContractBanksResponse a() {
            return this.f959a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f959a, ((c) obj).f959a);
        }

        public int hashCode() {
            return this.f959a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f959a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}

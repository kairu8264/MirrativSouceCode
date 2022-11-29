package ab;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f720a = mRError;
        }

        public final MRError a() {
            return this.f720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f720a, ((a) obj).f720a);
        }

        public int hashCode() {
            return this.f720a.hashCode();
        }

        public String toString() {
            return "CheckReceiptFailed(error=" + this.f720a + ')';
        }
    }

    /* renamed from: ab.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0014b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0014b f721a = new C0014b();

        public C0014b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f722a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f723a = mRError;
        }

        public final MRError a() {
            return this.f723a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f723a, ((d) obj).f723a);
        }

        public int hashCode() {
            return this.f723a.hashCode();
        }

        public String toString() {
            return "FetchCoinPurchaseFailed(error=" + this.f723a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f724a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final jf.f f725a;

        /* renamed from: b  reason: collision with root package name */
        public final List<w> f726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jf.f fVar, List<w> list) {
            super(null);
            jo.p.h(fVar, "possessionCoin");
            jo.p.h(list, "skuDetailsWithCoinProducts");
            this.f725a = fVar;
            this.f726b = list;
        }

        public final jf.f a() {
            return this.f725a;
        }

        public final List<w> b() {
            return this.f726b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f725a, fVar.f725a) && jo.p.c(this.f726b, fVar.f726b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f725a.hashCode() * 31) + this.f726b.hashCode();
        }

        public String toString() {
            return "FetchCoinPurchaseSucceeded(possessionCoin=" + this.f725a + ", skuDetailsWithCoinProducts=" + this.f726b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f727a;

        public g(int i10) {
            super(null);
            this.f727a = i10;
        }

        public final int a() {
            return this.f727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f727a == ((g) obj).f727a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f727a);
        }

        public String toString() {
            return "OrientationChanged(orientation=" + this.f727a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f728a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final i f729a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f730a = new j();

        public j() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}

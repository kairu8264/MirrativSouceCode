package pd;

import com.dena.mirrativ.mirrativapi.user.LatestRewardResponse;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.mirrativapi.user.TosResponse;

/* loaded from: classes2.dex */
public abstract class x {

    /* loaded from: classes2.dex */
    public static final class a extends x {

        /* renamed from: a  reason: collision with root package name */
        public final LatestRewardResponse f47319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LatestRewardResponse latestRewardResponse) {
            super(null);
            jo.p.h(latestRewardResponse, "response");
            this.f47319a = latestRewardResponse;
        }

        public final LatestRewardResponse a() {
            return this.f47319a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47319a, ((a) obj).f47319a);
        }

        public int hashCode() {
            return this.f47319a.hashCode();
        }

        public String toString() {
            return "LoadFinishLatestReward(response=" + this.f47319a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x {

        /* renamed from: a  reason: collision with root package name */
        public final SeasonRatingStatusResponse f47320a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SeasonRatingStatusResponse seasonRatingStatusResponse, boolean z10) {
            super(null);
            jo.p.h(seasonRatingStatusResponse, "response");
            this.f47320a = seasonRatingStatusResponse;
            this.f47321b = z10;
        }

        public final SeasonRatingStatusResponse a() {
            return this.f47320a;
        }

        public final boolean b() {
            return this.f47321b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f47320a, bVar.f47320a) && this.f47321b == bVar.f47321b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f47320a.hashCode() * 31;
            boolean z10 = this.f47321b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "LoadSucceededSeasonRatingStatus(response=" + this.f47320a + ", isShowPopUp=" + this.f47321b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends x {

        /* renamed from: a  reason: collision with root package name */
        public final TosResponse f47322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TosResponse tosResponse) {
            super(null);
            jo.p.h(tosResponse, "response");
            this.f47322a = tosResponse;
        }

        public final TosResponse a() {
            return this.f47322a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47322a, ((c) obj).f47322a);
        }

        public int hashCode() {
            return this.f47322a.hashCode();
        }

        public String toString() {
            return "LoadSucceededTos(response=" + this.f47322a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final d f47323a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends x {
    }

    /* loaded from: classes2.dex */
    public static final class f extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final f f47324a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends pd.j {

        /* renamed from: a  reason: collision with root package name */
        public static final g f47325a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47326a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final i f47327a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends pd.j {

        /* renamed from: a  reason: collision with root package name */
        public static final j f47328a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final k f47329a = new k();

        public k() {
            super(null);
        }
    }

    public x() {
    }

    public /* synthetic */ x(jo.h hVar) {
        this();
    }
}

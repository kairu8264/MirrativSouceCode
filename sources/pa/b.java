package pa;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import jo.h;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46334a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f46334a, ((a) obj).f46334a);
        }

        public int hashCode() {
            return this.f46334a.hashCode();
        }

        public String toString() {
            return "FetchLiveFailed(error=" + this.f46334a + ')';
        }
    }

    /* renamed from: pa.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0703b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0703b f46335a = new C0703b();

        public C0703b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f46336b = LiveDetailResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final LiveDetailResponse f46337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LiveDetailResponse liveDetailResponse) {
            super(null);
            p.h(liveDetailResponse, "liveDetail");
            this.f46337a = liveDetailResponse;
        }

        public final LiveDetailResponse a() {
            return this.f46337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f46337a, ((c) obj).f46337a);
        }

        public int hashCode() {
            return this.f46337a.hashCode();
        }

        public String toString() {
            return "FetchLiveSucceeded(liveDetail=" + this.f46337a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f46338a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f46339a = new e();

        public e() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(h hVar) {
        this();
    }
}

package xe;

import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import jo.h;
import jo.p;
import kf.v;
import of.n;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C1008a f60244f = new C1008a(null);

    /* renamed from: a  reason: collision with root package name */
    public final v f60245a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.a f60246b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60247c;

    /* renamed from: d  reason: collision with root package name */
    public final long f60248d;

    /* renamed from: e  reason: collision with root package name */
    public final long f60249e;

    /* renamed from: xe.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1008a {
        public C1008a() {
        }

        public /* synthetic */ C1008a(h hVar) {
            this();
        }
    }

    public a(v vVar, kf.a aVar) {
        p.h(vVar, "tutorialPreference");
        p.h(aVar, "appRaterPreference");
        this.f60245a = vVar;
        this.f60246b = aVar;
        this.f60247c = 3;
        this.f60248d = n.n() ? DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS : DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS;
        this.f60249e = n.n() ? 5L : 600L;
    }

    public final void a() {
        this.f60246b.A3(true);
        this.f60246b.X0(BuildConfig.VERSION_NAME);
    }

    public final boolean b() {
        if (p.c(BuildConfig.VERSION_NAME, this.f60246b.t0())) {
            return this.f60246b.f0() || this.f60246b.a0() || this.f60246b.k4() == -1;
        }
        this.f60246b.clear();
        return false;
    }

    public final void c(boolean z10) {
        this.f60246b.G(z10 ? 1 : -1);
        if (z10) {
            return;
        }
        this.f60246b.X0(BuildConfig.VERSION_NAME);
    }

    public final boolean d() {
        return !b() && this.f60246b.k4() == 0;
    }

    public final boolean e(long j10) {
        return !b() && j10 >= this.f60249e && this.f60245a.A1() >= this.f60247c;
    }

    public final boolean f(long j10, int i10) {
        return !b() && j10 >= this.f60248d && i10 >= this.f60247c;
    }
}

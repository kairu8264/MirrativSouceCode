package o7;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import j8.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o7.f;
import o7.i;

/* loaded from: classes.dex */
public class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    public final n3.e<h<?>> A;
    public com.bumptech.glide.e D;
    public m7.e E;
    public com.bumptech.glide.h F;
    public n G;
    public int H;
    public int I;
    public j J;
    public m7.h K;
    public b<R> L;
    public int M;
    public EnumC0659h N;
    public g O;
    public long P;
    public boolean Q;
    public Object R;
    public Thread S;
    public m7.e T;
    public m7.e U;
    public Object V;
    public m7.a W;
    public com.bumptech.glide.load.data.d<?> X;
    public volatile o7.f Y;
    public volatile boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public volatile boolean f44163a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f44164b0;

    /* renamed from: z  reason: collision with root package name */
    public final e f44168z;

    /* renamed from: w  reason: collision with root package name */
    public final o7.g<R> f44165w = new o7.g<>();

    /* renamed from: x  reason: collision with root package name */
    public final List<Throwable> f44166x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final j8.c f44167y = j8.c.a();
    public final d<?> B = new d<>();
    public final f C = new f();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44169a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f44170b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f44171c;

        static {
            int[] iArr = new int[m7.c.values().length];
            f44171c = iArr;
            try {
                iArr[m7.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44171c[m7.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0659h.values().length];
            f44170b = iArr2;
            try {
                iArr2[EnumC0659h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44170b[EnumC0659h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44170b[EnumC0659h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44170b[EnumC0659h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44170b[EnumC0659h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f44169a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44169a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44169a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<R> {
        void a(h<?> hVar);

        void b(u<R> uVar, m7.a aVar, boolean z10);

        void c(GlideException glideException);
    }

    /* loaded from: classes.dex */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final m7.a f44172a;

        public c(m7.a aVar) {
            this.f44172a = aVar;
        }

        @Override // o7.i.a
        public u<Z> a(u<Z> uVar) {
            return h.this.B(this.f44172a, uVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        public m7.e f44174a;

        /* renamed from: b  reason: collision with root package name */
        public m7.k<Z> f44175b;

        /* renamed from: c  reason: collision with root package name */
        public t<Z> f44176c;

        public void a() {
            this.f44174a = null;
            this.f44175b = null;
            this.f44176c = null;
        }

        public void b(e eVar, m7.h hVar) {
            j8.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f44174a, new o7.e(this.f44175b, this.f44176c, hVar));
            } finally {
                this.f44176c.h();
                j8.b.d();
            }
        }

        public boolean c() {
            return this.f44176c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(m7.e eVar, m7.k<X> kVar, t<X> tVar) {
            this.f44174a = eVar;
            this.f44175b = kVar;
            this.f44176c = tVar;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        q7.a a();
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f44177a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f44178b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f44179c;

        public final boolean a(boolean z10) {
            return (this.f44179c || z10 || this.f44178b) && this.f44177a;
        }

        public synchronized boolean b() {
            this.f44178b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.f44179c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z10) {
            this.f44177a = true;
            return a(z10);
        }

        public synchronized void e() {
            this.f44178b = false;
            this.f44177a = false;
            this.f44179c = false;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: o7.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0659h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, n3.e<h<?>> eVar2) {
        this.f44168z = eVar;
        this.A = eVar2;
    }

    public final void A() {
        if (this.C.c()) {
            D();
        }
    }

    public <Z> u<Z> B(m7.a aVar, u<Z> uVar) {
        u<Z> uVar2;
        m7.l<Z> lVar;
        m7.c cVar;
        m7.e dVar;
        Class<?> cls = uVar.get().getClass();
        m7.k<Z> kVar = null;
        if (aVar != m7.a.RESOURCE_DISK_CACHE) {
            m7.l<Z> r10 = this.f44165w.r(cls);
            lVar = r10;
            uVar2 = r10.b(this.D, uVar, this.H, this.I);
        } else {
            uVar2 = uVar;
            lVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.c();
        }
        if (this.f44165w.v(uVar2)) {
            kVar = this.f44165w.n(uVar2);
            cVar = kVar.b(this.K);
        } else {
            cVar = m7.c.NONE;
        }
        m7.k kVar2 = kVar;
        if (this.J.d(!this.f44165w.x(this.T), aVar, cVar)) {
            if (kVar2 != null) {
                int i10 = a.f44171c[cVar.ordinal()];
                if (i10 == 1) {
                    dVar = new o7.d(this.T, this.E);
                } else if (i10 == 2) {
                    dVar = new w(this.f44165w.b(), this.T, this.E, this.H, this.I, lVar, cls, this.K);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: " + cVar);
                }
                t f10 = t.f(uVar2);
                this.B.d(dVar, kVar2, f10);
                return f10;
            }
            throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
        }
        return uVar2;
    }

    public void C(boolean z10) {
        if (this.C.d(z10)) {
            D();
        }
    }

    public final void D() {
        this.C.e();
        this.B.a();
        this.f44165w.a();
        this.Z = false;
        this.D = null;
        this.E = null;
        this.K = null;
        this.F = null;
        this.G = null;
        this.L = null;
        this.N = null;
        this.Y = null;
        this.S = null;
        this.T = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.P = 0L;
        this.f44163a0 = false;
        this.R = null;
        this.f44166x.clear();
        this.A.a(this);
    }

    public final void E() {
        this.S = Thread.currentThread();
        this.P = i8.f.b();
        boolean z10 = false;
        while (!this.f44163a0 && this.Y != null && !(z10 = this.Y.b())) {
            this.N = q(this.N);
            this.Y = p();
            if (this.N == EnumC0659h.SOURCE) {
                h();
                return;
            }
        }
        if ((this.N == EnumC0659h.FINISHED || this.f44163a0) && !z10) {
            y();
        }
    }

    public final <Data, ResourceType> u<R> F(Data data, m7.a aVar, s<Data, ResourceType, R> sVar) throws GlideException {
        m7.h r10 = r(aVar);
        com.bumptech.glide.load.data.e<Data> l10 = this.D.i().l(data);
        try {
            return sVar.a(l10, r10, this.H, this.I, new c(aVar));
        } finally {
            l10.b();
        }
    }

    public final void G() {
        int i10 = a.f44169a[this.O.ordinal()];
        if (i10 == 1) {
            this.N = q(EnumC0659h.INITIALIZE);
            this.Y = p();
            E();
        } else if (i10 == 2) {
            E();
        } else if (i10 == 3) {
            o();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.O);
        }
    }

    public final void H() {
        Throwable th2;
        this.f44167y.c();
        if (this.Z) {
            if (this.f44166x.isEmpty()) {
                th2 = null;
            } else {
                List<Throwable> list = this.f44166x;
                th2 = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.Z = true;
    }

    public boolean I() {
        EnumC0659h q10 = q(EnumC0659h.INITIALIZE);
        return q10 == EnumC0659h.RESOURCE_CACHE || q10 == EnumC0659h.DATA_CACHE;
    }

    @Override // o7.f.a
    public void a(m7.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, m7.a aVar, m7.e eVar2) {
        this.T = eVar;
        this.V = obj;
        this.X = dVar;
        this.W = aVar;
        this.U = eVar2;
        this.f44164b0 = eVar != this.f44165w.c().get(0);
        if (Thread.currentThread() != this.S) {
            this.O = g.DECODE_DATA;
            this.L.a(this);
            return;
        }
        j8.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            o();
        } finally {
            j8.b.d();
        }
    }

    @Override // o7.f.a
    public void c(m7.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, m7.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f44166x.add(glideException);
        if (Thread.currentThread() != this.S) {
            this.O = g.SWITCH_TO_SOURCE_SERVICE;
            this.L.a(this);
            return;
        }
        E();
    }

    @Override // j8.a.f
    public j8.c e() {
        return this.f44167y;
    }

    @Override // o7.f.a
    public void h() {
        this.O = g.SWITCH_TO_SOURCE_SERVICE;
        this.L.a(this);
    }

    public void i() {
        this.f44163a0 = true;
        o7.f fVar = this.Y;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: l */
    public int compareTo(h<?> hVar) {
        int s10 = s() - hVar.s();
        return s10 == 0 ? this.M - hVar.M : s10;
    }

    public final <Data> u<R> m(com.bumptech.glide.load.data.d<?> dVar, Data data, m7.a aVar) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long b10 = i8.f.b();
            u<R> n10 = n(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                u("Decoded result " + n10, b10);
            }
            return n10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> u<R> n(Data data, m7.a aVar) throws GlideException {
        return F(data, aVar, (s<Data, ?, R>) this.f44165w.h(data.getClass()));
    }

    public final void o() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.P;
            v("Retrieved data", j10, "data: " + this.V + ", cache key: " + this.T + ", fetcher: " + this.X);
        }
        u<R> uVar = null;
        try {
            uVar = m(this.X, this.V, this.W);
        } catch (GlideException e10) {
            e10.i(this.U, this.W);
            this.f44166x.add(e10);
        }
        if (uVar != null) {
            x(uVar, this.W, this.f44164b0);
        } else {
            E();
        }
    }

    public final o7.f p() {
        int i10 = a.f44170b[this.N.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.N);
                }
                return new y(this.f44165w, this);
            }
            return new o7.c(this.f44165w, this);
        }
        return new v(this.f44165w, this);
    }

    public final EnumC0659h q(EnumC0659h enumC0659h) {
        int i10 = a.f44170b[enumC0659h.ordinal()];
        if (i10 == 1) {
            if (this.J.a()) {
                return EnumC0659h.DATA_CACHE;
            }
            return q(EnumC0659h.DATA_CACHE);
        } else if (i10 == 2) {
            return this.Q ? EnumC0659h.FINISHED : EnumC0659h.SOURCE;
        } else if (i10 == 3 || i10 == 4) {
            return EnumC0659h.FINISHED;
        } else {
            if (i10 == 5) {
                if (this.J.b()) {
                    return EnumC0659h.RESOURCE_CACHE;
                }
                return q(EnumC0659h.RESOURCE_CACHE);
            }
            throw new IllegalArgumentException("Unrecognized stage: " + enumC0659h);
        }
    }

    public final m7.h r(m7.a aVar) {
        m7.h hVar = this.K;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == m7.a.RESOURCE_DISK_CACHE || this.f44165w.w();
        m7.g<Boolean> gVar = v7.m.f56871j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool == null || (bool.booleanValue() && !z10)) {
            m7.h hVar2 = new m7.h();
            hVar2.d(this.K);
            hVar2.e(gVar, Boolean.valueOf(z10));
            return hVar2;
        }
        return hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j8.b.b("DecodeJob#run(model=%s)", this.R);
        com.bumptech.glide.load.data.d<?> dVar = this.X;
        try {
            try {
                if (this.f44163a0) {
                    y();
                    if (dVar != null) {
                        dVar.b();
                    }
                    j8.b.d();
                    return;
                }
                G();
                if (dVar != null) {
                    dVar.b();
                }
                j8.b.d();
            } catch (o7.b e10) {
                throw e10;
            }
        }
    }

    public final int s() {
        return this.F.ordinal();
    }

    public h<R> t(com.bumptech.glide.e eVar, Object obj, n nVar, m7.e eVar2, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, m7.l<?>> map, boolean z10, boolean z11, boolean z12, m7.h hVar2, b<R> bVar, int i12) {
        this.f44165w.u(eVar, obj, eVar2, i10, i11, jVar, cls, cls2, hVar, hVar2, map, z10, z11, this.f44168z);
        this.D = eVar;
        this.E = eVar2;
        this.F = hVar;
        this.G = nVar;
        this.H = i10;
        this.I = i11;
        this.J = jVar;
        this.Q = z12;
        this.K = hVar2;
        this.L = bVar;
        this.M = i12;
        this.O = g.INITIALIZE;
        this.R = obj;
        return this;
    }

    public final void u(String str, long j10) {
        v(str, j10, null);
    }

    public final void v(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(i8.f.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.G);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    public final void w(u<R> uVar, m7.a aVar, boolean z10) {
        H();
        this.L.b(uVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(u<R> uVar, m7.a aVar, boolean z10) {
        if (uVar instanceof q) {
            ((q) uVar).b();
        }
        t tVar = 0;
        if (this.B.c()) {
            uVar = t.f(uVar);
            tVar = uVar;
        }
        w(uVar, aVar, z10);
        this.N = EnumC0659h.ENCODE;
        try {
            if (this.B.c()) {
                this.B.b(this.f44168z, this.K);
            }
            z();
        } finally {
            if (tVar != 0) {
                tVar.h();
            }
        }
    }

    public final void y() {
        H();
        this.L.c(new GlideException("Failed to load resource", new ArrayList(this.f44166x)));
        A();
    }

    public final void z() {
        if (this.C.b()) {
            D();
        }
    }
}

package er;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import ep.b0;
import ep.d0;
import ep.e;
import ep.e0;
import java.io.IOException;
import java.util.Objects;
import rp.h0;

/* loaded from: classes4.dex */
public final class m<T> implements er.b<T> {
    public volatile boolean A;
    public ep.e B;
    public Throwable C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public final r f31145w;

    /* renamed from: x  reason: collision with root package name */
    public final Object[] f31146x;

    /* renamed from: y  reason: collision with root package name */
    public final e.a f31147y;

    /* renamed from: z  reason: collision with root package name */
    public final f<e0, T> f31148z;

    /* loaded from: classes4.dex */
    public class a implements ep.f {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f31149w;

        public a(d dVar) {
            this.f31149w = dVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f31149w.a(m.this, th2);
            } catch (Throwable th3) {
                x.s(th3);
                th3.printStackTrace();
            }
        }

        @Override // ep.f
        public void c(ep.e eVar, IOException iOException) {
            a(iOException);
        }

        @Override // ep.f
        public void e(ep.e eVar, d0 d0Var) {
            try {
                try {
                    this.f31149w.b(m.this, m.this.f(d0Var));
                } catch (Throwable th2) {
                    x.s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                x.s(th3);
                a(th3);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends e0 {
        public IOException A;

        /* renamed from: y  reason: collision with root package name */
        public final e0 f31151y;

        /* renamed from: z  reason: collision with root package name */
        public final rp.e f31152z;

        /* loaded from: classes4.dex */
        public class a extends rp.l {
            public a(h0 h0Var) {
                super(h0Var);
            }

            @Override // rp.l, rp.h0
            public long f1(rp.c cVar, long j10) throws IOException {
                try {
                    return super.f1(cVar, j10);
                } catch (IOException e10) {
                    b.this.A = e10;
                    throw e10;
                }
            }
        }

        public b(e0 e0Var) {
            this.f31151y = e0Var;
            this.f31152z = rp.t.c(new a(e0Var.n()));
        }

        @Override // ep.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31151y.close();
        }

        @Override // ep.e0
        public long h() {
            return this.f31151y.h();
        }

        @Override // ep.e0
        public ep.x i() {
            return this.f31151y.i();
        }

        @Override // ep.e0
        public rp.e n() {
            return this.f31152z;
        }

        public void p() throws IOException {
            IOException iOException = this.A;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends e0 {

        /* renamed from: y  reason: collision with root package name */
        public final ep.x f31154y;

        /* renamed from: z  reason: collision with root package name */
        public final long f31155z;

        public c(ep.x xVar, long j10) {
            this.f31154y = xVar;
            this.f31155z = j10;
        }

        @Override // ep.e0
        public long h() {
            return this.f31155z;
        }

        @Override // ep.e0
        public ep.x i() {
            return this.f31154y;
        }

        @Override // ep.e0
        public rp.e n() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public m(r rVar, Object[] objArr, e.a aVar, f<e0, T> fVar) {
        this.f31145w = rVar;
        this.f31146x = objArr;
        this.f31147y = aVar;
        this.f31148z = fVar;
    }

    @Override // er.b
    public void D0(d<T> dVar) {
        ep.e eVar;
        Throwable th2;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.D) {
                this.D = true;
                eVar = this.B;
                th2 = this.C;
                if (eVar == null && th2 == null) {
                    ep.e c10 = c();
                    this.B = c10;
                    eVar = c10;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.a(this, th2);
            return;
        }
        if (this.A) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new a(dVar));
    }

    @Override // er.b
    /* renamed from: b */
    public m<T> clone() {
        return new m<>(this.f31145w, this.f31146x, this.f31147y, this.f31148z);
    }

    public final ep.e c() throws IOException {
        ep.e b10 = this.f31147y.b(this.f31145w.a(this.f31146x));
        Objects.requireNonNull(b10, "Call.Factory returned null.");
        return b10;
    }

    @Override // er.b
    public void cancel() {
        ep.e eVar;
        this.A = true;
        synchronized (this) {
            eVar = this.B;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // er.b
    public s<T> d() throws IOException {
        ep.e e10;
        synchronized (this) {
            if (!this.D) {
                this.D = true;
                e10 = e();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.A) {
            e10.cancel();
        }
        return f(FirebasePerfOkHttpClient.execute(e10));
    }

    public final ep.e e() throws IOException {
        ep.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.C;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            ep.e c10 = c();
            this.B = c10;
            return c10;
        } catch (IOException | Error | RuntimeException e10) {
            x.s(e10);
            this.C = e10;
            throw e10;
        }
    }

    public s<T> f(d0 d0Var) throws IOException {
        e0 a10 = d0Var.a();
        d0 c10 = d0Var.z().b(new c(a10.i(), a10.h())).c();
        int h10 = c10.h();
        if (h10 < 200 || h10 >= 300) {
            try {
                return s.c(x.a(a10), c10);
            } finally {
                a10.close();
            }
        } else if (h10 != 204 && h10 != 205) {
            b bVar = new b(a10);
            try {
                return s.h(this.f31148z.a(bVar), c10);
            } catch (RuntimeException e10) {
                bVar.p();
                throw e10;
            }
        } else {
            a10.close();
            return s.h(null, c10);
        }
    }

    @Override // er.b
    public synchronized b0 j() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return e().j();
    }

    @Override // er.b
    public boolean p() {
        boolean z10 = true;
        if (this.A) {
            return true;
        }
        synchronized (this) {
            ep.e eVar = this.B;
            if (eVar == null || !eVar.p()) {
                z10 = false;
            }
        }
        return z10;
    }
}

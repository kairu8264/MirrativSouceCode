package ai;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class an0 implements ui {

    /* renamed from: a  reason: collision with root package name */
    public final ej<ui> f1930a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1931b;

    /* renamed from: c  reason: collision with root package name */
    public final ui f1932c;

    /* renamed from: d  reason: collision with root package name */
    public final zm0 f1933d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1934e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1935f;

    /* renamed from: h  reason: collision with root package name */
    public InputStream f1937h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1938i;

    /* renamed from: j  reason: collision with root package name */
    public Uri f1939j;

    /* renamed from: k  reason: collision with root package name */
    public volatile bn f1940k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1941l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1942m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1943n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1944o = false;

    /* renamed from: p  reason: collision with root package name */
    public long f1945p = 0;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicLong f1947r = new AtomicLong(-1);

    /* renamed from: q  reason: collision with root package name */
    public s43<Long> f1946q = null;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1936g = ((Boolean) ft.c().c(ox.f8030l1)).booleanValue();

    public an0(Context context, ui uiVar, String str, int i10, ej<ui> ejVar, zm0 zm0Var) {
        this.f1931b = context;
        this.f1932c = uiVar;
        this.f1930a = ejVar;
        this.f1933d = zm0Var;
        this.f1934e = str;
        this.f1935f = i10;
    }

    public final boolean a() {
        return this.f1941l;
    }

    @Override // ai.ui
    public final Uri b() {
        return this.f1939j;
    }

    @Override // ai.ui
    public final void d() throws IOException {
        if (!this.f1938i) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f1938i = false;
        this.f1939j = null;
        InputStream inputStream = this.f1937h;
        if (inputStream != null) {
            vh.l.a(inputStream);
            this.f1937h = null;
            return;
        }
        this.f1932c.d();
    }

    @Override // ai.ui
    public final int e(byte[] bArr, int i10, int i11) throws IOException {
        int e10;
        ej<ui> ejVar;
        if (this.f1938i) {
            InputStream inputStream = this.f1937h;
            if (inputStream != null) {
                e10 = inputStream.read(bArr, i10, i11);
            } else {
                e10 = this.f1932c.e(bArr, i10, i11);
            }
            if ((!this.f1936g || this.f1937h != null) && (ejVar = this.f1930a) != null) {
                ((mn0) ejVar).e0(this, e10);
            }
            return e10;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // ai.ui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(ai.vi r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.an0.f(ai.vi):long");
    }

    public final boolean g() {
        return this.f1942m;
    }

    public final boolean h() {
        return this.f1943n;
    }

    public final boolean i() {
        return this.f1944o;
    }

    public final long j() {
        return this.f1945p;
    }

    public final long k() {
        if (this.f1940k == null) {
            return -1L;
        }
        if (this.f1947r.get() != -1) {
            return this.f1947r.get();
        }
        synchronized (this) {
            if (this.f1946q == null) {
                this.f1946q = hk0.f4878a.h(new Callable(this) { // from class: ai.ym0

                    /* renamed from: a  reason: collision with root package name */
                    public final an0 f12668a;

                    {
                        this.f12668a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f12668a.l();
                    }
                });
            }
        }
        if (this.f1946q.isDone()) {
            try {
                this.f1947r.compareAndSet(-1L, this.f1946q.get().longValue());
                return this.f1947r.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long l() throws Exception {
        return Long.valueOf(wg.t.j().g(this.f1940k));
    }

    public final void m(vi viVar) {
        ej<ui> ejVar = this.f1930a;
        if (ejVar != null) {
            ((mn0) ejVar).n(this, viVar);
        }
    }

    public final boolean n() {
        if (this.f1936g) {
            if (!((Boolean) ft.c().c(ox.L2)).booleanValue() || this.f1943n) {
                return ((Boolean) ft.c().c(ox.M2)).booleanValue() && !this.f1944o;
            }
            return true;
        }
        return false;
    }
}

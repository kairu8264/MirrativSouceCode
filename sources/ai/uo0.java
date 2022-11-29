package ai;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class uo0 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final Context f10765e;

    /* renamed from: f  reason: collision with root package name */
    public final a8 f10766f;

    /* renamed from: g  reason: collision with root package name */
    public final to0 f10767g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10768h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10769i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10770j;

    /* renamed from: k  reason: collision with root package name */
    public InputStream f10771k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10772l;

    /* renamed from: m  reason: collision with root package name */
    public Uri f10773m;

    /* renamed from: n  reason: collision with root package name */
    public volatile bn f10774n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10775o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10776p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10777q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10778r;

    /* renamed from: s  reason: collision with root package name */
    public long f10779s;

    /* renamed from: t  reason: collision with root package name */
    public s43<Long> f10780t;

    /* renamed from: u  reason: collision with root package name */
    public final AtomicLong f10781u;

    public uo0(Context context, a8 a8Var, String str, int i10, pm pmVar, to0 to0Var) {
        super(false);
        this.f10765e = context;
        this.f10766f = a8Var;
        this.f10767g = to0Var;
        this.f10768h = str;
        this.f10769i = i10;
        this.f10775o = false;
        this.f10776p = false;
        this.f10777q = false;
        this.f10778r = false;
        this.f10779s = 0L;
        this.f10781u = new AtomicLong(-1L);
        this.f10780t = null;
        this.f10770j = ((Boolean) ft.c().c(ox.f8030l1)).booleanValue();
        l(pmVar);
    }

    public final boolean A() {
        if (this.f10770j) {
            if (!((Boolean) ft.c().c(ox.L2)).booleanValue() || this.f10777q) {
                return ((Boolean) ft.c().c(ox.M2)).booleanValue() && !this.f10778r;
            }
            return true;
        }
        return false;
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int b10;
        if (this.f10772l) {
            InputStream inputStream = this.f10771k;
            if (inputStream != null) {
                b10 = inputStream.read(bArr, i10, i11);
            } else {
                b10 = this.f10766f.b(bArr, i10, i11);
            }
            if (!this.f10770j || this.f10771k != null) {
                s(b10);
            }
            return b10;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    @Override // ai.a8
    public final void g() throws IOException {
        if (!this.f10772l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z10 = false;
        this.f10772l = false;
        this.f10773m = null;
        if (!this.f10770j || this.f10771k != null) {
            z10 = true;
        }
        InputStream inputStream = this.f10771k;
        if (inputStream != null) {
            vh.l.a(inputStream);
            this.f10771k = null;
        } else {
            this.f10766f.g();
        }
        if (z10) {
            t();
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f10773m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // ai.a8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(ai.bc r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.uo0.m(ai.bc):long");
    }

    public final long o() {
        return this.f10779s;
    }

    public final boolean u() {
        return this.f10775o;
    }

    public final boolean v() {
        return this.f10776p;
    }

    public final boolean w() {
        return this.f10777q;
    }

    public final boolean x() {
        return this.f10778r;
    }

    public final long y() {
        if (this.f10774n == null) {
            return -1L;
        }
        if (this.f10781u.get() != -1) {
            return this.f10781u.get();
        }
        synchronized (this) {
            if (this.f10780t == null) {
                this.f10780t = hk0.f4878a.h(new Callable(this) { // from class: ai.so0

                    /* renamed from: a  reason: collision with root package name */
                    public final uo0 f9887a;

                    {
                        this.f9887a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f9887a.z();
                    }
                });
            }
        }
        if (this.f10780t.isDone()) {
            try {
                this.f10781u.compareAndSet(-1L, this.f10780t.get().longValue());
                return this.f10781u.get();
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long z() throws Exception {
        return Long.valueOf(wg.t.j().g(this.f10774n));
    }
}

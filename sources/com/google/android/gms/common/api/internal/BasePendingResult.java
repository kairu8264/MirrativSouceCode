package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oh.b;
import oh.e;
import oh.f;
import ph.h1;
import ph.j1;
import ph.x0;
import rh.j;
import rh.p;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends e> extends b<R> {

    /* renamed from: o */
    public static final ThreadLocal<Boolean> f27200o = new h1();

    /* renamed from: p */
    public static final /* synthetic */ int f27201p = 0;

    /* renamed from: a */
    public final Object f27202a;

    /* renamed from: b */
    public final a<R> f27203b;

    /* renamed from: c */
    public final WeakReference<c> f27204c;

    /* renamed from: d */
    public final CountDownLatch f27205d;

    /* renamed from: e */
    public final ArrayList<b.a> f27206e;

    /* renamed from: f */
    public f<? super R> f27207f;

    /* renamed from: g */
    public final AtomicReference<x0> f27208g;

    /* renamed from: h */
    public R f27209h;

    /* renamed from: i */
    public Status f27210i;

    /* renamed from: j */
    public volatile boolean f27211j;

    /* renamed from: k */
    public boolean f27212k;

    /* renamed from: l */
    public boolean f27213l;

    /* renamed from: m */
    public j f27214m;
    @KeepName
    private j1 mResultGuardian;

    /* renamed from: n */
    public boolean f27215n;

    /* loaded from: classes3.dex */
    public static class a<R extends e> extends di.f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(f<? super R> fVar, R r10) {
            int i10 = BasePendingResult.f27201p;
            sendMessage(obtainMessage(1, new Pair((f) p.i(fVar), r10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                f fVar = (f) pair.first;
                e eVar = (e) pair.second;
                try {
                    fVar.a(eVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.k(eVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).d(Status.E);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f27202a = new Object();
        this.f27205d = new CountDownLatch(1);
        this.f27206e = new ArrayList<>();
        this.f27208g = new AtomicReference<>();
        this.f27215n = false;
        this.f27203b = new a<>(Looper.getMainLooper());
        this.f27204c = new WeakReference<>(null);
    }

    public static void k(e eVar) {
        if (eVar instanceof oh.c) {
            try {
                ((oh.c) eVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(eVar)), e10);
            }
        }
    }

    @Override // oh.b
    public final void a(b.a aVar) {
        p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f27202a) {
            if (e()) {
                aVar.a(this.f27210i);
            } else {
                this.f27206e.add(aVar);
            }
        }
    }

    @Override // oh.b
    public final R b(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            p.h("await must not be called on the UI thread when time is greater than zero.");
        }
        p.m(!this.f27211j, "Result has already been consumed.");
        p.m(true, "Cannot await if then() has been called.");
        try {
            if (!this.f27205d.await(j10, timeUnit)) {
                d(Status.E);
            }
        } catch (InterruptedException unused) {
            d(Status.C);
        }
        p.m(e(), "Result is not ready.");
        return g();
    }

    public abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f27202a) {
            if (!e()) {
                f(c(status));
                this.f27213l = true;
            }
        }
    }

    public final boolean e() {
        return this.f27205d.getCount() == 0;
    }

    public final void f(R r10) {
        synchronized (this.f27202a) {
            if (!this.f27213l && !this.f27212k) {
                e();
                p.m(!e(), "Results have already been set");
                p.m(!this.f27211j, "Result has already been consumed");
                h(r10);
                return;
            }
            k(r10);
        }
    }

    public final R g() {
        R r10;
        synchronized (this.f27202a) {
            p.m(!this.f27211j, "Result has already been consumed.");
            p.m(e(), "Result is not ready.");
            r10 = this.f27209h;
            this.f27209h = null;
            this.f27207f = null;
            this.f27211j = true;
        }
        if (this.f27208g.getAndSet(null) == null) {
            return (R) p.i(r10);
        }
        throw null;
    }

    public final void h(R r10) {
        this.f27209h = r10;
        this.f27210i = r10.d();
        this.f27214m = null;
        this.f27205d.countDown();
        if (this.f27212k) {
            this.f27207f = null;
        } else {
            f<? super R> fVar = this.f27207f;
            if (fVar == null) {
                if (this.f27209h instanceof oh.c) {
                    this.mResultGuardian = new j1(this, null);
                }
            } else {
                this.f27203b.removeMessages(2);
                this.f27203b.a(fVar, g());
            }
        }
        ArrayList<b.a> arrayList = this.f27206e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.f27210i);
        }
        this.f27206e.clear();
    }

    public final void j() {
        boolean z10 = true;
        if (!this.f27215n && !f27200o.get().booleanValue()) {
            z10 = false;
        }
        this.f27215n = z10;
    }

    public BasePendingResult(c cVar) {
        this.f27202a = new Object();
        this.f27205d = new CountDownLatch(1);
        this.f27206e = new ArrayList<>();
        this.f27208g = new AtomicReference<>();
        this.f27215n = false;
        this.f27203b = new a<>(cVar != null ? cVar.b() : Looper.getMainLooper());
        this.f27204c = new WeakReference<>(cVar);
    }
}

package ai;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class z34 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f12857a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<w34<?>> f12858b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityBlockingQueue<w34<?>> f12859c;

    /* renamed from: d  reason: collision with root package name */
    public final PriorityBlockingQueue<w34<?>> f12860d;

    /* renamed from: e  reason: collision with root package name */
    public final i34 f12861e;

    /* renamed from: f  reason: collision with root package name */
    public final q34 f12862f;

    /* renamed from: g  reason: collision with root package name */
    public final r34[] f12863g;

    /* renamed from: h  reason: collision with root package name */
    public k34 f12864h;

    /* renamed from: i  reason: collision with root package name */
    public final List<y34> f12865i;

    /* renamed from: j  reason: collision with root package name */
    public final List<x34> f12866j;

    /* renamed from: k  reason: collision with root package name */
    public final o34 f12867k;

    public z34(i34 i34Var, q34 q34Var, int i10) {
        o34 o34Var = new o34(new Handler(Looper.getMainLooper()));
        this.f12857a = new AtomicInteger();
        this.f12858b = new HashSet();
        this.f12859c = new PriorityBlockingQueue<>();
        this.f12860d = new PriorityBlockingQueue<>();
        this.f12865i = new ArrayList();
        this.f12866j = new ArrayList();
        this.f12861e = i34Var;
        this.f12862f = q34Var;
        this.f12863g = new r34[4];
        this.f12867k = o34Var;
    }

    public final void a() {
        k34 k34Var = this.f12864h;
        if (k34Var != null) {
            k34Var.b();
        }
        r34[] r34VarArr = this.f12863g;
        for (int i10 = 0; i10 < 4; i10++) {
            r34 r34Var = r34VarArr[i10];
            if (r34Var != null) {
                r34Var.a();
            }
        }
        k34 k34Var2 = new k34(this.f12859c, this.f12860d, this.f12861e, this.f12867k, null);
        this.f12864h = k34Var2;
        k34Var2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            r34 r34Var2 = new r34(this.f12860d, this.f12862f, this.f12861e, this.f12867k, null);
            this.f12863g[i11] = r34Var2;
            r34Var2.start();
        }
    }

    public final <T> w34<T> b(w34<T> w34Var) {
        w34Var.m(this);
        synchronized (this.f12858b) {
            this.f12858b.add(w34Var);
        }
        w34Var.n(this.f12857a.incrementAndGet());
        w34Var.h("add-to-queue");
        d(w34Var, 0);
        this.f12859c.add(w34Var);
        return w34Var;
    }

    public final <T> void c(w34<T> w34Var) {
        synchronized (this.f12858b) {
            this.f12858b.remove(w34Var);
        }
        synchronized (this.f12865i) {
            for (y34 y34Var : this.f12865i) {
                y34Var.zza();
            }
        }
        d(w34Var, 5);
    }

    public final void d(w34<?> w34Var, int i10) {
        synchronized (this.f12866j) {
            for (x34 x34Var : this.f12866j) {
                x34Var.zza();
            }
        }
    }
}

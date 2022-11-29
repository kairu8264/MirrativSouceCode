package uo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wn.l;

/* loaded from: classes4.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56005b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a  reason: collision with root package name */
    public final y0<T>[] f56006a;
    public volatile /* synthetic */ int notCompletedCount;

    /* loaded from: classes4.dex */
    public final class a extends j2 {
        public final p<List<? extends T>> A;
        public i1 B;
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super List<? extends T>> pVar) {
            this.A = pVar;
        }

        @Override // uo.f0
        public void Q(Throwable th2) {
            if (th2 != null) {
                Object q10 = this.A.q(th2);
                if (q10 != null) {
                    this.A.T(q10);
                    e<T>.b V = V();
                    if (V == null) {
                        return;
                    }
                    V.b();
                    return;
                }
                return;
            }
            if (e.f56005b.decrementAndGet(e.this) == 0) {
                p<List<? extends T>> pVar = this.A;
                l.a aVar = wn.l.f59224w;
                y0[] y0VarArr = e.this.f56006a;
                ArrayList arrayList = new ArrayList(y0VarArr.length);
                int i10 = 0;
                int length = y0VarArr.length;
                while (i10 < length) {
                    y0 y0Var = y0VarArr[i10];
                    i10++;
                    arrayList.add(y0Var.e());
                }
                pVar.resumeWith(wn.l.a(arrayList));
            }
        }

        public final e<T>.b V() {
            return (b) this._disposer;
        }

        public final i1 W() {
            i1 i1Var = this.B;
            if (i1Var != null) {
                return i1Var;
            }
            jo.p.v("handle");
            return null;
        }

        public final void X(e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void Y(i1 i1Var) {
            this.B = i1Var;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            Q(th2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes4.dex */
    public final class b extends n {

        /* renamed from: w  reason: collision with root package name */
        public final e<T>.a[] f56007w;

        public b(e<T>.a[] aVarArr) {
            this.f56007w = aVarArr;
        }

        @Override // uo.o
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            e<T>.a[] aVarArr = this.f56007w;
            int length = aVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                e<T>.a aVar = aVarArr[i10];
                i10++;
                aVar.W().dispose();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f56007w + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(y0<? extends T>[] y0VarArr) {
        this.f56006a = y0VarArr;
        this.notCompletedCount = y0VarArr.length;
    }

    public final Object b(ao.d<? super List<? extends T>> dVar) {
        q qVar = new q(bo.b.b(dVar), 1);
        qVar.y();
        int length = this.f56006a.length;
        a[] aVarArr = new a[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            y0 y0Var = this.f56006a[i11];
            y0Var.start();
            a aVar = new a(qVar);
            aVar.Y(y0Var.p(aVar));
            wn.v vVar = wn.v.f59242a;
            aVarArr[i11] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        while (i10 < length) {
            a aVar2 = aVarArr[i10];
            i10++;
            aVar2.X(bVar);
        }
        if (qVar.w()) {
            bVar.b();
        } else {
            qVar.M(bVar);
        }
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }
}

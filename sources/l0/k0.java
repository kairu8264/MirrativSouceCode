package l0;

import java.util.ArrayList;
import java.util.List;
import wn.l;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f39193a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public List<ao.d<wn.v>> f39194b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<ao.d<wn.v>> f39195c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f39196d = true;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ uo.p<wn.v> f39198x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(uo.p<? super wn.v> pVar) {
            super(1);
            this.f39198x = pVar;
        }

        public final void a(Throwable th2) {
            Object obj = k0.this.f39193a;
            k0 k0Var = k0.this;
            uo.p<wn.v> pVar = this.f39198x;
            synchronized (obj) {
                k0Var.f39194b.remove(pVar);
                wn.v vVar = wn.v.f59242a;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    public final Object c(ao.d<? super wn.v> dVar) {
        if (e()) {
            return wn.v.f59242a;
        }
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        synchronized (this.f39193a) {
            this.f39194b.add(qVar);
        }
        qVar.M(new a(qVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : wn.v.f59242a;
    }

    public final void d() {
        synchronized (this.f39193a) {
            this.f39196d = false;
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f39193a) {
            z10 = this.f39196d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f39193a) {
            if (e()) {
                return;
            }
            List<ao.d<wn.v>> list = this.f39194b;
            this.f39194b = this.f39195c;
            this.f39195c = list;
            this.f39196d = true;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                l.a aVar = wn.l.f59224w;
                list.get(i10).resumeWith(wn.l.a(wn.v.f59242a));
            }
            list.clear();
            wn.v vVar = wn.v.f59242a;
        }
    }
}

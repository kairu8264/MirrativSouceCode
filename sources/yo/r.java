package yo;

import ao.g;
import uo.g2;

/* loaded from: classes4.dex */
public final class r<T> extends co.d implements xo.d<T> {
    public ao.d<? super wn.v> A;

    /* renamed from: w  reason: collision with root package name */
    public final xo.d<T> f62132w;

    /* renamed from: x  reason: collision with root package name */
    public final ao.g f62133x;

    /* renamed from: y  reason: collision with root package name */
    public final int f62134y;

    /* renamed from: z  reason: collision with root package name */
    public ao.g f62135z;

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.p<Integer, g.b, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62136w = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(xo.d<? super T> dVar, ao.g gVar) {
        super(o.f62126w, ao.h.f16651w);
        this.f62132w = dVar;
        this.f62133x = gVar;
        this.f62134y = ((Number) gVar.fold(0, a.f62136w)).intValue();
    }

    public final void a(ao.g gVar, ao.g gVar2, T t10) {
        if (gVar2 instanceof j) {
            i((j) gVar2, t10);
        }
        t.a(this, gVar);
    }

    @Override // xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        try {
            Object g10 = g(dVar, t10);
            if (g10 == bo.c.c()) {
                co.h.c(dVar);
            }
            return g10 == bo.c.c() ? g10 : wn.v.f59242a;
        } catch (Throwable th2) {
            this.f62135z = new j(th2, dVar.getContext());
            throw th2;
        }
    }

    public final Object g(ao.d<? super wn.v> dVar, T t10) {
        io.q qVar;
        ao.g context = dVar.getContext();
        g2.j(context);
        ao.g gVar = this.f62135z;
        if (gVar != context) {
            a(context, gVar, t10);
            this.f62135z = context;
        }
        this.A = dVar;
        qVar = s.f62137a;
        Object s02 = qVar.s0(this.f62132w, t10, this);
        if (!jo.p.c(s02, bo.c.c())) {
            this.A = null;
        }
        return s02;
    }

    @Override // co.a, co.e
    public co.e getCallerFrame() {
        ao.d<? super wn.v> dVar = this.A;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // co.d, ao.d
    public ao.g getContext() {
        ao.g gVar = this.f62135z;
        return gVar == null ? ao.h.f16651w : gVar;
    }

    @Override // co.a, co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void i(j jVar, Object obj) {
        throw new IllegalStateException(so.g.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + jVar.f62124w + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // co.a
    public Object invokeSuspend(Object obj) {
        Throwable b10 = wn.l.b(obj);
        if (b10 != null) {
            this.f62135z = new j(b10, getContext());
        }
        ao.d<? super wn.v> dVar = this.A;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return bo.c.c();
    }

    @Override // co.d, co.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

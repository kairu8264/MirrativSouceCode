package z;

/* loaded from: classes.dex */
public interface c0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final a f62177w = new a();

        public a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void a(c0 c0Var, Object obj, Object obj2, io.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        c0Var.f(obj, obj2, qVar);
    }

    static /* synthetic */ void d(c0 c0Var, Object obj, Object obj2, io.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        c0Var.b(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void e(c0 c0Var, int i10, io.l lVar, io.l lVar2, io.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = a.f62177w;
        }
        c0Var.c(i10, lVar, lVar2, rVar);
    }

    default void b(Object obj, Object obj2, io.q<? super h, ? super l0.i, ? super Integer, wn.v> qVar) {
        jo.p.h(qVar, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    default void c(int i10, io.l<? super Integer, ? extends Object> lVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super h, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar) {
        jo.p.h(lVar2, "contentType");
        jo.p.h(rVar, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    void f(Object obj, Object obj2, io.q<? super h, ? super l0.i, ? super Integer, wn.v> qVar);
}

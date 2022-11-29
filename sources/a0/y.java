package a0;

/* loaded from: classes.dex */
public interface y {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l {

        /* renamed from: w  reason: collision with root package name */
        public static final a f268w = new a();

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

    static /* synthetic */ void b(y yVar, int i10, io.l lVar, io.p pVar, io.l lVar2, io.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        io.l lVar3 = (i11 & 2) != 0 ? null : lVar;
        io.p pVar2 = (i11 & 4) != 0 ? null : pVar;
        a aVar = lVar2;
        if ((i11 & 8) != 0) {
            aVar = a.f268w;
        }
        yVar.a(i10, lVar3, pVar2, aVar, rVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(y yVar, Object obj, io.l lVar, Object obj2, io.q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        yVar.d(obj, lVar, obj2, qVar);
    }

    void a(int i10, io.l<? super Integer, ? extends Object> lVar, io.p<? super q, ? super Integer, c> pVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super o, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar);

    void d(Object obj, io.l<? super q, c> lVar, Object obj2, io.q<? super o, ? super l0.i, ? super Integer, wn.v> qVar);
}

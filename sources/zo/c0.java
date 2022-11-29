package zo;

import kotlinx.coroutines.internal.UndeliveredElementException;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes4.dex */
public final class c0 {

    /* loaded from: classes4.dex */
    public static final class a extends jo.q implements io.l<Throwable, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<E, wn.v> f63280w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ E f63281x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ao.g f63282y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(io.l<? super E, wn.v> lVar, E e10, ao.g gVar) {
            super(1);
            this.f63280w = lVar;
            this.f63281x = e10;
            this.f63282y = gVar;
        }

        public final void a(Throwable th2) {
            c0.b(this.f63280w, this.f63281x, this.f63282y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
            a(th2);
            return wn.v.f59242a;
        }
    }

    public static final <E> io.l<Throwable, wn.v> a(io.l<? super E, wn.v> lVar, E e10, ao.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(io.l<? super E, wn.v> lVar, E e10, ao.g gVar) {
        UndeliveredElementException c10 = c(lVar, e10, null);
        if (c10 == null) {
            return;
        }
        uo.n0.a(gVar, c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(io.l<? super E, wn.v> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                wn.a.a(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException(jo.p.o("Exception in undelivered element handler for ", e10), th2);
            }
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(io.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}

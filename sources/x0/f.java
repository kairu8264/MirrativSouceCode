package x0;

import io.l;
import jo.p;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: u  reason: collision with root package name */
    public static final a f59359u = a.f59360w;

    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ a f59360w = new a();

        @Override // x0.f
        public f L(f fVar) {
            p.h(fVar, "other");
            return fVar;
        }

        @Override // x0.f
        public boolean e(l<? super b, Boolean> lVar) {
            p.h(lVar, "predicate");
            return true;
        }

        @Override // x0.f
        public <R> R k(R r10, io.p<? super R, ? super b, ? extends R> pVar) {
            p.h(pVar, "operation");
            return r10;
        }

        @Override // x0.f
        public <R> R o(R r10, io.p<? super b, ? super R, ? extends R> pVar) {
            p.h(pVar, "operation");
            return r10;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* loaded from: classes.dex */
    public interface b extends f {
        @Override // x0.f
        default boolean e(l<? super b, Boolean> lVar) {
            p.h(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }

        @Override // x0.f
        default <R> R k(R r10, io.p<? super R, ? super b, ? extends R> pVar) {
            p.h(pVar, "operation");
            return pVar.invoke(r10, this);
        }

        @Override // x0.f
        default <R> R o(R r10, io.p<? super b, ? super R, ? extends R> pVar) {
            p.h(pVar, "operation");
            return pVar.invoke(this, r10);
        }
    }

    default f L(f fVar) {
        p.h(fVar, "other");
        return fVar == f59359u ? this : new c(this, fVar);
    }

    boolean e(l<? super b, Boolean> lVar);

    <R> R k(R r10, io.p<? super R, ? super b, ? extends R> pVar);

    <R> R o(R r10, io.p<? super b, ? super R, ? extends R> pVar);
}

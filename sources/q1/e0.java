package q1;

import java.util.Map;
import q1.q0;

/* loaded from: classes.dex */
public interface e0 extends m {

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f48563a;

        /* renamed from: b  reason: collision with root package name */
        public final int f48564b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<q1.a, Integer> f48565c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f48566d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e0 f48567e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ io.l<q0.a, wn.v> f48568f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, int i11, Map<q1.a, Integer> map, e0 e0Var, io.l<? super q0.a, wn.v> lVar) {
            this.f48566d = i10;
            this.f48567e = e0Var;
            this.f48568f = lVar;
            this.f48563a = i10;
            this.f48564b = i11;
            this.f48565c = map;
        }

        @Override // q1.d0
        public void c() {
            int h10;
            m2.q g10;
            q0.a.C0733a c0733a = q0.a.f48598a;
            int i10 = this.f48566d;
            m2.q layoutDirection = this.f48567e.getLayoutDirection();
            io.l<q0.a, wn.v> lVar = this.f48568f;
            h10 = c0733a.h();
            g10 = c0733a.g();
            q0.a.f48600c = i10;
            q0.a.f48599b = layoutDirection;
            lVar.invoke(c0733a);
            q0.a.f48600c = h10;
            q0.a.f48599b = g10;
        }

        @Override // q1.d0
        public Map<q1.a, Integer> e() {
            return this.f48565c;
        }

        @Override // q1.d0
        public int getHeight() {
            return this.f48564b;
        }

        @Override // q1.d0
        public int getWidth() {
            return this.f48563a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ d0 O0(e0 e0Var, int i10, int i11, Map map, io.l lVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                map = xn.n0.e();
            }
            return e0Var.W(i10, i11, map, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    default d0 W(int i10, int i11, Map<q1.a, Integer> map, io.l<? super q0.a, wn.v> lVar) {
        jo.p.h(map, "alignmentLines");
        jo.p.h(lVar, "placementBlock");
        return new b(i10, i11, map, this, lVar);
    }
}

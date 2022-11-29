package u;

import l0.c2;
import u.j0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ T f54045w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j0.a<T, V> f54046x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ T f54047y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ i0<T> f54048z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t10, j0.a<T, V> aVar, T t11, i0<T> i0Var) {
            super(0);
            this.f54045w = t10;
            this.f54046x = aVar;
            this.f54047y = t11;
            this.f54048z = i0Var;
        }

        public final void a() {
            if (jo.p.c(this.f54045w, this.f54046x.d()) && jo.p.c(this.f54047y, this.f54046x.j())) {
                return;
            }
            this.f54046x.r(this.f54045w, this.f54047y, this.f54048z);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<l0.a0, l0.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j0 f54049w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j0.a<T, V> f54050x;

        /* loaded from: classes.dex */
        public static final class a implements l0.z {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j0 f54051a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ j0.a f54052b;

            public a(j0 j0Var, j0.a aVar) {
                this.f54051a = j0Var;
                this.f54052b = aVar;
            }

            @Override // l0.z
            public void dispose() {
                this.f54051a.g(this.f54052b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, j0.a<T, V> aVar) {
            super(1);
            this.f54049w = j0Var;
            this.f54050x = aVar;
        }

        public final l0.z a(l0.a0 a0Var) {
            jo.p.h(a0Var, "$this$DisposableEffect");
            this.f54049w.c(this.f54050x);
            return new a(this.f54049w, this.f54050x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ l0.z invoke(l0.a0 a0Var) {
            return a(a0Var);
        }
    }

    public static final c2<Float> a(j0 j0Var, float f10, float f11, i0<Float> i0Var, l0.i iVar, int i10) {
        jo.p.h(j0Var, "<this>");
        jo.p.h(i0Var, "animationSpec");
        iVar.x(1399864148);
        c2<Float> b10 = b(j0Var, Float.valueOf(f10), Float.valueOf(f11), e1.e(jo.i.f38148a), i0Var, iVar, (i10 & 112) | 8 | (i10 & 896) | ((i10 << 3) & 57344));
        iVar.O();
        return b10;
    }

    public static final <T, V extends p> c2<T> b(j0 j0Var, T t10, T t11, c1<T, V> c1Var, i0<T> i0Var, l0.i iVar, int i10) {
        jo.p.h(j0Var, "<this>");
        jo.p.h(c1Var, "typeConverter");
        jo.p.h(i0Var, "animationSpec");
        iVar.x(1847699412);
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = new j0.a(j0Var, t10, t11, c1Var, i0Var);
            iVar.q(y10);
        }
        iVar.O();
        j0.a aVar = (j0.a) y10;
        l0.c0.g(new a(t10, aVar, t11, i0Var), iVar, 0);
        l0.c0.a(aVar, new b(j0Var, aVar), iVar, 6);
        iVar.O();
        return aVar;
    }

    public static final j0 c(l0.i iVar, int i10) {
        iVar.x(353815743);
        iVar.x(-3687241);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = new j0();
            iVar.q(y10);
        }
        iVar.O();
        j0 j0Var = (j0) y10;
        j0Var.h(iVar, 8);
        iVar.O();
        return j0Var;
    }
}

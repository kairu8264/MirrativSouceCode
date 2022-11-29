package f0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ e2.t B;
        public final /* synthetic */ y0 C;
        public final /* synthetic */ io.l<e2.a0, wn.v> D;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ r0 f31520w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g0.v f31521x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e2.a0 f31522y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f31523z;

        /* renamed from: f0.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0333a extends jo.m implements io.l<l1.b, Boolean> {
            public C0333a(Object obj) {
                super(1, obj, j0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean i(KeyEvent keyEvent) {
                jo.p.h(keyEvent, "p0");
                return Boolean.valueOf(((j0) this.f38131x).j(keyEvent));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ Boolean invoke(l1.b bVar) {
                return i(bVar.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r0 r0Var, g0.v vVar, e2.a0 a0Var, boolean z10, boolean z11, e2.t tVar, y0 y0Var, io.l<? super e2.a0, wn.v> lVar) {
            super(3);
            this.f31520w = r0Var;
            this.f31521x = vVar;
            this.f31522y = a0Var;
            this.f31523z = z10;
            this.A = z11;
            this.B = tVar;
            this.C = y0Var;
            this.D = lVar;
        }

        public final x0.f a(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(58482146);
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = new g0.y();
                iVar.q(y10);
            }
            iVar.O();
            x0.f b10 = l1.f.b(x0.f.f59359u, new C0333a(new j0(this.f31520w, this.f31521x, this.f31522y, this.f31523z, this.A, (g0.y) y10, this.B, this.C, null, this.D, 256, null)));
            iVar.O();
            return b10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final x0.f a(x0.f fVar, r0 r0Var, g0.v vVar, e2.a0 a0Var, io.l<? super e2.a0, wn.v> lVar, boolean z10, boolean z11, e2.t tVar, y0 y0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(r0Var, "state");
        jo.p.h(vVar, "manager");
        jo.p.h(a0Var, "value");
        jo.p.h(lVar, "onValueChange");
        jo.p.h(tVar, "offsetMapping");
        jo.p.h(y0Var, "undoManager");
        return x0.e.d(fVar, null, new a(r0Var, vVar, a0Var, z10, z11, tVar, y0Var, lVar), 1, null);
    }
}

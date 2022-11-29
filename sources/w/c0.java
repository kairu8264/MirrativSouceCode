package w;

import l0.c2;
import l0.u1;

/* loaded from: classes.dex */
public final class c0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<Float, Float> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<io.l<Float, Float>> f57590w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c2<? extends io.l<? super Float, Float>> c2Var) {
            super(1);
            this.f57590w = c2Var;
        }

        public final Float invoke(float f10) {
            return this.f57590w.getValue().invoke(Float.valueOf(f10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }
    }

    public static final b0 a(io.l<? super Float, Float> lVar) {
        jo.p.h(lVar, "consumeScrollDelta");
        return new f(lVar);
    }

    public static final b0 b(io.l<? super Float, Float> lVar, l0.i iVar, int i10) {
        jo.p.h(lVar, "consumeScrollDelta");
        iVar.x(-180460798);
        c2 l10 = u1.l(lVar, iVar, i10 & 14);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = a(new a(l10));
            iVar.q(y10);
        }
        iVar.O();
        b0 b0Var = (b0) y10;
        iVar.O();
        return b0Var;
    }
}

package w6;

import io.p;
import l0.c0;
import l0.s0;
import l0.z1;
import uo.q0;
import w6.b;
import wn.v;

/* loaded from: classes.dex */
public final class a {

    @co.f(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {59, 64}, m = "invokeSuspend")
    /* renamed from: w6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0952a extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ s6.d A;
        public final /* synthetic */ int B;
        public final /* synthetic */ float C;
        public final /* synthetic */ h D;
        public final /* synthetic */ g E;
        public final /* synthetic */ s0<Boolean> F;

        /* renamed from: w  reason: collision with root package name */
        public int f58131w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f58132x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f58133y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b f58134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0952a(boolean z10, boolean z11, b bVar, s6.d dVar, int i10, float f10, h hVar, g gVar, s0<Boolean> s0Var, ao.d<? super C0952a> dVar2) {
            super(2, dVar2);
            this.f58132x = z10;
            this.f58133y = z11;
            this.f58134z = bVar;
            this.A = dVar;
            this.B = i10;
            this.C = f10;
            this.D = hVar;
            this.E = gVar;
            this.F = s0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0952a(this.f58132x, this.f58133y, this.f58134z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0952a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58131w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (this.f58132x && !a.d(this.F) && this.f58133y) {
                    b bVar = this.f58134z;
                    this.f58131w = 1;
                    if (d.e(bVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return v.f59242a;
            } else {
                wn.m.b(obj);
            }
            a.e(this.F, this.f58132x);
            if (this.f58132x) {
                b bVar2 = this.f58134z;
                s6.d dVar = this.A;
                int i11 = this.B;
                float f10 = this.C;
                h hVar = this.D;
                float g10 = bVar2.g();
                g gVar = this.E;
                this.f58131w = 2;
                if (b.a.a(bVar2, dVar, 0, i11, f10, hVar, g10, false, gVar, this, 2, null) == c10) {
                    return c10;
                }
                return v.f59242a;
            }
            return v.f59242a;
        }
    }

    public static final f c(s6.d dVar, boolean z10, boolean z11, h hVar, float f10, int i10, g gVar, l0.i iVar, int i11, int i12) {
        iVar.x(-180608448);
        boolean z12 = (i12 & 2) != 0 ? true : z10;
        boolean z13 = (i12 & 4) != 0 ? true : z11;
        h hVar2 = (i12 & 8) != 0 ? null : hVar;
        float f11 = (i12 & 16) != 0 ? 1.0f : f10;
        int i13 = (i12 & 32) != 0 ? 1 : i10;
        g gVar2 = (i12 & 64) != 0 ? g.Immediately : gVar;
        if (i13 > 0) {
            if ((Float.isInfinite(f11) || Float.isNaN(f11)) ? false : true) {
                b d10 = d.d(iVar, 0);
                iVar.x(-3687241);
                Object y10 = iVar.y();
                if (y10 == l0.i.f39065a.a()) {
                    y10 = z1.e(Boolean.valueOf(z12), null, 2, null);
                    iVar.q(y10);
                }
                iVar.O();
                c0.f(new Object[]{dVar, Boolean.valueOf(z12), hVar2, Float.valueOf(f11), Integer.valueOf(i13)}, new C0952a(z12, z13, d10, dVar, i13, f11, hVar2, gVar2, (s0) y10, null), iVar, 8);
                iVar.O();
                return d10;
            }
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + '.').toString());
        }
        throw new IllegalArgumentException(("Iterations must be a positive number (" + i13 + ").").toString());
    }

    public static final boolean d(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void e(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }
}

package g0;

import android.annotation.SuppressLint;
import androidx.compose.ui.platform.o0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<x0.f, l0.i, Integer, x0.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v f32318w;

        /* renamed from: g0.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0370a extends jo.q implements io.a<b1.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v f32319w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s0<m2.o> f32320x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0370a(v vVar, s0<m2.o> s0Var) {
                super(0);
                this.f32319w = vVar;
                this.f32320x = s0Var;
            }

            public final long a() {
                return w.b(this.f32319w, a.d(this.f32320x));
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ b1.f invoke() {
                return b1.f.d(a());
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.l<io.a<? extends b1.f>, x0.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ m2.d f32321w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s0<m2.o> f32322x;

            /* renamed from: g0.x$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0371a extends jo.q implements io.l<m2.d, b1.f> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<b1.f> f32323w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0371a(io.a<b1.f> aVar) {
                    super(1);
                    this.f32323w = aVar;
                }

                public final long a(m2.d dVar) {
                    jo.p.h(dVar, "$this$magnifier");
                    return this.f32323w.invoke().u();
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ b1.f invoke(m2.d dVar) {
                    return b1.f.d(a(dVar));
                }
            }

            /* renamed from: g0.x$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0372b extends jo.q implements io.l<m2.j, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ m2.d f32324w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ s0<m2.o> f32325x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0372b(m2.d dVar, s0<m2.o> s0Var) {
                    super(1);
                    this.f32324w = dVar;
                    this.f32325x = s0Var;
                }

                public final void a(long j10) {
                    s0<m2.o> s0Var = this.f32325x;
                    m2.d dVar = this.f32324w;
                    a.e(s0Var, m2.p.a(dVar.X(m2.j.h(j10)), dVar.X(m2.j.g(j10))));
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(m2.j jVar) {
                    a(jVar.k());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m2.d dVar, s0<m2.o> s0Var) {
                super(1);
                this.f32321w = dVar;
                this.f32322x = s0Var;
            }

            @Override // io.l
            /* renamed from: a */
            public final x0.f invoke(io.a<b1.f> aVar) {
                jo.p.h(aVar, TtmlNode.CENTER);
                return v.b0.f(x0.f.f59359u, new C0371a(aVar), null, 0.0f, v.c0.f56165g.b(), new C0372b(this.f32321w, this.f32322x), 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar) {
            super(3);
            this.f32318w = vVar;
        }

        public static final long d(s0<m2.o> s0Var) {
            return s0Var.getValue().j();
        }

        public static final void e(s0<m2.o> s0Var, long j10) {
            s0Var.setValue(m2.o.b(j10));
        }

        public final x0.f c(x0.f fVar, l0.i iVar, int i10) {
            jo.p.h(fVar, "$this$composed");
            iVar.x(1980580247);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            iVar.x(-492369756);
            Object y10 = iVar.y();
            if (y10 == l0.i.f39065a.a()) {
                y10 = z1.e(m2.o.b(m2.o.f40537b.a()), null, 2, null);
                iVar.q(y10);
            }
            iVar.O();
            s0 s0Var = (s0) y10;
            x0.f e10 = o.e(fVar, new C0370a(this.f32318w, s0Var), new b(dVar, s0Var));
            iVar.O();
            return e10;
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ x0.f s0(x0.f fVar, l0.i iVar, Integer num) {
            return c(fVar, iVar, num.intValue());
        }
    }

    public static final boolean a(n1.m mVar) {
        jo.p.h(mVar, "<this>");
        return false;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    public static final x0.f b(x0.f fVar, v vVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(vVar, "manager");
        return !v.c0.f56165g.b().i() ? fVar : x0.e.d(fVar, null, new a(vVar), 1, null);
    }
}

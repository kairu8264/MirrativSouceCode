package k9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import c1.g1;
import c1.u;
import h0.w1;
import io.p;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.n1;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x0.a;
import x0.f;
import y.a1;
import y.d1;
import y.f;
import y.r0;
import y.y0;
import y.z0;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f38491w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u f38492x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u f38493y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.q<z0, i, Integer, v> f38494z;

        /* renamed from: k9.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0540a extends q implements p<i, Integer, v> {
            public final /* synthetic */ int A;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f38495w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ u f38496x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ u f38497y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ io.q<z0, i, Integer, v> f38498z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0540a(boolean z10, u uVar, u uVar2, io.q<? super z0, ? super i, ? super Integer, v> qVar, int i10) {
                super(2);
                this.f38495w = z10;
                this.f38496x = uVar;
                this.f38497y = uVar2;
                this.f38498z = qVar;
                this.A = i10;
            }

            public final void a(i iVar, int i10) {
                if ((i10 & 11) == 2 && iVar.j()) {
                    iVar.I();
                    return;
                }
                f b10 = v.e.b(f.f59359u, this.f38495w ? this.f38496x : this.f38497y, null, 0.0f, 6, null);
                h0.d dVar = h0.d.f33749a;
                f h10 = r0.h(d1.g(b10, dVar.e(), dVar.d()), dVar.c());
                f.e b11 = y.f.f60773a.b();
                a.c i11 = x0.a.f59327a.i();
                io.q<z0, i, Integer, v> qVar = this.f38498z;
                int i12 = ((this.A << 3) & 7168) | 432;
                iVar.x(693286680);
                int i13 = i12 >> 3;
                c0 a10 = y0.a(b11, i11, iVar, (i13 & 112) | (i13 & 14));
                iVar.x(-1323940314);
                m2.d dVar2 = (m2.d) iVar.G(o0.e());
                m2.q qVar2 = (m2.q) iVar.G(o0.j());
                g2 g2Var = (g2) iVar.G(o0.n());
                a.C0787a c0787a = s1.a.f51802o;
                io.a<s1.a> a11 = c0787a.a();
                io.q<n1<s1.a>, i, Integer, v> a12 = w.a(h10);
                int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
                if (!(iVar.k() instanceof l0.e)) {
                    h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.r(a11);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a13 = h2.a(iVar);
                h2.b(a13, a10, c0787a.d());
                h2.b(a13, dVar2, c0787a.b());
                h2.b(a13, qVar2, c0787a.c());
                h2.b(a13, g2Var, c0787a.f());
                iVar.c();
                a12.s0(n1.a(n1.b(iVar)), iVar, Integer.valueOf((i14 >> 3) & 112));
                iVar.x(2058660585);
                iVar.x(-678309503);
                if (((i14 >> 9) & 14 & 11) == 2 && iVar.j()) {
                    iVar.I();
                } else {
                    qVar.s0(a1.f60672a, iVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
                }
                iVar.O();
                iVar.O();
                iVar.s();
                iVar.O();
                iVar.O();
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
                a(iVar, num.intValue());
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, u uVar, u uVar2, io.q<? super z0, ? super i, ? super Integer, v> qVar, int i10) {
            super(2);
            this.f38491w = z10;
            this.f38492x = uVar;
            this.f38493y = uVar2;
            this.f38494z = qVar;
            this.A = i10;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w1.a(o9.b.f44283a.b().b(), s0.c.b(iVar, 1081303218, true, new C0540a(this.f38491w, this.f38492x, this.f38493y, this.f38494z, this.A)), iVar, 54);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<i, Integer, v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ u B;
        public final /* synthetic */ long C;
        public final /* synthetic */ long D;
        public final /* synthetic */ float E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ h0.e G;
        public final /* synthetic */ g1 H;
        public final /* synthetic */ io.q<z0, i, Integer, v> I;
        public final /* synthetic */ int J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f38499w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f38500x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ u f38501y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f38502z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.a<v> aVar, x0.f fVar, u uVar, long j10, long j11, u uVar2, long j12, long j13, float f10, boolean z10, h0.e eVar, g1 g1Var, io.q<? super z0, ? super i, ? super Integer, v> qVar, int i10, int i11, int i12) {
            super(2);
            this.f38499w = aVar;
            this.f38500x = fVar;
            this.f38501y = uVar;
            this.f38502z = j10;
            this.A = j11;
            this.B = uVar2;
            this.C = j12;
            this.D = j13;
            this.E = f10;
            this.F = z10;
            this.G = eVar;
            this.H = g1Var;
            this.I = qVar;
            this.J = i10;
            this.K = i11;
            this.L = i12;
        }

        public final void a(i iVar, int i10) {
            e.a(this.f38499w, this.f38500x, this.f38501y, this.f38502z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, iVar, this.J | 1, this.K, this.L);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(io.a<wn.v> r39, x0.f r40, c1.u r41, long r42, long r44, c1.u r46, long r47, long r49, float r51, boolean r52, h0.e r53, c1.g1 r54, io.q<? super y.z0, ? super l0.i, ? super java.lang.Integer, wn.v> r55, l0.i r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.a(io.a, x0.f, c1.u, long, long, c1.u, long, long, float, boolean, h0.e, c1.g1, io.q, l0.i, int, int, int):void");
    }
}

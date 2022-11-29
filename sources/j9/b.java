package j9;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import e2.i0;
import f0.u;
import h0.u1;
import h0.w1;
import io.p;
import j2.e;
import jo.q;
import l0.h;
import l0.h2;
import l0.i;
import l0.n1;
import m2.d;
import q1.c0;
import q1.w;
import s1.a;
import wn.v;
import x.m;
import x0.f;
import y.j;
import y.l;
import y1.d0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.q<p<? super i, ? super Integer, ? extends v>, i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ e D;
        public final /* synthetic */ d0 E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f37260w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u1 f37261x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f37262y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f37263z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, u1 u1Var, boolean z10, int i10, int i11, String str, String str2, e eVar, d0 d0Var) {
            super(3);
            this.f37260w = fVar;
            this.f37261x = u1Var;
            this.f37262y = z10;
            this.f37263z = i10;
            this.A = i11;
            this.B = str;
            this.C = str2;
            this.D = eVar;
            this.E = d0Var;
        }

        public final void a(p<? super i, ? super Integer, v> pVar, i iVar, int i10) {
            int i11;
            jo.p.h(pVar, "innerTextField");
            if ((i10 & 14) == 0) {
                i11 = i10 | (iVar.P(pVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && iVar.j()) {
                iVar.I();
                return;
            }
            f d10 = v.e.d(this.f37260w, this.f37261x.a(this.f37262y, iVar, ((this.f37263z >> 9) & 14) | ((this.A >> 6) & 112)).getValue().u(), null, 2, null);
            String str = this.B;
            String str2 = this.C;
            u1 u1Var = this.f37261x;
            boolean z10 = this.f37262y;
            int i12 = this.f37263z;
            int i13 = this.A;
            e eVar = this.D;
            d0 d0Var = this.E;
            iVar.x(733328855);
            c0 h10 = j.h(x0.a.f59327a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            d dVar = (d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, i, Integer, v> a11 = w.a(d10);
            if (!(iVar.k() instanceof l0.e)) {
                h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a10);
            } else {
                iVar.o();
            }
            iVar.E();
            i a12 = h2.a(iVar);
            h2.b(a12, h10, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            l lVar = l.f60836a;
            iVar.x(145492628);
            if ((str.length() == 0) && str2 != null) {
                w1.c(str2, null, u1Var.c(z10, iVar, ((i12 >> 9) & 14) | ((i13 >> 6) & 112)).getValue().u(), 0L, null, null, null, 0L, null, eVar, 0L, 0, false, 0, null, d0Var, iVar, ((i12 >> 12) & 14) | ((i12 << 9) & 1879048192), 0, 32250);
            }
            iVar.O();
            pVar.invoke(iVar, Integer.valueOf(i11 & 14));
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(p<? super i, ? super Integer, ? extends v> pVar, i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: j9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0495b extends q implements p<i, Integer, v> {
        public final /* synthetic */ String A;
        public final /* synthetic */ d0 B;
        public final /* synthetic */ e C;
        public final /* synthetic */ f0.v D;
        public final /* synthetic */ u E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ int G;
        public final /* synthetic */ i0 H;
        public final /* synthetic */ m I;
        public final /* synthetic */ u1 J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f37264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, v> f37265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f f37266y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f37267z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0495b(String str, io.l<? super String, v> lVar, f fVar, boolean z10, String str2, d0 d0Var, e eVar, f0.v vVar, u uVar, boolean z11, int i10, i0 i0Var, m mVar, u1 u1Var, int i11, int i12, int i13) {
            super(2);
            this.f37264w = str;
            this.f37265x = lVar;
            this.f37266y = fVar;
            this.f37267z = z10;
            this.A = str2;
            this.B = d0Var;
            this.C = eVar;
            this.D = vVar;
            this.E = uVar;
            this.F = z11;
            this.G = i10;
            this.H = i0Var;
            this.I = mVar;
            this.J = u1Var;
            this.K = i11;
            this.L = i12;
            this.M = i13;
        }

        public final void a(i iVar, int i10) {
            b.a(this.f37264w, this.f37265x, this.f37266y, this.f37267z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, iVar, this.K | 1, this.L, this.M);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
        if (r7.P(r83) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r70, io.l<? super java.lang.String, wn.v> r71, x0.f r72, boolean r73, java.lang.String r74, y1.d0 r75, j2.e r76, f0.v r77, f0.u r78, boolean r79, int r80, e2.i0 r81, x.m r82, h0.u1 r83, l0.i r84, int r85, int r86, int r87) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.b.a(java.lang.String, io.l, x0.f, boolean, java.lang.String, y1.d0, j2.e, f0.v, f0.u, boolean, int, e2.i0, x.m, h0.u1, l0.i, int, int, int):void");
    }
}

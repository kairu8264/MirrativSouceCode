package g1;

import c1.j1;
import c1.k1;
import c1.w0;
import java.util.List;
import l0.h2;
import l0.l1;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<g1.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f32489w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final g1.b invoke() {
            return new g1.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ c1.u B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ float G;
        public final /* synthetic */ float H;
        public final /* synthetic */ float I;
        public final /* synthetic */ float J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<g1.f> f32490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f32491x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f32492y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ c1.u f32493z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(List<? extends g1.f> list, int i10, String str, c1.u uVar, float f10, c1.u uVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, int i14, int i15) {
            super(2);
            this.f32490w = list;
            this.f32491x = i10;
            this.f32492y = str;
            this.f32493z = uVar;
            this.A = f10;
            this.B = uVar2;
            this.C = f11;
            this.D = f12;
            this.E = i11;
            this.F = i12;
            this.G = f13;
            this.H = f14;
            this.I = f15;
            this.J = f16;
            this.K = i13;
            this.L = i14;
            this.M = i15;
        }

        public final void a(l0.i iVar, int i10) {
            m.b(this.f32490w, this.f32491x, this.f32492y, this.f32493z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, iVar, this.K | 1, this.L, this.M);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<g1.b, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f32494w = new b();

        public b() {
            super(2);
        }

        public final void a(g1.b bVar, String str) {
            jo.p.h(bVar, "$this$set");
            jo.p.h(str, "it");
            bVar.l(str);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, String str) {
            a(bVar, str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<g1.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f32495w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar) {
            super(0);
            this.f32495w = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, g1.e] */
        @Override // io.a
        public final g1.e invoke() {
            return this.f32495w.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f32496w = new c();

        public c() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.o(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f32497w = new d();

        public d() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.m(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f32498w = new e();

        public e() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.n(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f32499w = new f();

        public f() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.p(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f32500w = new g();

        public g() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.q(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f32501w = new h();

        public h() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.r(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<g1.b, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final i f32502w = new i();

        public i() {
            super(2);
        }

        public final void a(g1.b bVar, float f10) {
            jo.p.h(bVar, "$this$set");
            bVar.s(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, Float f10) {
            a(bVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.p<g1.b, List<? extends g1.f>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f32503w = new j();

        public j() {
            super(2);
        }

        public final void a(g1.b bVar, List<? extends g1.f> list) {
            jo.p.h(bVar, "$this$set");
            jo.p.h(list, "it");
            bVar.k(list);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.b bVar, List<? extends g1.f> list) {
            a(bVar, list);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ float A;
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ List<g1.f> E;
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f32504w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ float f32505x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f32506y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ float f32507z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends g1.f> list, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10, int i11) {
            super(2);
            this.f32504w = str;
            this.f32505x = f10;
            this.f32506y = f11;
            this.f32507z = f12;
            this.A = f13;
            this.B = f14;
            this.C = f15;
            this.D = f16;
            this.E = list;
            this.F = pVar;
            this.G = i10;
            this.H = i11;
        }

        public final void a(l0.i iVar, int i10) {
            m.a(this.f32504w, this.f32505x, this.f32506y, this.f32507z, this.A, this.B, this.C, this.D, this.E, this.F, iVar, this.G | 1, this.H);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<g1.e> {

        /* renamed from: w  reason: collision with root package name */
        public static final l f32508w = new l();

        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final g1.e invoke() {
            return new g1.e();
        }
    }

    /* renamed from: g1.m$m  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0375m extends jo.q implements io.p<g1.e, j1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0375m f32509w = new C0375m();

        public C0375m() {
            super(2);
        }

        public final void a(g1.e eVar, int i10) {
            jo.p.h(eVar, "$this$set");
            eVar.m(i10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, j1 j1Var) {
            a(eVar, j1Var.j());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final n f32510w = new n();

        public n() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.o(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final o f32511w = new o();

        public o() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.s(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final p f32512w = new p();

        public p() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.q(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final q f32513w = new q();

        public q() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.r(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.p<g1.e, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final r f32514w = new r();

        public r() {
            super(2);
        }

        public final void a(g1.e eVar, String str) {
            jo.p.h(eVar, "$this$set");
            jo.p.h(str, "it");
            eVar.h(str);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, String str) {
            a(eVar, str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.p<g1.e, List<? extends g1.f>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final s f32515w = new s();

        public s() {
            super(2);
        }

        public final void a(g1.e eVar, List<? extends g1.f> list) {
            jo.p.h(eVar, "$this$set");
            jo.p.h(list, "it");
            eVar.i(list);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, List<? extends g1.f> list) {
            a(eVar, list);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.p<g1.e, w0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final t f32516w = new t();

        public t() {
            super(2);
        }

        public final void a(g1.e eVar, int i10) {
            jo.p.h(eVar, "$this$set");
            eVar.j(i10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, w0 w0Var) {
            a(eVar, w0Var.i());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.p<g1.e, c1.u, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final u f32517w = new u();

        public u() {
            super(2);
        }

        public final void a(g1.e eVar, c1.u uVar) {
            jo.p.h(eVar, "$this$set");
            eVar.f(uVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, c1.u uVar) {
            a(eVar, uVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final v f32518w = new v();

        public v() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.g(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.p<g1.e, c1.u, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final w f32519w = new w();

        public w() {
            super(2);
        }

        public final void a(g1.e eVar, c1.u uVar) {
            jo.p.h(eVar, "$this$set");
            eVar.k(uVar);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, c1.u uVar) {
            a(eVar, uVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final x f32520w = new x();

        public x() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.l(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.p<g1.e, Float, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final y f32521w = new y();

        public y() {
            super(2);
        }

        public final void a(g1.e eVar, float f10) {
            jo.p.h(eVar, "$this$set");
            eVar.p(f10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.p<g1.e, k1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final z f32522w = new z();

        public z() {
            super(2);
        }

        public final void a(g1.e eVar, int i10) {
            jo.p.h(eVar, "$this$set");
            eVar.n(i10);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(g1.e eVar, k1 k1Var) {
            a(eVar, k1Var.j());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, java.util.List<? extends g1.f> r27, io.p<? super l0.i, ? super java.lang.Integer, wn.v> r28, l0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.m.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, io.p, l0.i, int, int):void");
    }

    public static final void b(List<? extends g1.f> list, int i10, String str, c1.u uVar, float f10, c1.u uVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, l0.i iVar, int i13, int i14, int i15) {
        jo.p.h(list, "pathData");
        l0.i h10 = iVar.h(-1478270750);
        int b10 = (i15 & 2) != 0 ? g1.p.b() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        c1.u uVar3 = (i15 & 8) != 0 ? null : uVar;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        c1.u uVar4 = (i15 & 32) != 0 ? null : uVar2;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        int c10 = (i15 & 256) != 0 ? g1.p.c() : i11;
        int d10 = (i15 & 512) != 0 ? g1.p.d() : i12;
        float f20 = (i15 & 1024) != 0 ? 4.0f : f13;
        float f21 = (i15 & 2048) != 0 ? 0.0f : f14;
        float f22 = (i15 & 4096) != 0 ? 1.0f : f15;
        float f23 = (i15 & 8192) != 0 ? 0.0f : f16;
        l lVar = l.f32508w;
        h10.x(1886828752);
        if (!(h10.k() instanceof g1.k)) {
            l0.h.c();
        }
        h10.m();
        if (h10.f()) {
            h10.r(new b0(lVar));
        } else {
            h10.o();
        }
        l0.i a10 = h2.a(h10);
        h2.b(a10, str2, r.f32514w);
        h2.b(a10, list, s.f32515w);
        h2.b(a10, w0.c(b10), t.f32516w);
        h2.b(a10, uVar3, u.f32517w);
        h2.b(a10, Float.valueOf(f17), v.f32518w);
        h2.b(a10, uVar4, w.f32519w);
        h2.b(a10, Float.valueOf(f18), x.f32520w);
        h2.b(a10, Float.valueOf(f19), y.f32521w);
        h2.b(a10, k1.d(d10), z.f32522w);
        h2.b(a10, j1.d(c10), C0375m.f32509w);
        h2.b(a10, Float.valueOf(f20), n.f32510w);
        h2.b(a10, Float.valueOf(f21), o.f32511w);
        h2.b(a10, Float.valueOf(f22), p.f32512w);
        h2.b(a10, Float.valueOf(f23), q.f32513w);
        h10.s();
        h10.O();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a0(list, b10, str2, uVar3, f17, uVar4, f18, f19, c10, d10, f20, f21, f22, f23, i13, i14, i15));
    }
}

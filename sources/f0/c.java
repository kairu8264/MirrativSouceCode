package f0;

import java.util.List;
import java.util.Map;
import y1.a;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<y1.z, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31319w = new a();

        public a() {
            super(1);
        }

        public final void a(y1.z zVar) {
            jo.p.h(zVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y1.z zVar) {
            a(zVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f31320w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f31321x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31322y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<y1.z, wn.v> f31323z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, x0.f fVar, y1.d0 d0Var, io.l<? super y1.z, wn.v> lVar, int i10, boolean z10, int i11, int i12, int i13) {
            super(2);
            this.f31320w = str;
            this.f31321x = fVar;
            this.f31322y = d0Var;
            this.f31323z = lVar;
            this.A = i10;
            this.B = z10;
            this.C = i11;
            this.D = i12;
            this.E = i13;
        }

        public final void a(l0.i iVar, int i10) {
            c.b(this.f31320w, this.f31321x, this.f31322y, this.f31323z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* renamed from: f0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0323c extends jo.q implements io.l<y1.z, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0323c f31324w = new C0323c();

        public C0323c() {
            super(1);
        }

        public final void a(y1.z zVar) {
            jo.p.h(zVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(y1.z zVar) {
            a(zVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y1.a f31325w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<a.b<io.q<String, l0.i, Integer, wn.v>>> f31326x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f31327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y1.a aVar, List<a.b<io.q<String, l0.i, Integer, wn.v>>> list, int i10) {
            super(2);
            this.f31325w = aVar;
            this.f31326x = list;
            this.f31327y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                f0.i.a(this.f31325w, this.f31326x, iVar, (this.f31327y & 14) | 64);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ int C;
        public final /* synthetic */ Map<String, m> D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y1.a f31328w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f31329x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y1.d0 f31330y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<y1.z, wn.v> f31331z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(y1.a aVar, x0.f fVar, y1.d0 d0Var, io.l<? super y1.z, wn.v> lVar, int i10, boolean z10, int i11, Map<String, m> map, int i12, int i13) {
            super(2);
            this.f31328w = aVar;
            this.f31329x = fVar;
            this.f31330y = d0Var;
            this.f31331z = lVar;
            this.A = i10;
            this.B = z10;
            this.C = i11;
            this.D = map;
            this.E = i12;
            this.F = i13;
        }

        public final void a(l0.i iVar, int i10) {
            c.a(this.f31328w, this.f31329x, this.f31330y, this.f31331z, this.A, this.B, this.C, this.D, iVar, this.E | 1, this.F);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<Long> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.q f31332w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g0.q qVar) {
            super(0);
            this.f31332w = qVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final Long invoke() {
            g0.q qVar = this.f31332w;
            return Long.valueOf(qVar != null ? qVar.c() : 0L);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<Long> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.q f31333w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(g0.q qVar) {
            super(0);
            this.f31333w = qVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final Long invoke() {
            g0.q qVar = this.f31333w;
            return Long.valueOf(qVar != null ? qVar.c() : 0L);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<s1.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f31334w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f31334w = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [s1.a, java.lang.Object] */
        @Override // io.a
        public final s1.a invoke() {
            return this.f31334w.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.p<u0.k, Long, Long> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.q f31335w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(g0.q qVar) {
            super(2);
            this.f31335w = qVar;
        }

        public final Long a(u0.k kVar, long j10) {
            jo.p.h(kVar, "$this$Saver");
            if (g0.r.b(this.f31335w, j10)) {
                return Long.valueOf(j10);
            }
            return null;
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ Long invoke(u0.k kVar, Long l10) {
            return a(kVar, l10.longValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<Long, Long> {

        /* renamed from: w  reason: collision with root package name */
        public static final j f31336w = new j();

        public j() {
            super(1);
        }

        public final Long a(long j10) {
            return Long.valueOf(j10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Long invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(y1.a r34, x0.f r35, y1.d0 r36, io.l<? super y1.z, wn.v> r37, int r38, boolean r39, int r40, java.util.Map<java.lang.String, f0.m> r41, l0.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.a(y1.a, x0.f, y1.d0, io.l, int, boolean, int, java.util.Map, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r28, x0.f r29, y1.d0 r30, io.l<? super y1.z, wn.v> r31, int r32, boolean r33, int r34, l0.i r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.b(java.lang.String, x0.f, y1.d0, io.l, int, boolean, int, l0.i, int, int):void");
    }

    public static final u0.i<Long, Long> c(g0.q qVar) {
        return u0.j.a(new i(qVar), j.f31336w);
    }
}

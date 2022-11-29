package l9;

import d2.x;
import io.l;
import jo.p;
import jo.q;
import l0.i;
import l0.s0;
import wn.v;
import y1.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: l9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0565a extends q implements l<e1.c, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f39681w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0565a(s0<Boolean> s0Var) {
            super(1);
            this.f39681w = s0Var;
        }

        public final void a(e1.c cVar) {
            p.h(cVar, "$this$drawWithContent");
            if (a.e(this.f39681w)) {
                cVar.c1();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(e1.c cVar) {
            a(cVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<z, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f39682w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s0<Integer> f39683x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f39684y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, s0<Integer> s0Var, s0<Boolean> s0Var2) {
            super(1);
            this.f39682w = i10;
            this.f39683x = s0Var;
            this.f39684y = s0Var2;
        }

        public final void a(z zVar) {
            p.h(zVar, "textLayoutResult");
            if (!zVar.h() || a.c(this.f39683x) <= this.f39682w) {
                a.f(this.f39684y, true);
                return;
            }
            s0<Integer> s0Var = this.f39683x;
            a.d(s0Var, a.c(s0Var) - 1);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(z zVar) {
            a(zVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ x B;
        public final /* synthetic */ j2.e C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39685w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39686x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f39687y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.f f39688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, int i11, x0.f fVar, long j10, x xVar, j2.e eVar, int i12, int i13) {
            super(2);
            this.f39685w = str;
            this.f39686x = i10;
            this.f39687y = i11;
            this.f39688z = fVar;
            this.A = j10;
            this.B = xVar;
            this.C = eVar;
            this.D = i12;
            this.E = i13;
        }

        public final void a(i iVar, int i10) {
            a.b(this.f39685w, this.f39686x, this.f39687y, this.f39688z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.p<i, Integer, v> {
        public final /* synthetic */ long A;
        public final /* synthetic */ x B;
        public final /* synthetic */ j2.e C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39689w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f39690x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f39691y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ x0.f f39692z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j10, long j11, x0.f fVar, long j12, x xVar, j2.e eVar, int i10, int i11) {
            super(2);
            this.f39689w = str;
            this.f39690x = j10;
            this.f39691y = j11;
            this.f39692z = fVar;
            this.A = j12;
            this.B = xVar;
            this.C = eVar;
            this.D = i10;
            this.E = i11;
        }

        public final void a(i iVar, int i10) {
            a.a(this.f39689w, this.f39690x, this.f39691y, this.f39692z, this.A, this.B, this.C, iVar, this.D | 1, this.E);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r23, long r24, long r26, x0.f r28, long r29, d2.x r31, j2.e r32, l0.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a.a(java.lang.String, long, long, x0.f, long, d2.x, j2.e, l0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r34, int r35, int r36, x0.f r37, long r38, d2.x r40, j2.e r41, l0.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a.b(java.lang.String, int, int, x0.f, long, d2.x, j2.e, l0.i, int, int):void");
    }

    public static final int c(s0<Integer> s0Var) {
        return s0Var.getValue().intValue();
    }

    public static final void d(s0<Integer> s0Var, int i10) {
        s0Var.setValue(Integer.valueOf(i10));
    }

    public static final boolean e(s0<Boolean> s0Var) {
        return s0Var.getValue().booleanValue();
    }

    public static final void f(s0<Boolean> s0Var, boolean z10) {
        s0Var.setValue(Boolean.valueOf(z10));
    }
}

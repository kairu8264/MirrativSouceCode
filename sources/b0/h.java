package b0;

import l0.c2;
import q1.d0;
import q1.z0;
import wn.v;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<z0, m2.b, d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f16686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<i, m2.b, d0> f16687x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, io.p<? super i, ? super m2.b, ? extends d0> pVar) {
            super(2);
            this.f16686w = eVar;
            this.f16687x = pVar;
        }

        public final d0 a(z0 z0Var, long j10) {
            jo.p.h(z0Var, "$this$null");
            this.f16686w.e(z0Var, j10);
            return this.f16687x.invoke(new j(this.f16686w, z0Var), m2.b.b(j10));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ d0 invoke(z0 z0Var, m2.b bVar) {
            return a(z0Var, bVar.t());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f16688w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x0.f f16689x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k f16690y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.p<i, m2.b, d0> f16691z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(f fVar, x0.f fVar2, k kVar, io.p<? super i, ? super m2.b, ? extends d0> pVar, int i10, int i11) {
            super(2);
            this.f16688w = fVar;
            this.f16689x = fVar2;
            this.f16690y = kVar;
            this.f16691z = pVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f16688w, this.f16689x, this.f16690y, this.f16691z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c2<f> f16692w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c2<? extends f> c2Var) {
            super(0);
            this.f16692w = c2Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final f invoke() {
            return this.f16692w.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.f r13, x0.f r14, b0.k r15, io.p<? super b0.i, ? super m2.b, ? extends q1.d0> r16, l0.i r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h.a(b0.f, x0.f, b0.k, io.p, l0.i, int, int):void");
    }
}

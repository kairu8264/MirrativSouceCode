package l9;

import d2.x;
import h0.o0;
import h0.w1;
import io.p;
import jo.q;
import l0.i;
import m2.s;
import wn.v;
import y.z0;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f39735w = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39736w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39737x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(2);
            this.f39736w = str;
            this.f39737x = i10;
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(this.f39736w, null, 0L, s.d(16), null, x.f29149x.h(), null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, (this.f39737x & 14) | 199680, 0, 65494);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f39738w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39739x;

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f39740w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.a<v> aVar) {
                super(0);
                this.f39740w = aVar;
            }

            public final void a() {
                this.f39740w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a<v> aVar, int i10) {
            super(2);
            this.f39738w = aVar;
            this.f39739x = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [l0.i] */
        /* JADX WARN: Type inference failed for: r1v2 */
        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            io.a<v> aVar = this.f39738w;
            iVar.x(1157296644);
            boolean P = iVar.P(aVar);
            Object y10 = iVar.y();
            if (P || y10 == i.f39065a.a()) {
                y10 = new a(aVar);
                iVar.q(y10);
            }
            iVar.O();
            o0.a(y10, null, false, null, l9.c.f39697a.b(), iVar, 24576, 14);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements p<i, Integer, v> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f39741w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f39742x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f39743y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.q<z0, i, Integer, v> f39744z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, boolean z10, io.a<v> aVar, io.q<? super z0, ? super i, ? super Integer, v> qVar, int i10, int i11) {
            super(2);
            this.f39741w = str;
            this.f39742x = z10;
            this.f39743y = aVar;
            this.f39744z = qVar;
            this.A = i10;
            this.B = i11;
        }

        public final void a(i iVar, int i10) {
            f.a(this.f39741w, this.f39742x, this.f39743y, this.f39744z, iVar, this.A | 1, this.B);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r27, boolean r28, io.a<wn.v> r29, io.q<? super y.z0, ? super l0.i, ? super java.lang.Integer, wn.v> r30, l0.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.f.a(java.lang.String, boolean, io.a, io.q, l0.i, int, int):void");
    }
}

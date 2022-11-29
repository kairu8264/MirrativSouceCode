package a0;

/* loaded from: classes.dex */
public final class z implements y {

    /* renamed from: b  reason: collision with root package name */
    public boolean f270b;

    /* renamed from: a  reason: collision with root package name */
    public final b0.o<h> f269a = new b0.o<>();

    /* renamed from: c  reason: collision with root package name */
    public final io.p<q, Integer, a0.c> f271c = a.f272w;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<q, Integer, a0.c> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f272w = new a();

        public a() {
            super(2);
        }

        public final long a(q qVar, int i10) {
            jo.p.h(qVar, "$this$null");
            return c0.a(1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ a0.c invoke(q qVar, Integer num) {
            return a0.c.a(a(qVar, num.intValue()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<Integer, Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f273w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f273w = obj;
        }

        public final Object a(int i10) {
            return this.f273w;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.p<q, Integer, a0.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<q, a0.c> f274w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super q, a0.c> lVar) {
            super(2);
            this.f274w = lVar;
        }

        public final long a(q qVar, int i10) {
            jo.p.h(qVar, "$this$null");
            return this.f274w.invoke(qVar).g();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ a0.c invoke(q qVar, Integer num) {
            return a0.c.a(a(qVar, num.intValue()));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Integer, Object> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f275w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj) {
            super(1);
            this.f275w = obj;
        }

        public final Object a(int i10) {
            return this.f275w;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.r<o, Integer, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q<o, l0.i, Integer, wn.v> f276w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(io.q<? super o, ? super l0.i, ? super Integer, wn.v> qVar) {
            super(4);
            this.f276w = qVar;
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ wn.v F(o oVar, Integer num, l0.i iVar, Integer num2) {
            a(oVar, num.intValue(), iVar, num2.intValue());
            return wn.v.f59242a;
        }

        public final void a(o oVar, int i10, l0.i iVar, int i11) {
            jo.p.h(oVar, "$this$$receiver");
            if ((i11 & 14) == 0) {
                i11 |= iVar.P(oVar) ? 4 : 2;
            }
            if ((i11 & 651) == 130 && iVar.j()) {
                iVar.I();
            } else {
                this.f276w.s0(oVar, iVar, Integer.valueOf(i11 & 14));
            }
        }
    }

    @Override // a0.y
    public void a(int i10, io.l<? super Integer, ? extends Object> lVar, io.p<? super q, ? super Integer, a0.c> pVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super o, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar) {
        jo.p.h(lVar2, "contentType");
        jo.p.h(rVar, "itemContent");
        this.f269a.c(i10, new h(lVar, pVar == null ? this.f271c : pVar, lVar2, rVar));
        if (pVar != null) {
            this.f270b = true;
        }
    }

    @Override // a0.y
    public void d(Object obj, io.l<? super q, a0.c> lVar, Object obj2, io.q<? super o, ? super l0.i, ? super Integer, wn.v> qVar) {
        jo.p.h(qVar, "content");
        this.f269a.c(1, new h(obj != null ? new b(obj) : null, lVar != null ? new c(lVar) : this.f271c, new d(obj2), s0.c.c(-1504808184, true, new e(qVar))));
        if (lVar != null) {
            this.f270b = true;
        }
    }

    public final boolean e() {
        return this.f270b;
    }

    public final b0.o<h> f() {
        return this.f269a;
    }
}

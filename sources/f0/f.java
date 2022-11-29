package f0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f31382a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> f31383b = s0.c.c(1894572096, false, a.f31384w);

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<io.p<? super l0.i, ? super Integer, ? extends wn.v>, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31384w = new a();

        public a() {
            super(3);
        }

        public final void a(io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
            jo.p.h(pVar, "innerTextField");
            if ((i10 & 14) == 0) {
                i10 |= iVar.P(pVar) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && iVar.j()) {
                iVar.I();
            } else {
                pVar.invoke(iVar, Integer.valueOf(i10 & 14));
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(io.p<? super l0.i, ? super Integer, ? extends wn.v> pVar, l0.i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.q<io.p<? super l0.i, ? super Integer, wn.v>, l0.i, Integer, wn.v> a() {
        return f31383b;
    }
}

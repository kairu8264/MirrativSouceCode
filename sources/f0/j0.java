package f0;

import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f31497a;

    /* renamed from: b  reason: collision with root package name */
    public final g0.v f31498b;

    /* renamed from: c  reason: collision with root package name */
    public final e2.a0 f31499c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31500d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f31501e;

    /* renamed from: f  reason: collision with root package name */
    public final g0.y f31502f;

    /* renamed from: g  reason: collision with root package name */
    public final e2.t f31503g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f31504h;

    /* renamed from: i  reason: collision with root package name */
    public final p f31505i;

    /* renamed from: j  reason: collision with root package name */
    public final io.l<e2.a0, wn.v> f31506j;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<e2.a0, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f31507w = new a();

        public a() {
            super(1);
        }

        public final void a(e2.a0 a0Var) {
            jo.p.h(a0Var, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(e2.a0 a0Var) {
            a(a0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<g0.t, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f31508w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j0 f31509x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.a0 f31510y;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<g0.t, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f31511w = new a();

            public a() {
                super(1);
            }

            public final void a(g0.t tVar) {
                jo.p.h(tVar, "$this$collapseLeftOr");
                tVar.C();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(g0.t tVar) {
                a(tVar);
                return wn.v.f59242a;
            }
        }

        /* renamed from: f0.j0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0332b extends jo.q implements io.l<g0.t, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0332b f31512w = new C0332b();

            public C0332b() {
                super(1);
            }

            public final void a(g0.t tVar) {
                jo.p.h(tVar, "$this$collapseRightOr");
                tVar.K();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(g0.t tVar) {
                a(tVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final c f31513w = new c();

            public c() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                return new e2.b(y1.b0.i(tVar.w()) - tVar.s(), 0);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final d f31514w = new d();

            public d() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                int l10 = tVar.l();
                if (l10 != -1) {
                    return new e2.b(0, l10 - y1.b0.i(tVar.w()));
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final e f31515w = new e();

            public e() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                Integer v10 = tVar.v();
                if (v10 != null) {
                    return new e2.b(y1.b0.i(tVar.w()) - v10.intValue(), 0);
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final f f31516w = new f();

            public f() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                Integer m10 = tVar.m();
                if (m10 != null) {
                    return new e2.b(0, m10.intValue() - y1.b0.i(tVar.w()));
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final g f31517w = new g();

            public g() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                Integer i10 = tVar.i();
                if (i10 != null) {
                    return new e2.b(y1.b0.i(tVar.w()) - i10.intValue(), 0);
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends jo.q implements io.l<g0.t, e2.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final h f31518w = new h();

            public h() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final e2.d invoke(g0.t tVar) {
                jo.p.h(tVar, "$this$deleteIfSelectedOr");
                Integer f10 = tVar.f();
                if (f10 != null) {
                    return new e2.b(0, f10.intValue() - y1.b0.i(tVar.w()));
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class i {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f31519a;

            static {
                int[] iArr = new int[n.values().length];
                iArr[n.COPY.ordinal()] = 1;
                iArr[n.PASTE.ordinal()] = 2;
                iArr[n.CUT.ordinal()] = 3;
                iArr[n.LEFT_CHAR.ordinal()] = 4;
                iArr[n.RIGHT_CHAR.ordinal()] = 5;
                iArr[n.LEFT_WORD.ordinal()] = 6;
                iArr[n.RIGHT_WORD.ordinal()] = 7;
                iArr[n.PREV_PARAGRAPH.ordinal()] = 8;
                iArr[n.NEXT_PARAGRAPH.ordinal()] = 9;
                iArr[n.UP.ordinal()] = 10;
                iArr[n.DOWN.ordinal()] = 11;
                iArr[n.PAGE_UP.ordinal()] = 12;
                iArr[n.PAGE_DOWN.ordinal()] = 13;
                iArr[n.LINE_START.ordinal()] = 14;
                iArr[n.LINE_END.ordinal()] = 15;
                iArr[n.LINE_LEFT.ordinal()] = 16;
                iArr[n.LINE_RIGHT.ordinal()] = 17;
                iArr[n.HOME.ordinal()] = 18;
                iArr[n.END.ordinal()] = 19;
                iArr[n.DELETE_PREV_CHAR.ordinal()] = 20;
                iArr[n.DELETE_NEXT_CHAR.ordinal()] = 21;
                iArr[n.DELETE_PREV_WORD.ordinal()] = 22;
                iArr[n.DELETE_NEXT_WORD.ordinal()] = 23;
                iArr[n.DELETE_FROM_LINE_START.ordinal()] = 24;
                iArr[n.DELETE_TO_LINE_END.ordinal()] = 25;
                iArr[n.NEW_LINE.ordinal()] = 26;
                iArr[n.TAB.ordinal()] = 27;
                iArr[n.SELECT_ALL.ordinal()] = 28;
                iArr[n.SELECT_LEFT_CHAR.ordinal()] = 29;
                iArr[n.SELECT_RIGHT_CHAR.ordinal()] = 30;
                iArr[n.SELECT_LEFT_WORD.ordinal()] = 31;
                iArr[n.SELECT_RIGHT_WORD.ordinal()] = 32;
                iArr[n.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                iArr[n.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                iArr[n.SELECT_LINE_START.ordinal()] = 35;
                iArr[n.SELECT_LINE_END.ordinal()] = 36;
                iArr[n.SELECT_LINE_LEFT.ordinal()] = 37;
                iArr[n.SELECT_LINE_RIGHT.ordinal()] = 38;
                iArr[n.SELECT_UP.ordinal()] = 39;
                iArr[n.SELECT_DOWN.ordinal()] = 40;
                iArr[n.SELECT_PAGE_UP.ordinal()] = 41;
                iArr[n.SELECT_PAGE_DOWN.ordinal()] = 42;
                iArr[n.SELECT_HOME.ordinal()] = 43;
                iArr[n.SELECT_END.ordinal()] = 44;
                iArr[n.DESELECT.ordinal()] = 45;
                iArr[n.UNDO.ordinal()] = 46;
                iArr[n.REDO.ordinal()] = 47;
                iArr[n.CHARACTER_PALETTE.ordinal()] = 48;
                f31519a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, j0 j0Var, jo.a0 a0Var) {
            super(1);
            this.f31508w = nVar;
            this.f31509x = j0Var;
            this.f31510y = a0Var;
        }

        public final void a(g0.t tVar) {
            e2.a0 g10;
            e2.a0 c10;
            jo.p.h(tVar, "$this$commandExecutionContext");
            switch (i.f31519a[this.f31508w.ordinal()]) {
                case 1:
                    this.f31509x.g().k(false);
                    return;
                case 2:
                    this.f31509x.g().L();
                    return;
                case 3:
                    this.f31509x.g().o();
                    return;
                case 4:
                    tVar.b(a.f31511w);
                    return;
                case 5:
                    tVar.c(C0332b.f31512w);
                    return;
                case 6:
                    tVar.D();
                    return;
                case 7:
                    tVar.L();
                    return;
                case 8:
                    tVar.I();
                    return;
                case 9:
                    tVar.F();
                    return;
                case 10:
                    tVar.S();
                    return;
                case 11:
                    tVar.B();
                    return;
                case 12:
                    tVar.e0();
                    return;
                case 13:
                    tVar.d0();
                    return;
                case 14:
                    tVar.R();
                    return;
                case 15:
                    tVar.O();
                    return;
                case 16:
                    tVar.P();
                    return;
                case 17:
                    tVar.Q();
                    return;
                case 18:
                    tVar.N();
                    return;
                case 19:
                    tVar.M();
                    return;
                case 20:
                    List<e2.d> a02 = tVar.a0(c.f31513w);
                    if (a02 != null) {
                        this.f31509x.e(a02);
                        return;
                    }
                    return;
                case 21:
                    List<e2.d> a03 = tVar.a0(d.f31514w);
                    if (a03 != null) {
                        this.f31509x.e(a03);
                        return;
                    }
                    return;
                case 22:
                    List<e2.d> a04 = tVar.a0(e.f31515w);
                    if (a04 != null) {
                        this.f31509x.e(a04);
                        return;
                    }
                    return;
                case 23:
                    List<e2.d> a05 = tVar.a0(f.f31516w);
                    if (a05 != null) {
                        this.f31509x.e(a05);
                        return;
                    }
                    return;
                case 24:
                    List<e2.d> a06 = tVar.a0(g.f31517w);
                    if (a06 != null) {
                        this.f31509x.e(a06);
                        return;
                    }
                    return;
                case 25:
                    List<e2.d> a07 = tVar.a0(h.f31518w);
                    if (a07 != null) {
                        this.f31509x.e(a07);
                        return;
                    }
                    return;
                case 26:
                    if (!this.f31509x.h()) {
                        this.f31509x.d(new e2.a("\n", 1));
                        return;
                    } else {
                        this.f31510y.f38125w = false;
                        return;
                    }
                case 27:
                    if (!this.f31509x.h()) {
                        this.f31509x.d(new e2.a("\t", 1));
                        return;
                    } else {
                        this.f31510y.f38125w = false;
                        return;
                    }
                case 28:
                    tVar.T();
                    return;
                case 29:
                    tVar.C().U();
                    return;
                case 30:
                    tVar.K().U();
                    return;
                case 31:
                    tVar.D().U();
                    return;
                case 32:
                    tVar.L().U();
                    return;
                case 33:
                    tVar.I().U();
                    return;
                case 34:
                    tVar.F().U();
                    return;
                case 35:
                    tVar.R().U();
                    return;
                case 36:
                    tVar.O().U();
                    return;
                case 37:
                    tVar.P().U();
                    return;
                case 38:
                    tVar.Q().U();
                    return;
                case 39:
                    tVar.S().U();
                    return;
                case 40:
                    tVar.B().U();
                    return;
                case 41:
                    tVar.e0().U();
                    return;
                case 42:
                    tVar.d0().U();
                    return;
                case 43:
                    tVar.N().U();
                    return;
                case 44:
                    tVar.M().U();
                    return;
                case 45:
                    tVar.d();
                    return;
                case 46:
                    y0 i10 = this.f31509x.i();
                    if (i10 != null) {
                        i10.b(tVar.b0());
                    }
                    y0 i11 = this.f31509x.i();
                    if (i11 == null || (g10 = i11.g()) == null) {
                        return;
                    }
                    this.f31509x.f31506j.invoke(g10);
                    return;
                case 47:
                    y0 i12 = this.f31509x.i();
                    if (i12 == null || (c10 = i12.c()) == null) {
                        return;
                    }
                    this.f31509x.f31506j.invoke(c10);
                    return;
                case 48:
                    o.b();
                    return;
                default:
                    return;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(g0.t tVar) {
            a(tVar);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(r0 r0Var, g0.v vVar, e2.a0 a0Var, boolean z10, boolean z11, g0.y yVar, e2.t tVar, y0 y0Var, p pVar, io.l<? super e2.a0, wn.v> lVar) {
        jo.p.h(r0Var, "state");
        jo.p.h(vVar, "selectionManager");
        jo.p.h(a0Var, "value");
        jo.p.h(yVar, "preparedSelectionState");
        jo.p.h(tVar, "offsetMapping");
        jo.p.h(pVar, "keyMapping");
        jo.p.h(lVar, "onValueChange");
        this.f31497a = r0Var;
        this.f31498b = vVar;
        this.f31499c = a0Var;
        this.f31500d = z10;
        this.f31501e = z11;
        this.f31502f = yVar;
        this.f31503g = tVar;
        this.f31504h = y0Var;
        this.f31505i = pVar;
        this.f31506j = lVar;
    }

    public final void d(e2.d dVar) {
        e(xn.r.d(dVar));
    }

    public final void e(List<? extends e2.d> list) {
        e2.f j10 = this.f31497a.j();
        List<? extends e2.d> D0 = xn.a0.D0(list);
        D0.add(0, new e2.i());
        this.f31506j.invoke(j10.a(D0));
    }

    public final void f(io.l<? super g0.t, wn.v> lVar) {
        g0.t tVar = new g0.t(this.f31499c, this.f31503g, this.f31497a.g(), this.f31502f);
        lVar.invoke(tVar);
        if (y1.b0.g(tVar.w(), this.f31499c.g()) && jo.p.c(tVar.e(), this.f31499c.e())) {
            return;
        }
        this.f31506j.invoke(tVar.b0());
    }

    public final g0.v g() {
        return this.f31498b;
    }

    public final boolean h() {
        return this.f31501e;
    }

    public final y0 i() {
        return this.f31504h;
    }

    public final boolean j(KeyEvent keyEvent) {
        n a10;
        jo.p.h(keyEvent, "event");
        e2.a k10 = k(keyEvent);
        if (k10 != null) {
            if (this.f31500d) {
                d(k10);
                this.f31502f.b();
                return true;
            }
            return false;
        } else if (l1.c.e(l1.d.b(keyEvent), l1.c.f39491a.a()) && (a10 = this.f31505i.a(keyEvent)) != null && (!a10.c() || this.f31500d)) {
            jo.a0 a0Var = new jo.a0();
            a0Var.f38125w = true;
            f(new b(a10, this, a0Var));
            y0 y0Var = this.f31504h;
            if (y0Var != null) {
                y0Var.a();
            }
            return a0Var.f38125w;
        } else {
            return false;
        }
    }

    public final e2.a k(KeyEvent keyEvent) {
        if (l0.a(keyEvent)) {
            String sb2 = b0.a(new StringBuilder(), l1.d.c(keyEvent)).toString();
            jo.p.g(sb2, "StringBuilder().appendCo…              .toString()");
            return new e2.a(sb2, 1);
        }
        return null;
    }

    public /* synthetic */ j0(r0 r0Var, g0.v vVar, e2.a0 a0Var, boolean z10, boolean z11, g0.y yVar, e2.t tVar, y0 y0Var, p pVar, io.l lVar, int i10, jo.h hVar) {
        this(r0Var, vVar, (i10 & 4) != 0 ? new e2.a0((String) null, 0L, (y1.b0) null, 7, (jo.h) null) : a0Var, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, yVar, (i10 & 64) != 0 ? e2.t.f30146a.a() : tVar, (i10 & 128) != 0 ? null : y0Var, (i10 & 256) != 0 ? r.a() : pVar, (i10 & 512) != 0 ? a.f31507w : lVar);
    }
}

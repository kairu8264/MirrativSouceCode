package e2;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final View f30070a;

    /* renamed from: b  reason: collision with root package name */
    public final o f30071b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f30072c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super List<? extends e2.d>, wn.v> f30073d;

    /* renamed from: e  reason: collision with root package name */
    public io.l<? super l, wn.v> f30074e;

    /* renamed from: f  reason: collision with root package name */
    public a0 f30075f;

    /* renamed from: g  reason: collision with root package name */
    public m f30076g;

    /* renamed from: h  reason: collision with root package name */
    public w f30077h;

    /* renamed from: i  reason: collision with root package name */
    public final wn.f f30078i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f30079j;

    /* renamed from: k  reason: collision with root package name */
    public final wo.i<a> f30080k;

    /* loaded from: classes.dex */
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30081a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.StartInput.ordinal()] = 1;
            iArr[a.StopInput.ordinal()] = 2;
            iArr[a.ShowKeyboard.ordinal()] = 3;
            iArr[a.HideKeyboard.ordinal()] = 4;
            f30081a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<BaseInputConnection> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(d0.this.k(), false);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements n {
        public d() {
        }

        @Override // e2.n
        public void a(KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            d0.this.j().sendKeyEvent(keyEvent);
        }

        @Override // e2.n
        public void b(int i10) {
            d0.this.f30074e.invoke(l.i(i10));
        }

        @Override // e2.n
        public void c(List<? extends e2.d> list) {
            jo.p.h(list, "editCommands");
            d0.this.f30073d.invoke(list);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<List<? extends e2.d>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f30084w = new e();

        public e() {
            super(1);
        }

        public final void a(List<? extends e2.d> list) {
            jo.p.h(list, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(List<? extends e2.d> list) {
            a(list);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<l, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final f f30085w = new f();

        public f() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l lVar) {
            a(lVar.o());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<List<? extends e2.d>, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final g f30086w = new g();

        public g() {
            super(1);
        }

        public final void a(List<? extends e2.d> list) {
            jo.p.h(list, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(List<? extends e2.d> list) {
            a(list);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<l, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final h f30087w = new h();

        public h() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(l lVar) {
            a(lVar.o());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "textInputCommandEventLoop")
    /* loaded from: classes.dex */
    public static final class i extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f30088w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30089x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f30090y;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f30090y = obj;
            this.A |= Integer.MIN_VALUE;
            return d0.this.o(this);
        }
    }

    public d0(View view, o oVar) {
        jo.p.h(view, "view");
        jo.p.h(oVar, "inputMethodManager");
        this.f30070a = view;
        this.f30071b = oVar;
        this.f30073d = e.f30084w;
        this.f30074e = f.f30085w;
        this.f30075f = new a0("", y1.b0.f61064b.a(), (y1.b0) null, 4, (jo.h) null);
        this.f30076g = m.f30122f.a();
        this.f30078i = wn.g.b(wn.i.NONE, new c());
        this.f30080k = wo.l.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    public static final void p(a aVar, jo.e0<Boolean> e0Var, jo.e0<Boolean> e0Var2) {
        int i10 = b.f30081a[aVar.ordinal()];
        if (i10 == 1) {
            ?? r32 = Boolean.TRUE;
            e0Var.f38136w = r32;
            e0Var2.f38136w = r32;
        } else if (i10 != 2) {
            if ((i10 == 3 || i10 == 4) && !jo.p.c(e0Var.f38136w, Boolean.FALSE)) {
                e0Var2.f38136w = Boolean.valueOf(aVar == a.ShowKeyboard);
            }
        } else {
            ?? r33 = Boolean.FALSE;
            e0Var.f38136w = r33;
            e0Var2.f38136w = r33;
        }
    }

    @Override // e2.v
    public void a() {
        this.f30072c = false;
        this.f30073d = g.f30086w;
        this.f30074e = h.f30087w;
        this.f30079j = null;
        this.f30080k.l(a.StopInput);
    }

    @Override // e2.v
    public void b() {
        this.f30080k.l(a.HideKeyboard);
    }

    @Override // e2.v
    public void c(a0 a0Var, m mVar, io.l<? super List<? extends e2.d>, wn.v> lVar, io.l<? super l, wn.v> lVar2) {
        jo.p.h(a0Var, "value");
        jo.p.h(mVar, "imeOptions");
        jo.p.h(lVar, "onEditCommand");
        jo.p.h(lVar2, "onImeActionPerformed");
        this.f30072c = true;
        this.f30075f = a0Var;
        this.f30076g = mVar;
        this.f30073d = lVar;
        this.f30074e = lVar2;
        this.f30080k.l(a.StartInput);
    }

    @Override // e2.v
    public void d() {
        this.f30080k.l(a.ShowKeyboard);
    }

    @Override // e2.v
    public void e(a0 a0Var, a0 a0Var2) {
        jo.p.h(a0Var2, "newValue");
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (y1.b0.g(this.f30075f.g(), a0Var2.g()) && jo.p.c(this.f30075f.f(), a0Var2.f())) ? false : true;
        this.f30075f = a0Var2;
        w wVar = this.f30077h;
        if (wVar != null) {
            wVar.e(a0Var2);
        }
        if (jo.p.c(a0Var, a0Var2)) {
            if (z12) {
                o oVar = this.f30071b;
                View view = this.f30070a;
                int l10 = y1.b0.l(a0Var2.g());
                int k10 = y1.b0.k(a0Var2.g());
                y1.b0 f10 = this.f30075f.f();
                int l11 = f10 != null ? y1.b0.l(f10.r()) : -1;
                y1.b0 f11 = this.f30075f.f();
                oVar.b(view, l10, k10, l11, f11 != null ? y1.b0.k(f11.r()) : -1);
                return;
            }
            return;
        }
        if (a0Var != null) {
            if (jo.p.c(a0Var.h(), a0Var2.h()) && (!y1.b0.g(a0Var.g(), a0Var2.g()) || jo.p.c(a0Var.f(), a0Var2.f()))) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            m();
            return;
        }
        w wVar2 = this.f30077h;
        if (wVar2 != null) {
            wVar2.f(this.f30075f, this.f30071b, this.f30070a);
        }
    }

    public final InputConnection i(EditorInfo editorInfo) {
        jo.p.h(editorInfo, "outAttrs");
        if (this.f30072c) {
            e0.b(editorInfo, this.f30076g, this.f30075f);
            w wVar = new w(this.f30075f, new d(), this.f30076g.b());
            this.f30077h = wVar;
            return wVar;
        }
        return null;
    }

    public final BaseInputConnection j() {
        return (BaseInputConnection) this.f30078i.getValue();
    }

    public final View k() {
        return this.f30070a;
    }

    public final boolean l() {
        return this.f30072c;
    }

    public final void m() {
        this.f30071b.e(this.f30070a);
    }

    public final void n(boolean z10) {
        if (z10) {
            this.f30071b.c(this.f30070a);
        } else {
            this.f30071b.a(this.f30070a.getWindowToken());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(ao.d<? super wn.v> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof e2.d0.i
            if (r0 == 0) goto L13
            r0 = r9
            e2.d0$i r0 = (e2.d0.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e2.d0$i r0 = new e2.d0$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30090y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f30089x
            wo.k r2 = (wo.k) r2
            java.lang.Object r4 = r0.f30088w
            e2.d0 r4 = (e2.d0) r4
            wn.m.b(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            wn.m.b(r9)
            wo.i<e2.d0$a> r9 = r8.f30080k
            wo.k r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L44:
            r0.f30088w = r4
            r0.f30089x = r2
            r0.A = r3
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r2.next()
            e2.d0$a r9 = (e2.d0.a) r9
            android.view.View r5 = r4.f30070a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L74
        L67:
            wo.i<e2.d0$a> r9 = r4.f30080k
            java.lang.Object r9 = r9.t()
            boolean r9 = wo.m.j(r9)
            if (r9 != 0) goto L67
            goto L44
        L74:
            jo.e0 r5 = new jo.e0
            r5.<init>()
            jo.e0 r6 = new jo.e0
            r6.<init>()
        L7e:
            if (r9 == 0) goto L90
            p(r9, r5, r6)
            wo.i<e2.d0$a> r9 = r4.f30080k
            java.lang.Object r9 = r9.t()
            java.lang.Object r9 = wo.m.f(r9)
            e2.d0$a r9 = (e2.d0.a) r9
            goto L7e
        L90:
            T r9 = r5.f38136w
            java.lang.Boolean r7 = co.b.a(r3)
            boolean r9 = jo.p.c(r9, r7)
            if (r9 == 0) goto L9f
            r4.m()
        L9f:
            T r9 = r6.f38136w
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto Lac
            boolean r9 = r9.booleanValue()
            r4.n(r9)
        Lac:
            T r9 = r5.f38136w
            r5 = 0
            java.lang.Boolean r5 = co.b.a(r5)
            boolean r9 = jo.p.c(r9, r5)
            if (r9 == 0) goto L44
            r4.m()
            goto L44
        Lbd:
            wn.v r9 = wn.v.f59242a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.o(ao.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            jo.p.h(r4, r0)
            e2.p r0 = new e2.p
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            jo.p.g(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.d0.<init>(android.view.View):void");
    }
}

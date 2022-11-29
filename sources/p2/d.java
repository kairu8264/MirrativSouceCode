package p2;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.l2;
import androidx.lifecycle.w0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import l0.c2;
import l0.l1;
import l0.s0;
import m2.l;
import m2.m;
import m2.n;
import m2.o;
import m2.q;
import q1.r;
import wn.v;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class d extends androidx.compose.ui.platform.a implements l2 {
    public io.a<v> D;
    public i E;
    public String F;
    public final View G;
    public final e H;
    public final WindowManager I;
    public final WindowManager.LayoutParams J;
    public h K;
    public q L;
    public final s0 M;
    public final s0 N;
    public m O;
    public final c2 P;
    public final float Q;
    public final Rect R;
    public final s0 S;
    public boolean T;
    public final int[] U;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            p.h(view, "view");
            p.h(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f45727x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f45727x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            d.this.a(iVar, this.f45727x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f45728a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.Ltr.ordinal()] = 1;
            iArr[q.Rtl.ordinal()] = 2;
            f45728a = iArr;
        }
    }

    /* renamed from: p2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0698d extends jo.q implements io.a<Boolean> {
        public C0698d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf((d.this.getParentLayoutCoordinates() == null || d.this.m32getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d(io.a r11, p2.i r12, java.lang.String r13, android.view.View r14, m2.d r15, p2.h r16, java.util.UUID r17, p2.e r18, int r19, jo.h r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            p2.f r0 = new p2.f
            r0.<init>()
            goto L17
        L12:
            p2.g r0 = new p2.g
            r0.<init>()
        L17:
            r9 = r0
            goto L1b
        L19:
            r9 = r18
        L1b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.<init>(io.a, p2.i, java.lang.String, android.view.View, m2.d, p2.h, java.util.UUID, p2.e, int, jo.h):void");
    }

    private final io.p<l0.i, Integer, v> getContent() {
        return (io.p) this.S.getValue();
    }

    private final int getDisplayHeight() {
        return lo.c.c(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return lo.c.c(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q1.q getParentLayoutCoordinates() {
        return (q1.q) this.N.getValue();
    }

    private final void setClippingEnabled(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.J.flags & (-513);
        } else {
            i10 = this.J.flags | 512;
        }
        l(i10);
    }

    private final void setContent(io.p<? super l0.i, ? super Integer, v> pVar) {
        this.S.setValue(pVar);
    }

    private final void setIsFocusable(boolean z10) {
        int i10;
        if (!z10) {
            i10 = this.J.flags | 8;
        } else {
            i10 = this.J.flags & (-9);
        }
        l(i10);
    }

    private final void setParentLayoutCoordinates(q1.q qVar) {
        this.N.setValue(qVar);
    }

    private final void setSecurePolicy(j jVar) {
        int i10;
        if (k.a(jVar, p2.a.e(this.G))) {
            i10 = this.J.flags | 8192;
        } else {
            i10 = this.J.flags & (-8193);
        }
        l(i10);
    }

    @Override // androidx.compose.ui.platform.a
    public void a(l0.i iVar, int i10) {
        l0.i h10 = iVar.h(-857613600);
        getContent().invoke(h10, 0);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new b(i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        p.h(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.E.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                io.a<v> aVar = this.D;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.a
    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        super.g(z10, i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.J.width = childAt.getMeasuredWidth();
        this.J.height = childAt.getMeasuredHeight();
        this.H.b(this.I, this, this.J);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.P.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.J;
    }

    public final q getParentLayoutDirection() {
        return this.L;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final o m32getPopupContentSizebOM6tXw() {
        return (o) this.M.getValue();
    }

    public final h getPositionProvider() {
        return this.K;
    }

    @Override // androidx.compose.ui.platform.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.T;
    }

    @Override // androidx.compose.ui.platform.l2
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.F;
    }

    @Override // androidx.compose.ui.platform.l2
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.a
    public void h(int i10, int i11) {
        if (this.E.g()) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void l(int i10) {
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.flags = i10;
        this.H.b(this.I, this, layoutParams);
    }

    public final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i10 = layoutParams.flags & (-8552473);
        layoutParams.flags = i10;
        layoutParams.flags = i10 | 262144;
        layoutParams.type = AnalyticsListener.EVENT_LOAD_CANCELED;
        layoutParams.token = this.G.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.G.getContext().getResources().getString(x0.i.f59392d));
        return layoutParams;
    }

    public final void n() {
        w0.b(this, null);
        this.I.removeViewImmediate(this);
    }

    public final void o() {
        int[] iArr = this.U;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.G.getLocationOnScreen(iArr);
        int[] iArr2 = this.U;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        t();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.E.c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z10 = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            io.a<v> aVar = this.D;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z10 = true;
        }
        if (z10) {
            io.a<v> aVar2 = this.D;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(l0.m mVar, io.p<? super l0.i, ? super Integer, v> pVar) {
        p.h(mVar, "parent");
        p.h(pVar, "content");
        setParentCompositionContext(mVar);
        setContent(pVar);
        this.T = true;
    }

    public final void q() {
        this.I.addView(this, this.J);
    }

    public final void r(q qVar) {
        int i10 = c.f45728a[qVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    public final void s(io.a<v> aVar, i iVar, String str, q qVar) {
        p.h(iVar, "properties");
        p.h(str, "testTag");
        p.h(qVar, "layoutDirection");
        this.D = aVar;
        this.E = iVar;
        this.F = str;
        setIsFocusable(iVar.e());
        setSecurePolicy(iVar.f());
        setClippingEnabled(iVar.a());
        r(qVar);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(q qVar) {
        p.h(qVar, "<set-?>");
        this.L = qVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m33setPopupContentSizefhxjrPA(o oVar) {
        this.M.setValue(oVar);
    }

    public final void setPositionProvider(h hVar) {
        p.h(hVar, "<set-?>");
        this.K = hVar;
    }

    public final void setTestTag(String str) {
        p.h(str, "<set-?>");
        this.F = str;
    }

    public final void t() {
        q1.q parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long a10 = parentLayoutCoordinates.a();
        long f10 = r.f(parentLayoutCoordinates);
        m a11 = n.a(l.a(lo.c.c(b1.f.m(f10)), lo.c.c(b1.f.n(f10))), a10);
        if (p.c(a11, this.O)) {
            return;
        }
        this.O = a11;
        v();
    }

    public final void u(q1.q qVar) {
        p.h(qVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(qVar);
        t();
    }

    public final void v() {
        o m32getPopupContentSizebOM6tXw;
        m mVar = this.O;
        if (mVar == null || (m32getPopupContentSizebOM6tXw = m32getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = m32getPopupContentSizebOM6tXw.j();
        Rect rect = this.R;
        this.H.a(this.G, rect);
        m d10 = p2.a.d(rect);
        long a10 = m2.p.a(d10.d(), d10.a());
        long a11 = this.K.a(mVar, a10, this.L, j10);
        this.J.x = m2.k.j(a11);
        this.J.y = m2.k.k(a11);
        if (this.E.d()) {
            this.H.c(this, o.g(a10), o.f(a10));
        }
        this.H.b(this.I, this, this.J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(io.a<wn.v> r8, p2.i r9, java.lang.String r10, android.view.View r11, m2.d r12, p2.h r13, java.util.UUID r14, p2.e r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            jo.p.h(r9, r0)
            java.lang.String r0 = "testTag"
            jo.p.h(r10, r0)
            java.lang.String r0 = "composeView"
            jo.p.h(r11, r0)
            java.lang.String r0 = "density"
            jo.p.h(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            jo.p.h(r13, r0)
            java.lang.String r0 = "popupId"
            jo.p.h(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            jo.p.h(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            jo.p.g(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.D = r8
            r7.E = r9
            r7.F = r10
            r7.G = r11
            r7.H = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            java.util.Objects.requireNonNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.I = r8
            android.view.WindowManager$LayoutParams r8 = r7.m()
            r7.J = r8
            r7.K = r13
            m2.q r8 = m2.q.Ltr
            r7.L = r8
            r8 = 0
            r9 = 2
            l0.s0 r10 = l0.u1.g(r8, r8, r9, r8)
            r7.M = r10
            l0.s0 r10 = l0.u1.g(r8, r8, r9, r8)
            r7.N = r10
            p2.d$d r10 = new p2.d$d
            r10.<init>()
            l0.c2 r10 = l0.u1.b(r10)
            r7.P = r10
            r10 = 30
            float r10 = (float) r10
            float r10 = m2.g.l(r10)
            r7.Q = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.R = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.u r13 = androidx.lifecycle.w0.a(r11)
            androidx.lifecycle.w0.b(r7, r13)
            androidx.lifecycle.v0 r13 = androidx.lifecycle.x0.a(r11)
            androidx.lifecycle.x0.b(r7, r13)
            y4.e r11 = y4.f.a(r11)
            y4.f.b(r7, r11)
            int r11 = x0.h.H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.I0(r10)
            r7.setElevation(r10)
            p2.d$a r10 = new p2.d$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            p2.c r10 = p2.c.f45723a
            io.p r10 = r10.a()
            l0.s0 r8 = l0.u1.g(r10, r8, r9, r8)
            r7.S = r8
            int[] r8 = new int[r9]
            r7.U = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.<init>(io.a, p2.i, java.lang.String, android.view.View, m2.d, p2.h, java.util.UUID, p2.e):void");
    }
}

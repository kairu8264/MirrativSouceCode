package w3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import o3.c0;
import p3.d;
import p3.e;
import s.h;
import w3.b;

/* loaded from: classes.dex */
public abstract class a extends o3.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f58082n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a<p3.c> f58083o = new C0949a();

    /* renamed from: p  reason: collision with root package name */
    public static final b.InterfaceC0950b<h<p3.c>, p3.c> f58084p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f58089h;

    /* renamed from: i  reason: collision with root package name */
    public final View f58090i;

    /* renamed from: j  reason: collision with root package name */
    public c f58091j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f58085d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f58086e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f58087f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f58088g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f58092k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f58093l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f58094m = Integer.MIN_VALUE;

    /* renamed from: w3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0949a implements b.a<p3.c> {
        @Override // w3.b.a
        /* renamed from: b */
        public void a(p3.c cVar, Rect rect) {
            cVar.m(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0950b<h<p3.c>, p3.c> {
        @Override // w3.b.InterfaceC0950b
        /* renamed from: c */
        public p3.c a(h<p3.c> hVar, int i10) {
            return hVar.s(i10);
        }

        @Override // w3.b.InterfaceC0950b
        /* renamed from: d */
        public int b(h<p3.c> hVar) {
            return hVar.r();
        }
    }

    /* loaded from: classes.dex */
    public class c extends d {
        public c() {
        }

        @Override // p3.d
        public p3.c b(int i10) {
            return p3.c.P(a.this.H(i10));
        }

        @Override // p3.d
        public p3.c d(int i10) {
            int i11 = i10 == 2 ? a.this.f58092k : a.this.f58093l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // p3.d
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f58090i = view;
            this.f58089h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (c0.C(view) == 0) {
                c0.C0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    public static int F(int i10) {
        if (i10 != 19) {
            if (i10 != 21) {
                if (i10 != 22) {
                    return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    public final int A() {
        return this.f58093l;
    }

    public abstract int B(float f10, float f11);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f58090i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f58090i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i10, Rect rect) {
        p3.c cVar;
        h<p3.c> y10 = y();
        int i11 = this.f58093l;
        p3.c h10 = i11 == Integer.MIN_VALUE ? null : y10.h(i11);
        if (i10 == 1 || i10 == 2) {
            cVar = (p3.c) w3.b.d(y10, f58084p, f58083o, h10, i10, c0.E(this.f58090i) == 1, false);
        } else if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i12 = this.f58093l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f58090i, i10, rect2);
            }
            cVar = (p3.c) w3.b.c(y10, f58084p, f58083o, h10, rect2, i10);
        }
        return T(cVar != null ? y10.m(y10.l(cVar)) : Integer.MIN_VALUE);
    }

    public p3.c H(int i10) {
        if (i10 == -1) {
            return u();
        }
        return t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f58093l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    public abstract boolean J(int i10, int i11, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    public void M(p3.c cVar) {
    }

    public abstract void N(int i10, p3.c cVar);

    public void O(int i10, boolean z10) {
    }

    public boolean P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return Q(i10, i11, bundle);
        }
        return R(i11, bundle);
    }

    public final boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 64) {
                    if (i11 != 128) {
                        return J(i10, i11, bundle);
                    }
                    return n(i10);
                }
                return S(i10);
            }
            return o(i10);
        }
        return T(i10);
    }

    public final boolean R(int i10, Bundle bundle) {
        return c0.g0(this.f58090i, i10, bundle);
    }

    public final boolean S(int i10) {
        int i11;
        if (this.f58089h.isEnabled() && this.f58089h.isTouchExplorationEnabled() && (i11 = this.f58092k) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                n(i11);
            }
            this.f58092k = i10;
            this.f58090i.invalidate();
            U(i10, 32768);
            return true;
        }
        return false;
    }

    public final boolean T(int i10) {
        int i11;
        if ((this.f58090i.isFocused() || this.f58090i.requestFocus()) && (i11 = this.f58093l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                o(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f58093l = i10;
            O(i10, true);
            U(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f58089h.isEnabled() || (parent = this.f58090i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f58090i, q(i10, i11));
    }

    public final void V(int i10) {
        int i11 = this.f58094m;
        if (i11 == i10) {
            return;
        }
        this.f58094m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    @Override // o3.a
    public d b(View view) {
        if (this.f58091j == null) {
            this.f58091j = new c();
        }
        return this.f58091j;
    }

    @Override // o3.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // o3.a
    public void g(View view, p3.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean n(int i10) {
        if (this.f58092k == i10) {
            this.f58092k = Integer.MIN_VALUE;
            this.f58090i.invalidate();
            U(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            return true;
        }
        return false;
    }

    public final boolean o(int i10) {
        if (this.f58093l != i10) {
            return false;
        }
        this.f58093l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f58093l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        if (i10 != -1) {
            return r(i10, i11);
        }
        return s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        p3.c H = H(i10);
        obtain.getText().add(H.y());
        obtain.setContentDescription(H.r());
        obtain.setScrollable(H.K());
        obtain.setPassword(H.J());
        obtain.setEnabled(H.F());
        obtain.setChecked(H.D());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.p());
        e.c(obtain, this.f58090i, i10);
        obtain.setPackageName(this.f58090i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f58090i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final p3.c t(int i10) {
        p3.c N = p3.c.N();
        N.j0(true);
        N.l0(true);
        N.b0("android.view.View");
        Rect rect = f58082n;
        N.W(rect);
        N.X(rect);
        N.v0(this.f58090i);
        N(i10, N);
        if (N.y() == null && N.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        N.m(this.f58086e);
        if (!this.f58086e.equals(rect)) {
            int k10 = N.k();
            if ((k10 & 64) == 0) {
                if ((k10 & 128) == 0) {
                    N.t0(this.f58090i.getContext().getPackageName());
                    N.E0(this.f58090i, i10);
                    if (this.f58092k == i10) {
                        N.U(true);
                        N.a(128);
                    } else {
                        N.U(false);
                        N.a(64);
                    }
                    boolean z10 = this.f58093l == i10;
                    if (z10) {
                        N.a(2);
                    } else if (N.G()) {
                        N.a(1);
                    }
                    N.m0(z10);
                    this.f58090i.getLocationOnScreen(this.f58088g);
                    N.n(this.f58085d);
                    if (this.f58085d.equals(rect)) {
                        N.m(this.f58085d);
                        if (N.f45743b != -1) {
                            p3.c N2 = p3.c.N();
                            for (int i11 = N.f45743b; i11 != -1; i11 = N2.f45743b) {
                                N2.w0(this.f58090i, -1);
                                N2.W(f58082n);
                                N(i11, N2);
                                N2.m(this.f58086e);
                                Rect rect2 = this.f58085d;
                                Rect rect3 = this.f58086e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            N2.R();
                        }
                        this.f58085d.offset(this.f58088g[0] - this.f58090i.getScrollX(), this.f58088g[1] - this.f58090i.getScrollY());
                    }
                    if (this.f58090i.getLocalVisibleRect(this.f58087f)) {
                        this.f58087f.offset(this.f58088g[0] - this.f58090i.getScrollX(), this.f58088g[1] - this.f58090i.getScrollY());
                        if (this.f58085d.intersect(this.f58087f)) {
                            N.X(this.f58085d);
                            if (E(this.f58085d)) {
                                N.K0(true);
                            }
                        }
                    }
                    return N;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final p3.c u() {
        p3.c O = p3.c.O(this.f58090i);
        c0.e0(this.f58090i, O);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (O.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            O.d(this.f58090i, ((Integer) arrayList.get(i10)).intValue());
        }
        return O;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f58089h.isEnabled() && this.f58089h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f58094m != Integer.MIN_VALUE) {
                    V(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && G(F, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int x() {
        return this.f58092k;
    }

    public final h<p3.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<p3.c> hVar = new h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.n(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return hVar;
    }

    public final void z(int i10, Rect rect) {
        H(i10).m(rect);
    }
}

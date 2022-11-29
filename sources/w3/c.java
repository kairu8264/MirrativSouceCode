package w3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import o3.c0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    public static final Interpolator f58100x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f58101a;

    /* renamed from: b  reason: collision with root package name */
    public int f58102b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f58104d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f58105e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f58106f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f58107g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f58108h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f58109i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f58110j;

    /* renamed from: k  reason: collision with root package name */
    public int f58111k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f58112l;

    /* renamed from: m  reason: collision with root package name */
    public float f58113m;

    /* renamed from: n  reason: collision with root package name */
    public float f58114n;

    /* renamed from: o  reason: collision with root package name */
    public int f58115o;

    /* renamed from: p  reason: collision with root package name */
    public final int f58116p;

    /* renamed from: q  reason: collision with root package name */
    public int f58117q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f58118r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0951c f58119s;

    /* renamed from: t  reason: collision with root package name */
    public View f58120t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f58121u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f58122v;

    /* renamed from: c  reason: collision with root package name */
    public int f58103c = -1;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f58123w = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: w3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0951c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0951c abstractC0951c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0951c != null) {
            this.f58122v = viewGroup;
            this.f58119s = abstractC0951c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f58116p = i10;
            this.f58115o = i10;
            this.f58102b = viewConfiguration.getScaledTouchSlop();
            this.f58113m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f58114n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f58118r = new OverScroller(context, f58100x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public static c l(ViewGroup viewGroup, float f10, AbstractC0951c abstractC0951c) {
        c m10 = m(viewGroup, abstractC0951c);
        m10.f58102b = (int) (m10.f58102b * (1.0f / f10));
        return m10;
    }

    public static c m(ViewGroup viewGroup, AbstractC0951c abstractC0951c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0951c);
    }

    public final void A() {
        this.f58112l.computeCurrentVelocity(1000, this.f58113m);
        n(e(this.f58112l.getXVelocity(this.f58103c), this.f58114n, this.f58113m), e(this.f58112l.getYVelocity(this.f58103c), this.f58114n, this.f58113m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [w3.c$c] */
    public final void B(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = c10 | true;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f58109i;
            iArr[i10] = iArr[i10] | r02;
            this.f58119s.f(r02, i10);
        }
    }

    public final void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f58104d;
        this.f58106f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f58105e;
        this.f58107g[i10] = f11;
        fArr2[i10] = f11;
        this.f58108h[i10] = t((int) f10, (int) f11);
        this.f58111k |= 1 << i10;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f58106f[pointerId] = x10;
                this.f58107g[pointerId] = y10;
            }
        }
    }

    public void E(int i10) {
        this.f58122v.removeCallbacks(this.f58123w);
        if (this.f58101a != i10) {
            this.f58101a = i10;
            this.f58119s.j(i10);
            if (this.f58101a == 0) {
                this.f58120t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f58121u) {
            return s(i10, i11, (int) this.f58112l.getXVelocity(this.f58103c), (int) this.f58112l.getYVelocity(this.f58103c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f58120t = view;
        this.f58103c = -1;
        boolean s10 = s(i10, i11, 0, 0);
        if (!s10 && this.f58101a == 0 && this.f58120t != null) {
            this.f58120t = null;
        }
        return s10;
    }

    public boolean I(View view, int i10) {
        if (view == this.f58120t && this.f58103c == i10) {
            return true;
        }
        if (view == null || !this.f58119s.m(view, i10)) {
            return false;
        }
        this.f58103c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f58103c = -1;
        g();
        VelocityTracker velocityTracker = this.f58112l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f58112l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f58122v) {
            this.f58120t = view;
            this.f58103c = i10;
            this.f58119s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f58122v + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f58108h[i10] & i11) != i11 || (this.f58117q & i11) == 0 || (this.f58110j[i10] & i11) == i11 || (this.f58109i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f58102b;
        if (abs > i12 || abs2 > i12) {
            if (abs >= abs2 * 0.5f || !this.f58119s.g(i11)) {
                return (this.f58109i[i10] & i11) == 0 && abs > ((float) this.f58102b);
            }
            int[] iArr = this.f58110j;
            iArr[i10] = iArr[i10] | i11;
            return false;
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f58119s.d(view) > 0;
        boolean z11 = this.f58119s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f58102b) : z11 && Math.abs(f11) > ((float) this.f58102b);
        }
        int i10 = this.f58102b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    public final float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void g() {
        float[] fArr = this.f58104d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f58105e, 0.0f);
        Arrays.fill(this.f58106f, 0.0f);
        Arrays.fill(this.f58107g, 0.0f);
        Arrays.fill(this.f58108h, 0);
        Arrays.fill(this.f58109i, 0);
        Arrays.fill(this.f58110j, 0);
        this.f58111k = 0;
    }

    public final void h(int i10) {
        if (this.f58104d == null || !w(i10)) {
            return;
        }
        this.f58104d[i10] = 0.0f;
        this.f58105e[i10] = 0.0f;
        this.f58106f[i10] = 0.0f;
        this.f58107g[i10] = 0.0f;
        this.f58108h[i10] = 0;
        this.f58109i[i10] = 0;
        this.f58110j[i10] = 0;
        this.f58111k = (~(1 << i10)) & this.f58111k;
    }

    public final int i(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f58122v.getWidth();
        float f10 = width / 2;
        float o10 = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int f14 = f(i12, (int) this.f58114n, (int) this.f58113m);
        int f15 = f(i13, (int) this.f58114n, (int) this.f58113m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (f14 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f16 = f10 / f11;
        if (f15 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((i(i10, f14, this.f58119s.d(view)) * f16) + (i(i11, f15, this.f58119s.e(view)) * (f12 / f13)));
    }

    public boolean k(boolean z10) {
        if (this.f58101a == 2) {
            boolean computeScrollOffset = this.f58118r.computeScrollOffset();
            int currX = this.f58118r.getCurrX();
            int currY = this.f58118r.getCurrY();
            int left = currX - this.f58120t.getLeft();
            int top = currY - this.f58120t.getTop();
            if (left != 0) {
                c0.b0(this.f58120t, left);
            }
            if (top != 0) {
                c0.c0(this.f58120t, top);
            }
            if (left != 0 || top != 0) {
                this.f58119s.k(this.f58120t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f58118r.getFinalX() && currY == this.f58118r.getFinalY()) {
                this.f58118r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f58122v.post(this.f58123w);
                } else {
                    E(0);
                }
            }
        }
        return this.f58101a == 2;
    }

    public final void n(float f10, float f11) {
        this.f58121u = true;
        this.f58119s.l(this.f58120t, f10, f11);
        this.f58121u = false;
        if (this.f58101a == 1) {
            E(0);
        }
    }

    public final float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int left = this.f58120t.getLeft();
        int top = this.f58120t.getTop();
        if (i12 != 0) {
            i10 = this.f58119s.a(this.f58120t, i10, i12);
            c0.b0(this.f58120t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f58119s.b(this.f58120t, i11, i13);
            c0.c0(this.f58120t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f58119s.k(this.f58120t, i14, i15, i14 - left, i15 - top);
    }

    public final void q(int i10) {
        float[] fArr = this.f58104d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f58105e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f58106f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f58107g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f58108h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f58109i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f58110j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f58104d = fArr2;
            this.f58105e = fArr3;
            this.f58106f = fArr4;
            this.f58107g = fArr5;
            this.f58108h = iArr;
            this.f58109i = iArr2;
            this.f58110j = iArr3;
        }
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f58122v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f58122v.getChildAt(this.f58119s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f58120t.getLeft();
        int top = this.f58120t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f58118r.abortAnimation();
            E(0);
            return false;
        }
        this.f58118r.startScroll(left, top, i14, i15, j(this.f58120t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    public final int t(int i10, int i11) {
        int i12 = i10 < this.f58122v.getLeft() + this.f58115o ? 1 : 0;
        if (i11 < this.f58122v.getTop() + this.f58115o) {
            i12 |= 4;
        }
        if (i10 > this.f58122v.getRight() - this.f58115o) {
            i12 |= 2;
        }
        return i11 > this.f58122v.getBottom() - this.f58115o ? i12 | 8 : i12;
    }

    public int u() {
        return this.f58102b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f58120t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f58111k) != 0;
    }

    public final boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f58112l == null) {
            this.f58112l = VelocityTracker.obtain();
        }
        this.f58112l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r10 = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(r10, pointerId);
            int i12 = this.f58108h[pointerId];
            int i13 = this.f58117q;
            if ((i12 & i13) != 0) {
                this.f58119s.h(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f58101a == 1) {
                A();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.f58101a == 1) {
                if (x(this.f58103c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f58103c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f58106f;
                    int i14 = this.f58103c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f58107g[i14]);
                    p(this.f58120t.getLeft() + i15, this.f58120t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f58104d[pointerId2];
                    float f11 = y12 - this.f58105e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f58101a != 1) {
                        View r11 = r((int) x12, (int) y12);
                        if (d(r11, f10, f11) && I(r11, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f58101a == 1) {
                n(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f58101a == 0) {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f58108h[pointerId3];
                int i18 = this.f58117q;
                if ((i17 & i18) != 0) {
                    this.f58119s.h(i17 & i18, pointerId3);
                }
            } else if (v((int) x13, (int) y13)) {
                I(this.f58120t, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f58101a == 1 && pointerId4 == this.f58103c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount2) {
                        i10 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i11);
                    if (pointerId5 != this.f58103c) {
                        View r12 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view = this.f58120t;
                        if (r12 == view && I(view, pointerId5)) {
                            i10 = this.f58103c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    A();
                }
            }
            h(pointerId4);
        }
    }
}

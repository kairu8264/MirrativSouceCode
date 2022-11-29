package w2;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.s;
import w2.l;

/* loaded from: classes.dex */
public class j extends ConstraintLayout implements s {
    public static boolean T0;
    public ArrayList<h> A0;
    public ArrayList<h> B0;
    public CopyOnWriteArrayList<d> C0;
    public int D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public float H0;
    public r2.c I0;
    public boolean J0;
    public c K0;
    public Runnable L0;
    public int[] M0;
    public int N0;
    public int O0;
    public boolean P0;
    public e Q0;
    public boolean R0;
    public ArrayList<Integer> S0;
    public l U;
    public Interpolator V;
    public Interpolator W;

    /* renamed from: a0  reason: collision with root package name */
    public float f58041a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f58042b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f58043c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f58044d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f58045e0;

    /* renamed from: f0  reason: collision with root package name */
    public HashMap<View, g> f58046f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f58047g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f58048h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f58049i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f58050j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f58051k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f58052l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f58053m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f58054n0;

    /* renamed from: o0  reason: collision with root package name */
    public d f58055o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f58056p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f58057q0;

    /* renamed from: r0  reason: collision with root package name */
    public v2.a f58058r0;

    /* renamed from: s0  reason: collision with root package name */
    public w2.b f58059s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f58060t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f58061u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f58062v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f58063w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f58064x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f58065y0;

    /* renamed from: z0  reason: collision with root package name */
    public ArrayList<h> f58066z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.K0.a();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58068a;

        static {
            int[] iArr = new int[e.values().length];
            f58068a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58068a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58068a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58068a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public float f58069a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f58070b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f58071c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f58072d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final String f58073e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        public final String f58074f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        public final String f58075g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        public final String f58076h = "motion.EndState";

        public c() {
        }

        public void a() {
            int i10 = this.f58071c;
            if (i10 != -1 || this.f58072d != -1) {
                if (i10 == -1) {
                    j.this.J(this.f58072d);
                } else {
                    int i11 = this.f58072d;
                    if (i11 == -1) {
                        j.this.G(i10, -1, -1);
                    } else {
                        j.this.H(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f58070b)) {
                if (Float.isNaN(this.f58069a)) {
                    return;
                }
                j.this.setProgress(this.f58069a);
                return;
            }
            j.this.F(this.f58069a, this.f58070b);
            this.f58069a = Float.NaN;
            this.f58070b = Float.NaN;
            this.f58071c = -1;
            this.f58072d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f58069a);
            bundle.putFloat("motion.velocity", this.f58070b);
            bundle.putInt("motion.StartState", this.f58071c);
            bundle.putInt("motion.EndState", this.f58072d);
            return bundle;
        }

        public void c() {
            this.f58072d = j.this.f58044d0;
            this.f58071c = j.this.f58042b0;
            this.f58070b = j.this.getVelocity();
            this.f58069a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f58072d = i10;
        }

        public void e(float f10) {
            this.f58069a = f10;
        }

        public void f(int i10) {
            this.f58071c = i10;
        }

        public void g(Bundle bundle) {
            this.f58069a = bundle.getFloat("motion.progress");
            this.f58070b = bundle.getFloat("motion.velocity");
            this.f58071c = bundle.getInt("motion.StartState");
            this.f58072d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f58070b = f10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(j jVar, int i10);

        void b(j jVar, int i10, int i11, float f10);

        void c(j jVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        float interpolation;
        boolean z14;
        boolean z15;
        if (this.f58051k0 == -1) {
            this.f58051k0 = getNanoTime();
        }
        float f10 = this.f58050j0;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f58043c0 = -1;
        }
        if (this.f58065y0 || (this.f58054n0 && (z10 || this.f58052l0 != f10))) {
            float signum = Math.signum(this.f58052l0 - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.V;
            float f11 = !(interpolator instanceof i) ? ((((float) (nanoTime - this.f58051k0)) * signum) * 1.0E-9f) / this.f58048h0 : 0.0f;
            float f12 = this.f58050j0 + f11;
            if (this.f58053m0) {
                f12 = this.f58052l0;
            }
            int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i11 <= 0 || f12 < this.f58052l0) && (signum > 0.0f || f12 > this.f58052l0)) {
                z11 = false;
            } else {
                f12 = this.f58052l0;
                this.f58054n0 = false;
                z11 = true;
            }
            this.f58050j0 = f12;
            this.f58049i0 = f12;
            this.f58051k0 = nanoTime;
            if (interpolator != null && !z11) {
                if (this.f58057q0) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.f58047g0)) * 1.0E-9f);
                    Interpolator interpolator2 = this.V;
                    if (interpolator2 != this.f58058r0) {
                        this.f58050j0 = interpolation;
                        this.f58051k0 = nanoTime;
                        if (interpolator2 instanceof i) {
                            float a10 = ((i) interpolator2).a();
                            this.f58041a0 = a10;
                            int i12 = ((Math.abs(a10) * this.f58048h0) > 1.0E-5f ? 1 : ((Math.abs(a10) * this.f58048h0) == 1.0E-5f ? 0 : -1));
                            if (a10 <= 0.0f || interpolation < 1.0f) {
                                z14 = false;
                            } else {
                                this.f58050j0 = 1.0f;
                                z14 = false;
                                this.f58054n0 = false;
                                interpolation = 1.0f;
                            }
                            if (a10 < 0.0f && interpolation <= 0.0f) {
                                this.f58050j0 = 0.0f;
                                this.f58054n0 = z14;
                                f12 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.V;
                    if (interpolator3 instanceof i) {
                        this.f58041a0 = ((i) interpolator3).a();
                    } else {
                        this.f58041a0 = ((interpolator3.getInterpolation(f12 + f11) - interpolation) * signum) / f11;
                    }
                }
                f12 = interpolation;
            } else {
                this.f58041a0 = f11;
            }
            if (Math.abs(this.f58041a0) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((i11 > 0 && f12 >= this.f58052l0) || (signum <= 0.0f && f12 <= this.f58052l0)) {
                f12 = this.f58052l0;
                this.f58054n0 = false;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                z12 = 0;
                this.f58054n0 = false;
                setState(e.FINISHED);
            } else {
                z12 = 0;
            }
            int childCount = getChildCount();
            this.f58065y0 = z12;
            long nanoTime2 = getNanoTime();
            this.H0 = f12;
            Interpolator interpolator4 = this.W;
            float interpolation2 = interpolator4 == null ? f12 : interpolator4.getInterpolation(f12);
            Interpolator interpolator5 = this.W;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.f58048h0) + f12);
                this.f58041a0 = interpolation3;
                this.f58041a0 = interpolation3 - this.W.getInterpolation(f12);
            }
            for (int i13 = z12; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = this.f58046f0.get(childAt);
                if (gVar != null) {
                    this.f58065y0 = gVar.c(childAt, interpolation2, nanoTime2, this.I0) | this.f58065y0;
                }
            }
            boolean z16 = (i11 > 0 && f12 >= this.f58052l0) || (signum <= 0.0f && f12 <= this.f58052l0);
            if (!this.f58065y0 && !this.f58054n0 && z16) {
                setState(e.FINISHED);
            }
            if (this.G0) {
                requestLayout();
            }
            z13 = true;
            boolean z17 = this.f58065y0 | (!z16);
            this.f58065y0 = z17;
            if (f12 <= 0.0f && (i10 = this.f58042b0) != -1 && this.f58043c0 != i10) {
                this.f58043c0 = i10;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i14 = this.f58043c0;
                int i15 = this.f58044d0;
                if (i14 != i15) {
                    this.f58043c0 = i15;
                    throw null;
                }
            }
            if (z17 || this.f58054n0) {
                invalidate();
            } else if ((i11 > 0 && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f)) {
                setState(e.FINISHED);
            }
            if (!this.f58065y0 && !this.f58054n0 && ((i11 > 0 && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f))) {
                D();
            }
        } else {
            z13 = true;
        }
        float f13 = this.f58050j0;
        if (f13 >= 1.0f) {
            int i16 = this.f58043c0;
            int i17 = this.f58044d0;
            if (i16 == i17) {
                z13 = false;
            }
            this.f58043c0 = i17;
        } else if (f13 <= 0.0f) {
            int i18 = this.f58043c0;
            int i19 = this.f58042b0;
            if (i18 == i19) {
                z13 = false;
            }
            this.f58043c0 = i19;
        } else {
            z15 = false;
            this.R0 |= z15;
            if (z15 && !this.J0) {
                requestLayout();
            }
            this.f58049i0 = this.f58050j0;
        }
        z15 = z13;
        this.R0 |= z15;
        if (z15) {
            requestLayout();
        }
        this.f58049i0 = this.f58050j0;
    }

    public final void B() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f58055o0 == null && ((copyOnWriteArrayList = this.C0) == null || copyOnWriteArrayList.isEmpty())) || this.E0 == this.f58049i0) {
            return;
        }
        if (this.D0 != -1) {
            d dVar = this.f58055o0;
            if (dVar != null) {
                dVar.c(this, this.f58042b0, this.f58044d0);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.C0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, this.f58042b0, this.f58044d0);
                }
            }
            this.F0 = true;
        }
        this.D0 = -1;
        float f10 = this.f58049i0;
        this.E0 = f10;
        d dVar2 = this.f58055o0;
        if (dVar2 != null) {
            dVar2.b(this, this.f58042b0, this.f58044d0, f10);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.C0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this, this.f58042b0, this.f58044d0, this.f58049i0);
            }
        }
        this.F0 = true;
    }

    public void C() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f58055o0 != null || ((copyOnWriteArrayList = this.C0) != null && !copyOnWriteArrayList.isEmpty())) && this.D0 == -1) {
            this.D0 = this.f58043c0;
            if (this.S0.isEmpty()) {
                i10 = -1;
            } else {
                ArrayList<Integer> arrayList = this.S0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.f58043c0;
            if (i10 != i11 && i11 != -1) {
                this.S0.add(Integer.valueOf(i11));
            }
        }
        E();
        Runnable runnable = this.L0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.M0;
        if (iArr == null || this.N0 <= 0) {
            return;
        }
        J(iArr[0]);
        int[] iArr2 = this.M0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.N0--;
    }

    public void D() {
    }

    public final void E() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.f58055o0 == null && ((copyOnWriteArrayList = this.C0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.F0 = false;
        Iterator<Integer> it = this.S0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            d dVar = this.f58055o0;
            if (dVar != null) {
                dVar.a(this, next.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.C0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, next.intValue());
                }
            }
        }
        this.S0.clear();
    }

    public void F(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new c();
            }
            this.K0.e(f10);
            this.K0.h(f11);
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.f58041a0 = f11;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            z(i10 > 0 ? 1.0f : 0.0f);
        } else if (f10 == 0.0f || f10 == 1.0f) {
        } else {
            z(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void G(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.f58043c0 = i10;
        this.f58042b0 = -1;
        this.f58044d0 = -1;
        x2.a aVar = this.G;
        if (aVar != null) {
            aVar.d(i10, i11, i12);
        }
    }

    public void H(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.K0 == null) {
            this.K0 = new c();
        }
        this.K0.f(i10);
        this.K0.d(i11);
    }

    public void I() {
        z(1.0f);
        this.L0 = null;
    }

    public void J(int i10) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new c();
            }
            this.K0.d(i10);
            return;
        }
        K(i10, -1, -1);
    }

    public void K(int i10, int i11, int i12) {
        L(i10, i11, i12, -1);
    }

    public void L(int i10, int i11, int i12, int i13) {
        int i14 = this.f58043c0;
        if (i14 == i10) {
            return;
        }
        if (this.f58042b0 == i10) {
            z(0.0f);
            if (i13 > 0) {
                this.f58048h0 = i13 / 1000.0f;
            }
        } else if (this.f58044d0 == i10) {
            z(1.0f);
            if (i13 > 0) {
                this.f58048h0 = i13 / 1000.0f;
            }
        } else {
            this.f58044d0 = i10;
            if (i14 != -1) {
                H(i14, i10);
                z(1.0f);
                this.f58050j0 = 0.0f;
                I();
                if (i13 > 0) {
                    this.f58048h0 = i13 / 1000.0f;
                    return;
                }
                return;
            }
            this.f58057q0 = false;
            this.f58052l0 = 1.0f;
            this.f58049i0 = 0.0f;
            this.f58050j0 = 0.0f;
            this.f58051k0 = getNanoTime();
            this.f58047g0 = getNanoTime();
            this.f58053m0 = false;
            this.V = null;
            if (i13 == -1) {
                throw null;
            }
            this.f58042b0 = -1;
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.B0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        A(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f58043c0;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public w2.b getDesignTool() {
        if (this.f58059s0 == null) {
            this.f58059s0 = new w2.b(this);
        }
        return this.f58059s0;
    }

    public int getEndState() {
        return this.f58044d0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f58050j0;
    }

    public l getScene() {
        return this.U;
    }

    public int getStartState() {
        return this.f58042b0;
    }

    public float getTargetPosition() {
        return this.f58052l0;
    }

    public Bundle getTransitionState() {
        if (this.K0 == null) {
            this.K0 = new c();
        }
        this.K0.c();
        return this.K0.b();
    }

    public long getTransitionTimeMs() {
        return this.f58048h0 * 1000.0f;
    }

    public float getVelocity() {
        return this.f58041a0;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void o(int i10) {
        this.G = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            this.O0 = display.getRotation();
        }
        D();
        c cVar = this.K0;
        if (cVar != null) {
            if (this.P0) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.J0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.J0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o3.t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // o3.r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // o3.r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // o3.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f58060t0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f58060t0 = false;
    }

    @Override // o3.r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f58063w0 = getNanoTime();
        this.f58064x0 = 0.0f;
        this.f58061u0 = 0.0f;
        this.f58062v0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // o3.r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // o3.r
    public void onStopNestedScroll(View view, int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.C0 == null) {
                this.C0 = new CopyOnWriteArrayList<>();
            }
            this.C0.add(hVar);
            if (hVar.v()) {
                if (this.f58066z0 == null) {
                    this.f58066z0 = new ArrayList<>();
                }
                this.f58066z0.add(hVar);
            }
            if (hVar.u()) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList<>();
                }
                this.A0.add(hVar);
            }
            if (hVar.t()) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList<>();
                }
                this.B0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f58066z0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.A0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.G0) {
            int i10 = this.f58043c0;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f58056p0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.P0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f58045e0 = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.A0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.A0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f58066z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f58066z0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new c();
            }
            this.K0.e(f10);
        } else if (i10 <= 0) {
            if (this.f58050j0 == 1.0f && this.f58043c0 == this.f58044d0) {
                setState(e.MOVING);
            }
            this.f58043c0 = this.f58042b0;
            if (this.f58050j0 == 0.0f) {
                setState(e.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.f58050j0 == 0.0f && this.f58043c0 == this.f58042b0) {
                setState(e.MOVING);
            }
            this.f58043c0 = this.f58044d0;
            if (this.f58050j0 == 1.0f) {
                setState(e.FINISHED);
            }
        } else {
            this.f58043c0 = -1;
            setState(e.MOVING);
        }
    }

    public void setScene(l lVar) {
        m();
        throw null;
    }

    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new c();
            }
            this.K0.f(i10);
            this.K0.d(i10);
            return;
        }
        this.f58043c0 = i10;
    }

    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f58043c0 == -1) {
            return;
        }
        e eVar3 = this.Q0;
        this.Q0 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            B();
        }
        int i10 = b.f58068a[eVar3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && eVar == eVar2) {
                C();
                return;
            }
            return;
        }
        if (eVar == eVar4) {
            B();
        }
        if (eVar == eVar2) {
            C();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.f58055o0 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.K0 == null) {
            this.K0 = new c();
        }
        this.K0.g(bundle);
        if (isAttachedToWindow()) {
            this.K0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        String a10 = w2.a.a(context, this.f58042b0);
        String a11 = w2.a.a(context, this.f58044d0);
        float f10 = this.f58050j0;
        float f11 = this.f58041a0;
        StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 47 + String.valueOf(a11).length());
        sb2.append(a10);
        sb2.append("->");
        sb2.append(a11);
        sb2.append(" (pos:");
        sb2.append(f10);
        sb2.append(" Dpos/Dt:");
        sb2.append(f11);
        return sb2.toString();
    }

    public void z(float f10) {
    }
}

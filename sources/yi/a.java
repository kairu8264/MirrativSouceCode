package yi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o3.c0;

/* loaded from: classes3.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    public Runnable f62011d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f62012e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f62013f;

    /* renamed from: g  reason: collision with root package name */
    public int f62014g;

    /* renamed from: h  reason: collision with root package name */
    public int f62015h;

    /* renamed from: i  reason: collision with root package name */
    public int f62016i;

    /* renamed from: j  reason: collision with root package name */
    public VelocityTracker f62017j;

    /* renamed from: yi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC1061a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final CoordinatorLayout f62018w;

        /* renamed from: x  reason: collision with root package name */
        public final V f62019x;

        public RunnableC1061a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f62018w = coordinatorLayout;
            this.f62019x = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f62019x == null || (overScroller = a.this.f62012e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.P(this.f62018w, this.f62019x, aVar.f62012e.getCurrY());
                c0.j0(this.f62019x, this);
                return;
            }
            a.this.N(this.f62018w, this.f62019x);
        }
    }

    public a() {
        this.f62014g = -1;
        this.f62016i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f62014g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f62015h = r12
            goto L4c
        L2d:
            int r0 = r11.f62014g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f62015h
            int r7 = r1 - r0
            r11.f62015h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f62017j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f62017j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f62017j
            int r4 = r11.f62014g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f62013f = r3
            r11.f62014g = r1
            android.view.VelocityTracker r13 = r11.f62017j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f62017j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f62017j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f62013f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean H(V v10) {
        return false;
    }

    public final void I() {
        if (this.f62017j == null) {
            this.f62017j = VelocityTracker.obtain();
        }
    }

    public final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f62011d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f62011d = null;
        }
        if (this.f62012e == null) {
            this.f62012e = new OverScroller(v10.getContext());
        }
        this.f62012e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f62012e.computeScrollOffset()) {
            RunnableC1061a runnableC1061a = new RunnableC1061a(coordinatorLayout, v10);
            this.f62011d = runnableC1061a;
            c0.j0(v10, runnableC1061a);
            return true;
        }
        N(coordinatorLayout, v10);
        return false;
    }

    public int K(V v10) {
        return -v10.getHeight();
    }

    public int L(V v10) {
        return v10.getHeight();
    }

    public int M() {
        return E();
    }

    public void N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int E = E();
        if (i11 == 0 || E < i11 || E > i12 || E == (b10 = i3.a.b(i10, i11, i12))) {
            return 0;
        }
        G(b10);
        return E - b10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f62016i < 0) {
            this.f62016i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f62013f) {
            int i10 = this.f62014g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f62015h) > this.f62016i) {
                this.f62015h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f62014g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(v10) && coordinatorLayout.v(v10, x10, y11);
            this.f62013f = z10;
            if (z10) {
                this.f62015h = y11;
                this.f62014g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f62012e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f62012e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f62017j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62014g = -1;
        this.f62016i = -1;
    }
}

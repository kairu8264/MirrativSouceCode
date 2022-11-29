package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class r extends RecyclerView.a0 {

    /* renamed from: k  reason: collision with root package name */
    public PointF f16328k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f16329l;

    /* renamed from: n  reason: collision with root package name */
    public float f16331n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f16326i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f16327j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f16330m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f16332o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f16333p = 0;

    public r(Context context) {
        this.f16329l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f16330m) {
            this.f16331n = v(this.f16329l);
            this.f16330m = true;
        }
        return this.f16331n;
    }

    public int B() {
        PointF pointF = this.f16328k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.a0.a aVar) {
        PointF a10 = a(f());
        if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
            i(a10);
            this.f16328k = a10;
            this.f16332o = (int) (a10.x * 10000.0f);
            this.f16333p = (int) (a10.y * 10000.0f);
            aVar.d((int) (this.f16332o * 1.2f), (int) (this.f16333p * 1.2f), (int) (x(10000) * 1.2f), this.f16326i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void l(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f16332o = y(this.f16332o, i10);
        int y10 = y(this.f16333p, i11);
        this.f16333p = y10;
        if (this.f16332o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void n() {
        this.f16333p = 0;
        this.f16332o = 0;
        this.f16328k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((t10 * t10) + (u10 * u10)));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f16327j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public int t(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 == null || !e10.v()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e10.b0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e10.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e10.getPaddingLeft(), e10.v0() - e10.getPaddingRight(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p e10 = e();
        if (e10 == null || !e10.w()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e10.f0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e10.Z(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e10.getPaddingTop(), e10.h0() - e10.getPaddingBottom(), i10);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    public final int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    public int z() {
        PointF pointF = this.f16328k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}

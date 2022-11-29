package sd;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import de.n;
import jo.p;

/* loaded from: classes2.dex */
public class a extends RelativeLayout {
    public WindowManager A;
    public Rect B;
    public int C;
    public int D;
    public int E;
    public int F;

    /* renamed from: w  reason: collision with root package name */
    public Context f52652w;

    /* renamed from: x  reason: collision with root package name */
    public WindowManager.LayoutParams f52653x;

    /* renamed from: y  reason: collision with root package name */
    public final int f52654y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f52655z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        p.h(context, "mContext");
        this.f52652w = context;
        Object systemService = getContext().getSystemService("window");
        p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.A = (WindowManager) systemService;
        int b10 = n.b(this, 12);
        this.f52654y = b10 * b10;
    }

    public final Point getCurrentViewLocation() {
        return new Point(getMLayoutParams().x, getMLayoutParams().y);
    }

    public final Context getMContext() {
        return this.f52652w;
    }

    public final WindowManager.LayoutParams getMLayoutParams() {
        WindowManager.LayoutParams layoutParams = this.f52653x;
        if (layoutParams != null) {
            return layoutParams;
        }
        p.v("mLayoutParams");
        return null;
    }

    public final WindowManager getMWindowManager() {
        return this.A;
    }

    public final void i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.A.getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        Context context = getContext();
        p.g(context, "context");
        Rect rect = new Rect(0, 0, i10, i11 - of.e.b(context));
        Rect rect2 = new Rect();
        n(rect2);
        if (this.B == null) {
            this.B = new Rect();
        }
        Rect rect3 = this.B;
        p.e(rect3);
        rect3.set(rect.left + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    public final boolean j(int i10, int i11) {
        int i12 = i10 - this.C;
        int i13 = i11 - this.D;
        return (i12 * i12) + (i13 * i13) > this.f52654y;
    }

    public final int k() {
        return (getMLayoutParams().gravity & 80) != 80 ? 1 : -1;
    }

    public void l() {
        if (isShown()) {
            this.A.removeView(this);
        }
    }

    public void m(int i10, int i11) {
        if (!this.f52655z) {
            if (j(i10, i11)) {
                this.f52655z = true;
            } else {
                this.f52655z = false;
                return;
            }
        }
        float f10 = i10 - this.E;
        float k10 = (i11 - this.F) * k();
        if (p()) {
            u(getMLayoutParams().x + f10, getMLayoutParams().y + k10);
        } else {
            getMLayoutParams().x += (int) f10;
            getMLayoutParams().y += (int) k10;
        }
        this.E = i10;
        this.F = i11;
        w();
    }

    public void n(Rect rect) {
        p.h(rect, "outMargins");
        rect.set(0, 0, getWidth(), getHeight());
    }

    public final boolean o() {
        return this.f52655z;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (p()) {
            i();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (p()) {
            i();
        }
    }

    public final boolean p() {
        return this.B != null;
    }

    public final int q() {
        return 2038;
    }

    public void r(int i10, int i11) {
        getMLayoutParams().x = i10;
        getMLayoutParams().y = i11;
        w();
    }

    public final void s(int i10, int i11) {
        this.f52655z = false;
        this.C = i10;
        this.D = i11;
        this.E = i10;
        this.F = i11;
    }

    public final void setCurrentViewLocation(Point point) {
        p.h(point, "location");
        if (p()) {
            u(point.x, point.y);
        } else {
            getMLayoutParams().x = point.x;
            getMLayoutParams().y = point.y;
        }
        w();
    }

    public final void setMContext(Context context) {
        p.h(context, "<set-?>");
        this.f52652w = context;
    }

    public final void setMLayoutParams(WindowManager.LayoutParams layoutParams) {
        p.h(layoutParams, "<set-?>");
        this.f52653x = layoutParams;
    }

    public final void setMWindowManager(WindowManager windowManager) {
        p.h(windowManager, "<set-?>");
        this.A = windowManager;
    }

    public final void setMoved(boolean z10) {
        this.f52655z = z10;
    }

    public final void t() {
        i();
        int i10 = getMLayoutParams().x;
        int i11 = getMLayoutParams().y;
        u(i10, i11);
        if (i10 == getMLayoutParams().x && i11 == getMLayoutParams().y) {
            return;
        }
        w();
    }

    public final void u(float f10, float f11) {
        WindowManager.LayoutParams mLayoutParams = getMLayoutParams();
        Rect rect = this.B;
        p.e(rect);
        Rect rect2 = this.B;
        p.e(rect2);
        mLayoutParams.x = (int) Math.max(rect.left, Math.min(f10, rect2.right));
        WindowManager.LayoutParams mLayoutParams2 = getMLayoutParams();
        Rect rect3 = this.B;
        p.e(rect3);
        Rect rect4 = this.B;
        p.e(rect4);
        mLayoutParams2.y = (int) Math.max(rect3.top, Math.min(f11, rect4.bottom));
    }

    public void v() {
        try {
            if (isShown()) {
                return;
            }
            this.A.addView(this, getMLayoutParams());
        } catch (WindowManager.BadTokenException e10) {
            g9.a.c(e10);
        }
    }

    public void w() {
        if (isShown()) {
            this.A.updateViewLayout(this, getMLayoutParams());
        }
    }
}

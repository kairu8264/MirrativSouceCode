package kj;

import android.content.Context;
import android.graphics.Color;
import qj.b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38828b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38829c;

    /* renamed from: d  reason: collision with root package name */
    public final float f38830d;

    public a(Context context) {
        this.f38827a = b.b(context, wi.b.f58781r, false);
        this.f38828b = hj.a.a(context, wi.b.f58780q, 0);
        this.f38829c = hj.a.a(context, wi.b.f58778o, 0);
        this.f38830d = context.getResources().getDisplayMetrics().density;
    }

    public float a(float f10) {
        float f11 = this.f38830d;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        float a10 = a(f10);
        return f3.a.k(hj.a.g(f3.a.k(i10, 255), this.f38828b, a10), Color.alpha(i10));
    }

    public int c(int i10, float f10) {
        return (this.f38827a && f(i10)) ? b(i10, f10) : i10;
    }

    public int d(float f10) {
        return c(this.f38829c, f10);
    }

    public boolean e() {
        return this.f38827a;
    }

    public final boolean f(int i10) {
        return f3.a.k(i10, 255) == this.f38829c;
    }
}

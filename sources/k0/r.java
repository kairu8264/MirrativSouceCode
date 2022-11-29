package k0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c1.c0;
import c1.e0;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends RippleDrawable {
    public static final a A = new a(null);
    public static Method B;
    public static boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f38359w;

    /* renamed from: x  reason: collision with root package name */
    public c0 f38360x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f38361y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f38362z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38363a = new b();

        public final void a(RippleDrawable rippleDrawable, int i10) {
            jo.p.h(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i10);
        }
    }

    public r(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f38359w = z10;
    }

    public final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return c0.k(j10, po.n.h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long a10 = a(j10, f10);
        c0 c0Var = this.f38360x;
        if (c0Var == null ? false : c0.m(c0Var.u(), a10)) {
            return;
        }
        this.f38360x = c0.g(a10);
        setColor(ColorStateList.valueOf(e0.i(a10)));
    }

    public final void c(int i10) {
        Integer num = this.f38361y;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f38361y = Integer.valueOf(i10);
        if (Build.VERSION.SDK_INT < 23) {
            try {
                if (!C) {
                    C = true;
                    B = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                }
                Method method = B;
                if (method != null) {
                    method.invoke(this, Integer.valueOf(i10));
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        b.f38363a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f38359w) {
            this.f38362z = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        jo.p.g(dirtyBounds, "super.getDirtyBounds()");
        this.f38362z = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f38362z;
    }
}

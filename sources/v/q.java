package v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f56307a = new q();

    public final EdgeEffect a(Context context, AttributeSet attributeSet) {
        jo.p.h(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f56164a.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        jo.p.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f56164a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        jo.p.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        jo.p.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return c.f56164a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }
}

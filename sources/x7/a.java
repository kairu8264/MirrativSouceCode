package x7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import e3.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f59771a = true;

    public static Drawable a(Context context, int i10, Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, int i10) {
        return c(context, context2, i10, null);
    }

    public static Drawable c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f59771a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return c3.a.f(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f59771a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    public static Drawable d(Context context, int i10, Resources.Theme theme) {
        return h.f(context.getResources(), i10, theme);
    }

    public static Drawable e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            context = new j.d(context, theme);
        }
        return f.a.b(context, i10);
    }
}

package o6;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {
    public static final Drawable a(Context context, int i10) {
        Drawable b10 = f.a.b(context, i10);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(jo.p.o("Invalid resource ID: ", Integer.valueOf(i10)).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable f10 = e3.h.f(resources, i10, theme);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException(jo.p.o("Invalid resource ID: ", Integer.valueOf(i10)).toString());
    }

    public static final androidx.lifecycle.o c(Context context) {
        while (!(context instanceof androidx.lifecycle.u)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((androidx.lifecycle.u) context).g();
    }

    public static final Drawable d(Context context, Resources resources, int i10) {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            if (Build.VERSION.SDK_INT < 24) {
                String name = xml.getName();
                if (jo.p.c(name, "vector")) {
                    return h5.i.c(resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
                if (jo.p.c(name, "animated-vector")) {
                    return h5.c.a(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
            }
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return c3.a.a(context, str) == 0;
    }
}

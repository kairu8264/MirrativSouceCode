package v1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.platform.z;
import c1.k0;
import g1.s;
import jo.p;
import l0.i;
import so.o;
import v1.d;

/* loaded from: classes.dex */
public final class e {
    public static final k0 a(Resources resources, int i10) {
        return c.a(k0.f18703a, resources, i10);
    }

    public static final g1.c b(Resources.Theme theme, Resources resources, int i10, i iVar, int i11) {
        iVar.x(2112503116);
        d dVar = (d) iVar.G(z.h());
        d.b bVar = new d.b(theme, i10);
        d.a b10 = dVar.b(bVar);
        if (b10 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            p.g(xml, "res.getXml(id)");
            if (p.c(h1.c.j(xml).getName(), "vector")) {
                b10 = g.a(theme, resources, xml);
                dVar.d(bVar, b10);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        g1.c b11 = b10.b();
        iVar.O();
        return b11;
    }

    public static final f1.d c(int i10, i iVar, int i11) {
        f1.d aVar;
        iVar.x(473971343);
        Context context = (Context) iVar.G(z.g());
        Resources resources = context.getResources();
        iVar.x(-492369756);
        Object y10 = iVar.y();
        i.a aVar2 = i.f39065a;
        if (y10 == aVar2.a()) {
            y10 = new TypedValue();
            iVar.q(y10);
        }
        iVar.O();
        TypedValue typedValue = (TypedValue) y10;
        boolean z10 = true;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !o.L(charSequence, ".xml", false, 2, null)) {
            z10 = false;
        }
        if (z10) {
            iVar.x(-738265321);
            Resources.Theme theme = context.getTheme();
            p.g(theme, "context.theme");
            p.g(resources, "res");
            aVar = s.b(b(theme, resources, i10, iVar, ((i11 << 6) & 896) | 72), iVar, 0);
            iVar.O();
        } else {
            iVar.x(-738265196);
            Object valueOf = Integer.valueOf(i10);
            iVar.x(511388516);
            boolean P = iVar.P(valueOf) | iVar.P(charSequence);
            Object y11 = iVar.y();
            if (P || y11 == aVar2.a()) {
                p.g(resources, "res");
                y11 = a(resources, i10);
                iVar.q(y11);
            }
            iVar.O();
            aVar = new f1.a((k0) y11, 0L, 0L, 6, null);
            iVar.O();
        }
        iVar.O();
        return aVar;
    }
}

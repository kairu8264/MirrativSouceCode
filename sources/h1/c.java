package h1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import c1.c0;
import c1.e0;
import c1.i1;
import c1.j1;
import c1.k1;
import c1.r;
import c1.u;
import c1.v;
import c1.w0;
import e3.d;
import e3.i;
import g1.c;
import g1.f;
import java.util.List;
import jo.p;
import m2.g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34423a = 0;

    public static final c.a a(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long e10;
        int z10;
        p.h(aVar, "<this>");
        p.h(resources, "res");
        p.h(attributeSet, "attrs");
        b bVar = b.f34397a;
        TypedArray l10 = aVar.l(resources, theme, attributeSet, bVar.F());
        boolean e11 = aVar.e(l10, "autoMirrored", bVar.a(), false);
        float h10 = aVar.h(l10, "viewportWidth", bVar.H(), 0.0f);
        float h11 = aVar.h(l10, "viewportHeight", bVar.G(), 0.0f);
        if (h10 <= 0.0f) {
            throw new XmlPullParserException(l10.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (h11 > 0.0f) {
            float b10 = aVar.b(l10, bVar.I(), 0.0f);
            float b11 = aVar.b(l10, bVar.n(), 0.0f);
            if (l10.hasValue(bVar.D())) {
                TypedValue typedValue = new TypedValue();
                l10.getValue(bVar.D(), typedValue);
                if (typedValue.type == 2) {
                    e10 = c0.f18634b.e();
                } else {
                    ColorStateList f10 = aVar.f(l10, theme, "tint", bVar.D());
                    if (f10 != null) {
                        e10 = e0.b(f10.getDefaultColor());
                    } else {
                        e10 = c0.f18634b.e();
                    }
                }
            } else {
                e10 = c0.f18634b.e();
            }
            long j10 = e10;
            int d10 = aVar.d(l10, bVar.E(), -1);
            if (d10 == -1) {
                z10 = r.f18740b.z();
            } else if (d10 == 3) {
                z10 = r.f18740b.B();
            } else if (d10 == 5) {
                z10 = r.f18740b.z();
            } else if (d10 != 9) {
                switch (d10) {
                    case 14:
                        z10 = r.f18740b.q();
                        break;
                    case 15:
                        z10 = r.f18740b.v();
                        break;
                    case 16:
                        z10 = r.f18740b.t();
                        break;
                    default:
                        z10 = r.f18740b.z();
                        break;
                }
            } else {
                z10 = r.f18740b.y();
            }
            int i10 = z10;
            float l11 = g.l(b10 / resources.getDisplayMetrics().density);
            float l12 = g.l(b11 / resources.getDisplayMetrics().density);
            l10.recycle();
            return new c.a(null, l11, l12, h10, h11, j10, i10, e11, 1, null);
        } else {
            throw new XmlPullParserException(l10.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    public static final int b(int i10, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? i11 : j1.f18697b.c();
            }
            return j1.f18697b.b();
        }
        return j1.f18697b.a();
    }

    public static final int c(int i10, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? i11 : k1.f18705b.a();
            }
            return k1.f18705b.c();
        }
        return k1.f18705b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        p.h(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static final u e(d dVar) {
        if (dVar.l()) {
            Shader f10 = dVar.f();
            if (f10 != null) {
                return v.a(f10);
            }
            return new i1(e0.b(dVar.e()), null);
        }
        return null;
    }

    public static final void f(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) {
        p.h(aVar, "<this>");
        p.h(resources, "res");
        p.h(attributeSet, "attrs");
        p.h(aVar2, "builder");
        b bVar = b.f34397a;
        TypedArray l10 = aVar.l(resources, theme, attributeSet, bVar.b());
        String j10 = aVar.j(l10, bVar.c());
        if (j10 == null) {
            j10 = "";
        }
        List<f> a10 = g1.p.a(aVar.j(l10, bVar.d()));
        l10.recycle();
        aVar2.a((r20 & 1) != 0 ? "" : j10, (r20 & 2) != 0 ? 0.0f : 0.0f, (r20 & 4) != 0 ? 0.0f : 0.0f, (r20 & 8) != 0 ? 0.0f : 0.0f, (r20 & 16) != 0 ? 1.0f : 0.0f, (r20 & 32) == 0 ? 0.0f : 1.0f, (r20 & 64) != 0 ? 0.0f : 0.0f, (r20 & 128) == 0 ? 0.0f : 0.0f, (r20 & 256) != 0 ? g1.p.e() : a10);
    }

    public static final int g(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, c.a aVar2, int i10) {
        p.h(aVar, "<this>");
        p.h(resources, "res");
        p.h(attributeSet, "attrs");
        p.h(aVar2, "builder");
        int eventType = aVar.k().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && p.c("group", aVar.k().getName())) {
                int i11 = i10 + 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    aVar2.g();
                }
                return 0;
            }
            return i10;
        }
        String name = aVar.k().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode == -1649314686) {
                if (name.equals("clip-path")) {
                    f(aVar, resources, theme, attributeSet, aVar2);
                    return i10 + 1;
                }
                return i10;
            } else if (hashCode == 3433509) {
                if (name.equals("path")) {
                    i(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                }
                return i10;
            } else if (hashCode == 98629247 && name.equals("group")) {
                h(aVar, resources, theme, attributeSet, aVar2);
                return i10;
            } else {
                return i10;
            }
        }
        return i10;
    }

    public static final void h(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) {
        p.h(aVar, "<this>");
        p.h(resources, "res");
        p.h(attributeSet, "attrs");
        p.h(aVar2, "builder");
        b bVar = b.f34397a;
        TypedArray l10 = aVar.l(resources, theme, attributeSet, bVar.e());
        float h10 = aVar.h(l10, "rotation", bVar.i(), 0.0f);
        float c10 = aVar.c(l10, bVar.g(), 0.0f);
        float c11 = aVar.c(l10, bVar.h(), 0.0f);
        float h11 = aVar.h(l10, "scaleX", bVar.j(), 1.0f);
        float h12 = aVar.h(l10, "scaleY", bVar.k(), 1.0f);
        float h13 = aVar.h(l10, "translateX", bVar.l(), 0.0f);
        float h14 = aVar.h(l10, "translateY", bVar.m(), 0.0f);
        String j10 = aVar.j(l10, bVar.f());
        if (j10 == null) {
            j10 = "";
        }
        l10.recycle();
        aVar2.a(j10, h10, c10, c11, h11, h12, h13, h14, g1.p.e());
    }

    public static final void i(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) throws IllegalArgumentException {
        p.h(aVar, "<this>");
        p.h(resources, "res");
        p.h(attributeSet, "attrs");
        p.h(aVar2, "builder");
        b bVar = b.f34397a;
        TypedArray l10 = aVar.l(resources, theme, attributeSet, bVar.o());
        if (i.j(aVar.k(), "pathData")) {
            String j10 = aVar.j(l10, bVar.r());
            if (j10 == null) {
                j10 = "";
            }
            String str = j10;
            List<f> a10 = g1.p.a(aVar.j(l10, bVar.s()));
            d g10 = aVar.g(l10, theme, "fillColor", bVar.q(), 0);
            float h10 = aVar.h(l10, "fillAlpha", bVar.p(), 1.0f);
            int b10 = b(aVar.i(l10, "strokeLineCap", bVar.v(), -1), j1.f18697b.a());
            int c10 = c(aVar.i(l10, "strokeLineJoin", bVar.w(), -1), k1.f18705b.a());
            float h11 = aVar.h(l10, "strokeMiterLimit", bVar.x(), 1.0f);
            d g11 = aVar.g(l10, theme, "strokeColor", bVar.u(), 0);
            float h12 = aVar.h(l10, "strokeAlpha", bVar.t(), 1.0f);
            float h13 = aVar.h(l10, "strokeWidth", bVar.y(), 1.0f);
            float h14 = aVar.h(l10, "trimPathEnd", bVar.z(), 1.0f);
            float h15 = aVar.h(l10, "trimPathOffset", bVar.B(), 0.0f);
            float h16 = aVar.h(l10, "trimPathStart", bVar.C(), 0.0f);
            int i10 = aVar.i(l10, "fillType", bVar.A(), f34423a);
            l10.recycle();
            u e10 = e(g10);
            u e11 = e(g11);
            w0.a aVar3 = w0.f18778b;
            aVar2.c(a10, i10 == 0 ? aVar3.b() : aVar3.a(), str, e10, h10, e11, h12, h13, b10, c10, h11, h16, h14, h15);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        p.h(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}

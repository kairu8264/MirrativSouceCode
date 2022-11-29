package c1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f18735a = new q();

    public static final d1.c a(Bitmap bitmap) {
        d1.c b10;
        jo.p.h(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b10 = b(colorSpace)) == null) ? d1.e.f28963a.r() : b10;
    }

    public static final d1.c b(ColorSpace colorSpace) {
        jo.p.h(colorSpace, "<this>");
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return d1.e.f28963a.r();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return d1.e.f28963a.a();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return d1.e.f28963a.b();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return d1.e.f28963a.c();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return d1.e.f28963a.d();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return d1.e.f28963a.e();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return d1.e.f28963a.f();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return d1.e.f28963a.g();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return d1.e.f28963a.i();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return d1.e.f28963a.j();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return d1.e.f28963a.k();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return d1.e.f28963a.l();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return d1.e.f28963a.m();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return d1.e.f28963a.n();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return d1.e.f28963a.p();
        }
        if (jo.p.c(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            return d1.e.f28963a.q();
        }
        return d1.e.f28963a.r();
    }

    public static final Bitmap c(int i10, int i11, int i12, boolean z10, d1.c cVar) {
        jo.p.h(cVar, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, f.d(i12), z10, d(cVar));
        jo.p.g(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    public static final ColorSpace d(d1.c cVar) {
        ColorSpace.Named named;
        jo.p.h(cVar, "<this>");
        d1.e eVar = d1.e.f28963a;
        if (jo.p.c(cVar, eVar.r())) {
            named = ColorSpace.Named.SRGB;
        } else if (jo.p.c(cVar, eVar.a())) {
            named = ColorSpace.Named.ACES;
        } else if (jo.p.c(cVar, eVar.b())) {
            named = ColorSpace.Named.ACESCG;
        } else if (jo.p.c(cVar, eVar.c())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (jo.p.c(cVar, eVar.d())) {
            named = ColorSpace.Named.BT2020;
        } else if (jo.p.c(cVar, eVar.e())) {
            named = ColorSpace.Named.BT709;
        } else if (jo.p.c(cVar, eVar.f())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (jo.p.c(cVar, eVar.g())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (jo.p.c(cVar, eVar.i())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (jo.p.c(cVar, eVar.j())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (jo.p.c(cVar, eVar.k())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (jo.p.c(cVar, eVar.l())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (jo.p.c(cVar, eVar.m())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (jo.p.c(cVar, eVar.n())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (jo.p.c(cVar, eVar.p())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = jo.p.c(cVar, eVar.q()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        jo.p.g(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}

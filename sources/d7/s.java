package d7;

import android.graphics.Color;
import android.graphics.PointF;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29281a = c.a.a("x", "y");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29282a;

        static {
            int[] iArr = new int[c.b.values().length];
            f29282a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29282a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29282a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(e7.c cVar, float f10) throws IOException {
        cVar.c();
        float n10 = (float) cVar.n();
        float n11 = (float) cVar.n();
        while (cVar.z() != c.b.END_ARRAY) {
            cVar.G();
        }
        cVar.e();
        return new PointF(n10 * f10, n11 * f10);
    }

    public static PointF b(e7.c cVar, float f10) throws IOException {
        float n10 = (float) cVar.n();
        float n11 = (float) cVar.n();
        while (cVar.i()) {
            cVar.G();
        }
        return new PointF(n10 * f10, n11 * f10);
    }

    public static PointF c(e7.c cVar, float f10) throws IOException {
        cVar.d();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.i()) {
            int E = cVar.E(f29281a);
            if (E == 0) {
                f11 = g(cVar);
            } else if (E != 1) {
                cVar.F();
                cVar.G();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.h();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static int d(e7.c cVar) throws IOException {
        cVar.c();
        int n10 = (int) (cVar.n() * 255.0d);
        int n11 = (int) (cVar.n() * 255.0d);
        int n12 = (int) (cVar.n() * 255.0d);
        while (cVar.i()) {
            cVar.G();
        }
        cVar.e();
        return Color.argb(255, n10, n11, n12);
    }

    public static PointF e(e7.c cVar, float f10) throws IOException {
        int i10 = a.f29282a[cVar.z().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return c(cVar, f10);
                }
                throw new IllegalArgumentException("Unknown point starts with " + cVar.z());
            }
            return a(cVar, f10);
        }
        return b(cVar, f10);
    }

    public static List<PointF> f(e7.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        while (cVar.z() == c.b.BEGIN_ARRAY) {
            cVar.c();
            arrayList.add(e(cVar, f10));
            cVar.e();
        }
        cVar.e();
        return arrayList;
    }

    public static float g(e7.c cVar) throws IOException {
        c.b z10 = cVar.z();
        int i10 = a.f29282a[z10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                cVar.c();
                float n10 = (float) cVar.n();
                while (cVar.i()) {
                    cVar.G();
                }
                cVar.e();
                return n10;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + z10);
        }
        return (float) cVar.n();
    }
}

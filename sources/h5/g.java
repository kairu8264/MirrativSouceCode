package h5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public float[] f34465a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f34466b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f34465a = new float[min];
            this.f34466b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((i11 * length) / (min - 1), fArr, null);
                this.f34465a[i11] = fArr[0];
                this.f34466b[i11] = fArr[1];
            }
            if (Math.abs(this.f34465a[0]) <= 1.0E-5d && Math.abs(this.f34466b[0]) <= 1.0E-5d) {
                int i12 = min - 1;
                if (Math.abs(this.f34465a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f34466b[i12] - 1.0f) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f34465a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f34465a[0]);
            sb2.append(",");
            sb2.append(this.f34466b[0]);
            sb2.append(" end:");
            int i15 = min - 1;
            sb2.append(this.f34465a[i15]);
            sb2.append(",");
            sb2.append(this.f34466b[i15]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public final void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (e3.i.j(xmlPullParser, "pathData")) {
            String i10 = e3.i.i(typedArray, xmlPullParser, "pathData", 4);
            Path e10 = f3.d.e(i10);
            if (e10 != null) {
                b(e10);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i10);
        } else if (e3.i.j(xmlPullParser, "controlX1")) {
            if (e3.i.j(xmlPullParser, "controlY1")) {
                float f10 = e3.i.f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float f11 = e3.i.f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean j10 = e3.i.j(xmlPullParser, "controlX2");
                if (j10 != e3.i.j(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!j10) {
                    c(f10, f11);
                    return;
                } else {
                    a(f10, f11, e3.i.f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), e3.i.f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f34465a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f34465a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f34465a;
        float f11 = fArr[length] - fArr[i10];
        if (f11 == 0.0f) {
            return this.f34466b[i10];
        }
        float[] fArr2 = this.f34466b;
        float f12 = fArr2[i10];
        return f12 + (((f10 - fArr[i10]) / f11) * (fArr2[length] - f12));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k10 = e3.i.k(resources, theme, attributeSet, a.f34452l);
        d(k10, xmlPullParser);
        k10.recycle();
    }
}

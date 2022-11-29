package h5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import f3.d;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<d.b[]> {

        /* renamed from: a  reason: collision with root package name */
        public d.b[] f34463a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public d.b[] evaluate(float f10, d.b[] bVarArr, d.b[] bVarArr2) {
            if (f3.d.b(bVarArr, bVarArr2)) {
                if (!f3.d.b(this.f34463a, bVarArr)) {
                    this.f34463a = f3.d.f(bVarArr);
                }
                for (int i10 = 0; i10 < bVarArr.length; i10++) {
                    this.f34463a[i10].d(bVarArr[i10], bVarArr2[i10], f10);
                }
                return this.f34463a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    public static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i16 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i17 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && h(i16)) || (z11 && h(i17))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            d.b[] d10 = f3.d.d(string);
            d.b[] d11 = f3.d.d(string2);
            if (d10 == null && d11 == null) {
                return null;
            }
            if (d10 == null) {
                if (d11 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d11);
                }
                return null;
            }
            a aVar = new a();
            if (d11 != null) {
                if (f3.d.b(d10, d11)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, d10, d11);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d10);
            }
            return ofObject;
        }
        f a10 = i10 == 3 ? f.a() : null;
        if (z12) {
            if (z10) {
                if (i16 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i17 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i17 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i16 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (h(i16)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i17 == 5) {
                    i15 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (h(i17)) {
                    i15 = typedArray.getColor(i12, 0);
                } else {
                    i15 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14, i15);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
            }
        } else if (z11) {
            if (i17 == 5) {
                i13 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (h(i17)) {
                i13 = typedArray.getColor(i12, 0);
            } else {
                i13 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
        }
        if (propertyValuesHolder == null || a10 == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a10);
        return propertyValuesHolder;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z10 = peekValue != null;
        int i12 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z11 = peekValue2 != null;
        return ((z10 && h(i12)) || (z11 && h(z11 ? peekValue2.type : 0))) ? 3 : 0;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34450j);
        int i10 = 0;
        TypedValue l10 = e3.i.l(k10, xmlPullParser, "value", 0);
        if ((l10 != null) && h(l10.type)) {
            i10 = 3;
        }
        k10.recycle();
        return i10;
    }

    public static boolean h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator i(Context context, int i10) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i10);
        }
        return j(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i10) throws Resources.NotFoundException {
        return k(context, resources, theme, i10, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i10);
                    return a(context, resources, theme, xmlResourceParser, f10);
                } catch (IOException e10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e10);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34447g);
        TypedArray k11 = e3.i.k(resources, theme, attributeSet, h5.a.f34451k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k10, k11, f10, xmlPullParser);
        int h10 = e3.i.h(k10, xmlPullParser, "interpolator", 0, 0);
        if (h10 > 0) {
            valueAnimator.setInterpolator(d.b(context, h10));
        }
        k10.recycle();
        if (k11 != null) {
            k11.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34450j);
        float f10 = e3.i.f(k10, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l10 = e3.i.l(k10, xmlPullParser, "value", 0);
        boolean z10 = l10 != null;
        if (i10 == 4) {
            i10 = (z10 && h(l10.type)) ? 3 : 0;
        }
        if (z10) {
            if (i10 != 0) {
                ofInt = (i10 == 1 || i10 == 3) ? Keyframe.ofInt(f10, e3.i.g(k10, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(f10, e3.i.f(k10, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i10 == 0) {
            ofInt = Keyframe.ofFloat(f10);
        } else {
            ofInt = Keyframe.ofInt(f10);
        }
        int h10 = e3.i.h(k10, xmlPullParser, "interpolator", 1, 0);
        if (h10 > 0) {
            ofInt.setInterpolator(d.b(context, h10));
        }
        k10.recycle();
        return ofInt;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m10 = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (m10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m10);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34449i);
                    String i11 = e3.i.i(k10, xmlPullParser, "propertyName", 3);
                    int g10 = e3.i.g(k10, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder o10 = o(context, resources, theme, xmlPullParser, i11, g10);
                    if (o10 == null) {
                        o10 = e(k10, g10, 0, 1, i11);
                    }
                    if (o10 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o10);
                    }
                    k10.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long g10 = e3.i.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g11 = e3.i.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g12 = e3.i.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (e3.i.j(xmlPullParser, "valueFrom") && e3.i.j(xmlPullParser, "valueTo")) {
            if (g12 == 4) {
                g12 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e10 = e(typedArray, g12, 5, 6, "");
            if (e10 != null) {
                valueAnimator.setValues(e10);
            }
        }
        valueAnimator.setDuration(g10);
        valueAnimator.setStartDelay(g11);
        valueAnimator.setRepeatCount(e3.i.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(e3.i.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g12, f10, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i11 = e3.i.i(typedArray, xmlPullParser, "pathData", 1);
        if (i11 != null) {
            String i12 = e3.i.i(typedArray, xmlPullParser, "propertyXName", 2);
            String i13 = e3.i.i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i10 != 2) {
            }
            if (i12 == null && i13 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            s(f3.d.e(i11), objectAnimator, f10 * 0.5f, i12, i13);
            return;
        }
        objectAnimator.setPropertyName(e3.i.i(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f12 = 0.0f;
        do {
            f12 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f12));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f12 / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f13 = f12 / (min - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f13;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}

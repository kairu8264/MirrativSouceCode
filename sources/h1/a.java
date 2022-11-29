package h1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e3.d;
import e3.i;
import jo.h;
import jo.p;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final XmlPullParser f34395a;

    /* renamed from: b  reason: collision with root package name */
    public int f34396b;

    public a(XmlPullParser xmlPullParser, int i10) {
        p.h(xmlPullParser, "xmlParser");
        this.f34395a = xmlPullParser;
        this.f34396b = i10;
    }

    public final int a() {
        return this.f34396b;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        p.h(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i10, f10);
        m(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int i10, float f10) {
        p.h(typedArray, "typedArray");
        float f11 = typedArray.getFloat(i10, f10);
        m(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int d(TypedArray typedArray, int i10, int i11) {
        p.h(typedArray, "typedArray");
        int i12 = typedArray.getInt(i10, i11);
        m(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean e(TypedArray typedArray, String str, int i10, boolean z10) {
        p.h(typedArray, "typedArray");
        p.h(str, "attrName");
        boolean a10 = i.a(typedArray, this.f34395a, str, i10, z10);
        m(typedArray.getChangingConfigurations());
        return a10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f34395a, aVar.f34395a) && this.f34396b == aVar.f34396b;
        }
        return false;
    }

    public final ColorStateList f(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        p.h(typedArray, "typedArray");
        p.h(str, "attrName");
        ColorStateList c10 = i.c(typedArray, this.f34395a, theme, str, i10);
        m(typedArray.getChangingConfigurations());
        return c10;
    }

    public final d g(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        p.h(typedArray, "typedArray");
        p.h(str, "attrName");
        d e10 = i.e(typedArray, this.f34395a, theme, str, i10, i11);
        m(typedArray.getChangingConfigurations());
        p.g(e10, "result");
        return e10;
    }

    public final float h(TypedArray typedArray, String str, int i10, float f10) {
        p.h(typedArray, "typedArray");
        p.h(str, "attrName");
        float f11 = i.f(typedArray, this.f34395a, str, i10, f10);
        m(typedArray.getChangingConfigurations());
        return f11;
    }

    public int hashCode() {
        return (this.f34395a.hashCode() * 31) + Integer.hashCode(this.f34396b);
    }

    public final int i(TypedArray typedArray, String str, int i10, int i11) {
        p.h(typedArray, "typedArray");
        p.h(str, "attrName");
        int g10 = i.g(typedArray, this.f34395a, str, i10, i11);
        m(typedArray.getChangingConfigurations());
        return g10;
    }

    public final String j(TypedArray typedArray, int i10) {
        p.h(typedArray, "typedArray");
        String string = typedArray.getString(i10);
        m(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser k() {
        return this.f34395a;
    }

    public final TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        p.h(resources, "res");
        p.h(attributeSet, "set");
        p.h(iArr, "attrs");
        TypedArray k10 = i.k(resources, theme, attributeSet, iArr);
        p.g(k10, "obtainAttributes(\n      …          attrs\n        )");
        m(k10.getChangingConfigurations());
        return k10;
    }

    public final void m(int i10) {
        this.f34396b = i10 | this.f34396b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f34395a + ", config=" + this.f34396b + ')';
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, h hVar) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}

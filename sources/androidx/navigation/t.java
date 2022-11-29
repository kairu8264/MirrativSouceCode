package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.i;
import androidx.navigation.m;
import androidx.navigation.u;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f15789c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public Context f15790a;

    /* renamed from: b  reason: collision with root package name */
    public y f15791b;

    public t(Context context, y yVar) {
        this.f15790a = context;
        this.f15791b = yVar;
    }

    public static v a(TypedValue typedValue, v vVar, v vVar2, String str, String str2) throws XmlPullParserException {
        if (vVar == null || vVar == vVar2) {
            return vVar != null ? vVar : vVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final o b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        o a10 = this.f15791b.e(xmlResourceParser.getName()).a();
        a10.w(this.f15790a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, a10, attributeSet, i10);
                } else if ("deepLink".equals(name)) {
                    h(resources, a10, attributeSet);
                } else if (ActionLogBase.ACTION.equals(name)) {
                    d(resources, a10, attributeSet, xmlResourceParser, i10);
                } else if ("include".equals(name) && (a10 instanceof q)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a0.f15688r);
                    ((q) a10).H(c(obtainAttributes.getResourceId(a0.f15689s, 0)));
                    obtainAttributes.recycle();
                } else if (a10 instanceof q) {
                    ((q) a10).H(b(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return a10;
    }

    @SuppressLint({"ResourceType"})
    public q c(int i10) {
        int next;
        Resources resources = this.f15790a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                try {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        }
        if (next == 2) {
            String name = xml.getName();
            o b10 = b(resources, xml, asAttributeSet, i10);
            if (b10 instanceof q) {
                return (q) b10;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final void d(Resources resources, o oVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws IOException, XmlPullParserException {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, s4.a.f52029f);
        int resourceId = obtainAttributes.getResourceId(s4.a.f52030g, 0);
        e eVar = new e(obtainAttributes.getResourceId(s4.a.f52031h, 0));
        u.a aVar = new u.a();
        aVar.d(obtainAttributes.getBoolean(s4.a.f52034k, false));
        aVar.g(obtainAttributes.getResourceId(s4.a.f52037n, -1), obtainAttributes.getBoolean(s4.a.f52038o, false));
        aVar.b(obtainAttributes.getResourceId(s4.a.f52032i, -1));
        aVar.c(obtainAttributes.getResourceId(s4.a.f52033j, -1));
        aVar.e(obtainAttributes.getResourceId(s4.a.f52035l, -1));
        aVar.f(obtainAttributes.getResourceId(s4.a.f52036m, -1));
        eVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i10);
            }
        }
        if (!bundle.isEmpty()) {
            eVar.d(bundle);
        }
        oVar.x(resourceId, eVar);
        obtainAttributes.recycle();
    }

    public final i e(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        i.a aVar = new i.a();
        aVar.c(typedArray.getBoolean(s4.a.f52043t, false));
        ThreadLocal<TypedValue> threadLocal = f15789c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(s4.a.f52042s);
        Object obj = null;
        v<Integer> a10 = string != null ? v.a(string, resources.getResourcePackageName(i10)) : null;
        int i11 = s4.a.f52041r;
        if (typedArray.getValue(i11, typedValue)) {
            v<Integer> vVar = v.f15807c;
            if (a10 == vVar) {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    obj = Integer.valueOf(i12);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    obj = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a10.c() + ". Must be a reference to a resource.");
                }
            } else {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (a10 == null) {
                        a10 = vVar;
                        obj = Integer.valueOf(i13);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a10.c() + ". You must use a \"" + vVar.c() + "\" type to reference other resources.");
                    }
                } else if (a10 == v.f15815k) {
                    obj = typedArray.getString(i11);
                } else {
                    int i14 = typedValue.type;
                    if (i14 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (a10 == null) {
                            a10 = v.d(charSequence);
                        }
                        obj = a10.h(charSequence);
                    } else if (i14 == 4) {
                        a10 = a(typedValue, a10, v.f15811g, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i14 == 5) {
                        a10 = a(typedValue, a10, v.f15806b, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i14 == 18) {
                        a10 = a(typedValue, a10, v.f15813i, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else if (i14 >= 16 && i14 <= 31) {
                        v<Float> vVar2 = v.f15811g;
                        if (a10 == vVar2) {
                            a10 = a(typedValue, a10, vVar2, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            a10 = a(typedValue, a10, v.f15806b, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    } else {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (a10 != null) {
            aVar.d(a10);
        }
        return aVar.a();
    }

    public final void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, s4.a.f52039p);
        String string = obtainAttributes.getString(s4.a.f52040q);
        if (string != null) {
            i e10 = e(obtainAttributes, resources, i10);
            if (e10.b()) {
                e10.c(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    public final void g(Resources resources, o oVar, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, s4.a.f52039p);
        String string = obtainAttributes.getString(s4.a.f52040q);
        if (string != null) {
            oVar.d(string, e(obtainAttributes, resources, i10));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    public final void h(Resources resources, o oVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, s4.a.f52044u);
        String string = obtainAttributes.getString(s4.a.f52047x);
        String string2 = obtainAttributes.getString(s4.a.f52045v);
        String string3 = obtainAttributes.getString(s4.a.f52046w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        m.a aVar = new m.a();
        if (string != null) {
            aVar.d(string.replace("${applicationId}", this.f15790a.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2.replace("${applicationId}", this.f15790a.getPackageName()));
        }
        if (string3 != null) {
            aVar.c(string3.replace("${applicationId}", this.f15790a.getPackageName()));
        }
        oVar.f(aVar.a());
        obtainAttributes.recycle();
    }
}

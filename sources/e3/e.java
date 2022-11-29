package e3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f30185a;

        public b(c[] cVarArr) {
            this.f30185a = cVarArr;
        }

        public c[] a() {
            return this.f30185a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f30186a;

        /* renamed from: b  reason: collision with root package name */
        public int f30187b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f30188c;

        /* renamed from: d  reason: collision with root package name */
        public String f30189d;

        /* renamed from: e  reason: collision with root package name */
        public int f30190e;

        /* renamed from: f  reason: collision with root package name */
        public int f30191f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f30186a = str;
            this.f30187b = i10;
            this.f30188c = z10;
            this.f30189d = str2;
            this.f30190e = i11;
            this.f30191f = i12;
        }

        public String a() {
            return this.f30186a;
        }

        public int b() {
            return this.f30191f;
        }

        public int c() {
            return this.f30190e;
        }

        public String d() {
            return this.f30189d;
        }

        public int e() {
            return this.f30187b;
        }

        public boolean f() {
            return this.f30188c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final l3.d f30192a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30193b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30194c;

        /* renamed from: d  reason: collision with root package name */
        public final String f30195d;

        public d(l3.d dVar, int i10, int i11, String str) {
            this.f30192a = dVar;
            this.f30194c = i10;
            this.f30193b = i11;
            this.f30195d = str;
        }

        public int a() {
            return this.f30194c;
        }

        public l3.d b() {
            return this.f30192a;
        }

        public String c() {
            return this.f30195d;
        }

        public int d() {
            return this.f30193b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i10);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a3.g.f424h);
        String string = obtainAttributes.getString(a3.g.f425i);
        String string2 = obtainAttributes.getString(a3.g.f429m);
        String string3 = obtainAttributes.getString(a3.g.f430n);
        int resourceId = obtainAttributes.getResourceId(a3.g.f426j, 0);
        int integer = obtainAttributes.getInteger(a3.g.f427k, 1);
        int integer2 = obtainAttributes.getInteger(a3.g.f428l, 500);
        String string4 = obtainAttributes.getString(a3.g.f431o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new l3.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    public static c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a3.g.f432p);
        int i10 = a3.g.f441y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = a3.g.f434r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = a3.g.f439w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = a3.g.f435s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = a3.g.f442z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = a3.g.f436t;
        }
        int i14 = a3.g.f440x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = a3.g.f437u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = a3.g.f438v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = a3.g.f433q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

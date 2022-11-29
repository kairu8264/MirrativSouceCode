package x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f59405a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.constraintlayout.widget.c f59406b;

    /* renamed from: c  reason: collision with root package name */
    public int f59407c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f59408d = -1;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<C0989a> f59409e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f59410f = new SparseArray<>();

    /* renamed from: x2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0989a {

        /* renamed from: a  reason: collision with root package name */
        public int f59411a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f59412b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f59413c;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.c f59414d;

        public C0989a(Context context, XmlPullParser xmlPullParser) {
            this.f59413c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.R6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == d.S6) {
                    this.f59411a = obtainStyledAttributes.getResourceId(index, this.f59411a);
                } else if (index == d.T6) {
                    this.f59413c = obtainStyledAttributes.getResourceId(index, this.f59413c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f59413c);
                    context.getResources().getResourceName(this.f59413c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f59414d = cVar;
                        cVar.f(context, this.f59413c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f59412b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f59412b.size(); i10++) {
                if (this.f59412b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f59415a;

        /* renamed from: b  reason: collision with root package name */
        public float f59416b;

        /* renamed from: c  reason: collision with root package name */
        public float f59417c;

        /* renamed from: d  reason: collision with root package name */
        public float f59418d;

        /* renamed from: e  reason: collision with root package name */
        public int f59419e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.constraintlayout.widget.c f59420f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f59415a = Float.NaN;
            this.f59416b = Float.NaN;
            this.f59417c = Float.NaN;
            this.f59418d = Float.NaN;
            this.f59419e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.f59564p7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == d.f59573q7) {
                    this.f59419e = obtainStyledAttributes.getResourceId(index, this.f59419e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f59419e);
                    context.getResources().getResourceName(this.f59419e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f59420f = cVar;
                        cVar.f(context, this.f59419e);
                    }
                } else if (index == d.f59582r7) {
                    this.f59418d = obtainStyledAttributes.getDimension(index, this.f59418d);
                } else if (index == d.f59591s7) {
                    this.f59416b = obtainStyledAttributes.getDimension(index, this.f59416b);
                } else if (index == d.f59600t7) {
                    this.f59417c = obtainStyledAttributes.getDimension(index, this.f59417c);
                } else if (index == d.f59609u7) {
                    this.f59415a = obtainStyledAttributes.getDimension(index, this.f59415a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (Float.isNaN(this.f59415a) || f10 >= this.f59415a) {
                if (Float.isNaN(this.f59416b) || f11 >= this.f59416b) {
                    if (Float.isNaN(this.f59417c) || f10 <= this.f59417c) {
                        return Float.isNaN(this.f59418d) || f11 <= this.f59418d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f59405a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        C0989a c0989a = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z10 = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            z10 = true;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    if (z10) {
                        c0989a = new C0989a(context, xml);
                        this.f59409e.put(c0989a.f59411a, c0989a);
                        continue;
                    } else if (z10) {
                        b bVar = new b(context, xml);
                        if (c0989a != null) {
                            c0989a.a(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (!z10) {
                        continue;
                    } else {
                        b(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && TtmlNode.ATTR_ID.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.t(context, xmlPullParser);
                this.f59410f.put(identifier, cVar);
                return;
            }
        }
    }

    public void c(x2.b bVar) {
    }

    public void d(int i10, float f10, float f11) {
        androidx.constraintlayout.widget.c cVar;
        C0989a c0989a;
        int b10;
        androidx.constraintlayout.widget.c cVar2;
        int i11 = this.f59407c;
        if (i11 == i10) {
            if (i10 == -1) {
                c0989a = this.f59409e.valueAt(0);
            } else {
                c0989a = this.f59409e.get(i11);
            }
            int i12 = this.f59408d;
            if ((i12 == -1 || !c0989a.f59412b.get(i12).a(f10, f11)) && this.f59408d != (b10 = c0989a.b(f10, f11))) {
                if (b10 == -1) {
                    cVar2 = this.f59406b;
                } else {
                    cVar2 = c0989a.f59412b.get(b10).f59420f;
                }
                if (b10 != -1) {
                    int i13 = c0989a.f59412b.get(b10).f59419e;
                }
                if (cVar2 == null) {
                    return;
                }
                this.f59408d = b10;
                cVar2.c(this.f59405a);
                return;
            }
            return;
        }
        this.f59407c = i10;
        C0989a c0989a2 = this.f59409e.get(i10);
        int b11 = c0989a2.b(f10, f11);
        if (b11 == -1) {
            cVar = c0989a2.f59414d;
        } else {
            cVar = c0989a2.f59412b.get(b11).f59420f;
        }
        if (b11 != -1) {
            int i14 = c0989a2.f59412b.get(b11).f59419e;
        }
        if (cVar == null) {
            StringBuilder sb2 = new StringBuilder(79);
            sb2.append("NO Constraint set found ! id=");
            sb2.append(i10);
            sb2.append(", dim =");
            sb2.append(f10);
            sb2.append(", ");
            sb2.append(f11);
            Log.v("ConstraintLayoutStates", sb2.toString());
            return;
        }
        this.f59408d = b11;
        cVar.c(this.f59405a);
    }
}

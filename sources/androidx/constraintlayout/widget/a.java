package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14798a;

    /* renamed from: b  reason: collision with root package name */
    public String f14799b;

    /* renamed from: c  reason: collision with root package name */
    public b f14800c;

    /* renamed from: d  reason: collision with root package name */
    public int f14801d;

    /* renamed from: e  reason: collision with root package name */
    public float f14802e;

    /* renamed from: f  reason: collision with root package name */
    public String f14803f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14804g;

    /* renamed from: h  reason: collision with root package name */
    public int f14805h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0057a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14806a;

        static {
            int[] iArr = new int[b.values().length];
            f14806a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14806a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14806a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14806a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14806a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14806a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14806a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14806a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, b bVar, Object obj, boolean z10) {
        this.f14798a = false;
        this.f14799b = str;
        this.f14800c = bVar;
        this.f14798a = z10;
        f(obj);
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, a> b(HashMap<String, a> hashMap, View view) {
        HashMap<String, a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new a(aVar, cls.getMethod(str.length() != 0 ? "getMap".concat(str) : new String("getMap"), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void c(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), x2.d.f59624w4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == x2.d.f59633x4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1);
                    sb2.append(upperCase);
                    sb2.append(substring);
                    str = sb2.toString();
                }
            } else if (index == x2.d.H4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == x2.d.f59642y4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == x2.d.A4) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == x2.d.f59651z4) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == x2.d.E4) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == x2.d.B4) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == x2.d.C4) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == x2.d.D4) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == x2.d.G4) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == x2.d.F4) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, bVar2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void d(View view, HashMap<String, a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = hashMap.get(str2);
            if (aVar.f14798a) {
                str = str2;
            } else {
                String valueOf = String.valueOf(str2);
                str = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
            }
            try {
                switch (C0057a.f14806a[aVar.f14800c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f14801d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f14804g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, aVar.f14803f);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f14805h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f14805h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f14801d));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f14802e));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f14802e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                String name = cls.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 34 + name.length());
                sb2.append(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(name);
                Log.e("TransitionLayout", sb2.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                String name2 = cls.getName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 34 + name2.length());
                sb3.append(" Custom Attribute \"");
                sb3.append(str2);
                sb3.append("\" not found on ");
                sb3.append(name2);
                Log.e("TransitionLayout", sb3.toString());
                String name3 = cls.getName();
                StringBuilder sb4 = new StringBuilder(name3.length() + 20 + String.valueOf(str).length());
                sb4.append(name3);
                sb4.append(" must have a method ");
                sb4.append(str);
                Log.e("TransitionLayout", sb4.toString());
            } catch (InvocationTargetException e12) {
                String name4 = cls.getName();
                StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 34 + name4.length());
                sb5.append(" Custom Attribute \"");
                sb5.append(str2);
                sb5.append("\" not found on ");
                sb5.append(name4);
                Log.e("TransitionLayout", sb5.toString());
                e12.printStackTrace();
            }
        }
    }

    public void e(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String valueOf = String.valueOf(this.f14799b);
        String concat = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
        try {
            switch (C0057a.f14806a[this.f14800c.ordinal()]) {
                case 2:
                    Method method = cls.getMethod(concat, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(fArr[0] > 0.5f);
                    method.invoke(view, objArr);
                    return;
                case 3:
                    String valueOf2 = String.valueOf(this.f14799b);
                    throw new RuntimeException(valueOf2.length() != 0 ? "unable to interpolate strings ".concat(valueOf2) : new String("unable to interpolate strings "));
                case 4:
                    cls.getMethod(concat, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    Method method2 = cls.getMethod(concat, Drawable.class);
                    int a10 = a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a11 = a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a10 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a11 << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method2.invoke(view, colorDrawable);
                    return;
                case 6:
                    cls.getMethod(concat, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 7:
                    cls.getMethod(concat, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 8:
                    cls.getMethod(concat, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            String b10 = w2.a.b(view);
            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 32 + String.valueOf(b10).length());
            sb2.append("cannot access method ");
            sb2.append(concat);
            sb2.append(" on View \"");
            sb2.append(b10);
            sb2.append("\"");
            Log.e("TransitionLayout", sb2.toString());
            e10.printStackTrace();
        } catch (NoSuchMethodException e11) {
            String b11 = w2.a.b(view);
            StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(b11).length());
            sb3.append("no method ");
            sb3.append(concat);
            sb3.append(" on View \"");
            sb3.append(b11);
            sb3.append("\"");
            Log.e("TransitionLayout", sb3.toString());
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public void f(Object obj) {
        switch (C0057a.f14806a[this.f14800c.ordinal()]) {
            case 1:
            case 6:
                this.f14801d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f14804g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f14803f = (String) obj;
                return;
            case 4:
            case 5:
                this.f14805h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f14802e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f14802e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f14798a = false;
        this.f14799b = aVar.f14799b;
        this.f14800c = aVar.f14800c;
        f(obj);
    }
}

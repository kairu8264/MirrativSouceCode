package e3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f30198a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<c, SparseArray<b>> f30199b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f30200c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static ColorStateList a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f30201a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f30202b;

        public b(ColorStateList colorStateList, Configuration configuration) {
            this.f30201a = colorStateList;
            this.f30202b = configuration;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f30203a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f30204b;

        public c(Resources resources, Resources.Theme theme) {
            this.f30203a = resources;
            this.f30204b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30203a.equals(cVar.f30203a) && n3.c.a(this.f30204b, cVar.f30204b);
        }

        public int hashCode() {
            return n3.c.b(this.f30203a, this.f30204b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Typeface f30205w;

            public a(Typeface typeface) {
                this.f30205w = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.onFontRetrieved(this.f30205w);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ int f30207w;

            public b(int i10) {
                this.f30207w = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.onFontRetrievalFailed(this.f30207w);
            }
        }

        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i10, Handler handler) {
            getHandler(handler).post(new b(i10));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new a(typeface));
        }

        public abstract void onFontRetrievalFailed(int i10);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f30209a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f30210b;

            /* renamed from: c  reason: collision with root package name */
            public static boolean f30211c;

            public static void a(Resources.Theme theme) {
                synchronized (f30209a) {
                    if (!f30211c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f30210b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f30211c = true;
                    }
                    Method method = f30210b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f30210b = null;
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(theme);
            } else if (i10 >= 23) {
                a.a(theme);
            }
        }
    }

    public static void a(c cVar, int i10, ColorStateList colorStateList) {
        synchronized (f30200c) {
            WeakHashMap<c, SparseArray<b>> weakHashMap = f30199b;
            SparseArray<b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i10, new b(colorStateList, cVar.f30203a.getConfiguration()));
        }
    }

    public static ColorStateList b(c cVar, int i10) {
        b bVar;
        synchronized (f30200c) {
            SparseArray<b> sparseArray = f30199b.get(cVar);
            if (sparseArray != null && sparseArray.size() > 0 && (bVar = sparseArray.get(i10)) != null) {
                if (bVar.f30202b.equals(cVar.f30203a.getConfiguration())) {
                    return bVar.f30201a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static Typeface c(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i10, theme);
        }
        return resources.getColor(i10);
    }

    public static ColorStateList e(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        c cVar = new c(resources, theme);
        ColorStateList b10 = b(cVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList l10 = l(resources, i10, theme);
        if (l10 != null) {
            a(cVar, i10, l10);
            return l10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return a.a(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable f(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Drawable g(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
        if (i12 >= 15) {
            return resources.getDrawableForDensity(i10, i11);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface h(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, d dVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, dVar, null, true, false);
    }

    public static void j(Context context, int i10, d dVar, Handler handler) throws Resources.NotFoundException {
        n3.h.g(dVar);
        if (context.isRestricted()) {
            dVar.callbackFailAsync(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, dVar, handler, false, false);
        }
    }

    public static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f30198a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return e3.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean m(Resources resources, int i10) {
        TypedValue k10 = k();
        resources.getValue(i10, k10, true);
        int i11 = k10.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface n(Context context, int i10, TypedValue typedValue, int i11, d dVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface o10 = o(context, resources, typedValue, i10, i11, dVar, handler, z10, z11);
        if (o10 == null && dVar == null && !z11) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        return o10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface o(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, e3.h.d r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.callbackFailAsync(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = f3.e.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.callbackSuccessAsync(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            e3.e$a r2 = e3.e.b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = f3.e.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = f3.e.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.callbackSuccessAsync(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.callbackFailAsync(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.callbackFailAsync(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.h.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, e3.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}

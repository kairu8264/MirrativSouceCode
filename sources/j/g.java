package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import d.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o3.m;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f37003e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f37004f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f37005a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f37006b;

    /* renamed from: c  reason: collision with root package name */
    public Context f37007c;

    /* renamed from: d  reason: collision with root package name */
    public Object f37008d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f37009c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f37010a;

        /* renamed from: b  reason: collision with root package name */
        public Method f37011b;

        public a(Object obj, String str) {
            this.f37010a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f37011b = cls.getMethod(str, f37009c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f37011b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f37011b.invoke(this.f37010a, menuItem)).booleanValue();
                }
                this.f37011b.invoke(this.f37010a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public o3.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f37012a;

        /* renamed from: b  reason: collision with root package name */
        public int f37013b;

        /* renamed from: c  reason: collision with root package name */
        public int f37014c;

        /* renamed from: d  reason: collision with root package name */
        public int f37015d;

        /* renamed from: e  reason: collision with root package name */
        public int f37016e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f37017f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f37018g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f37019h;

        /* renamed from: i  reason: collision with root package name */
        public int f37020i;

        /* renamed from: j  reason: collision with root package name */
        public int f37021j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f37022k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f37023l;

        /* renamed from: m  reason: collision with root package name */
        public int f37024m;

        /* renamed from: n  reason: collision with root package name */
        public char f37025n;

        /* renamed from: o  reason: collision with root package name */
        public int f37026o;

        /* renamed from: p  reason: collision with root package name */
        public char f37027p;

        /* renamed from: q  reason: collision with root package name */
        public int f37028q;

        /* renamed from: r  reason: collision with root package name */
        public int f37029r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f37030s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f37031t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f37032u;

        /* renamed from: v  reason: collision with root package name */
        public int f37033v;

        /* renamed from: w  reason: collision with root package name */
        public int f37034w;

        /* renamed from: x  reason: collision with root package name */
        public String f37035x;

        /* renamed from: y  reason: collision with root package name */
        public String f37036y;

        /* renamed from: z  reason: collision with root package name */
        public String f37037z;

        public b(Menu menu) {
            this.f37012a = menu;
            h();
        }

        public void a() {
            this.f37019h = true;
            i(this.f37012a.add(this.f37013b, this.f37020i, this.f37021j, this.f37022k));
        }

        public SubMenu b() {
            this.f37019h = true;
            SubMenu addSubMenu = this.f37012a.addSubMenu(this.f37013b, this.f37020i, this.f37021j, this.f37022k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f37019h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f37007c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f37007c.obtainStyledAttributes(attributeSet, j.f28867q1);
            this.f37013b = obtainStyledAttributes.getResourceId(j.f28877s1, 0);
            this.f37014c = obtainStyledAttributes.getInt(j.f28887u1, 0);
            this.f37015d = obtainStyledAttributes.getInt(j.f28892v1, 0);
            this.f37016e = obtainStyledAttributes.getInt(j.f28897w1, 0);
            this.f37017f = obtainStyledAttributes.getBoolean(j.f28882t1, true);
            this.f37018g = obtainStyledAttributes.getBoolean(j.f28872r1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(g.this.f37007c, attributeSet, j.f28902x1);
            this.f37020i = obtainStyledAttributes.getResourceId(j.A1, 0);
            this.f37021j = (obtainStyledAttributes.getInt(j.D1, this.f37014c) & (-65536)) | (obtainStyledAttributes.getInt(j.E1, this.f37015d) & 65535);
            this.f37022k = obtainStyledAttributes.getText(j.F1);
            this.f37023l = obtainStyledAttributes.getText(j.G1);
            this.f37024m = obtainStyledAttributes.getResourceId(j.f28907y1, 0);
            this.f37025n = c(obtainStyledAttributes.getString(j.H1));
            this.f37026o = obtainStyledAttributes.getInt(j.O1, 4096);
            this.f37027p = c(obtainStyledAttributes.getString(j.I1));
            this.f37028q = obtainStyledAttributes.getInt(j.S1, 4096);
            int i10 = j.J1;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f37029r = obtainStyledAttributes.getBoolean(i10, false) ? 1 : 0;
            } else {
                this.f37029r = this.f37016e;
            }
            this.f37030s = obtainStyledAttributes.getBoolean(j.B1, false);
            this.f37031t = obtainStyledAttributes.getBoolean(j.C1, this.f37017f);
            this.f37032u = obtainStyledAttributes.getBoolean(j.f28912z1, this.f37018g);
            this.f37033v = obtainStyledAttributes.getInt(j.T1, -1);
            this.f37037z = obtainStyledAttributes.getString(j.K1);
            this.f37034w = obtainStyledAttributes.getResourceId(j.L1, 0);
            this.f37035x = obtainStyledAttributes.getString(j.N1);
            String string = obtainStyledAttributes.getString(j.M1);
            this.f37036y = string;
            boolean z10 = string != null;
            if (z10 && this.f37034w == 0 && this.f37035x == null) {
                this.A = (o3.b) e(string, g.f37004f, g.this.f37006b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = obtainStyledAttributes.getText(j.P1);
            this.C = obtainStyledAttributes.getText(j.U1);
            int i11 = j.R1;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.E = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.Q1;
            if (obtainStyledAttributes.hasValue(i12)) {
                this.D = obtainStyledAttributes.getColorStateList(i12);
            } else {
                this.D = null;
            }
            obtainStyledAttributes.recycle();
            this.f37019h = false;
        }

        public void h() {
            this.f37013b = 0;
            this.f37014c = 0;
            this.f37015d = 0;
            this.f37016e = 0;
            this.f37017f = true;
            this.f37018g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f37030s).setVisible(this.f37031t).setEnabled(this.f37032u).setCheckable(this.f37029r >= 1).setTitleCondensed(this.f37023l).setIcon(this.f37024m);
            int i10 = this.f37033v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f37037z != null) {
                if (!g.this.f37007c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f37037z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f37029r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof k.c) {
                    ((k.c) menuItem).h(true);
                }
            }
            String str = this.f37035x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f37003e, g.this.f37005a));
                z10 = true;
            }
            int i11 = this.f37034w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            o3.b bVar = this.A;
            if (bVar != null) {
                m.a(menuItem, bVar);
            }
            m.c(menuItem, this.B);
            m.g(menuItem, this.C);
            m.b(menuItem, this.f37025n, this.f37026o);
            m.f(menuItem, this.f37027p, this.f37028q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                m.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                m.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f37003e = clsArr;
        f37004f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f37007c = context;
        Object[] objArr = {context};
        this.f37005a = objArr;
        this.f37006b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f37008d == null) {
            this.f37008d = a(this.f37007c);
        }
        return this.f37008d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.hasSubMenu() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            j.g$b r0 = new j.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            o3.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof h3.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f37007c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}

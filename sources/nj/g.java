package nj;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: n  reason: collision with root package name */
    public static final int f43637n;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f43638o;

    /* renamed from: p  reason: collision with root package name */
    public static Constructor<StaticLayout> f43639p;

    /* renamed from: q  reason: collision with root package name */
    public static Object f43640q;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f43641a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f43642b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43643c;

    /* renamed from: e  reason: collision with root package name */
    public int f43645e;

    /* renamed from: l  reason: collision with root package name */
    public boolean f43652l;

    /* renamed from: d  reason: collision with root package name */
    public int f43644d = 0;

    /* renamed from: f  reason: collision with root package name */
    public Layout.Alignment f43646f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g  reason: collision with root package name */
    public int f43647g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public float f43648h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f43649i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public int f43650j = f43637n;

    /* renamed from: k  reason: collision with root package name */
    public boolean f43651k = true;

    /* renamed from: m  reason: collision with root package name */
    public TextUtils.TruncateAt f43653m = null;

    /* loaded from: classes3.dex */
    public static class a extends Exception {
        public a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        f43637n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f43641a = charSequence;
        this.f43642b = textPaint;
        this.f43643c = i10;
        this.f43645e = charSequence.length();
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new g(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f43641a == null) {
            this.f43641a = "";
        }
        int max = Math.max(0, this.f43643c);
        CharSequence charSequence = this.f43641a;
        if (this.f43647g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f43642b, max, this.f43653m);
        }
        int min = Math.min(charSequence.length(), this.f43645e);
        this.f43645e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f43652l && this.f43647g == 1) {
                this.f43646f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f43644d, min, this.f43642b, max);
            obtain.setAlignment(this.f43646f);
            obtain.setIncludePad(this.f43651k);
            obtain.setTextDirection(this.f43652l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f43653m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f43647g);
            float f10 = this.f43648h;
            if (f10 != 0.0f || this.f43649i != 1.0f) {
                obtain.setLineSpacing(f10, this.f43649i);
            }
            if (this.f43647g > 1) {
                obtain.setHyphenationFrequency(this.f43650j);
            }
            return obtain.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) n3.h.g(f43639p)).newInstance(charSequence, Integer.valueOf(this.f43644d), Integer.valueOf(this.f43645e), this.f43642b, Integer.valueOf(max), this.f43646f, n3.h.g(f43640q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f43651k), null, Integer.valueOf(max), Integer.valueOf(this.f43647g));
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public final void b() throws a {
        Class<?> cls;
        if (f43638o) {
            return;
        }
        try {
            boolean z10 = this.f43652l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f43640q = z10 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.f43652l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f43640q = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f43639p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f43638o = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public g d(Layout.Alignment alignment) {
        this.f43646f = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.f43653m = truncateAt;
        return this;
    }

    public g f(int i10) {
        this.f43650j = i10;
        return this;
    }

    public g g(boolean z10) {
        this.f43651k = z10;
        return this;
    }

    public g h(boolean z10) {
        this.f43652l = z10;
        return this;
    }

    public g i(float f10, float f11) {
        this.f43648h = f10;
        this.f43649i = f11;
        return this;
    }

    public g j(int i10) {
        this.f43647g = i10;
        return this;
    }
}

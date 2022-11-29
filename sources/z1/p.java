package z1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62459a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62460b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<StaticLayout> f62461c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Constructor<StaticLayout> b() {
            if (p.f62460b) {
                return p.f62461c;
            }
            p.f62460b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                p.f62461c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                p.f62461c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return p.f62461c;
        }
    }

    @Override // z1.o
    public StaticLayout a(q qVar) {
        jo.p.h(qVar, "params");
        Constructor b10 = f62459a.b();
        StaticLayout staticLayout = null;
        if (b10 != null) {
            try {
                staticLayout = (StaticLayout) b10.newInstance(qVar.p(), Integer.valueOf(qVar.o()), Integer.valueOf(qVar.e()), qVar.m(), Integer.valueOf(qVar.s()), qVar.a(), qVar.q(), Float.valueOf(qVar.k()), Float.valueOf(qVar.j()), Boolean.valueOf(qVar.g()), qVar.c(), Integer.valueOf(qVar.d()), Integer.valueOf(qVar.l()));
            } catch (IllegalAccessException unused) {
                f62461c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f62461c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f62461c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(qVar.p(), qVar.o(), qVar.e(), qVar.m(), qVar.s(), qVar.a(), qVar.k(), qVar.j(), qVar.g(), qVar.c(), qVar.d());
    }
}

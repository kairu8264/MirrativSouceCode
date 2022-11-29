package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: w  reason: collision with root package name */
    public static int f29866w = -100;

    /* renamed from: x  reason: collision with root package name */
    public static final s.b<WeakReference<d>> f29867x = new s.b<>();

    /* renamed from: y  reason: collision with root package name */
    public static final Object f29868y = new Object();

    public static void a(d dVar) {
        synchronized (f29868y) {
            w(dVar);
            f29867x.add(new WeakReference<>(dVar));
        }
    }

    public static d e(Activity activity, c cVar) {
        return new e(activity, cVar);
    }

    public static d f(Dialog dialog, c cVar) {
        return new e(dialog, cVar);
    }

    public static int h() {
        return f29866w;
    }

    public static void v(d dVar) {
        synchronized (f29868y) {
            w(dVar);
        }
    }

    public static void w(d dVar) {
        synchronized (f29868y) {
            Iterator<WeakReference<d>> it = f29867x.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void B(Toolbar toolbar);

    public void C(int i10) {
    }

    public abstract void D(CharSequence charSequence);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void c(Context context) {
    }

    public Context d(Context context) {
        c(context);
        return context;
    }

    public abstract <T extends View> T g(int i10);

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void n(Configuration configuration);

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u();

    public abstract boolean x(int i10);

    public abstract void y(int i10);

    public abstract void z(View view);
}

package b8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p implements Handler.Callback {
    public static final b F = new a();
    public final b A;
    public final k E;

    /* renamed from: w  reason: collision with root package name */
    public volatile com.bumptech.glide.k f17086w;

    /* renamed from: z  reason: collision with root package name */
    public final Handler f17089z;

    /* renamed from: x  reason: collision with root package name */
    public final Map<FragmentManager, o> f17087x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public final Map<androidx.fragment.app.FragmentManager, s> f17088y = new HashMap();
    public final s.a<View, Fragment> B = new s.a<>();
    public final s.a<View, android.app.Fragment> C = new s.a<>();
    public final Bundle D = new Bundle();

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // b8.p.b
        public com.bumptech.glide.k a(com.bumptech.glide.c cVar, l lVar, q qVar, Context context) {
            return new com.bumptech.glide.k(cVar, lVar, qVar, context);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.c cVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, com.bumptech.glide.f fVar) {
        this.A = bVar == null ? F : bVar;
        this.f17089z = new Handler(Looper.getMainLooper(), this);
        this.E = b(fVar);
    }

    @TargetApi(17)
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static k b(com.bumptech.glide.f fVar) {
        if (v7.r.f56886h && v7.r.f56885g) {
            if (fVar.a(d.C0174d.class)) {
                return new i();
            }
            return new j();
        }
        return new g();
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.Z0() != null) {
                map.put(fragment.Z0(), fragment);
                f(fragment.p0().p0(), map);
            }
        }
    }

    public static boolean u(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void d(FragmentManager fragmentManager, s.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        e(fragmentManager, aVar);
    }

    @Deprecated
    public final void e(FragmentManager fragmentManager, s.a<View, android.app.Fragment> aVar) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.D.putInt("key", i10);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.D, "key");
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                if (Build.VERSION.SDK_INT >= 17) {
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            i10 = i11;
        }
    }

    @Deprecated
    public final android.app.Fragment g(View view, Activity activity) {
        this.C.clear();
        d(activity.getFragmentManager(), this.C);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.C.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.C.clear();
        return fragment;
    }

    public final Fragment h(View view, androidx.fragment.app.h hVar) {
        this.B.clear();
        f(hVar.a3().p0(), this.B);
        View findViewById = hVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.B.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.B.clear();
        return fragment;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i10 = message.what;
        Object obj3 = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f17087x.remove(obj);
        } else if (i10 == 2) {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f17088y.remove(obj);
        } else {
            z10 = false;
            obj2 = null;
            if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z10;
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }

    @Deprecated
    public final com.bumptech.glide.k i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        o r10 = r(fragmentManager, fragment);
        com.bumptech.glide.k e10 = r10.e();
        if (e10 == null) {
            e10 = this.A.a(com.bumptech.glide.c.d(context), r10.c(), r10.f(), context);
            if (z10) {
                e10.onStart();
            }
            r10.k(e10);
        }
        return e10;
    }

    public com.bumptech.glide.k j(Activity activity) {
        if (i8.k.r()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.h) {
            return o((androidx.fragment.app.h) activity);
        }
        a(activity);
        this.E.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.k k(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!i8.k.r() && Build.VERSION.SDK_INT >= 17) {
                if (fragment.getActivity() != null) {
                    this.E.a(fragment.getActivity());
                }
                return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public com.bumptech.glide.k l(Context context) {
        if (context != null) {
            if (i8.k.s() && !(context instanceof Application)) {
                if (context instanceof androidx.fragment.app.h) {
                    return o((androidx.fragment.app.h) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public com.bumptech.glide.k m(View view) {
        if (i8.k.r()) {
            return l(view.getContext().getApplicationContext());
        }
        i8.j.d(view);
        i8.j.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c10 = c(view.getContext());
        if (c10 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c10 instanceof androidx.fragment.app.h) {
            androidx.fragment.app.h hVar = (androidx.fragment.app.h) c10;
            Fragment h10 = h(view, hVar);
            return h10 != null ? n(h10) : o(hVar);
        }
        android.app.Fragment g10 = g(view, c10);
        if (g10 == null) {
            return j(c10);
        }
        return k(g10);
    }

    public com.bumptech.glide.k n(Fragment fragment) {
        i8.j.e(fragment.q0(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (i8.k.r()) {
            return l(fragment.q0().getApplicationContext());
        }
        if (fragment.j0() != null) {
            this.E.a(fragment.j0());
        }
        return v(fragment.q0(), fragment.p0(), fragment, fragment.r1());
    }

    public com.bumptech.glide.k o(androidx.fragment.app.h hVar) {
        if (i8.k.r()) {
            return l(hVar.getApplicationContext());
        }
        a(hVar);
        this.E.a(hVar);
        return v(hVar, hVar.a3(), null, u(hVar));
    }

    public final com.bumptech.glide.k p(Context context) {
        if (this.f17086w == null) {
            synchronized (this) {
                if (this.f17086w == null) {
                    this.f17086w = this.A.a(com.bumptech.glide.c.d(context.getApplicationContext()), new b8.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f17086w;
    }

    @Deprecated
    public o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    public final o r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null) {
            o oVar2 = this.f17087x.get(fragmentManager);
            if (oVar2 == null) {
                o oVar3 = new o();
                oVar3.j(fragment);
                this.f17087x.put(fragmentManager, oVar3);
                fragmentManager.beginTransaction().add(oVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f17089z.obtainMessage(1, fragmentManager).sendToTarget();
                return oVar3;
            }
            return oVar2;
        }
        return oVar;
    }

    public s s(androidx.fragment.app.FragmentManager fragmentManager) {
        return t(fragmentManager, null);
    }

    public final s t(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        s sVar = (s) fragmentManager.e0("com.bumptech.glide.manager");
        if (sVar == null) {
            s sVar2 = this.f17088y.get(fragmentManager);
            if (sVar2 == null) {
                s sVar3 = new s();
                sVar3.t3(fragment);
                this.f17088y.put(fragmentManager, sVar3);
                fragmentManager.k().d(sVar3, "com.bumptech.glide.manager").j();
                this.f17089z.obtainMessage(2, fragmentManager).sendToTarget();
                return sVar3;
            }
            return sVar2;
        }
        return sVar;
    }

    public final com.bumptech.glide.k v(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        s t10 = t(fragmentManager, fragment);
        com.bumptech.glide.k n32 = t10.n3();
        if (n32 == null) {
            n32 = this.A.a(com.bumptech.glide.c.d(context), t10.l3(), t10.o3(), context);
            if (z10) {
                n32.onStart();
            }
            t10.u3(n32);
        }
        return n32;
    }
}

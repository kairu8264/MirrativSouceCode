package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public final l f15409a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f15410b;

    /* renamed from: d  reason: collision with root package name */
    public int f15412d;

    /* renamed from: e  reason: collision with root package name */
    public int f15413e;

    /* renamed from: f  reason: collision with root package name */
    public int f15414f;

    /* renamed from: g  reason: collision with root package name */
    public int f15415g;

    /* renamed from: h  reason: collision with root package name */
    public int f15416h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15417i;

    /* renamed from: k  reason: collision with root package name */
    public String f15419k;

    /* renamed from: l  reason: collision with root package name */
    public int f15420l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f15421m;

    /* renamed from: n  reason: collision with root package name */
    public int f15422n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f15423o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f15424p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<String> f15425q;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Runnable> f15427s;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f15411c = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public boolean f15418j = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15426r = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15428a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f15429b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15430c;

        /* renamed from: d  reason: collision with root package name */
        public int f15431d;

        /* renamed from: e  reason: collision with root package name */
        public int f15432e;

        /* renamed from: f  reason: collision with root package name */
        public int f15433f;

        /* renamed from: g  reason: collision with root package name */
        public int f15434g;

        /* renamed from: h  reason: collision with root package name */
        public o.c f15435h;

        /* renamed from: i  reason: collision with root package name */
        public o.c f15436i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f15428a = i10;
            this.f15429b = fragment;
            this.f15430c = false;
            o.c cVar = o.c.RESUMED;
            this.f15435h = cVar;
            this.f15436i = cVar;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f15428a = i10;
            this.f15429b = fragment;
            this.f15430c = z10;
            o.c cVar = o.c.RESUMED;
            this.f15435h = cVar;
            this.f15436i = cVar;
        }

        public a(int i10, Fragment fragment, o.c cVar) {
            this.f15428a = i10;
            this.f15429b = fragment;
            this.f15430c = false;
            this.f15435h = fragment.f15139n0;
            this.f15436i = cVar;
        }
    }

    public z(l lVar, ClassLoader classLoader) {
        this.f15409a = lVar;
        this.f15410b = classLoader;
    }

    public z b(int i10, Fragment fragment, String str) {
        o(i10, fragment, str, 1);
        return this;
    }

    public z c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f15129d0 = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public z d(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f15411c.add(aVar);
        aVar.f15431d = this.f15412d;
        aVar.f15432e = this.f15413e;
        aVar.f15433f = this.f15414f;
        aVar.f15434g = this.f15415g;
    }

    public z f(View view, String str) {
        if (a0.e()) {
            String N = o3.c0.N(view);
            if (N != null) {
                if (this.f15424p == null) {
                    this.f15424p = new ArrayList<>();
                    this.f15425q = new ArrayList<>();
                } else if (!this.f15425q.contains(str)) {
                    if (this.f15424p.contains(N)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + N + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.f15424p.add(N);
                this.f15425q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public z g(String str) {
        if (this.f15418j) {
            this.f15417i = true;
            this.f15419k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public z h(Fragment fragment) {
        e(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public z m(Fragment fragment) {
        e(new a(6, fragment));
        return this;
    }

    public z n() {
        if (!this.f15417i) {
            this.f15418j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void o(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.f15138m0;
        if (str2 != null) {
            h4.c.h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.V;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.V + " now " + str);
                }
                fragment.V = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.T;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.T + " now " + i10);
                    }
                    fragment.T = i10;
                    fragment.U = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            e(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public z p(Fragment fragment) {
        e(new a(4, fragment));
        return this;
    }

    public z q(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public z r(int i10, Fragment fragment) {
        return s(i10, fragment, null);
    }

    public z s(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            o(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public z t(int i10, int i11, int i12, int i13) {
        this.f15412d = i10;
        this.f15413e = i11;
        this.f15414f = i12;
        this.f15415g = i13;
        return this;
    }

    public z u(Fragment fragment, o.c cVar) {
        e(new a(10, fragment, cVar));
        return this;
    }

    public z v(Fragment fragment) {
        e(new a(8, fragment));
        return this;
    }

    public z w(boolean z10) {
        this.f15426r = z10;
        return this;
    }
}

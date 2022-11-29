package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o;

@Deprecated
/* loaded from: classes.dex */
public abstract class u extends j5.a {

    /* renamed from: c  reason: collision with root package name */
    public final FragmentManager f15388c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15389d;

    /* renamed from: e  reason: collision with root package name */
    public z f15390e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f15391f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15392g;

    @Deprecated
    public u(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public static String s(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // j5.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f15390e == null) {
            this.f15390e = this.f15388c.k();
        }
        this.f15390e.m(fragment);
        if (fragment.equals(this.f15391f)) {
            this.f15391f = null;
        }
    }

    @Override // j5.a
    public void b(ViewGroup viewGroup) {
        z zVar = this.f15390e;
        if (zVar != null) {
            if (!this.f15392g) {
                try {
                    this.f15392g = true;
                    zVar.l();
                } finally {
                    this.f15392g = false;
                }
            }
            this.f15390e = null;
        }
    }

    @Override // j5.a
    public Object g(ViewGroup viewGroup, int i10) {
        if (this.f15390e == null) {
            this.f15390e = this.f15388c.k();
        }
        long r10 = r(i10);
        Fragment e02 = this.f15388c.e0(s(viewGroup.getId(), r10));
        if (e02 != null) {
            this.f15390e.h(e02);
        } else {
            e02 = q(i10);
            this.f15390e.b(viewGroup.getId(), e02, s(viewGroup.getId(), r10));
        }
        if (e02 != this.f15391f) {
            e02.Y2(false);
            if (this.f15389d == 1) {
                this.f15390e.u(e02, o.c.STARTED);
            } else {
                e02.d3(false);
            }
        }
        return e02;
    }

    @Override // j5.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).Z0() == view;
    }

    @Override // j5.a
    public void k(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // j5.a
    public Parcelable l() {
        return null;
    }

    @Override // j5.a
    public void m(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f15391f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.Y2(false);
                if (this.f15389d == 1) {
                    if (this.f15390e == null) {
                        this.f15390e = this.f15388c.k();
                    }
                    this.f15390e.u(this.f15391f, o.c.STARTED);
                } else {
                    this.f15391f.d3(false);
                }
            }
            fragment.Y2(true);
            if (this.f15389d == 1) {
                if (this.f15390e == null) {
                    this.f15390e = this.f15388c.k();
                }
                this.f15390e.u(fragment, o.c.RESUMED);
            } else {
                fragment.d3(true);
            }
            this.f15391f = fragment;
        }
    }

    @Override // j5.a
    public void o(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment q(int i10);

    public long r(int i10) {
        return i10;
    }

    public u(FragmentManager fragmentManager, int i10) {
        this.f15390e = null;
        this.f15391f = null;
        this.f15388c = fragmentManager;
        this.f15389d = i10;
    }
}

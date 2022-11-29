package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.z;
import androidx.lifecycle.o;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends z implements FragmentManager.n {

    /* renamed from: t  reason: collision with root package name */
    public final FragmentManager f15242t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15243u;

    /* renamed from: v  reason: collision with root package name */
    public int f15244v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15245w;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.o0(), fragmentManager.q0() != null ? fragmentManager.q0().f().getClassLoader() : null);
        this.f15244v = -1;
        this.f15245w = false;
        this.f15242t = fragmentManager;
    }

    public void A(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f15419k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f15244v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f15243u);
            if (this.f15416h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f15416h));
            }
            if (this.f15412d != 0 || this.f15413e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15412d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15413e));
            }
            if (this.f15414f != 0 || this.f15415g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15414f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15415g));
            }
            if (this.f15420l != 0 || this.f15421m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15420l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f15421m);
            }
            if (this.f15422n != 0 || this.f15423o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15422n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f15423o);
            }
        }
        if (this.f15411c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f15411c.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.a aVar = this.f15411c.get(i10);
            switch (aVar.f15428a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f15428a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f15429b);
            if (z10) {
                if (aVar.f15431d != 0 || aVar.f15432e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15431d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15432e));
                }
                if (aVar.f15433f != 0 || aVar.f15434g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15433f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15434g));
                }
            }
        }
    }

    public void B() {
        int size = this.f15411c.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.a aVar = this.f15411c.get(i10);
            Fragment fragment = aVar.f15429b;
            if (fragment != null) {
                fragment.J = this.f15245w;
                fragment.a3(false);
                fragment.Z2(this.f15416h);
                fragment.c3(this.f15424p, this.f15425q);
            }
            switch (aVar.f15428a) {
                case 1:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, false);
                    this.f15242t.f(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15428a);
                case 3:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.Y0(fragment);
                    break;
                case 4:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.A0(fragment);
                    break;
                case 5:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, false);
                    this.f15242t.l1(fragment);
                    break;
                case 6:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.t(fragment);
                    break;
                case 7:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, false);
                    this.f15242t.j(fragment);
                    break;
                case 8:
                    this.f15242t.j1(fragment);
                    break;
                case 9:
                    this.f15242t.j1(null);
                    break;
                case 10:
                    this.f15242t.i1(fragment, aVar.f15436i);
                    break;
            }
        }
    }

    public void C() {
        for (int size = this.f15411c.size() - 1; size >= 0; size--) {
            z.a aVar = this.f15411c.get(size);
            Fragment fragment = aVar.f15429b;
            if (fragment != null) {
                fragment.J = this.f15245w;
                fragment.a3(true);
                fragment.Z2(FragmentManager.c1(this.f15416h));
                fragment.c3(this.f15425q, this.f15424p);
            }
            switch (aVar.f15428a) {
                case 1:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, true);
                    this.f15242t.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f15428a);
                case 3:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f(fragment);
                    break;
                case 4:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.l1(fragment);
                    break;
                case 5:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, true);
                    this.f15242t.A0(fragment);
                    break;
                case 6:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.j(fragment);
                    break;
                case 7:
                    fragment.U2(aVar.f15431d, aVar.f15432e, aVar.f15433f, aVar.f15434g);
                    this.f15242t.f1(fragment, true);
                    this.f15242t.t(fragment);
                    break;
                case 8:
                    this.f15242t.j1(null);
                    break;
                case 9:
                    this.f15242t.j1(fragment);
                    break;
                case 10:
                    this.f15242t.i1(fragment, aVar.f15435h);
                    break;
            }
        }
    }

    public Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f15411c.size()) {
            z.a aVar = this.f15411c.get(i10);
            int i11 = aVar.f15428a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f15429b;
                    int i12 = fragment3.U;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.U == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f15411c.add(i10, new z.a(9, fragment4, true));
                                    i10++;
                                    fragment2 = null;
                                }
                                z.a aVar2 = new z.a(3, fragment4, true);
                                aVar2.f15431d = aVar.f15431d;
                                aVar2.f15433f = aVar.f15433f;
                                aVar2.f15432e = aVar.f15432e;
                                aVar2.f15434g = aVar.f15434g;
                                this.f15411c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f15411c.remove(i10);
                        i10--;
                    } else {
                        aVar.f15428a = 1;
                        aVar.f15430c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f15429b);
                    Fragment fragment5 = aVar.f15429b;
                    if (fragment5 == fragment2) {
                        this.f15411c.add(i10, new z.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f15411c.add(i10, new z.a(9, fragment2, true));
                        aVar.f15430c = true;
                        i10++;
                        fragment2 = aVar.f15429b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f15429b);
            i10++;
        }
        return fragment2;
    }

    public String E() {
        return this.f15419k;
    }

    public void F() {
        if (this.f15427s != null) {
            for (int i10 = 0; i10 < this.f15427s.size(); i10++) {
                this.f15427s.get(i10).run();
            }
            this.f15427s = null;
        }
    }

    public Fragment G(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f15411c.size() - 1; size >= 0; size--) {
            z.a aVar = this.f15411c.get(size);
            int i10 = aVar.f15428a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f15429b;
                            break;
                        case 10:
                            aVar.f15436i = aVar.f15435h;
                            break;
                    }
                }
                arrayList.add(aVar.f15429b);
            }
            arrayList.remove(aVar.f15429b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f15417i) {
            this.f15242t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.z
    public int i() {
        return y(false);
    }

    @Override // androidx.fragment.app.z
    public int j() {
        return y(true);
    }

    @Override // androidx.fragment.app.z
    public void k() {
        n();
        this.f15242t.Y(this, false);
    }

    @Override // androidx.fragment.app.z
    public void l() {
        n();
        this.f15242t.Y(this, true);
    }

    @Override // androidx.fragment.app.z
    public z m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.P;
        if (fragmentManager != null && fragmentManager != this.f15242t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.m(fragment);
    }

    @Override // androidx.fragment.app.z
    public void o(int i10, Fragment fragment, String str, int i11) {
        super.o(i10, fragment, str, i11);
        fragment.P = this.f15242t;
    }

    @Override // androidx.fragment.app.z
    public z p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.P;
        if (fragmentManager != null && fragmentManager != this.f15242t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.p(fragment);
    }

    @Override // androidx.fragment.app.z
    public z q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.P;
        if (fragmentManager != null && fragmentManager != this.f15242t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.q(fragment);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f15244v >= 0) {
            sb2.append(" #");
            sb2.append(this.f15244v);
        }
        if (this.f15419k != null) {
            sb2.append(" ");
            sb2.append(this.f15419k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.z
    public z u(Fragment fragment, o.c cVar) {
        if (fragment.P == this.f15242t) {
            if (cVar == o.c.INITIALIZED && fragment.f15148w > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != o.c.DESTROYED) {
                return super.u(fragment, cVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f15242t);
    }

    @Override // androidx.fragment.app.z
    public z v(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.P) != null && fragmentManager != this.f15242t) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.v(fragment);
    }

    public void x(int i10) {
        z.a aVar;
        if (this.f15417i) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f15411c.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f15411c.get(i11).f15429b;
                if (fragment != null) {
                    fragment.O += i10;
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f15429b + " to " + aVar.f15429b.O);
                    }
                }
            }
        }
    }

    public int y(boolean z10) {
        if (!this.f15243u) {
            if (FragmentManager.D0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
                z("  ", printWriter);
                printWriter.close();
            }
            this.f15243u = true;
            if (this.f15417i) {
                this.f15244v = this.f15242t.h();
            } else {
                this.f15244v = -1;
            }
            this.f15242t.V(this, z10);
            return this.f15244v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}

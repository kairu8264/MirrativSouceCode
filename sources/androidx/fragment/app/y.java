package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f15405a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, x> f15406b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, w> f15407c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public s f15408d;

    public void A(s sVar) {
        this.f15408d = sVar;
    }

    public w B(String str, w wVar) {
        if (wVar != null) {
            return this.f15407c.put(str, wVar);
        }
        return this.f15407c.remove(str);
    }

    public void a(Fragment fragment) {
        if (!this.f15405a.contains(fragment)) {
            synchronized (this.f15405a) {
                this.f15405a.add(fragment);
            }
            fragment.H = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.f15406b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f15406b.get(str) != null;
    }

    public void d(int i10) {
        for (x xVar : this.f15406b.values()) {
            if (xVar != null) {
                xVar.t(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f15406b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (x xVar : this.f15406b.values()) {
                printWriter.print(str);
                if (xVar != null) {
                    Fragment k10 = xVar.k();
                    printWriter.println(k10);
                    k10.f0(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f15405a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f15405a.get(i10).toString());
            }
        }
    }

    public Fragment f(String str) {
        x xVar = this.f15406b.get(str);
        if (xVar != null) {
            return xVar.k();
        }
        return null;
    }

    public Fragment g(int i10) {
        for (int size = this.f15405a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f15405a.get(size);
            if (fragment != null && fragment.T == i10) {
                return fragment;
            }
        }
        for (x xVar : this.f15406b.values()) {
            if (xVar != null) {
                Fragment k10 = xVar.k();
                if (k10.T == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f15405a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f15405a.get(size);
                if (fragment != null && str.equals(fragment.V)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (x xVar : this.f15406b.values()) {
                if (xVar != null) {
                    Fragment k10 = xVar.k();
                    if (str.equals(k10.V)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment h02;
        for (x xVar : this.f15406b.values()) {
            if (xVar != null && (h02 = xVar.k().h0(str)) != null) {
                return h02;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f15129d0;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f15405a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f15405a.get(i10);
            if (fragment2.f15129d0 == viewGroup && (view2 = fragment2.f15130e0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f15405a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f15405a.get(indexOf);
            if (fragment3.f15129d0 == viewGroup && (view = fragment3.f15130e0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<x> k() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f15406b.values()) {
            if (xVar != null) {
                arrayList.add(xVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (x xVar : this.f15406b.values()) {
            if (xVar != null) {
                arrayList.add(xVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ArrayList<w> m() {
        return new ArrayList<>(this.f15407c.values());
    }

    public x n(String str) {
        return this.f15406b.get(str);
    }

    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f15405a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f15405a) {
            arrayList = new ArrayList(this.f15405a);
        }
        return arrayList;
    }

    public s p() {
        return this.f15408d;
    }

    public w q(String str) {
        return this.f15407c.get(str);
    }

    public void r(x xVar) {
        Fragment k10 = xVar.k();
        if (c(k10.B)) {
            return;
        }
        this.f15406b.put(k10.B, xVar);
        if (k10.Z) {
            if (k10.Y) {
                this.f15408d.f(k10);
            } else {
                this.f15408d.p(k10);
            }
            k10.Z = false;
        }
        if (FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    public void s(x xVar) {
        Fragment k10 = xVar.k();
        if (k10.Y) {
            this.f15408d.p(k10);
        }
        if (this.f15406b.put(k10.B, null) != null && FragmentManager.D0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    public void t() {
        Iterator<Fragment> it = this.f15405a.iterator();
        while (it.hasNext()) {
            x xVar = this.f15406b.get(it.next().B);
            if (xVar != null) {
                xVar.m();
            }
        }
        for (x xVar2 : this.f15406b.values()) {
            if (xVar2 != null) {
                xVar2.m();
                Fragment k10 = xVar2.k();
                if (k10.I && !k10.j1()) {
                    if (k10.J && !this.f15407c.containsKey(k10.B)) {
                        xVar2.r();
                    }
                    s(xVar2);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f15405a) {
            this.f15405a.remove(fragment);
        }
        fragment.H = false;
    }

    public void v() {
        this.f15406b.clear();
    }

    public void w(List<String> list) {
        this.f15405a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 != null) {
                    if (FragmentManager.D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    public void x(ArrayList<w> arrayList) {
        this.f15407c.clear();
        Iterator<w> it = arrayList.iterator();
        while (it.hasNext()) {
            w next = it.next();
            this.f15407c.put(next.f15394x, next);
        }
    }

    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f15406b.size());
        for (x xVar : this.f15406b.values()) {
            if (xVar != null) {
                Fragment k10 = xVar.k();
                xVar.r();
                arrayList.add(k10.B);
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.f15149x);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> z() {
        synchronized (this.f15405a) {
            if (this.f15405a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f15405a.size());
            Iterator<Fragment> it = this.f15405a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.B);
                if (FragmentManager.D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.B + "): " + next);
                }
            }
            return arrayList;
        }
    }
}

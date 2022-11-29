package qk;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tk.a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final xl.b<tk.a> f49566a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49567b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f49568c = null;

    public b(Context context, xl.b<tk.a> bVar, String str) {
        this.f49566a = bVar;
        this.f49567b = str;
    }

    public static List<a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(a.a(map));
        }
        return arrayList;
    }

    public final void a(a.c cVar) {
        this.f49566a.get().c(cVar);
    }

    public final void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g10 = g();
        for (a aVar : list) {
            while (arrayDeque.size() >= g10) {
                i(((a.c) arrayDeque.pollFirst()).f53770b);
            }
            a.c d10 = aVar.d(this.f49567b);
            a(d10);
            arrayDeque.offer(d10);
        }
    }

    public final List<a.c> d() {
        return this.f49566a.get().g(this.f49567b, "");
    }

    public final ArrayList<a> e(List<a> list, Set<String> set) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f53770b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final int g() {
        if (this.f49568c == null) {
            this.f49568c = Integer.valueOf(this.f49566a.get().f(this.f49567b));
        }
        return this.f49568c.intValue();
    }

    public void h() throws AbtException {
        m();
        j(d());
    }

    public final void i(String str) {
        this.f49566a.get().clearConditionalUserProperty(str, null, null);
    }

    public final void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f53770b);
        }
    }

    public void k(List<Map<String, String>> list) throws AbtException {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public final void l(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (a aVar : list) {
            hashSet.add(aVar.b());
        }
        List<a.c> d10 = d();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : d10) {
            hashSet2.add(cVar.f53770b);
        }
        j(f(d10, hashSet));
        b(e(list, hashSet2));
    }

    public final void m() throws AbtException {
        if (this.f49566a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}

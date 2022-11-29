package hi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class f implements Iterable<q>, q, m {

    /* renamed from: w  reason: collision with root package name */
    public final SortedMap<Integer, q> f35749w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, q> f35750x;

    public f() {
        this.f35749w = new TreeMap();
        this.f35750x = new TreeMap();
    }

    public final void A(int i10) {
        int intValue = this.f35749w.lastKey().intValue();
        if (i10 > intValue || i10 < 0) {
            return;
        }
        this.f35749w.remove(Integer.valueOf(i10));
        if (i10 == intValue) {
            SortedMap<Integer, q> sortedMap = this.f35749w;
            int i11 = i10 - 1;
            Integer valueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(valueOf) || i11 < 0) {
                return;
            }
            this.f35749w.put(valueOf, q.f35921f);
            return;
        }
        while (true) {
            i10++;
            if (i10 > this.f35749w.lastKey().intValue()) {
                return;
            }
            SortedMap<Integer, q> sortedMap2 = this.f35749w;
            Integer valueOf2 = Integer.valueOf(i10);
            q qVar = sortedMap2.get(valueOf2);
            if (qVar != null) {
                this.f35749w.put(Integer.valueOf(i10 - 1), qVar);
                this.f35749w.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void B(int i10, q qVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (qVar == null) {
            this.f35749w.remove(Integer.valueOf(i10));
        } else {
            this.f35749w.put(Integer.valueOf(i10), qVar);
        }
    }

    public final boolean D(int i10) {
        if (i10 >= 0 && i10 <= this.f35749w.lastKey().intValue()) {
            return this.f35749w.containsKey(Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // hi.q
    public final q d() {
        f fVar = new f();
        for (Map.Entry<Integer, q> entry : this.f35749w.entrySet()) {
            if (entry.getValue() instanceof m) {
                fVar.f35749w.put(entry.getKey(), entry.getValue());
            } else {
                fVar.f35749w.put(entry.getKey(), entry.getValue().d());
            }
        }
        return fVar;
    }

    @Override // hi.q
    public final Double e() {
        if (this.f35749w.size() == 1) {
            return r(0).e();
        }
        if (this.f35749w.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (p() != fVar.p()) {
                return false;
            }
            if (this.f35749w.isEmpty()) {
                return fVar.f35749w.isEmpty();
            }
            for (int intValue = this.f35749w.firstKey().intValue(); intValue <= this.f35749w.lastKey().intValue(); intValue++) {
                if (!r(intValue).equals(fVar.r(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // hi.m
    public final boolean g(String str) {
        return "length".equals(str) || this.f35750x.containsKey(str);
    }

    @Override // hi.q
    public final String h() {
        return t(",");
    }

    public final int hashCode() {
        return this.f35749w.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        return new e(this);
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return new d(this, this.f35749w.keySet().iterator(), this.f35750x.keySet().iterator());
    }

    @Override // hi.m
    public final void k(String str, q qVar) {
        if (qVar == null) {
            this.f35750x.remove(str);
        } else {
            this.f35750x.put(str, qVar);
        }
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return k.a(this, new u(str), u4Var, list);
        }
        return d0.a(str, this, u4Var, list);
    }

    public final int m() {
        return this.f35749w.size();
    }

    public final int p() {
        if (this.f35749w.isEmpty()) {
            return 0;
        }
        return this.f35749w.lastKey().intValue() + 1;
    }

    public final q r(int i10) {
        q qVar;
        if (i10 < p()) {
            return (!D(i10) || (qVar = this.f35749w.get(Integer.valueOf(i10))) == null) ? q.f35921f : qVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // hi.m
    public final q s(String str) {
        q qVar;
        if ("length".equals(str)) {
            return new i(Double.valueOf(p()));
        }
        return (!g(str) || (qVar = this.f35750x.get(str)) == null) ? q.f35921f : qVar;
    }

    public final String t(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f35749w.isEmpty()) {
            for (int i10 = 0; i10 < p(); i10++) {
                q r10 = r(i10);
                sb2.append(str);
                if (!(r10 instanceof v) && !(r10 instanceof o)) {
                    sb2.append(r10.h());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return t(",");
    }

    public final Iterator<Integer> u() {
        return this.f35749w.keySet().iterator();
    }

    public final List<q> w() {
        ArrayList arrayList = new ArrayList(p());
        for (int i10 = 0; i10 < p(); i10++) {
            arrayList.add(r(i10));
        }
        return arrayList;
    }

    public final void x() {
        this.f35749w.clear();
    }

    public final void y(int i10, q qVar) {
        if (i10 >= 0) {
            if (i10 >= p()) {
                B(i10, qVar);
                return;
            }
            for (int intValue = this.f35749w.lastKey().intValue(); intValue >= i10; intValue--) {
                SortedMap<Integer, q> sortedMap = this.f35749w;
                Integer valueOf = Integer.valueOf(intValue);
                q qVar2 = sortedMap.get(valueOf);
                if (qVar2 != null) {
                    B(intValue + 1, qVar2);
                    this.f35749w.remove(valueOf);
                }
            }
            B(i10, qVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid value index: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public f(List<q> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                B(i10, list.get(i10));
            }
        }
    }
}

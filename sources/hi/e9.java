package hi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class e9 extends f7<String> implements RandomAccess, f9 {

    /* renamed from: y  reason: collision with root package name */
    public static final e9 f35736y;

    /* renamed from: z  reason: collision with root package name */
    public static final f9 f35737z;

    /* renamed from: x  reason: collision with root package name */
    public final List<Object> f35738x;

    static {
        e9 e9Var = new e9(10);
        f35736y = e9Var;
        e9Var.zzb();
        f35737z = e9Var;
    }

    public e9() {
        this(10);
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u7) {
            return ((u7) obj).w(b9.f35664b);
        }
        return b9.h((byte[]) obj);
    }

    @Override // hi.f9
    public final Object E(int i10) {
        return this.f35738x.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f35738x.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof f9) {
            collection = ((f9) collection).e();
        }
        boolean addAll = this.f35738x.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // hi.f9
    public final f9 c() {
        return b() ? new ab(this) : this;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f35738x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // hi.f9
    public final List<?> e() {
        return Collections.unmodifiableList(this.f35738x);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public final String get(int i10) {
        Object obj = this.f35738x.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u7) {
            u7 u7Var = (u7) obj;
            String w10 = u7Var.w(b9.f35664b);
            if (u7Var.p()) {
                this.f35738x.set(i10, w10);
            }
            return w10;
        }
        byte[] bArr = (byte[]) obj;
        String h10 = b9.h(bArr);
        if (b9.i(bArr)) {
            this.f35738x.set(i10, h10);
        }
        return h10;
    }

    @Override // hi.f9
    public final void k1(u7 u7Var) {
        d();
        this.f35738x.add(u7Var);
        ((AbstractList) this).modCount++;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        Object remove = this.f35738x.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        d();
        return g(this.f35738x.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35738x.size();
    }

    @Override // hi.a9
    public final /* bridge */ /* synthetic */ a9 v(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f35738x);
            return new e9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public e9(int i10) {
        this.f35738x = new ArrayList(i10);
    }

    public e9(ArrayList<Object> arrayList) {
        this.f35738x = arrayList;
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}

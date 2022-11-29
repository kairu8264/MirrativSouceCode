package ai;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class fj3 extends yg3<String> implements RandomAccess, gj3 {

    /* renamed from: y  reason: collision with root package name */
    public static final fj3 f4062y;

    /* renamed from: z  reason: collision with root package name */
    public static final gj3 f4063z;

    /* renamed from: x  reason: collision with root package name */
    public final List<Object> f4064x;

    static {
        fj3 fj3Var = new fj3(10);
        f4062y = fj3Var;
        fj3Var.zzb();
        f4063z = fj3Var;
    }

    public fj3() {
        this(10);
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof oh3) {
            return ((oh3) obj).d(bj3.f2374a);
        }
        return bj3.d((byte[]) obj);
    }

    @Override // ai.gj3
    public final Object Y(int i10) {
        return this.f4064x.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        d();
        this.f4064x.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof gj3) {
            collection = ((gj3) collection).e();
        }
        boolean addAll = this.f4064x.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f4064x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ai.gj3
    public final List<?> e() {
        return Collections.unmodifiableList(this.f4064x);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public final String get(int i10) {
        Object obj = this.f4064x.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof oh3) {
            oh3 oh3Var = (oh3) obj;
            String d10 = oh3Var.d(bj3.f2374a);
            if (oh3Var.B()) {
                this.f4064x.set(i10, d10);
            }
            return d10;
        }
        byte[] bArr = (byte[]) obj;
        String d11 = bj3.d(bArr);
        if (bj3.c(bArr)) {
            this.f4064x.set(i10, d11);
        }
        return d11;
    }

    @Override // ai.gj3
    public final gj3 h() {
        return zza() ? new il3(this) : this;
    }

    @Override // ai.aj3
    public final /* bridge */ /* synthetic */ aj3 i(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f4064x);
            return new fj3(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // ai.gj3
    public final void q(oh3 oh3Var) {
        d();
        this.f4064x.add(oh3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        Object remove = this.f4064x.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        d();
        return g(this.f4064x.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4064x.size();
    }

    public fj3(int i10) {
        this.f4064x = new ArrayList(i10);
    }

    public fj3(ArrayList<Object> arrayList) {
        this.f4064x = arrayList;
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}

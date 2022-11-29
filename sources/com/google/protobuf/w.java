package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public class w extends c<String> implements fn.i, RandomAccess {

    /* renamed from: y  reason: collision with root package name */
    public static final w f28228y;

    /* renamed from: z  reason: collision with root package name */
    public static final fn.i f28229z;

    /* renamed from: x  reason: collision with root package name */
    public final List<Object> f28230x;

    static {
        w wVar = new w();
        f28228y = wVar;
        wVar.C();
        f28229z = wVar;
    }

    public w() {
        this(10);
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            return ((f) obj).J();
        }
        return t.j((byte[]) obj);
    }

    @Override // fn.i
    public fn.i E1() {
        return L0() ? new fn.a0(this) : this;
    }

    @Override // fn.i
    public void I(f fVar) {
        d();
        this.f28230x.add(fVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, com.google.protobuf.t.i
    public /* bridge */ /* synthetic */ boolean L0() {
        return super.L0();
    }

    @Override // fn.i
    public Object L1(int i10) {
        return this.f28230x.get(i10);
    }

    @Override // fn.i
    public List<?> X() {
        return Collections.unmodifiableList(this.f28230x);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f28230x.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public void add(int i10, String str) {
        d();
        this.f28230x.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public String get(int i10) {
        Object obj = this.f28230x.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String J = fVar.J();
            if (fVar.r()) {
                this.f28230x.set(i10, J);
            }
            return J;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = t.j(bArr);
        if (t.g(bArr)) {
            this.f28230x.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: k */
    public w o(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f28230x);
            return new w(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public String remove(int i10) {
        d();
        Object remove = this.f28230x.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public String set(int i10, String str) {
        d();
        return g(this.f28230x.set(i10, str));
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28230x.size();
    }

    public w(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        d();
        if (collection instanceof fn.i) {
            collection = ((fn.i) collection).X();
        }
        boolean addAll = this.f28230x.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public w(ArrayList<Object> arrayList) {
        this.f28230x = arrayList;
    }
}

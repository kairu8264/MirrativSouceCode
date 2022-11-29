package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class i0<E> extends c<E> implements RandomAccess {

    /* renamed from: z  reason: collision with root package name */
    public static final i0<Object> f28147z;

    /* renamed from: x  reason: collision with root package name */
    public E[] f28148x;

    /* renamed from: y  reason: collision with root package name */
    public int f28149y;

    static {
        i0<Object> i0Var = new i0<>(new Object[0], 0);
        f28147z = i0Var;
        i0Var.C();
    }

    public i0(E[] eArr, int i10) {
        this.f28148x = eArr;
        this.f28149y = i10;
    }

    public static <E> E[] f(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> i0<E> g() {
        return (i0<E>) f28147z;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        d();
        int i10 = this.f28149y;
        E[] eArr = this.f28148x;
        if (i10 == eArr.length) {
            this.f28148x = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f28148x;
        int i11 = this.f28149y;
        this.f28149y = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        j(i10);
        return this.f28148x[i10];
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f28149y) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f28149y;
    }

    @Override // com.google.protobuf.t.i
    /* renamed from: l */
    public i0<E> o(int i10) {
        if (i10 >= this.f28149y) {
            return new i0<>(Arrays.copyOf(this.f28148x, i10), this.f28149y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        d();
        j(i10);
        E[] eArr = this.f28148x;
        E e10 = eArr[i10];
        if (i10 < this.f28149y - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f28149y--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d();
        j(i10);
        E[] eArr = this.f28148x;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28149y;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f28149y)) {
            E[] eArr = this.f28148x;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) f(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f28148x, 0, eArr2, 0, i10);
                System.arraycopy(this.f28148x, i10, eArr2, i10 + 1, this.f28149y - i10);
                this.f28148x = eArr2;
            }
            this.f28148x[i10] = e10;
            this.f28149y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }
}

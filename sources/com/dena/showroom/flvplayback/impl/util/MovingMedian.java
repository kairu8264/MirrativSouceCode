package com.dena.showroom.flvplayback.impl.util;

import java.lang.Comparable;
import java.util.ArrayDeque;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class MovingMedian<T extends Comparable<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final int f26621a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<a<T>> f26622b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet<a<T>> f26623c = new TreeSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final TreeSet<a<T>> f26624d = new TreeSet<>();

    /* renamed from: e  reason: collision with root package name */
    public int f26625e = 0;

    /* loaded from: classes3.dex */
    public static class a<T extends Comparable<T>> implements Comparable<a<T>> {

        /* renamed from: w  reason: collision with root package name */
        public final T f26626w;

        /* renamed from: x  reason: collision with root package name */
        public final int f26627x;

        public a(T t10, int i10) {
            this.f26626w = t10;
            this.f26627x = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a<T> aVar) {
            int compareTo = this.f26626w.compareTo(aVar.f26626w);
            return compareTo == 0 ? this.f26627x - aVar.f26627x : compareTo;
        }
    }

    public MovingMedian(int i10) {
        this.f26621a = i10;
    }

    public final void a() {
        while (true) {
            int size = this.f26624d.size() - this.f26623c.size();
            if (size * size <= 1) {
                return;
            }
            if (size < 0) {
                this.f26624d.add(this.f26623c.pollFirst());
            } else {
                this.f26623c.add(this.f26624d.pollLast());
            }
        }
    }

    public void clear() {
        this.f26622b.clear();
        this.f26623c.clear();
        this.f26624d.clear();
    }

    public T getOr(T t10) {
        return this.f26622b.isEmpty() ? t10 : value();
    }

    public boolean isFilled() {
        return size() == this.f26621a;
    }

    public T max() {
        TreeSet<a<T>> treeSet;
        if (this.f26623c.isEmpty()) {
            treeSet = this.f26624d;
        } else {
            treeSet = this.f26623c;
        }
        return treeSet.last().f26626w;
    }

    public T min() {
        return this.f26624d.first().f26626w;
    }

    public int size() {
        return this.f26622b.size();
    }

    public void update(T t10) {
        if (this.f26622b.size() == this.f26623c.size() + this.f26624d.size()) {
            int i10 = this.f26625e + 1;
            this.f26625e = i10;
            a<T> aVar = new a<>(t10, i10);
            this.f26622b.addLast(aVar);
            if (this.f26624d.isEmpty()) {
                this.f26624d.add(aVar);
                return;
            }
            if (this.f26622b.size() > this.f26621a) {
                a<T> removeFirst = this.f26622b.removeFirst();
                if (this.f26624d.last().compareTo(removeFirst) < 0) {
                    this.f26623c.remove(removeFirst);
                } else {
                    this.f26624d.remove(removeFirst);
                }
            }
            if (this.f26624d.last().compareTo(aVar) < 0) {
                this.f26623c.add(aVar);
            } else {
                this.f26624d.add(aVar);
            }
            a();
            return;
        }
        throw new IllegalStateException();
    }

    public T value() {
        return this.f26624d.last().f26626w;
    }
}

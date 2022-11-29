package l0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<T> f38966a = new ArrayList<>();

    public final void a() {
        this.f38966a.clear();
    }

    public final int b() {
        return this.f38966a.size();
    }

    public final boolean c() {
        return this.f38966a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.f38966a.get(b() - 1);
    }

    public final T f(int i10) {
        return this.f38966a.get(i10);
    }

    public final T g() {
        return this.f38966a.remove(b() - 1);
    }

    public final boolean h(T t10) {
        return this.f38966a.add(t10);
    }

    public final T[] i() {
        int size = this.f38966a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f38966a.get(i10);
        }
        return tArr;
    }
}

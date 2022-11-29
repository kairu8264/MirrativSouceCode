package xn;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class b<T> implements Iterator<T>, ko.a {

    /* renamed from: w  reason: collision with root package name */
    public v0 f60426w = v0.NotReady;

    /* renamed from: x  reason: collision with root package name */
    public T f60427x;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60428a;

        static {
            int[] iArr = new int[v0.values().length];
            iArr[v0.Done.ordinal()] = 1;
            iArr[v0.Ready.ordinal()] = 2;
            f60428a = iArr;
        }
    }

    public abstract void b();

    public final void d() {
        this.f60426w = v0.Done;
    }

    public final void e(T t10) {
        this.f60427x = t10;
        this.f60426w = v0.Ready;
    }

    public final boolean f() {
        this.f60426w = v0.Failed;
        b();
        return this.f60426w == v0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        v0 v0Var = this.f60426w;
        if (v0Var != v0.Failed) {
            int i10 = a.f60428a[v0Var.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return f();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f60426w = v0.NotReady;
            return this.f60427x;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

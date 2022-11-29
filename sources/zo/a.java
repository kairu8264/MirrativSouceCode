package zo;

import java.util.Objects;

/* loaded from: classes4.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f63271a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public int f63272b;

    /* renamed from: c  reason: collision with root package name */
    public int f63273c;

    public final void a(T t10) {
        Object[] objArr = this.f63271a;
        int i10 = this.f63273c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f63273c = length;
        if (length == this.f63272b) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = this.f63271a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        xn.n.m(objArr, objArr2, 0, this.f63272b, 0, 10, null);
        Object[] objArr3 = this.f63271a;
        int length2 = objArr3.length;
        int i10 = this.f63272b;
        xn.n.m(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f63271a = objArr2;
        this.f63272b = 0;
        this.f63273c = length;
    }

    public final boolean c() {
        return this.f63272b == this.f63273c;
    }

    public final T d() {
        int i10 = this.f63272b;
        if (i10 == this.f63273c) {
            return null;
        }
        Object[] objArr = this.f63271a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f63272b = (i10 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t10, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t10;
    }
}

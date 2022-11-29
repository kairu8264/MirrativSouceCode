package n3;

/* loaded from: classes.dex */
public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f41561a;

    /* renamed from: b  reason: collision with root package name */
    public int f41562b;

    public f(int i10) {
        if (i10 > 0) {
            this.f41561a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // n3.e
    public boolean a(T t10) {
        if (!b(t10)) {
            int i10 = this.f41562b;
            Object[] objArr = this.f41561a;
            if (i10 < objArr.length) {
                objArr[i10] = t10;
                this.f41562b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // n3.e
    public T acquire() {
        int i10 = this.f41562b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f41561a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f41562b = i10 - 1;
            return t10;
        }
        return null;
    }

    public final boolean b(T t10) {
        for (int i10 = 0; i10 < this.f41562b; i10++) {
            if (this.f41561a[i10] == t10) {
                return true;
            }
        }
        return false;
    }
}

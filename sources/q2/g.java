package q2;

/* loaded from: classes.dex */
public class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f48685a;

    /* renamed from: b  reason: collision with root package name */
    public int f48686b;

    public g(int i10) {
        if (i10 > 0) {
            this.f48685a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // q2.f
    public boolean a(T t10) {
        int i10 = this.f48686b;
        Object[] objArr = this.f48685a;
        if (i10 < objArr.length) {
            objArr[i10] = t10;
            this.f48686b = i10 + 1;
            return true;
        }
        return false;
    }

    @Override // q2.f
    public T acquire() {
        int i10 = this.f48686b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = this.f48685a;
            T t10 = (T) objArr[i11];
            objArr[i11] = null;
            this.f48686b = i10 - 1;
            return t10;
        }
        return null;
    }

    @Override // q2.f
    public void b(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f48686b;
            Object[] objArr = this.f48685a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f48686b = i12 + 1;
            }
        }
    }
}

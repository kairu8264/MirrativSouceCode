package ai;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i03<E> extends sz2<E> {

    /* renamed from: d  reason: collision with root package name */
    public Object[] f5066d;

    /* renamed from: e  reason: collision with root package name */
    public int f5067e;

    public i03(int i10) {
        super(i10);
        this.f5066d = new Object[j03.u(i10)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.tz2
    public final /* bridge */ /* synthetic */ tz2 a(Object obj) {
        f(obj);
        return this;
    }

    public final i03<E> f(E e10) {
        Objects.requireNonNull(e10);
        if (this.f5066d != null) {
            int u10 = j03.u(this.f10041b);
            int length = this.f5066d.length;
            if (u10 <= length) {
                int i10 = length - 1;
                int hashCode = e10.hashCode();
                int a10 = rz2.a(hashCode);
                while (true) {
                    int i11 = a10 & i10;
                    Object[] objArr = this.f5066d;
                    Object obj = objArr[i11];
                    if (obj == null) {
                        objArr[i11] = e10;
                        this.f5067e += hashCode;
                        super.c(e10);
                        break;
                    } else if (obj.equals(e10)) {
                        break;
                    } else {
                        a10 = i11 + 1;
                    }
                }
                return this;
            }
        }
        this.f5066d = null;
        super.c(e10);
        return this;
    }

    public final i03<E> g(Iterable<? extends E> iterable) {
        if (this.f5066d != null) {
            for (E e10 : iterable) {
                f(e10);
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final j03<E> h() {
        j03<E> A;
        boolean B;
        int i10 = this.f10041b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.f5066d != null && j03.u(i10) == this.f5066d.length) {
                    B = j03.B(this.f10041b, this.f10040a.length);
                    Object[] copyOf = B ? Arrays.copyOf(this.f10040a, this.f10041b) : this.f10040a;
                    int i11 = this.f5067e;
                    Object[] objArr = this.f5066d;
                    A = new t13<>(copyOf, i11, objArr, objArr.length - 1, this.f10041b);
                } else {
                    A = j03.A(this.f10041b, this.f10040a);
                    this.f10041b = A.size();
                }
                this.f10042c = true;
                this.f5066d = null;
                return A;
            }
            Object obj = this.f10040a[0];
            obj.getClass();
            return new y13(obj);
        }
        return t13.E;
    }
}

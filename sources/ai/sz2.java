package ai;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class sz2<E> extends tz2<E> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f10040a;

    /* renamed from: b  reason: collision with root package name */
    public int f10041b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10042c;

    public sz2(int i10) {
        this.f10040a = new Object[i10];
    }

    public final sz2<E> c(E e10) {
        Objects.requireNonNull(e10);
        e(this.f10041b + 1);
        Object[] objArr = this.f10040a;
        int i10 = this.f10041b;
        this.f10041b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tz2<E> d(Iterable<? extends E> iterable) {
        e(this.f10041b + iterable.size());
        if (!(iterable instanceof uz2)) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
        this.f10041b = ((uz2) iterable).m(this.f10040a, this.f10041b);
        return this;
    }

    public final void e(int i10) {
        Object[] objArr = this.f10040a;
        int length = objArr.length;
        if (length < i10) {
            this.f10040a = Arrays.copyOf(objArr, tz2.b(length, i10));
            this.f10042c = false;
        } else if (this.f10042c) {
            this.f10040a = (Object[]) objArr.clone();
            this.f10042c = false;
        }
    }
}

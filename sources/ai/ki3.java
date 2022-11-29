package ai;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ki3 extends yg3<Float> implements RandomAccess, ek3 {

    /* renamed from: z  reason: collision with root package name */
    public static final ki3 f6242z;

    /* renamed from: x  reason: collision with root package name */
    public float[] f6243x;

    /* renamed from: y  reason: collision with root package name */
    public int f6244y;

    static {
        ki3 ki3Var = new ki3(new float[0], 0);
        f6242z = ki3Var;
        ki3Var.zzb();
    }

    public ki3() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f6244y)) {
            float[] fArr = this.f6243x;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f6243x, i10, fArr2, i10 + 1, this.f6244y - i10);
                this.f6243x = fArr2;
            }
            this.f6243x[i10] = floatValue;
            this.f6244y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }

    @Override // ai.yg3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        bj3.a(collection);
        if (!(collection instanceof ki3)) {
            return super.addAll(collection);
        }
        ki3 ki3Var = (ki3) collection;
        int i10 = ki3Var.f6244y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f6244y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f6243x;
            if (i12 > fArr.length) {
                this.f6243x = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(ki3Var.f6243x, 0, this.f6243x, this.f6244y, ki3Var.f6244y);
            this.f6244y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki3)) {
            return super.equals(obj);
        }
        ki3 ki3Var = (ki3) obj;
        if (this.f6244y != ki3Var.f6244y) {
            return false;
        }
        float[] fArr = ki3Var.f6243x;
        for (int i10 = 0; i10 < this.f6244y; i10++) {
            if (Float.floatToIntBits(this.f6243x[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f10) {
        d();
        int i10 = this.f6244y;
        float[] fArr = this.f6243x;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6243x = fArr2;
        }
        float[] fArr3 = this.f6243x;
        int i11 = this.f6244y;
        this.f6244y = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f6244y) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f6243x[i10]);
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6244y; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f6243x[i11]);
        }
        return i10;
    }

    @Override // ai.aj3
    public final /* bridge */ /* synthetic */ aj3 i(int i10) {
        if (i10 >= this.f6244y) {
            return new ki3(Arrays.copyOf(this.f6243x, i10), this.f6244y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f6244y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f6243x[i11] == floatValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final String j(int i10) {
        int i11 = this.f6244y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        g(i10);
        float[] fArr = this.f6243x;
        float f10 = fArr[i10];
        if (i10 < this.f6244y - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f6244y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            float[] fArr = this.f6243x;
            System.arraycopy(fArr, i11, fArr, i10, this.f6244y - i11);
            this.f6244y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        g(i10);
        float[] fArr = this.f6243x;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6244y;
    }

    public ki3(float[] fArr, int i10) {
        this.f6243x = fArr;
        this.f6244y = i10;
    }

    @Override // ai.yg3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}

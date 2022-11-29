package hi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class n8 extends f7<Float> implements RandomAccess, da {

    /* renamed from: z  reason: collision with root package name */
    public static final n8 f35872z;

    /* renamed from: x  reason: collision with root package name */
    public float[] f35873x;

    /* renamed from: y  reason: collision with root package name */
    public int f35874y;

    static {
        n8 n8Var = new n8(new float[0], 0);
        f35872z = n8Var;
        n8Var.zzb();
    }

    public n8() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f35874y)) {
            float[] fArr = this.f35873x;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f35873x, i10, fArr2, i10 + 1, this.f35874y - i10);
                this.f35873x = fArr2;
            }
            this.f35873x[i10] = floatValue;
            this.f35874y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }

    @Override // hi.f7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        b9.e(collection);
        if (!(collection instanceof n8)) {
            return super.addAll(collection);
        }
        n8 n8Var = (n8) collection;
        int i10 = n8Var.f35874y;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f35874y;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f35873x;
            if (i12 > fArr.length) {
                this.f35873x = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(n8Var.f35873x, 0, this.f35873x, this.f35874y, n8Var.f35874y);
            this.f35874y = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return super.equals(obj);
        }
        n8 n8Var = (n8) obj;
        if (this.f35874y != n8Var.f35874y) {
            return false;
        }
        float[] fArr = n8Var.f35873x;
        for (int i10 = 0; i10 < this.f35874y; i10++) {
            if (Float.floatToIntBits(this.f35873x[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f10) {
        d();
        int i10 = this.f35874y;
        float[] fArr = this.f35873x;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f35873x = fArr2;
        }
        float[] fArr3 = this.f35873x;
        int i11 = this.f35874y;
        this.f35874y = i11 + 1;
        fArr3[i11] = f10;
    }

    public final String g(int i10) {
        int i11 = this.f35874y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Float.valueOf(this.f35873x[i10]);
    }

    @Override // hi.f7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f35874y; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f35873x[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f35874y;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f35873x[i11] == floatValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i10) {
        if (i10 < 0 || i10 >= this.f35874y) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // hi.f7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        d();
        j(i10);
        float[] fArr = this.f35873x;
        float f10 = fArr[i10];
        if (i10 < this.f35874y - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f35874y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 >= i10) {
            float[] fArr = this.f35873x;
            System.arraycopy(fArr, i11, fArr, i10, this.f35874y - i11);
            this.f35874y -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        j(i10);
        float[] fArr = this.f35873x;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35874y;
    }

    @Override // hi.a9
    public final /* bridge */ /* synthetic */ a9 v(int i10) {
        if (i10 >= this.f35874y) {
            return new n8(Arrays.copyOf(this.f35873x, i10), this.f35874y);
        }
        throw new IllegalArgumentException();
    }

    public n8(float[] fArr, int i10) {
        this.f35873x = fArr;
        this.f35874y = i10;
    }

    @Override // hi.f7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}

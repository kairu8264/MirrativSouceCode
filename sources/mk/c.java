package mk;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kk.j;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class c {

    /* loaded from: classes3.dex */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: w  reason: collision with root package name */
        public final int[] f41202w;

        /* renamed from: x  reason: collision with root package name */
        public final int f41203x;

        /* renamed from: y  reason: collision with root package name */
        public final int f41204y;

        public a(int[] iArr, int i10, int i11) {
            this.f41202w = iArr;
            this.f41203x = i10;
            this.f41204y = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && c.g(this.f41202w, ((Integer) obj).intValue(), this.f41203x, this.f41204y) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer get(int i10) {
            j.g(i10, size());
            return Integer.valueOf(this.f41202w[this.f41203x + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f41202w[this.f41203x + i10] != aVar.f41202w[aVar.f41203x + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f */
        public Integer set(int i10, Integer num) {
            j.g(i10, size());
            int[] iArr = this.f41202w;
            int i11 = this.f41203x;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) j.i(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int[] g() {
            return Arrays.copyOfRange(this.f41202w, this.f41203x, this.f41204y);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f41203x; i11 < this.f41204y; i11++) {
                i10 = (i10 * 31) + c.e(this.f41202w[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int g10;
            if (!(obj instanceof Integer) || (g10 = c.g(this.f41202w, ((Integer) obj).intValue(), this.f41203x, this.f41204y)) < 0) {
                return -1;
            }
            return g10 - this.f41203x;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int h10;
            if (!(obj instanceof Integer) || (h10 = c.h(this.f41202w, ((Integer) obj).intValue(), this.f41203x, this.f41204y)) < 0) {
                return -1;
            }
            return h10 - this.f41203x;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f41204y - this.f41203x;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            j.m(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f41202w;
            int i12 = this.f41203x;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f41202w[this.f41203x]);
            int i10 = this.f41203x;
            while (true) {
                i10++;
                if (i10 < this.f41204y) {
                    sb2.append(", ");
                    sb2.append(this.f41202w[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    public static int c(long j10) {
        int i10 = (int) j10;
        j.f(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int e(int i10) {
        return i10;
    }

    public static int f(int[] iArr, int i10) {
        return g(iArr, i10, 0, iArr.length);
    }

    public static int g(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int h(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int i(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] j(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) j.i(array[i10])).intValue();
        }
        return iArr;
    }
}

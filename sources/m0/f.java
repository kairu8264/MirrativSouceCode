package m0;

import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public static final void c(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void d(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        } else if (i10 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
        } else if (i11 <= size) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }
}

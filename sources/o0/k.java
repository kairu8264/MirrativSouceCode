package o0;

import java.util.NoSuchElementException;
import java.util.Objects;
import jo.p;

/* loaded from: classes.dex */
public final class k<E> extends a<E> {
    public boolean A;

    /* renamed from: y  reason: collision with root package name */
    public int f43795y;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f43796z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        p.h(objArr, "root");
        this.f43795y = i12;
        Object[] objArr2 = new Object[i12];
        this.f43796z = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.A = r52;
        objArr2[0] = objArr;
        j(i10 - r52, 1);
    }

    public final E i() {
        Object obj = this.f43796z[this.f43795y - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[e() & 31];
    }

    public final void j(int i10, int i11) {
        int i12 = (this.f43795y - i11) * 5;
        while (i11 < this.f43795y) {
            Object[] objArr = this.f43796z;
            Object[] objArr2 = objArr[i11 - 1];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = objArr2[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void k(int i10) {
        int i11 = 0;
        while (l.a(e(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            j(e(), ((this.f43795y - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void m(Object[] objArr, int i10, int i11, int i12) {
        p.h(objArr, "root");
        g(i10);
        h(i11);
        this.f43795y = i12;
        if (this.f43796z.length < i12) {
            this.f43796z = new Object[i12];
        }
        this.f43796z[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.A = r02;
        j(i10 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E i10 = i();
            g(e() + 1);
            if (e() == f()) {
                this.A = true;
                return i10;
            }
            k(0);
            return i10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            g(e() - 1);
            if (this.A) {
                this.A = false;
                return i();
            }
            k(31);
            return i();
        }
        throw new NoSuchElementException();
    }
}

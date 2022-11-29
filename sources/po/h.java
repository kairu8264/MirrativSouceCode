package po;

import java.util.NoSuchElementException;
import xn.i0;

/* loaded from: classes4.dex */
public final class h extends i0 {

    /* renamed from: w  reason: collision with root package name */
    public final int f48471w;

    /* renamed from: x  reason: collision with root package name */
    public final int f48472x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f48473y;

    /* renamed from: z  reason: collision with root package name */
    public int f48474z;

    public h(int i10, int i11, int i12) {
        this.f48471w = i12;
        this.f48472x = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f48473y = z10;
        this.f48474z = z10 ? i10 : i11;
    }

    @Override // xn.i0
    public int b() {
        int i10 = this.f48474z;
        if (i10 == this.f48472x) {
            if (this.f48473y) {
                this.f48473y = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f48474z = this.f48471w + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48473y;
    }
}

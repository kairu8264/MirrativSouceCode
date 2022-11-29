package po;

import java.util.NoSuchElementException;
import jo.p;
import xn.q;

/* loaded from: classes4.dex */
public final class b extends q {

    /* renamed from: w  reason: collision with root package name */
    public final int f48461w;

    /* renamed from: x  reason: collision with root package name */
    public final int f48462x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f48463y;

    /* renamed from: z  reason: collision with root package name */
    public int f48464z;

    public b(char c10, char c11, int i10) {
        this.f48461w = i10;
        this.f48462x = c11;
        boolean z10 = true;
        if (i10 <= 0 ? p.j(c10, c11) < 0 : p.j(c10, c11) > 0) {
            z10 = false;
        }
        this.f48463y = z10;
        this.f48464z = z10 ? c10 : c11;
    }

    @Override // xn.q
    public char b() {
        int i10 = this.f48464z;
        if (i10 == this.f48462x) {
            if (this.f48463y) {
                this.f48463y = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f48464z = this.f48461w + i10;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48463y;
    }
}

package hi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class s implements Iterator<q> {

    /* renamed from: w  reason: collision with root package name */
    public int f35982w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f35983x;

    public s(u uVar) {
        this.f35983x = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f35982w;
        str = this.f35983x.f36007w;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        String str;
        int i10 = this.f35982w;
        str = this.f35983x.f36007w;
        if (i10 < str.length()) {
            int i11 = this.f35982w;
            this.f35982w = i11 + 1;
            return new u(String.valueOf(i11));
        }
        throw new NoSuchElementException();
    }
}

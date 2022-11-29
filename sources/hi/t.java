package hi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class t implements Iterator<q> {

    /* renamed from: w  reason: collision with root package name */
    public int f35992w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f35993x;

    public t(u uVar) {
        this.f35993x = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.f35992w;
        str = this.f35993x.f36007w;
        return i10 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        String str;
        String str2;
        int i10 = this.f35992w;
        str = this.f35993x.f36007w;
        if (i10 < str.length()) {
            str2 = this.f35993x.f36007w;
            int i11 = this.f35992w;
            this.f35992w = i11 + 1;
            return new u(String.valueOf(str2.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}

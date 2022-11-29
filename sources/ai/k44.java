package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class k44 {

    /* renamed from: d  reason: collision with root package name */
    public static final Comparator<byte[]> f6079d = new j44();

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f6080a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<byte[]> f6081b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    public int f6082c = 0;

    public k44(int i10) {
    }

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f6081b.size(); i11++) {
            byte[] bArr = this.f6081b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f6082c -= length;
                this.f6081b.remove(i11);
                this.f6080a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f6080a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f6081b, bArr, f6079d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f6081b.add(binarySearch, bArr);
                this.f6082c += length;
                c();
            }
        }
    }

    public final synchronized void c() {
        while (this.f6082c > 4096) {
            byte[] remove = this.f6080a.remove(0);
            this.f6081b.remove(remove);
            this.f6082c -= remove.length;
        }
    }
}

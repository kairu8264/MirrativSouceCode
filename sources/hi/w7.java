package hi;

import com.google.android.gms.internal.measurement.zzkh;

/* loaded from: classes3.dex */
public final class w7 extends y7 {

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f36041b;

    /* renamed from: c  reason: collision with root package name */
    public int f36042c;

    /* renamed from: d  reason: collision with root package name */
    public int f36043d;

    /* renamed from: e  reason: collision with root package name */
    public int f36044e;

    public /* synthetic */ w7(byte[] bArr, int i10, int i11, boolean z10, v7 v7Var) {
        super(null);
        this.f36044e = Integer.MAX_VALUE;
        this.f36041b = bArr;
        this.f36042c = 0;
    }

    public final int c(int i10) throws zzkh {
        int i11 = this.f36044e;
        this.f36044e = 0;
        int i12 = this.f36042c + this.f36043d;
        this.f36042c = i12;
        if (i12 > 0) {
            this.f36043d = i12;
            this.f36042c = 0;
        } else {
            this.f36043d = 0;
        }
        return i11;
    }
}

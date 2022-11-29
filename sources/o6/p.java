package o6;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f44108a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f44109b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f44110c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44111d;

    public p(boolean z10, boolean z11, boolean z12, int i10) {
        this.f44108a = z10;
        this.f44109b = z11;
        this.f44110c = z12;
        this.f44111d = i10;
    }

    public final boolean a() {
        return this.f44108a;
    }

    public final int b() {
        return this.f44111d;
    }

    public final boolean c() {
        return this.f44109b;
    }

    public final boolean d() {
        return this.f44110c;
    }

    public /* synthetic */ p(boolean z10, boolean z11, boolean z12, int i10, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10);
    }
}

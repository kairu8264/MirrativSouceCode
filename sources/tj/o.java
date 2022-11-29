package tj;

/* loaded from: classes3.dex */
public class o extends f {

    /* renamed from: a  reason: collision with root package name */
    public final float f53767a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f53768b;

    public o(float f10, boolean z10) {
        this.f53767a = f10;
        this.f53768b = z10;
    }

    @Override // tj.f
    public void c(float f10, float f11, float f12, m mVar) {
        mVar.m(f11 - (this.f53767a * f12), 0.0f);
        mVar.m(f11, (this.f53768b ? this.f53767a : -this.f53767a) * f12);
        mVar.m(f11 + (this.f53767a * f12), 0.0f);
        mVar.m(f10, 0.0f);
    }
}

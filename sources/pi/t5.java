package pi;

/* loaded from: classes3.dex */
public final class t5 implements Runnable {
    public final /* synthetic */ u5 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48233w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48234x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f48235y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f48236z;

    public t5(u5 u5Var, String str, String str2, String str3, long j10) {
        this.A = u5Var;
        this.f48233w = str;
        this.f48234x = str2;
        this.f48235y = str3;
        this.f48236z = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ba baVar;
        ba baVar2;
        String str = this.f48233w;
        if (str == null) {
            baVar2 = this.A.f48261w;
            baVar2.b0().K().G(this.f48234x, null);
            return;
        }
        p7 p7Var = new p7(this.f48235y, str, this.f48236z);
        baVar = this.A.f48261w;
        baVar.b0().K().G(this.f48234x, p7Var);
    }
}

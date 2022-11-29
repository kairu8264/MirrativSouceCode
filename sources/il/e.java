package il;

/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f36855a;

    /* renamed from: b  reason: collision with root package name */
    public final c f36856b;

    /* renamed from: c  reason: collision with root package name */
    public final b f36857c;

    /* renamed from: d  reason: collision with root package name */
    public final long f36858d;

    /* renamed from: e  reason: collision with root package name */
    public final int f36859e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36860f;

    public e(long j10, a aVar, c cVar, b bVar, int i10, int i11) {
        this.f36858d = j10;
        this.f36855a = aVar;
        this.f36856b = cVar;
        this.f36857c = bVar;
        this.f36859e = i10;
        this.f36860f = i11;
    }

    @Override // il.d
    public b a() {
        return this.f36857c;
    }

    @Override // il.d
    public c b() {
        return this.f36856b;
    }

    public a c() {
        return this.f36855a;
    }

    public long d() {
        return this.f36858d;
    }

    public boolean e(long j10) {
        return this.f36858d < j10;
    }
}

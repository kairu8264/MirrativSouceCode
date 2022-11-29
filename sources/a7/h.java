package a7;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final a f576a;

    /* renamed from: b  reason: collision with root package name */
    public final z6.h f577b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.d f578c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f579d;

    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, z6.h hVar, z6.d dVar, boolean z10) {
        this.f576a = aVar;
        this.f577b = hVar;
        this.f578c = dVar;
        this.f579d = z10;
    }

    public a a() {
        return this.f576a;
    }

    public z6.h b() {
        return this.f577b;
    }

    public z6.d c() {
        return this.f578c;
    }

    public boolean d() {
        return this.f579d;
    }
}

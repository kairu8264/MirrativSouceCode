package hn;

/* loaded from: classes4.dex */
public class j0 {

    /* renamed from: b  reason: collision with root package name */
    public a f36199b = a.NONE;

    /* renamed from: a  reason: collision with root package name */
    public v0 f36198a = v0.CREATED;

    /* loaded from: classes4.dex */
    public enum a {
        NONE,
        SERVER,
        CLIENT
    }

    public void a(a aVar) {
        this.f36198a = v0.CLOSING;
        if (this.f36199b == a.NONE) {
            this.f36199b = aVar;
        }
    }

    public boolean b() {
        return this.f36199b == a.SERVER;
    }

    public v0 c() {
        return this.f36198a;
    }

    public void d(v0 v0Var) {
        this.f36198a = v0Var;
    }
}

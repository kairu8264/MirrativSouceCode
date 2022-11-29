package t;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final s f52912a;

    /* renamed from: b  reason: collision with root package name */
    public final z f52913b;

    /* renamed from: c  reason: collision with root package name */
    public final i f52914c;

    /* renamed from: d  reason: collision with root package name */
    public final w f52915d;

    public e0() {
        this(null, null, null, null, 15, null);
    }

    public e0(s sVar, z zVar, i iVar, w wVar) {
        this.f52912a = sVar;
        this.f52913b = zVar;
        this.f52914c = iVar;
        this.f52915d = wVar;
    }

    public final i a() {
        return this.f52914c;
    }

    public final s b() {
        return this.f52912a;
    }

    public final w c() {
        return this.f52915d;
    }

    public final z d() {
        return this.f52913b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return jo.p.c(this.f52912a, e0Var.f52912a) && jo.p.c(this.f52913b, e0Var.f52913b) && jo.p.c(this.f52914c, e0Var.f52914c) && jo.p.c(this.f52915d, e0Var.f52915d);
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f52912a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        z zVar = this.f52913b;
        int hashCode2 = (hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        i iVar = this.f52914c;
        int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        w wVar = this.f52915d;
        return hashCode3 + (wVar != null ? wVar.hashCode() : 0);
    }

    public String toString() {
        return "TransitionData(fade=" + this.f52912a + ", slide=" + this.f52913b + ", changeSize=" + this.f52914c + ", scale=" + this.f52915d + ')';
    }

    public /* synthetic */ e0(s sVar, z zVar, i iVar, w wVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? null : sVar, (i10 & 2) != 0 ? null : zVar, (i10 & 4) != 0 ? null : iVar, (i10 & 8) != 0 ? null : wVar);
    }
}

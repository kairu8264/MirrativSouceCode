package v9;

import jo.p;
import l0.s0;
import l0.z1;
import v9.b;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public s0<b.a> f57000a;

    /* renamed from: b  reason: collision with root package name */
    public final u.a<Float, u.m> f57001b;

    /* renamed from: c  reason: collision with root package name */
    public final u.a<Float, u.m> f57002c;

    /* renamed from: d  reason: collision with root package name */
    public s0<Boolean> f57003d;

    /* renamed from: e  reason: collision with root package name */
    public final u.a<Float, u.m> f57004e;

    /* renamed from: f  reason: collision with root package name */
    public final u.a<Float, u.m> f57005f;

    /* renamed from: g  reason: collision with root package name */
    public s0<Boolean> f57006g;

    /* renamed from: h  reason: collision with root package name */
    public final u.a<Float, u.m> f57007h;

    public i() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public i(s0<b.a> s0Var, u.a<Float, u.m> aVar, u.a<Float, u.m> aVar2, s0<Boolean> s0Var2, u.a<Float, u.m> aVar3, u.a<Float, u.m> aVar4, s0<Boolean> s0Var3, u.a<Float, u.m> aVar5) {
        p.h(s0Var, "playState");
        p.h(aVar, "gachaImageScale");
        p.h(aVar2, "gachaImageAlpha");
        p.h(s0Var2, "isGachaImageVisible");
        p.h(aVar3, "itemImageScale");
        p.h(aVar4, "itemImageAlpha");
        p.h(s0Var3, "isItemImageVisible");
        p.h(aVar5, "itemInfoAlpha");
        this.f57000a = s0Var;
        this.f57001b = aVar;
        this.f57002c = aVar2;
        this.f57003d = s0Var2;
        this.f57004e = aVar3;
        this.f57005f = aVar4;
        this.f57006g = s0Var3;
        this.f57007h = aVar5;
    }

    @Override // v9.b
    public s0<b.a> a() {
        return this.f57000a;
    }

    public final u.a<Float, u.m> b() {
        return this.f57002c;
    }

    public final u.a<Float, u.m> c() {
        return this.f57001b;
    }

    public final u.a<Float, u.m> d() {
        return this.f57005f;
    }

    public final u.a<Float, u.m> e() {
        return this.f57004e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return p.c(a(), iVar.a()) && p.c(this.f57001b, iVar.f57001b) && p.c(this.f57002c, iVar.f57002c) && p.c(this.f57003d, iVar.f57003d) && p.c(this.f57004e, iVar.f57004e) && p.c(this.f57005f, iVar.f57005f) && p.c(this.f57006g, iVar.f57006g) && p.c(this.f57007h, iVar.f57007h);
        }
        return false;
    }

    public final u.a<Float, u.m> f() {
        return this.f57007h;
    }

    @Override // v9.b
    public void finish() {
        b.C0909b.a(this);
    }

    public final s0<Boolean> g() {
        return this.f57003d;
    }

    public final s0<Boolean> h() {
        return this.f57006g;
    }

    public int hashCode() {
        return (((((((((((((a().hashCode() * 31) + this.f57001b.hashCode()) * 31) + this.f57002c.hashCode()) * 31) + this.f57003d.hashCode()) * 31) + this.f57004e.hashCode()) * 31) + this.f57005f.hashCode()) * 31) + this.f57006g.hashCode()) * 31) + this.f57007h.hashCode();
    }

    @Override // v9.b
    public void play() {
        b.C0909b.b(this);
    }

    public String toString() {
        return "EmomoQuestEquipmentGachaNormalItemAnimationState(playState=" + a() + ", gachaImageScale=" + this.f57001b + ", gachaImageAlpha=" + this.f57002c + ", isGachaImageVisible=" + this.f57003d + ", itemImageScale=" + this.f57004e + ", itemImageAlpha=" + this.f57005f + ", isItemImageVisible=" + this.f57006g + ", itemInfoAlpha=" + this.f57007h + ')';
    }

    public /* synthetic */ i(s0 s0Var, u.a aVar, u.a aVar2, s0 s0Var2, u.a aVar3, u.a aVar4, s0 s0Var3, u.a aVar5, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? z1.e(b.a.UnPlayed, null, 2, null) : s0Var, (i10 & 2) != 0 ? u.b.b(1.0f, 0.0f, 2, null) : aVar, (i10 & 4) != 0 ? u.b.b(1.0f, 0.0f, 2, null) : aVar2, (i10 & 8) != 0 ? z1.e(Boolean.TRUE, null, 2, null) : s0Var2, (i10 & 16) != 0 ? u.b.b(0.8f, 0.0f, 2, null) : aVar3, (i10 & 32) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar4, (i10 & 64) != 0 ? z1.e(Boolean.FALSE, null, 2, null) : s0Var3, (i10 & 128) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar5);
    }
}

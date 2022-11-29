package v9;

import jo.p;
import l0.s0;
import l0.z1;
import v9.b;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    public s0<b.a> f57070a;

    /* renamed from: b  reason: collision with root package name */
    public final u.a<Float, u.m> f57071b;

    /* renamed from: c  reason: collision with root package name */
    public final u.a<Float, u.m> f57072c;

    /* renamed from: d  reason: collision with root package name */
    public final u.a<Float, u.m> f57073d;

    /* renamed from: e  reason: collision with root package name */
    public final u.a<Float, u.m> f57074e;

    /* renamed from: f  reason: collision with root package name */
    public final u.a<Float, u.m> f57075f;

    /* renamed from: g  reason: collision with root package name */
    public s0<Boolean> f57076g;

    /* renamed from: h  reason: collision with root package name */
    public final u.a<Float, u.m> f57077h;

    /* renamed from: i  reason: collision with root package name */
    public final u.a<Float, u.m> f57078i;

    /* renamed from: j  reason: collision with root package name */
    public s0<Boolean> f57079j;

    /* renamed from: k  reason: collision with root package name */
    public final u.a<Float, u.m> f57080k;

    public l() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public l(s0<b.a> s0Var, u.a<Float, u.m> aVar, u.a<Float, u.m> aVar2, u.a<Float, u.m> aVar3, u.a<Float, u.m> aVar4, u.a<Float, u.m> aVar5, s0<Boolean> s0Var2, u.a<Float, u.m> aVar6, u.a<Float, u.m> aVar7, s0<Boolean> s0Var3, u.a<Float, u.m> aVar8) {
        p.h(s0Var, "playState");
        p.h(aVar, "kirakiraAlpha");
        p.h(aVar2, "kirakiraRotate");
        p.h(aVar3, "gachaImageScale");
        p.h(aVar4, "gachaImageAlpha");
        p.h(aVar5, "gachaImageRotate");
        p.h(s0Var2, "isGachaImageVisible");
        p.h(aVar6, "itemImageScale");
        p.h(aVar7, "itemImageAlpha");
        p.h(s0Var3, "isItemImageVisible");
        p.h(aVar8, "itemInfoAlpha");
        this.f57070a = s0Var;
        this.f57071b = aVar;
        this.f57072c = aVar2;
        this.f57073d = aVar3;
        this.f57074e = aVar4;
        this.f57075f = aVar5;
        this.f57076g = s0Var2;
        this.f57077h = aVar6;
        this.f57078i = aVar7;
        this.f57079j = s0Var3;
        this.f57080k = aVar8;
    }

    @Override // v9.b
    public s0<b.a> a() {
        return this.f57070a;
    }

    public final u.a<Float, u.m> b() {
        return this.f57074e;
    }

    public final u.a<Float, u.m> c() {
        return this.f57075f;
    }

    public final u.a<Float, u.m> d() {
        return this.f57073d;
    }

    public final u.a<Float, u.m> e() {
        return this.f57078i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return p.c(a(), lVar.a()) && p.c(this.f57071b, lVar.f57071b) && p.c(this.f57072c, lVar.f57072c) && p.c(this.f57073d, lVar.f57073d) && p.c(this.f57074e, lVar.f57074e) && p.c(this.f57075f, lVar.f57075f) && p.c(this.f57076g, lVar.f57076g) && p.c(this.f57077h, lVar.f57077h) && p.c(this.f57078i, lVar.f57078i) && p.c(this.f57079j, lVar.f57079j) && p.c(this.f57080k, lVar.f57080k);
        }
        return false;
    }

    public final u.a<Float, u.m> f() {
        return this.f57077h;
    }

    @Override // v9.b
    public void finish() {
        b.C0909b.a(this);
    }

    public final u.a<Float, u.m> g() {
        return this.f57080k;
    }

    public final u.a<Float, u.m> h() {
        return this.f57071b;
    }

    public int hashCode() {
        return (((((((((((((((((((a().hashCode() * 31) + this.f57071b.hashCode()) * 31) + this.f57072c.hashCode()) * 31) + this.f57073d.hashCode()) * 31) + this.f57074e.hashCode()) * 31) + this.f57075f.hashCode()) * 31) + this.f57076g.hashCode()) * 31) + this.f57077h.hashCode()) * 31) + this.f57078i.hashCode()) * 31) + this.f57079j.hashCode()) * 31) + this.f57080k.hashCode();
    }

    public final u.a<Float, u.m> i() {
        return this.f57072c;
    }

    public final s0<Boolean> j() {
        return this.f57076g;
    }

    public final s0<Boolean> k() {
        return this.f57079j;
    }

    @Override // v9.b
    public void play() {
        b.C0909b.b(this);
    }

    public String toString() {
        return "EmomoQuestEquipmentGachaRareItemAnimationState(playState=" + a() + ", kirakiraAlpha=" + this.f57071b + ", kirakiraRotate=" + this.f57072c + ", gachaImageScale=" + this.f57073d + ", gachaImageAlpha=" + this.f57074e + ", gachaImageRotate=" + this.f57075f + ", isGachaImageVisible=" + this.f57076g + ", itemImageScale=" + this.f57077h + ", itemImageAlpha=" + this.f57078i + ", isItemImageVisible=" + this.f57079j + ", itemInfoAlpha=" + this.f57080k + ')';
    }

    public /* synthetic */ l(s0 s0Var, u.a aVar, u.a aVar2, u.a aVar3, u.a aVar4, u.a aVar5, s0 s0Var2, u.a aVar6, u.a aVar7, s0 s0Var3, u.a aVar8, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? z1.e(b.a.UnPlayed, null, 2, null) : s0Var, (i10 & 2) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar, (i10 & 4) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar2, (i10 & 8) != 0 ? u.b.b(1.0f, 0.0f, 2, null) : aVar3, (i10 & 16) != 0 ? u.b.b(1.0f, 0.0f, 2, null) : aVar4, (i10 & 32) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar5, (i10 & 64) != 0 ? z1.e(Boolean.TRUE, null, 2, null) : s0Var2, (i10 & 128) != 0 ? u.b.b(0.8f, 0.0f, 2, null) : aVar6, (i10 & 256) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar7, (i10 & 512) != 0 ? z1.e(Boolean.FALSE, null, 2, null) : s0Var3, (i10 & 1024) != 0 ? u.b.b(0.0f, 0.0f, 2, null) : aVar8);
    }
}

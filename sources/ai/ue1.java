package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ue1 implements x01<b11> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ry1<b11>> f10680a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, ry1<jg1>> f10681b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, g12<jg1>> f10682c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<x01<ty0>> f10683d;

    /* renamed from: e  reason: collision with root package name */
    public final zg1 f10684e;

    public ue1(Map<String, ry1<b11>> map, Map<String, ry1<jg1>> map2, Map<String, g12<jg1>> map3, eo3<x01<ty0>> eo3Var, zg1 zg1Var) {
        this.f10680a = map;
        this.f10681b = map2;
        this.f10682c = map3;
        this.f10683d = eo3Var;
        this.f10684e = zg1Var;
    }

    @Override // ai.x01
    public final ry1<b11> a(int i10, String str) {
        ry1<ty0> a10;
        ry1<b11> ry1Var = this.f10680a.get(str);
        if (ry1Var != null) {
            return ry1Var;
        }
        if (i10 == 1) {
            if (this.f10684e.d() == null || (a10 = this.f10683d.zzb().a(i10, str)) == null) {
                return null;
            }
            return b11.b(a10);
        } else if (i10 != 4) {
            return null;
        } else {
            g12<jg1> g12Var = this.f10682c.get(str);
            if (g12Var != null) {
                return b11.a(g12Var);
            }
            ry1<jg1> ry1Var2 = this.f10681b.get(str);
            if (ry1Var2 == null) {
                return null;
            }
            return b11.b(ry1Var2);
        }
    }
}

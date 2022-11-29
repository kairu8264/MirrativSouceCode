package ai;

import com.google.android.gms.internal.ads.zzdym;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yu1 implements av1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, eo3<av1>> f12734a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f12735b;

    /* renamed from: c  reason: collision with root package name */
    public final p71 f12736c;

    public yu1(Map<String, eo3<av1>> map, t43 t43Var, p71 p71Var) {
        this.f12734a = map;
        this.f12735b = t43Var;
        this.f12736c = p71Var;
    }

    @Override // ai.av1
    public final s43<sl2> a(final ie0 ie0Var) {
        this.f12736c.s(ie0Var);
        s43<sl2> c10 = j43.c(new zzdym(3));
        for (String str : ((String) ft.c().c(ox.R5)).split(",")) {
            final eo3<av1> eo3Var = this.f12734a.get(str.trim());
            if (eo3Var != null) {
                c10 = j43.g(c10, zzdym.class, new p33(eo3Var, ie0Var) { // from class: ai.wu1

                    /* renamed from: a  reason: collision with root package name */
                    public final eo3 f11751a;

                    /* renamed from: b  reason: collision with root package name */
                    public final ie0 f11752b;

                    {
                        this.f11751a = eo3Var;
                        this.f11752b = ie0Var;
                    }

                    @Override // ai.p33
                    public final s43 a(Object obj) {
                        eo3 eo3Var2 = this.f11751a;
                        zzdym zzdymVar = (zzdym) obj;
                        return ((av1) eo3Var2.zzb()).a(this.f11752b);
                    }
                }, this.f12735b);
            }
        }
        j43.p(c10, new xu1(this), hk0.f4883f);
        return c10;
    }
}

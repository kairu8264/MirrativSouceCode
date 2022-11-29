package ai;

import android.view.View;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l0 implements uv2 {

    /* renamed from: a  reason: collision with root package name */
    public final xt2 f6424a;

    /* renamed from: b  reason: collision with root package name */
    public final pu2 f6425b;

    /* renamed from: c  reason: collision with root package name */
    public final y0 f6426c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f6427d;

    /* renamed from: e  reason: collision with root package name */
    public final w f6428e;

    public l0(xt2 xt2Var, pu2 pu2Var, y0 y0Var, k0 k0Var, w wVar) {
        this.f6424a = xt2Var;
        this.f6425b = pu2Var;
        this.f6426c = y0Var;
        this.f6427d = k0Var;
        this.f6428e = wVar;
    }

    public final void a(View view) {
        this.f6426c.a(view);
    }

    @Override // ai.uv2
    public final Map<String, Object> b() {
        return c();
    }

    public final Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        s64 c10 = this.f6425b.c();
        hashMap.put("v", this.f6424a.a());
        hashMap.put("gms", Boolean.valueOf(this.f6424a.c()));
        hashMap.put("int", c10.s0());
        hashMap.put("up", Boolean.valueOf(this.f6427d.a()));
        hashMap.put(TopicConstant.PACKET_TYPE_TEXT, new Throwable());
        return hashMap;
    }

    @Override // ai.uv2
    public final Map<String, Object> d() {
        Map<String, Object> c10 = c();
        c10.put("lts", Long.valueOf(this.f6426c.c()));
        return c10;
    }

    @Override // ai.uv2
    public final Map<String, Object> zzb() {
        Map<String, Object> c10 = c();
        s64 b10 = this.f6425b.b();
        c10.put("gai", Boolean.valueOf(this.f6424a.b()));
        c10.put("did", b10.t0());
        c10.put("dst", Integer.valueOf(b10.l0() - 1));
        c10.put("doo", Boolean.valueOf(b10.u0()));
        w wVar = this.f6428e;
        if (wVar != null) {
            c10.put("nt", Long.valueOf(wVar.d()));
        }
        return c10;
    }
}

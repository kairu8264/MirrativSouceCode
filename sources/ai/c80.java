package ai;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c80<I, O> implements n70<I, O> {

    /* renamed from: a  reason: collision with root package name */
    public final p70<O> f2747a;

    /* renamed from: b  reason: collision with root package name */
    public final q70<I> f2748b;

    /* renamed from: c  reason: collision with root package name */
    public final k70 f2749c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2750d;

    public c80(k70 k70Var, String str, q70<I> q70Var, p70<O> p70Var) {
        this.f2749c = k70Var;
        this.f2750d = str;
        this.f2748b = q70Var;
        this.f2747a = p70Var;
    }

    public static /* synthetic */ void d(c80 c80Var, e70 e70Var, l70 l70Var, Object obj, mk0 mk0Var) {
        try {
            wg.t.d();
            String uuid = UUID.randomUUID().toString();
            q30.f8793o.b(uuid, new b80(c80Var, e70Var, mk0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.ATTR_ID, uuid);
            jSONObject.put("args", c80Var.f2748b.b(obj));
            l70Var.l0(c80Var.f2750d, jSONObject);
        } catch (Exception e10) {
            try {
                mk0Var.e(e10);
                uj0.d("Unable to invokeJavascript", e10);
            } finally {
                e70Var.g();
            }
        }
    }

    @Override // ai.p33
    public final s43<O> a(I i10) throws Exception {
        return b(i10);
    }

    @Override // ai.n70
    public final s43<O> b(I i10) {
        mk0 mk0Var = new mk0();
        e70 g10 = this.f2749c.g(null);
        g10.b(new z70(this, g10, i10, mk0Var), new a80(this, mk0Var, g10));
        return mk0Var;
    }
}

package ai;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k80<I, O> implements p33<I, O> {

    /* renamed from: a  reason: collision with root package name */
    public final p70<O> f6118a;

    /* renamed from: b  reason: collision with root package name */
    public final q70<I> f6119b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6120c = "google.afma.activeView.handleUpdate";

    /* renamed from: d  reason: collision with root package name */
    public final s43<l70> f6121d;

    public k80(s43<l70> s43Var, String str, q70<I> q70Var, p70<O> p70Var) {
        this.f6121d = s43Var;
        this.f6119b = q70Var;
        this.f6118a = p70Var;
    }

    @Override // ai.p33
    public final s43<O> a(I i10) throws Exception {
        return b(i10);
    }

    public final s43<O> b(final I i10) {
        return j43.i(this.f6121d, new p33(this, i10) { // from class: ai.i80

            /* renamed from: a  reason: collision with root package name */
            public final k80 f5132a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f5133b;

            {
                this.f5132a = this;
                this.f5133b = i10;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f5132a.c(this.f5133b, (l70) obj);
            }
        }, hk0.f4883f);
    }

    public final /* synthetic */ s43 c(Object obj, l70 l70Var) throws Exception {
        mk0 mk0Var = new mk0();
        wg.t.d();
        String uuid = UUID.randomUUID().toString();
        q30.f8793o.b(uuid, new j80(this, mk0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.ATTR_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        l70Var.l0(this.f6120c, jSONObject);
        return mk0Var;
    }
}

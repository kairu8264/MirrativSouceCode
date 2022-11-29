package eh;

import ai.ie0;
import ai.j43;
import ai.p33;
import ai.s43;
import ai.ut1;
import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class h implements p33<ie0, j> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f30591a;

    /* renamed from: b  reason: collision with root package name */
    public final ut1 f30592b;

    public h(Executor executor, ut1 ut1Var) {
        this.f30591a = executor;
        this.f30592b = ut1Var;
    }

    @Override // ai.p33
    public final /* bridge */ /* synthetic */ s43<j> a(ie0 ie0Var) throws Exception {
        final ie0 ie0Var2 = ie0Var;
        return j43.i(this.f30592b.a(ie0Var2), new p33(ie0Var2) { // from class: eh.g

            /* renamed from: a  reason: collision with root package name */
            public final ie0 f30580a;

            {
                this.f30580a = ie0Var2;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                ie0 ie0Var3 = this.f30580a;
                j jVar = new j(new JsonReader(new InputStreamReader((InputStream) obj)));
                try {
                    jVar.f30597b = wg.t.d().S(ie0Var3.f5201w).toString();
                } catch (JSONException unused) {
                    jVar.f30597b = "{}";
                }
                return j43.a(jVar);
            }
        }, this.f30591a);
    }
}

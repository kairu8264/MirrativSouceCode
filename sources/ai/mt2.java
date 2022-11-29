package ai;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mt2 extends it2 {
    /* JADX WARN: Multi-variable type inference failed */
    public mt2(bt2 bt2Var, bt2 bt2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bt2Var, bt2Var2, hashSet, jSONObject, null);
    }

    @Override // ai.jt2
    public final void a(String str) {
        c(str);
        super.onPostExecute(str);
    }

    public final void c(String str) {
        ds2 a10 = ds2.a();
        if (a10 != null) {
            for (sr2 sr2Var : a10.e()) {
                if (this.f5405c.contains(sr2Var.h())) {
                    sr2Var.g().g(str, this.f5407e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f5406d.toString();
    }

    @Override // ai.jt2, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        c(str2);
        super.onPostExecute(str2);
    }
}

package p6;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class z0 extends v0 {

    /* renamed from: o  reason: collision with root package name */
    public String f46172o;

    public z0(c cVar) {
        this.f46172o = c1.B(cVar.f());
    }

    public m b() {
        if (this.f46124a) {
            return null;
        }
        m mVar = new m();
        if ("unity".equals(this.f46172o)) {
            String str = this.f46127d;
            if (str == null) {
                str = "";
            }
            mVar.f46011c = str;
            String str2 = this.f46128e;
            if (str2 == null) {
                str2 = "";
            }
            mVar.f46012d = str2;
            String str3 = this.f46126c;
            mVar.f46010b = str3 != null ? str3 : "";
            mVar.f46009a = this.f46125b;
            JSONObject jSONObject = this.f46129f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            mVar.f46013e = jSONObject;
        } else {
            mVar.f46011c = this.f46127d;
            mVar.f46012d = this.f46128e;
            mVar.f46010b = this.f46126c;
            mVar.f46009a = this.f46125b;
            mVar.f46013e = this.f46129f;
        }
        return mVar;
    }

    public n c() {
        if (this.f46124a) {
            n nVar = new n();
            if ("unity".equals(this.f46172o)) {
                String str = this.f46127d;
                if (str == null) {
                    str = "";
                }
                nVar.f46015b = str;
                String str2 = this.f46128e;
                if (str2 == null) {
                    str2 = "";
                }
                nVar.f46016c = str2;
                String str3 = this.f46126c;
                nVar.f46014a = str3 != null ? str3 : "";
                JSONObject jSONObject = this.f46129f;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                nVar.f46017d = jSONObject;
            } else {
                nVar.f46015b = this.f46127d;
                nVar.f46016c = this.f46128e;
                nVar.f46014a = this.f46126c;
                nVar.f46017d = this.f46129f;
            }
            return nVar;
        }
        return null;
    }
}

package p6;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class v extends v0 {

    /* renamed from: o  reason: collision with root package name */
    public String f46121o;

    /* renamed from: p  reason: collision with root package name */
    public String f46122p;

    /* renamed from: q  reason: collision with root package name */
    public String f46123q;

    public v(c cVar) {
        this.f46121o = cVar.m().get("event_token");
        this.f46122p = cVar.m().get("event_callback_id");
        this.f46123q = c1.B(cVar.f());
    }

    public i b() {
        if (this.f46124a) {
            return null;
        }
        i iVar = new i();
        if ("unity".equals(this.f46123q)) {
            String str = this.f46121o;
            if (str == null) {
                str = "";
            }
            iVar.f45968e = str;
            String str2 = this.f46127d;
            if (str2 == null) {
                str2 = "";
            }
            iVar.f45966c = str2;
            String str3 = this.f46128e;
            if (str3 == null) {
                str3 = "";
            }
            iVar.f45967d = str3;
            String str4 = this.f46126c;
            if (str4 == null) {
                str4 = "";
            }
            iVar.f45965b = str4;
            String str5 = this.f46122p;
            iVar.f45969f = str5 != null ? str5 : "";
            iVar.f45964a = this.f46125b;
            JSONObject jSONObject = this.f46129f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            iVar.f45970g = jSONObject;
        } else {
            iVar.f45968e = this.f46121o;
            iVar.f45966c = this.f46127d;
            iVar.f45967d = this.f46128e;
            iVar.f45965b = this.f46126c;
            iVar.f45969f = this.f46122p;
            iVar.f45964a = this.f46125b;
            iVar.f45970g = this.f46129f;
        }
        return iVar;
    }

    public j c() {
        if (this.f46124a) {
            j jVar = new j();
            if ("unity".equals(this.f46123q)) {
                String str = this.f46121o;
                if (str == null) {
                    str = "";
                }
                jVar.f45974d = str;
                String str2 = this.f46127d;
                if (str2 == null) {
                    str2 = "";
                }
                jVar.f45972b = str2;
                String str3 = this.f46128e;
                if (str3 == null) {
                    str3 = "";
                }
                jVar.f45973c = str3;
                String str4 = this.f46126c;
                if (str4 == null) {
                    str4 = "";
                }
                jVar.f45971a = str4;
                String str5 = this.f46122p;
                jVar.f45975e = str5 != null ? str5 : "";
                JSONObject jSONObject = this.f46129f;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jVar.f45976f = jSONObject;
            } else {
                jVar.f45974d = this.f46121o;
                jVar.f45972b = this.f46127d;
                jVar.f45973c = this.f46128e;
                jVar.f45971a = this.f46126c;
                jVar.f45975e = this.f46122p;
                jVar.f45976f = this.f46129f;
            }
            return jVar;
        }
        return null;
    }
}

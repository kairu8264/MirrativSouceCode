package in;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class e extends m<com.twitter.sdk.android.core.internal.oauth.a> {

    /* loaded from: classes4.dex */
    public static class a implements mn.d<e> {

        /* renamed from: a  reason: collision with root package name */
        public final xm.e f36906a = new xm.f().c(com.twitter.sdk.android.core.internal.oauth.a.class, new b()).b();

        @Override // mn.d
        /* renamed from: c */
        public e b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (e) this.f36906a.i(str, e.class);
            } catch (Exception e10) {
                h g10 = o.g();
                g10.b("Twitter", "Failed to deserialize session " + e10.getMessage());
                return null;
            }
        }

        @Override // mn.d
        /* renamed from: d */
        public String a(e eVar) {
            if (eVar == null || eVar.a() == null) {
                return "";
            }
            try {
                return this.f36906a.s(eVar);
            } catch (Exception e10) {
                h g10 = o.g();
                g10.b("Twitter", "Failed to serialize session " + e10.getMessage());
                return "";
            }
        }
    }
}

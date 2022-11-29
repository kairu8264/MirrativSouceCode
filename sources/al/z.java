package al;

import com.google.android.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f13901b = Charset.forName(C.UTF8_NAME);

    /* renamed from: a  reason: collision with root package name */
    public final fl.f f13902a;

    /* loaded from: classes2.dex */
    public class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f13903a;

        public a(g0 g0Var) throws JSONException {
            this.f13903a = g0Var;
            put("userId", g0Var.c());
        }
    }

    public z(fl.f fVar) {
        this.f13902a = fVar;
    }

    public static Map<String, String> d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, i(jSONObject, next));
        }
        return hashMap;
    }

    public static String e(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    public static String h(g0 g0Var) throws JSONException {
        return new a(g0Var).toString();
    }

    public static String i(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f13902a.n(str, "internal-keys");
    }

    public File b(String str) {
        return this.f13902a.n(str, "keys");
    }

    public File c(String str) {
        return this.f13902a.n(str, "user-data");
    }

    public Map<String, String> f(String str) {
        return g(str, false);
    }

    public Map<String, String> g(String str, boolean z10) {
        File a10 = z10 ? a(str) : b(str);
        if (!a10.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a10);
                try {
                    Map<String, String> d10 = d(g.B(fileInputStream2));
                    g.e(fileInputStream2, "Failed to close user metadata file.");
                    return d10;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    xk.f.f().e("Error deserializing user metadata.", e);
                    g.e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    g.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void j(String str, Map<String, String> map, boolean z10) {
        File a10 = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String e10 = e(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a10), f13901b));
                try {
                    bufferedWriter2.write(e10);
                    bufferedWriter2.flush();
                    g.e(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    xk.f.f().e("Error serializing key/value metadata.", e);
                    g.e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    g.e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void k(String str, g0 g0Var) {
        File c10 = c(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String h10 = h(g0Var);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c10), f13901b));
                try {
                    bufferedWriter2.write(h10);
                    bufferedWriter2.flush();
                    g.e(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    xk.f.f().e("Error serializing user metadata.", e);
                    g.e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    g.e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
